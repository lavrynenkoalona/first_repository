package FindUserByName;

import java.util.List;

public interface UserDataMapper {

        List<User> getAllUsers();
        User findUser(String email);
        User findByUserName(String name);

}
