package ru.spaceinvasion.mechanic.game;

import org.jetbrains.annotations.NotNull;
import ru.spaceinvasion.mechanic.game.messages.GameMessage;

import static ru.spaceinvasion.resources.Constants.HEALTH_OF_TOWER;

/**
 * Created by egor on 17.11.17.
 */
public class Tower extends Damaging {

    public Tower(@NotNull Mediator mediator, @NotNull Integer gamePartId) {
        super(mediator, gamePartId, HEALTH_OF_TOWER);
    }

    @Override
    public void notify(GameMessage message) {

    }
}