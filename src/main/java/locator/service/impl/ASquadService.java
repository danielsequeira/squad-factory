package locator.service.impl;

import java.util.Arrays;
import java.util.List;

import locator.service.SquadService;

import org.springframework.stereotype.Component;

@Component("ASquadService")
public class ASquadService implements SquadService {

    @Override
    public List<String> getPlayers() {
        return Arrays.asList("Casillas", "Marcano", "Imbula", "Brahimi",
                "Aboubakar");
    }

}
