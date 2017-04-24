import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ClientLoyaltyLevelServiceTest {

  private ClientLoyaltyLevelService clientLoyaltyLevelService;

  @Before
  public void setUp() {
    clientLoyaltyLevelService = new ClientLoyaltyLevelService();
  }

  @Test
  public void oldClientShouldHaveGoldLevelStatus() {
    //given
    LocalDate joinDate = LocalDate.now().minusDays(101);

    //when
    boolean isGoldMember = clientLoyaltyLevelService.isGoldMember(joinDate);

    //then
    assertTrue("Old client should have Gold Level Status", isGoldMember);
  }

  @Test
  public void newClientShouldNotHaveGoldLevelStatus() {
    //given
    LocalDate joinDate = LocalDate.now().minusDays(99);

    //when
    boolean isGoldMember = clientLoyaltyLevelService.isGoldMember(joinDate);

    //then
    assertFalse("New client should not have Gold Level Status", isGoldMember);
  }

}
