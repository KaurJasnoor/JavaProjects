package Java_Practice.Oct10.Inheritence.Oct14;

public class PollyWood extends HollyWood {
    public int numOfScreen;

    public PollyWood(double lengthOfMovie, String movieName, String actor, int numOfScreen) {
        super(lengthOfMovie, movieName, actor);
        this.numOfScreen = numOfScreen;
    }

    @Override
    public String toString() {
        return "PollyWood{" +
                "numOfScreen=" + numOfScreen +
                ", movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", lengthOfMovie=" + lengthOfMovie +
                '}';
    }
}

