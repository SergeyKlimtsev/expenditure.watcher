package expenditure.watcher.service;

import expenditure.watcher.model.User;
import expenditure.watcher.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User get(String id) {
        return userRepository.get(id);
    }

    @Override
    public User add(User user) {
        return userRepository.add(user);
    }

    @Override
    public boolean delete(String id) {
        return userRepository.delete(id);
    }
}
