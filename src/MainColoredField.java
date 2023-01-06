import java.util.Random;
import java.util.Scanner;

public class MainColoredField {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random randomColor = new Random();

            int bomb = randomColor.nextInt(9);
            String input = "";
            String[] colors = {"groen", "oker", "blauw", "rood", "paars", "aqua", "wit", "geel", "roze"};

            while(!input.equals(colors[bomb-1])) {
                System.out.println("Kies een kleur");
                input = scanner.nextLine();
                if (input.equals(colors[bomb-1])) {
                    Util.printExplosion();
                } else {
                    Util.printBomb();
                }
            }
        }
    }