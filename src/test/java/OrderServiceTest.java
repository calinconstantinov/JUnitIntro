import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class OrderServiceTest {

  private OrderService orderService;

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() {
    orderService = new OrderService();
  }

  @Test(expected = OrderException.class)
  public void ordersWithNegativeTotalShouldThrowException() throws OrderException {
    //given
    double orderTotal = -1;

    //when
    orderService.placeOrder(orderTotal);
  }

  @Test
  public void ordersWithPositiveTotalShouldNotThrowException() throws OrderException {
    //given
    double orderTotal = 1;

    //when
    orderService.placeOrder(orderTotal);
  }

}
