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
    assertEquals("Voucher value should be 3.75", voucherValue, 3.75, 0.01);
  }

  @Test
  public void largeOrdersShouldGenerateTenPercentVoucher() {
    //given
    double orderTotal = 175;

    //when
    double voucherValue = voucherGeneratorService.generateVoucher(orderTotal);

    //then
    assertEquals("Voucher value should be 17.5", voucherValue, 17.5, 0.01);
  }

}
