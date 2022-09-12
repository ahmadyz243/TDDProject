import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserServiceImpl {

    private UserDAO userDAO = new UserDAO();
    private SecurityServiceImpl  securityService = new SecurityServiceImpl();

    public void assignPassword(User user){
        String passWordMd5 = securityService.passwordMd5(user.getPassword());
        user.setPassword(passWordMd5);
        userDAO.updateUser(user);
    }

}
