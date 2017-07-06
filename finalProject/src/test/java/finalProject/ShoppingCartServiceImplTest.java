package finalProject;

import finalProject.model.Product;
import finalProject.model.ShoppingCart;
import finalProject.repositories.ProductRepository;
import finalProject.repositories.ShoppingCartRepository;
import finalProject.services.ShoppingCartService;
import finalProject.services.ShoppingCartServiceImpl;
import finalProject.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceImplTest {

    @Mock
    private ProductRepository productRepository;
    @Mock
    private ShoppingCartRepository shoppingCartRepository;

    @Mock
    private UserService userService;

    @InjectMocks
    private ShoppingCartServiceImpl shoppingCartService;

    @Test
    public void testSavingAShoppingCart(){

        when(userService.isUserOn(1)).thenReturn(true);
        ShoppingCart shoppingCart= shoppingCartService.getAshoppingCart(1);
        shoppingCartService.saveShoppingCart(1);
        verify(shoppingCartRepository).save(shoppingCart);

    }



    @Test
    public void testGetAshoopingCart(){

        when(userService.isUserOn(1)).thenReturn(true);
        ShoppingCart shoppingCart = shoppingCartService.getAshoppingCart(1);
        assertEquals(shoppingCart,shoppingCartService.getAshoppingCart(1));

    }
}
