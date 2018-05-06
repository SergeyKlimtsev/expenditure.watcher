package expenditure.watcher.repository;

import expenditure.watcher.model.User;

public interface UserRepository {
    /**
     *  Получение юзера по id
     * @param id
     * @return
     */
    User get(String id);

    /**
     * Добавление юзера
     * @param user
     * @return возвращается нового юзера c ID
     */
    User add(User user);

    /**
     * Удаление юзера по id
     * @param id
     * @return если возвращается true то пользователь удалён
     */
    boolean delete(String id);
}
