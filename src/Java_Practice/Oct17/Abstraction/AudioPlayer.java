package Java_Practice.Oct17.Abstraction;

public class AudioPlayer extends MediaPlayer{

    @Override
    public void play() {
        System.out.println("Audio is Playing....");
    }

    @Override
    public void pause() {
        System.out.println("Audio has paused....");
    }

    @Override
    public void stop() {
        System.out.println("Audio has stopped....");
    }

    @Override
    public void next() {
        System.out.println("Next Audio....");
    }

    @Override
    public void rewind() {
        System.out.println("Audio rewinding....");
    }

    public void playAudioMedia(){

    }
}
