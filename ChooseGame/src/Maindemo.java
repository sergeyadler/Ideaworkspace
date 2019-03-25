import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maindemo {
    public static void main(String[] args) {
        Map<Integer, Command > games = new HashMap<>();
        games.put(1,new DevilMayCry5());
        games.put(2,new SekiroShadowsDieTwice());
        games.put(3,new Uncharted4());

        System.out.println("Welcome! Choose your game  ");
        System.out.println("Press-> 1, if you wanted to play Devil May Cry 5" );
        System.out.println("Press-> 2, if you wanted to play SEKIRO: Shadows die twice  ");
        System.out.println("Press-> 3, if you wanted to play UNCHARTED 4 ");

        startgame(games);

    }

    public static void startgame (Map<Integer, Command> map){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your game : ");
        int num = scan.nextInt();
        if(num>0 && num<4){
            map.get(num).execute();
        }
        else{
            System.out.println("You press wrong number, please try again");
        }
        


    }
}
