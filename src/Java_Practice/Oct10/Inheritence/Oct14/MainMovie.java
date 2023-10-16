package Java_Practice.Oct10.Inheritence.Oct14;

public class MainMovie {
    public static void main(String[] args) {
        Movies movies = new Movies(3.0);
        System.out.println(movies);
        System.out.println("*********************");

        HollyWood hollyWood = new HollyWood(2.45, "Harry Potter", "J K Rowling");
        System.out.println(hollyWood);
        System.out.println("*********************");

        PollyWood pollyWood = new PollyWood(3.0, "Angrej","Amrinder Gill", 296);
        System.out.println(pollyWood);
        System.out.println("*********************");
    }
}
