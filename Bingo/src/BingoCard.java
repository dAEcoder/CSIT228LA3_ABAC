import java.util.*;
public class BingoCard {
    private int[][] numbers;
    private int id;
    static int ID;

    BingoCard(){
        id = ++ID;
        numbers = createBingoCard();
    }

    public int[][] createBingoCard(){
        int[][] card = new int[5][5];
        for(int i = 0; i < 5; i++){
            List<Integer> list = new ArrayList<>();
            for (int m = 1 + (i * 15); m <= 15 + (i * 15); m++) {
                list.add(m);
            }
            Collections.shuffle(list);
            for (int j = 0; j < 5; j++) {
                if(i == 2 && j == 2){
                    card[2][2] = 0;
                    continue;
                }
                card[i][j] = list.remove(0);

            }
        }
        return card;
    }

    public static void main(String[] args) {
        BingoCard bingoCard = new BingoCard();
        System.out.println(bingoCard);
    }

    @Override
    public String toString() {
        return "B\t" + "I\t" + "N\t" + "G\t" + "O\t" + "\n" + "_________________\n" + numbers[0][0] + "\t" + numbers[1][0] + "\t" + numbers[2][0] + "\t" + numbers[3][0] + "\t" + numbers[4][0] + "\n" + numbers[0][1] + "\t" + numbers[1][1] + "\t" + numbers[2][1] + "\t" + numbers[3][1] + "\t" + numbers[4][1] + "\n" + numbers[0][2] + "\t" + numbers[1][2] + "\t" + numbers[2][2] + "\t" + numbers[3][2] + "\t" + numbers[4][2] + "\n" + numbers[0][3] + "\t" + numbers[1][3] + "\t" + numbers[2][3] + "\t" + numbers[3][3] + "\t" + numbers[4][3] + "\n" + numbers[0][4] + "\t" + numbers[1][4] + "\t" + numbers[2][4] + "\t" + numbers[3][4] + "\t" + numbers[4][4] + "\n";
    }
}
