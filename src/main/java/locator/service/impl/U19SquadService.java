package locator.service.impl;

import java.util.Arrays;
import java.util.List;

import locator.service.SquadService;

import org.springframework.stereotype.Component;

@Component("U19SquadService")
public class U19SquadService implements SquadService {

    @Override
    public List<String> getPlayers() {
        return Arrays.asList("Joao", "Miguel", "Tiago");
    }

}