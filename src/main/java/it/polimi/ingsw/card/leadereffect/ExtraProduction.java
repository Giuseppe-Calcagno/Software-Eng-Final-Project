package it.polimi.ingsw.card.leadereffect;

import it.polimi.ingsw.player.Player;
import it.polimi.ingsw.producible.Resources;

public class ExtraProduction {
    /**
     * This attribute indicates the requested resource that activate the extra Production of the relative Leader Card
     */
    private Resources resources;

    /**
     * This method is the constructor
     */
    public ExtraProduction(){

    }

    /**
     * this method active the extra production
     * @param p the player that call this method to add one faith point
     * @param r the resources that the player wants to return and add it to the buffer's player
     */
    public void activeExtraProduction(Player p, Resources r){

    }

    /**
     * this method specify the type of resource requested
     * @return the type of resource requested
     */
    public Resources getResources(){
        return resources;
    }

}