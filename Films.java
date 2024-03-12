import java.util.Scanner;

public class Films {
    private String title;
    private String year;
    private String director;
    private String actors;

    Scanner scanner = new Scanner(System.in);

    public void setTitle(String filmTitle) {
        System.out.println("Set a title of film: ");
        title = scanner.nextLine();
        title = filmTitle;
    }
    public String getTitle() {
        return title;
    }
    public void setYear(String filmYear) {
        System.out.println("Set a year of film: ");
        year = scanner.nextLine();
        year = filmYear;
    }
    public String getYear() {
        return year;
    }
    public void setDirector(String filmDirector) {
        System.out.println("Set a director of the film: ");
        director = scanner.nextLine();
        director = filmDirector;
    }
    public String getDirector() {
        return director;
    }
    public void setActors(String filmActors) {
        String loop = " ";
        while (loop == "y" || loop == "Y") {
            System.out.println("Set a ac");
            actors = filmActors;

        }
    }
}

