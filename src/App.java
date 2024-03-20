package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tarantino comes very close and asks you, what is the most legendary film of all time? ");
        String tG = sc.nextLine();
        System.out.println("okay, what year is this movie we're talking about? ");
        int y1 = sc.nextInt();

        Films theGoods = new Films(tG, y1);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tarantino comes very close and asks you, what is the most legendary film of all time? ");
        String tB = sc.nextLine();
        System.out.println("okay, what year is this movie we're talking about? ");
        int y2 = sc.nextInt();

        Films theBads = new Films(tB, y2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("DataBank of films by gender");

        // List<Films> films = new ArrayList();
        // boolean loop = true;

        // // while (loop) {
        // //     String title = rTitle(scanner);
        // // }

        // String titles[];
        // String years[];
        // String directors[];
        

        // Films f1 = new Films("The Dark Knight", "2012", "Christopher Nolan");
        // Films f2 = new Films("Clockwork Orange", "1979", "Stanley Kubrick");

        // f1.rTitle();

        // // f1.bioPrint();
        // // f2.bioPrint();
    }       
}

