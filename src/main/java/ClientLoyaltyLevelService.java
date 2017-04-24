import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class ClientLoyaltyLevelService {

  public boolean isGoldMember(LocalDate joinDate) {
    return DAYS.between(joinDate, LocalDate.now()) > 100;
  }

}
