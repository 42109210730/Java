package tool;
import Menu.CalMenu;
import tool.Calcu;
import java.util.Scanner;

public class Rob {
    public void game() {
        System.out.println("轻松一刻");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("sing a song");
                break;
            case 2:
                System.out.println("dance with me");
                break;
            case 3:
                System.out.println("播报今日天气");
                break;
            default:
        }
    }

    public void housework() {
        System.out.println("已完成");
    }

    public void study() {
        Calcu calcu = new Calcu();
        CalMenu calMenu = new CalMenu();
        calMenu.menua();
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
                calcu.pow(x, y);
            default:
                //   System.out.println("播放英语听力");
        }
    }
}
