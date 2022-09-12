import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class UserServiceImplTest {

    @Mock
    SecurityServiceImpl securityService = new SecurityServiceImpl();
    @Mock
    UserDAO userDAO = new UserDAO();

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAssignPassword() {

        UserServiceImpl userService = new UserServiceImpl();
        User testUser = new User("1234");
        String password = testUser.getPassword();
        String expectedPassword = "1234666";

        when(securityService.passwordMd5(password)).thenReturn(expectedPassword);

        //Mockito.doNothing().when(userDAO).updateUser(testUser);
        Mockito.doCallRealMethod().when(userDAO).updateUser(testUser);


//        //when
//        userDAO.updateUser(testUser);
//        //then
//        ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
//        verify(userDAO, times(1)).updateUser(captor.capture());
//        final User updatedUser = captor.getValue();
//        Assertions.assertEquals(expectedPassword, updatedUser.getPassword());

        userService.assignPassword(testUser);
        Assertions.assertEquals(expectedPassword, testUser.getPassword());

    }

}
