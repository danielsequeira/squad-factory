package locator.util;

import locator.enumeration.Squad;
import locator.service.SquadService;

public interface SquadFactory {

    SquadService getSquad(Squad squad);

}
