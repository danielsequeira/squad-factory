package squad.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import squad.domain.Player;
import squad.enumeration.Squad;
import squad.service.SquadService;

@Component("U19SquadService")
public class U19SquadService implements SquadService {

    @Override
    public List<Player> getPlayers() {
        return Arrays.asList(new Player("Joao", Squad.U19), new Player(
                "Miguel", Squad.U19), new Player("Tiago", Squad.U19));
    }
}
