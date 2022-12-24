import Menu.CalMenu;
import tool.Calcu;

import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        CalMenu calmenu =new CalMenu();
        calmenu.menua();
        Calcu calcu =new Calcu();
        while (true) {
            System.out.println("Please select a number:" );
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            System.out.println("Please input two numbers:");
            float x = sc.nextFloat();
            float y = sc.nextFloat();

            switch (a) {
                case 1:
                    calcu.add(x, y);
                    break;
                case 2:
                    calcu.sub(x, y);
                    break;
                case 3:
                    calcu.mul(x, y);
                    break;
                case 4:
                    calcu.div(x, y);
                    break;
                case 5:
                    calcu.pow(x,y);
                default:


            }
        }
    }
}
