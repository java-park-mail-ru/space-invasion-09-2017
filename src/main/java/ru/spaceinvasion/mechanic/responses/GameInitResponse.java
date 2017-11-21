package ru.spaceinvasion.mechanic.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.spaceinvasion.mechanic.game.Race;
import ru.spaceinvasion.models.Message;

public class GameInitResponse implements Message {
    @JsonProperty
    private final Race race;

    public GameInitResponse(Race race) {
        this.race = race;
    }
}
