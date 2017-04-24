import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VoucherGeneratorServiceTest {

  private VoucherGeneratorService voucherGeneratorService;

  @Before
  public void setUp() {
    voucherGeneratorService = new VoucherGeneratorService();
  }

  @Test
  public void smallOrdersShouldGenerateFivePercentVoucher() {
    //given
    double orderTotal = 75;

    //when
    double voucherValue = voucherGeneratorService.generateVoucher(orderTotal);

    //then
    assertEquals("Voucher value should be 5", voucherValue, 3.75, 0.01);
  }

}
