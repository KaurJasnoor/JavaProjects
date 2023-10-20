package Java_Practice.Oct17.Abstraction;

public class MainAbstrac {
    public static void main(String[] args) {
        MediaPlayer audioplayer = new AudioPlayer();
        MediaPlayer videoplayer = new VideoMediaPlayer();
        audioplayer.next();
        audioplayer.pause();
        audioplayer.play();
        audioplayer.rewind();
        audioplayer.stop();

        videoplayer.play();
        videoplayer.pause();
        videoplayer.next();
        videoplayer.stop();
        videoplayer.rewind();
    }
}
