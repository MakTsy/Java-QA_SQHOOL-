import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrelooTest {

    private String boardId;
    private String listId;
    private String cardId;
    @Test(priority = 1)
    public void checkCreateBoard() throws IOException {
        RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
        Board board = new Board();
        String name = "New1 board";
        Board createdBoard = retroFitBuilder.getTrelloapi().createBoard(board, name).execute().body();
        boardId = createdBoard.getId();
        Assert.assertEquals(createdBoard.getName(), name);
    }

    @Test(priority = 2)
    public void checkUpdateBoard() throws IOException {
    RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
    Board board = new Board();
    String updatedName = "Updated board name";
    board.setName(updatedName);
    Board updatedBoard = retroFitBuilder.getTrelloapi().updateBoard(board, boardId).execute().body();

    Assert.assertEquals(updatedBoard.getName(), updatedName);
    }

    @Test(priority = 8)
    public void checkDeleteBoard() throws IOException {
        RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
        Board board = new Board();
        int code = retroFitBuilder.getTrelloapi().deleteBoard(boardId, board.getKey(), board.getToken()).execute().code();

        Assert.assertEquals(code, 200);
    }

    //Homework part
    @Test(priority = 3)
    public void checkCreateList() throws IOException {
        RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
        List list = new List();
        String name = "New List1";
        List createdList = retroFitBuilder.getTrelloapi().createList(list, name, boardId).execute().body();
        listId = createdList.getid();
        System.out.println(listId);
        Assert.assertEquals(createdList.getName(), name);
    }

    @Test(priority = 4)
    public void checkCreateCard() throws IOException {
        RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
        Card card = new Card();
        String name = "New Card";
        Card createdCard = retroFitBuilder.getTrelloapi().createCard(card, listId,name).execute().body();
        cardId = createdCard.getId();
        Assert.assertEquals(createdCard.getName(), name);
    }

    @Test(priority = 5)
    public void checkUpdateCard() throws IOException {
        RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
        Card card = new Card();
        String updatedName = "Updated card name";
        card.setName(updatedName);
        Card updatedCard = retroFitBuilder.getTrelloapi().updateCard(card, cardId).execute().body();
        Assert.assertEquals(updatedCard.getName(), updatedName);
    }

    @Test(priority = 6)
    public void checkGetCard() throws IOException {
        RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
        Card card = new Card();
        int code = retroFitBuilder.getTrelloapi().getCard(cardId, card.getKey(), card.getToken()).execute().code();
        Assert.assertEquals(code, 200);
    }

    @Test(priority = 7)
    public void checkDeleteCard() throws IOException {
        RetroFitBuilder retroFitBuilder = new RetroFitBuilder();
        Card card = new Card();
        int code = retroFitBuilder.getTrelloapi().deleteCard(cardId, card.getKey(), card.getToken()).execute().code();
        Assert.assertEquals(code, 200);
    }
}
