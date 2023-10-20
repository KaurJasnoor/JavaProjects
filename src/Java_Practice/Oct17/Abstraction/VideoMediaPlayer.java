package Java_Practice.Oct17.Abstraction;

public class VideoMediaPlayer extends MediaPlayer{
    @Override
    public void play() {
        System.out.println("Video is Playing....");
    }
    @Override
    public void pause() {
        System.out.println("Video has paused....");
    }
    @Override
    public void stop() {
        System.out.println("Video has stopped....");
    }
    @Override
    public void next() {
        System.out.println("Next Video....");
    }
    @Override
    public void rewind() {
        System.out.println("Rewinding Video....");
    }
    public void playVideo(){

    }
}
