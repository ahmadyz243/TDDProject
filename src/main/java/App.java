import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        User user = new User("303030");
        userService.assignPassword(user);
        System.out.println(user.getPassword());
    }
}
