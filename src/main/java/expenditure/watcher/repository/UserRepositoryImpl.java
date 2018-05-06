package expenditure.watcher.repository;

import expenditure.watcher.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserRepositorySpringData dao;

    @Override
    public User get(String id) {
        return dao.getOne(id);
    }

    @Override
    public User add(User user) {
        return dao.save(user);
    }

    @Override
    public boolean delete(String id) {
        return dao.delete(id) != 0;
    }
}
