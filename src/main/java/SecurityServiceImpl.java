import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SecurityServiceImpl {

    public String passwordMd5(String password){
        System.out.println("Security passwordMd5 method: password changed...");
        return password.concat("666");
    }
}
