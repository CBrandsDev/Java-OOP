package src;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Films f1 = new Films("The Dark Knight", "2012", "Christopher Nolan");
        Films f2 = new Films("Clockwork Orange", "1979", "Stanley Kubrick");

        f1.bioPrint();
        f2.bioPrint();
    }       
}

