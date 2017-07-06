package finalProject;

import finalProject.model.User;
import finalProject.repositories.UserRepository;
import finalProject.services.UserService;
import finalProject.services.UserServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.jws.soap.SOAPBinding;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void testaddingAnUser() {

        User user = new User();
        userService.addUser(user);
        when(userRepository.findByNameAndPassword(anyString(),anyString())).thenReturn(null);
        verify(userRepository).save(user);

    }

    @Test
    public void testGettingAnUnexistingUser() {

        when(userRepository.findByNameAndPassword(anyString(),anyString())).thenReturn(null);

        User user = userService.login("notAname","notApass");

        assertEquals(user.getName(),"not registered user");
        assertEquals(user.getPassword(),"not registered user");

    }

    @Test
    public void testGettingAnExistingUser() {

        User user=new User();
        user.setName("userName");
        user.setPassword("123456");

        when(userRepository.findByNameAndPassword(anyString(),anyString())).thenReturn(user);

        User user2 = userService.login("userName","123456");

        assertEquals(user2.getName(),"userName");
        assertEquals(user2.getPassword(),"123456");



    }

    @Test
    public void testThatAUserIsOn() {

        User user=new User();
        user.setUserid(1);
        user.setName("userName");
        user.setPassword("123456");

        when(userRepository.findByNameAndPassword(anyString(),anyString())).thenReturn(user);

        userService.login("userName","123456");

        assertTrue(userService.isUserOn(1));



    }

    @Test
    public void testThatAUserIsNotOn() {

        assertFalse(userService.isUserOn(0));

    }
}
