package Java_Practice.Oct10.Inheritence.Oct14;

public class Movies {

    public double lengthOfMovie;

    public Movies(double lengthOfMovie) {
        this.lengthOfMovie = lengthOfMovie;

    }

    @Override
    public String toString() {
        return "Movies{" +
                "lengthOfMovie=" + lengthOfMovie +
                '}';
    }
}
