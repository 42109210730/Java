import Menu.RobMenu;
import tool.Rob;
import tool.Calcu;
import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        RobMenu robmenu = new RobMenu();
        robmenu.menua();
        System.out.println("请选择模式：");
        Rob rob = new Rob();
        boolean choose = true;
        while (choose) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 01:
                    robmenu.menu1();
                    rob.game();
                    break;
                case 02:
                    robmenu.menu2();
                    rob.housework();
                    break;
                case 03:
                    rob.study();
                    break;
                case 0:
                   choose=false;
                default:
            }
        }
    }
}
