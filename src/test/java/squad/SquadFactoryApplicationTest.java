package squad;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import squad.domain.Player;
import squad.enumeration.Squad;
import squad.util.SquadFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SquadFactoryApplication.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
public class SquadFactoryApplicationTest {

    @Autowired
    private SquadFactory squadFactory;

    @Test
    public void getPlayersBySquad() {
        List<Player> playersA = squadFactory.getSquad(Squad.A).getPlayers();
        List<Player> playersB = squadFactory.getSquad(Squad.B).getPlayers();
        List<Player> playersU19 = squadFactory.getSquad(Squad.U19).getPlayers();

        assertEquals(5, playersA.size());
        assertEquals(4, playersB.size());
        assertEquals(3, playersU19.size());
    }
}
