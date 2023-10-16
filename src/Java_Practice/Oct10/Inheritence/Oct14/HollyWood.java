package Java_Practice.Oct10.Inheritence.Oct14;

public class HollyWood extends Movies{
    public String movieName;
    public String actor;

    public HollyWood(double lengthOfMovie, String movieName, String actor) {
        super(lengthOfMovie);
        this.movieName = movieName;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "HollyWood{" +
                "movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", lengthOfMovie=" + lengthOfMovie +
                '}';
    }
}
