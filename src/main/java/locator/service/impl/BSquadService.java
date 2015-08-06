package locator.service.impl;

import java.util.Arrays;
import java.util.List;

import locator.service.SquadService;

import org.springframework.stereotype.Component;

@Component("BSquadService")
public class BSquadService implements SquadService {

    @Override
    public List<String> getPlayers() {
        return Arrays.asList("Gudino", "Francisco Ramos", "Ivo Rodrigues",
                "Andre Silva");
    }

}