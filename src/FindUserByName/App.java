package FindUserByName;

public class App {
    public static void main(String[] args) {
        UserDataMapper fileUserDataMapper = new FileUserDataMapper();
      //User user = fileUserDataMapper.findUser("test3@test.com");
      //System.out.printf("User with email %s exists", user.getEmail());
        User user = fileUserDataMapper.findByUserName("Kate");
        System.out.printf("User with name %s exists", user.getName());
    }
}
