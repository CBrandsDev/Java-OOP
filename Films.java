import java.util.ArrayList;
import java.util.Scanner;

public class Films {
    private String title;
    private String year;
    private String director;
    private ArrayList<String> actors;

    actors = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void setTitle() {
        System.out.println("Set a title of film: ");
        title = scanner.nextLine();
    }
    public String getTitle() {
        return title;
    }
    public void setYear() {
        System.out.println("Set a year of film: ");
        year = scanner.nextLine();
    }
    public String getYear() {
        return year;
    }
    public void setDirector() {
        System.out.println("Set a director of the film: ");
        director = scanner.nextLine();
    }
    public String getDirector() {
        return director;
    }
    public void setActors() {
        String loop;
        do {
            System.out.println("Set a actor to this film: ");
            String actors = scanner.nextLine();
            actors.add(actor);
            System.out.println(("Do you want add more actors? (Y/N)"));
            loop = scanner.nextLine();
        } while (loop.equalsIgnoreCase("Y"));
    }
    public ArrayList<String> getActors() {
        return actors;
    }
}

