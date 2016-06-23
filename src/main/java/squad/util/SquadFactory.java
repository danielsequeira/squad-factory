package squad.util;

import squad.enumeration.Squad;
import squad.service.SquadService;

public interface SquadFactory {

    SquadService getSquad(Squad squad);
}
