package Java_Practice.Oct17.Interfaces;

public class MobilePhone implements Calculator,Computer,Ipod,Telephone,Camera{

    public void clickPictures(){
        System.out.println("Mobile Phone is clicking pictures...");
    }

    @Override
    public void calculate() {
        System.out.println(" Calculator is doing calculations...");
    }

    @Override
    public void surfInternet() {
        System.out.println("Computer is used for Surf Internet...");
    }

    @Override
    public void playSongs() {
        System.out.println("Listening Songs on Ipod...");
    }

    @Override
    public void makeCalls() {
        System.out.println("Telephone making calls....");
    }

    @Override
    public void receiveCalls() {
        System.out.println("Telephone is ringing...");
    }

    @Override
    public void clickPics() {
        System.out.println("Camera is clicking pictures...");
    }

    @Override
    public void makeVideo() {
        System.out.println("Camera also making video...");
    }
}
