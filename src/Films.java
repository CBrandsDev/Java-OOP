package src;    
import java.util.Scanner;

public class Films {

    Scanner scanner = new Scanner(System.in);
    private String title;
    private int year;
    private String director;
    
    
    public Films(String title, int year) {
        this.title = title;
        this.year = year;
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


