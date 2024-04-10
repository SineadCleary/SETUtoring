import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user1,user2,user3;
    Login login;

    @Before
    public void setup(){
        user1 = new User("123456@gmail.com", "password123");
        user2 = new User("sinead@gmail.com", "softwareengineering");
        user3 = new User("hello@outlook.com", "hello999");
        login = new Login();
    }

    @Test
    public void correctDetailsEntered(){
        String message = login.verify(user1, "123456@gmail.com","password123");
        assertTrue(message.equals("Login Successful"));
    }

    @Test
    public void invalidEmailEntered(){
        String message = login.verify(user1, "nonexistant@gmail.com","password123");
        assertTrue(message.equals("Unknown user"));
    }

    @Test
    public void incorrectPasswordEntered(){
        String message = login.verify(user1, "123456@gmail.com","hello12345");
        assertTrue(message.equals("Incorrect Password"));
    }
}
