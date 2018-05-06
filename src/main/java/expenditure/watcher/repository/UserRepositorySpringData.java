package expenditure.watcher.repository;

import expenditure.watcher.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface UserRepositorySpringData extends JpaRepository<User, String> {

    @Transactional
    @Modifying
    @Query("DELETE FROM User u WHERE u.id=:id")
    int delete(@Param("id") String id);

    @Override
    @Transactional
    User save(User user);

    @Override
    User getOne(String id);
}
