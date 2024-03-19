package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("DataBank of films by gender");

        List<Films> films = new ArrayList();
        boolean loop = true;

        while (loop) {
            String title = rTitle(scanner);
        }

        String titles[];
        String years[];
        String directors[];
        

        Films f1 = new Films("The Dark Knight", "2012", "Christopher Nolan");
        Films f2 = new Films("Clockwork Orange", "1979", "Stanley Kubrick");

        f1.rTitle();

        // f1.bioPrint();
        // f2.bioPrint();
    }       
}

