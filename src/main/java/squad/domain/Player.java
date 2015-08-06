package squad.domain;

import squad.enumeration.Squad;

public class Player {

    private String name;
    private Squad squad;

    public Player() {
    }

    public Player(final String name, final Squad squad) {
        this.name = name;
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Squad getSquad() {
        return squad;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", squad=" + squad + "]";
    }

}
