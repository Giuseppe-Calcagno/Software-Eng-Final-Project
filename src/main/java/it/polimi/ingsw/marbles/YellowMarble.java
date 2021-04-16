package it.polimi.ingsw.marbles;

import it.polimi.ingsw.player.Player;
import it.polimi.ingsw.producible.Coins;
import it.polimi.ingsw.producible.Resources;

public class YellowMarble extends Marbles {
    /**
     * This method converts a yellow marble into a coin
     * @param p reference to the player's Warehouse depots
     */
    @Override
    public boolean addtoWarehouse(Player p, int i) {
        return p.getWarehouse().checkInsertion(i, new Coins());
    }
}
