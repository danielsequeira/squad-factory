package squad.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import squad.domain.Player;
import squad.enumeration.Squad;
import squad.service.SquadService;

@Component("BSquadService")
public class BSquadService implements SquadService {

    @Override
    public List<Player> getPlayers() {
        return Arrays.asList(new Player("Gudino", Squad.B), new Player(
                "Francisco Ramos", Squad.B), new Player("Ivo Rodrigues",
                Squad.B), new Player("Andre Silva", Squad.B));
    }
}
