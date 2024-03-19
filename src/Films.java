package src;    
import java.util.Scanner;

public class Films {

    Scanner scanner = new Scanner(System.in);
    private String title;
    private String year;
    private String director;
    
    
    public Films(String title, String year, String director) {
        this.title = title;
        this.year = year;
        this.director = director;
    }
    
    public static String rTitle() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a epic film");
        String title = scanner.nextLine();
        System.out.println(title);
        return title; 
        
    }
    
    public void bioPrint() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Director: " + director);
    }
    
}


