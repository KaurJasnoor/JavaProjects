package Java_Practice.Oct17.Abstraction;

public abstract class MediaPlayer {
    public int size;
    public int capacity;
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract void next();
    public abstract void rewind();
}
/*
MediaPlayer   ---> size, capacity // parent

    play(), pause(), stop(), next(), rewind()
    1. Audio media player ----> windows media player

    2. Video Media player -----> playVideo()

    1. Spotify ,   youtube music, VLC media player //child

    2.  Youtube,  Netflix
 */