import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BingoGame implements Runnable{
    private boolean[] arr;
    private List<BingoCard> cards;
    private boolean isWinner;
    BingoGame(){
        cards = new ArrayList<BingoCard>();
        arr = new boolean[76];
        arr[0] = true;
        for(int i = 1; i < 76; i++){
            arr[i] = false;
        }

        isWinner = false;
    }

    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of players: ");
        int numberOfPlayers = sc.nextInt();
        List<Thread> threads = new ArrayList<>();

    }
}
