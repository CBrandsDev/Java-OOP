public class app {
    public static void main(String[] args) {
        Films f1 = new Films();

        f1.setTitle();
        f1.setYear();
        f1.setDirector();
        f1.setActors();
        System.out.println(f1.getActors());
    }       
}

