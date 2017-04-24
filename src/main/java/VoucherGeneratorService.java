public class VoucherGeneratorService {

  public double generateVoucher(double orderTotal) {
    if (orderTotal < 100) {
      return orderTotal * 0.05;
    }
    return orderTotal * 0.1;
  }
}
