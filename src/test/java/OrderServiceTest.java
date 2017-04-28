import org.junit.Before;
import org.junit.Test;


public class OrderServiceTest {

  private OrderService orderService;

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
