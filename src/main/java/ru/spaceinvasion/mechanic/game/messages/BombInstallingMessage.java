package ru.spaceinvasion.mechanic.game.messages;

import ru.spaceinvasion.mechanic.game.GamePart;

/**
 * Created by egor on 22.11.17.
 */
public class BombInstallingMessage extends GameMessage {

    public BombInstallingMessage(GamePart messageCreator, Long requestId) {
        super(messageCreator, requestId);
    }

    public BombInstallingMessage(BombInstallingMessage bombInstallingMessage, GamePart messageCreator) {
        super(messageCreator, bombInstallingMessage.getRequestId());
    }

}