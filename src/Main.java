import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;


//rock = 1, paper = 2, scissors = 3
//loss = 0, draw = 3, win = 6
//a = rock, b = paper, c = scissors
//x = rock, y = paper, z = scissors
//x beats c, y beats a, z beats b

//part 2 implied that X means to lose, Y means to draw, Z means to win
public class Main {
    int total = 0;
    int score = 0;
    public static int scoreGet(ArrayList<String> game) {
        int score = 0;
        if (game.get(0).equals("A") && game.get(1).equals("X")) {
            game.set(1, "Z");
            score += 3;
//            score += 4;
        }
        else if (game.get(0).equals("A") && game.get(1).equals("Y")) {
            game.set(1, "X");
            score += 4;
//            score += 8;
        }
        else if (game.get(0).equals("A") && game.get(1).equals("Z")) {
            game.set(1, "Y");
            score += 8;
//            score += 3;
        }
        else if (game.get(0).equals("B") && game.get(1).equals("X")) {
            score += 1;
        }
        else if (game.get(0).equals("B") && game.get(1).equals("Y")) {
            score += 5;
        }
        else if (game.get(0).equals("B") && game.get(1).equals("Z")) {
            score += 9;
        }
         else if (game.get(0).equals("C") && game.get(1).equals("X")) {
             game.set(1, "Y");
             score += 2;
//            score += 7;
        }
         else if (game.get(0).equals("C") && game.get(1).equals("Y")) {
             game.set(1, "Z");
             score += 6;
//            score += 2;
        }
         else if (game.get(0).equals("C") && game.get(1).equals("Z")) {
             game.set(1, "X");
             score += 7;
//            score += 6;
        }
         return score;
    }

        public static void main(String[] args) throws FileNotFoundException {
            int score = 0;
            int count = 0;
            File file = new File("C:\\Users\\g\\Documents\\SECONDYEAR\\AoC\\AoC2\\src\\predictions.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(" ");
                ArrayList<String> game = new ArrayList<String>(Arrays.asList(lineArray));
                score += scoreGet(game);
                count++;
            }
            System.out.println(score);
            System.out.println(count);
        }

}
