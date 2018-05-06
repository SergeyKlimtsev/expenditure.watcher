package expenditure.watcher.service;

import expenditure.watcher.model.User;

public interface UserService {

    User get(String id);

    User add(User user);

    boolean delete(String id);
}
