package src;    
import java.util.Scanner;

public class Films {
    private String title;
    private String year;
    private String director;
    

    public Films(String title, String year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
    }

    public void bioPrint() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Director: " + director);
    }

    // actors = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    
    // public void setActors() {
    //     String loop;
    //     do {
    //         System.out.println("Set a actor to this film: ");
    //         String actors = scanner.nextLine();
    //         actors.add(actor);
    //         System.out.println(("Do you want add more actors? (Y/N)"));
    //         loop = scanner.nextLine();
    //     } while (loop.equalsIgnoreCase("Y"));
    // }
    // public ArrayList<String> getActors() {
    //     return actors;
    // }
}

