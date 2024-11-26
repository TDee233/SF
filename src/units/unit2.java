package units;
import java.sql.SQLOutput;
import java.util.Scanner;


public class unit2 {
    public static void main(String[] args) {

        String color1 = "Red";
        String color2 = "Green";
        String color3 = "Yellow";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kakoi cvet svetofora?");
        String color = scanner.next();

        switch (color){
            case "Red":
                System.out.println("Stop!");
                break;
            case "Green":
                System.out.println("Go go go!");
                break;
            case "Yellow":
                System.out.println("Wait!");
                break;
            default:
                System.out.println("Takogo cveta net!");
        }
        System.out.println(color + " opa na");
        scanner.close();

    }
}
