package it.polimi.ingsw.Network.Message.UpdateMesssage;

import it.polimi.ingsw.Client.PlayerBoard;
import it.polimi.ingsw.Network.Message.Message;
import it.polimi.ingsw.Network.Message.MessageType;

public class MessageUpdateStateLeaderAction extends Message {
    private static final long serialVersionUID = 2309901068199675655L;

    private String ID;

    /**
     * this attribute rappresent the new state of the Leader Card
     *  true -> to active
     *  false -> to discard
     */
    private boolean activated;

    public MessageUpdateStateLeaderAction(String nickname, String ID, boolean activated) {
        super(nickname, MessageType.UPDATESTATELEADERCARDS);
        this.ID = ID;
        this.activated = activated;
    }


    @Override
    public void update(PlayerBoard playerBoard) {
        if(activated)
            playerBoard.updateStateLeaderCard(ID);
    }
}
