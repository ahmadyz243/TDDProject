import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class UserDAO {

public void updateUser(User user){
    System.out.println("UserDAO update user method: user updated...");
}

}
