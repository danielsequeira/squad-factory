package squad.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import squad.domain.Player;
import squad.enumeration.Squad;
import squad.service.SquadService;

@Component("ASquadService")
public class ASquadService implements SquadService {

    @Override
    public List<Player> getPlayers() {
        return Arrays.asList(new Player("Casillas", Squad.A), new Player("Indi", Squad.A),
                new Player("Danilo", Squad.A), new Player("Brahimi", Squad.A), new Player("Aboubakar", Squad.A));
    }
}
