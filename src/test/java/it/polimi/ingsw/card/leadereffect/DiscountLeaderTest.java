package it.polimi.ingsw.card.leadereffect;

import StubGiovanni.LeaderCardDeckStub;
import it.polimi.ingsw.game.DevCardsDeck;
import it.polimi.ingsw.game.LeaderCardDeck;
import it.polimi.ingsw.player.Player;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiscountLeaderTest {
    //Ho usato uno stub LeaderCardDeck nel cui costruttore non faccio shuffle e per questo so le posizioni delle carte nella lista

    @Test
    void doSpecialAbilityTestActivated() throws IOException {
        Player playerTest = new Player("Giocatore1");
        LeaderCardDeck leaderCardDeck =  new LeaderCardDeckStub();
        DevCardsDeck devCardsDeck = new DevCardsDeck();
        playerTest.getSlotDevCards().insertCards(0, devCardsDeck.getDevCards(2, 0));
        playerTest.getSlotDevCards().insertCards(1, devCardsDeck.getDevCards(2, 2));

        assertTrue(leaderCardDeck.getLeaderCardList(0).doSpecialAbility(playerTest));
        assertTrue(leaderCardDeck.getLeaderCardList(0).getActivated());
    }

    @Test
    void doSpecialAbilityTestAdd() throws IOException {
        Player playerTest = new Player("Giocatore1");
        LeaderCardDeck leaderCardDeck =  new LeaderCardDeckStub();
        DevCardsDeck devCardsDeck = new DevCardsDeck();
        playerTest.getSlotDevCards().insertCards(0, devCardsDeck.getDevCards(2, 0));
        playerTest.getSlotDevCards().insertCards(1, devCardsDeck.getDevCards(2, 2));

        assertTrue(leaderCardDeck.getLeaderCardList(0).doSpecialAbility(playerTest));
        assertFalse(playerTest.getLeaderCardEffectDiscount().isEmpty());
    }

    @Test
    void doSpecialAbilityTestNotActivated() throws IOException {
        Player playerTest = new Player("Giocatore2");
        LeaderCardDeck leaderCardDeck = new LeaderCardDeckStub();
        leaderCardDeck.getLeaderCardList(0).setActivated();

        assertFalse(leaderCardDeck.getLeaderCardList(0).doSpecialAbility(playerTest));
    }

    @Test
    void doSpecialAbilityTestNotRequirements() throws IOException {
        Player playerTest = new Player("Giocatore2");
        LeaderCardDeck leaderCardDeck = new LeaderCardDeckStub();

        assertFalse(leaderCardDeck.getLeaderCardList(0).doSpecialAbility(playerTest));
    }
}