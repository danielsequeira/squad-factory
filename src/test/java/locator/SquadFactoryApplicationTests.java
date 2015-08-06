package locator;

import static org.junit.Assert.assertEquals;

import java.util.List;

import locator.enumeration.Squad;
import locator.util.SquadFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SquadFactoryApplication.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
public class SquadFactoryApplicationTests {

    @Autowired
    private SquadFactory squadFactory;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getPlayersBySquad() {
        List<String> playersA = squadFactory.getSquad(Squad.A).getPlayers();
        List<String> playersB = squadFactory.getSquad(Squad.B).getPlayers();
        List<String> playersU19 = squadFactory.getSquad(Squad.U19).getPlayers();

        assertEquals(5, playersA.size());
        assertEquals(4, playersB.size());
        assertEquals(3, playersU19.size());

        for (String player : playersA) {
            System.out.println("Squad A: " + player);
        }

        for (String player : playersB) {
            System.out.println("Squad B: " + player);
        }

        for (String player : playersU19) {
            System.out.println("Squad U19: " + player);
        }
    }

}
