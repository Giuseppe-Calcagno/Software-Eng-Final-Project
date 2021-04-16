package it.polimi.ingsw.marbles;

import it.polimi.ingsw.player.Player;

public class RedMarble extends Marbles {
    /**
     * This method converts a red marble into a faith point
     * @param p reference to the player's Warehouse depots
     */
    @Override
    public boolean addtoWarehouse(Player p, int i) {
        if(p.getFaithMarker() < 24){
            p.increasefaithMarker();
            return true;
        }
        else return false;
    }
}
