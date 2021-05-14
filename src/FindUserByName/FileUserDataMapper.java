package FindUserByName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUserDataMapper implements UserDataMapper {

    List<User> users = new ArrayList<>();

    public FileUserDataMapper() {
        try (FileReader fr = new FileReader(new File("C:\\QA autmation\\src\\L20HW19\\users.txt"));
             BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            while (line!= null) {
                String [] parts = line.split(",");
                users.add(new User(parts[0], parts[1], parts[2], parts[3]));
                line = br.readLine();
            }

        } catch (Exception e) {

        }
    }

    @Override
    public User findUser(String email) {

        //1) classic for

        for(User u : users) {
            if(u.getEmail().equals(email)){
                return u;
            }
        }

        //2) streams
//       return users.stream()
//                .filter(u -> u.getEmail().equals(email))
//                .findFirst()
//                .orElseThrow(() -> new UserNotFoundException("User with email [" + email + "] not found"));

        throw new UserNotFoundException("User with email [" + email + "] not found");
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User findByUserName(String name) {


        for(User u : users) {
            if(u.getName().equals(name)){
                return u;
            }
        }
        throw new UserNotFoundException("User with name [" + name + "] not found");
    }



}
