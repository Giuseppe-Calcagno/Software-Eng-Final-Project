package it.polimi.ingsw.Network.Server;

import it.polimi.ingsw.model.card.DevelopmentCard;
import it.polimi.ingsw.model.card.LeaderAction;
import it.polimi.ingsw.model.marbles.Marbles;
import it.polimi.ingsw.model.player.Player;
import it.polimi.ingsw.model.singleplayer.token.Tokens;

import java.util.List;

public interface Updater {

    void onUpdateError(String name, String message);

    void onUpdateInitialLeaderCards(Player player, List<LeaderAction> leaderActionList);

    public void onUpdateStartGame(DevelopmentCard[][][] developmentCardDeck, List<Player> playersList , Marbles[][] marketTray, Marbles remainingMarble);

    void onUpdateCurrentPlayer(Player currPlayer);

    void onUpdateFaithMarker(Player player, List<Player> playerList, boolean removeMarblefromBuffer, int blackcrosstoken);

    void onUpdateMarketTray(Player player, char direction, int num);

    void onUpdateDevCardDeck(Player player, DevelopmentCard card);

    void onUpdateActivatedDevCardProduction(Player player, String ID);

    void onUpdatePlayerState(Player player, boolean state);

    void onUpdateResources(Player player);

    void onUpdateSinglePlayer(int blackCrossToken, DevelopmentCard[][][] devCardsDeck, Tokens tokens, String tokenColor);

    void onUpdateSlotDevCard(Player player, DevelopmentCard card, int column);

    void onUpdateLeaderCard(Player player, String IDcard, boolean active);

    void onUpdateStrongBox(Player player);

    void onUpdateWarehouse(Player player, boolean removeMarble);

    void onUpdateWinnerMultiplayer(Player winner, List<Player> playerList);

    void onUpdateWinnerSinglePlayer(boolean winner, int finalpoint);

    void onUpdateGameFinished();
}
