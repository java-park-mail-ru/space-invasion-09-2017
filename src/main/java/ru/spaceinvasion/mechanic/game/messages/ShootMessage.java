package ru.spaceinvasion.mechanic.game.messages;

import ru.spaceinvasion.mechanic.game.Direction;
import ru.spaceinvasion.mechanic.game.GamePart;
import ru.spaceinvasion.models.Coordinates;

/**
 * Created by egor on 17.11.17.
 */
public class ShootMessage extends GameMessage {
    Direction direction;

    public ShootMessage(GamePart messageCreator, Long messageId, Direction direction) {
        super(messageCreator, messageId);
        this.direction = direction;
    }

    public ShootMessage(ShootMessage buildTowerMessage, GamePart messageCreator) {
        super(messageCreator, buildTowerMessage.getMessageId());
        this.direction = buildTowerMessage.getDirection();
    }

    public Direction getDirection() {
        return direction;
    }
}
