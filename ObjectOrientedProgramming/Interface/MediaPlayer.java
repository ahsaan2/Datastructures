package ObjectOrientedProgramming.Interface;

public class MediaPlayer implements Media {
    public void start(){
        System.out.println("Play the music:");
    }
    public void stop(){
        System.out.println("Stop the media:");
    }
    public void play(){
        System.out.println("Play the music:");
    }
    public static void main(String[] args) {
        // we can have separate classes in the same interface.
        MediaPlayer music = new MediaPlayer();
        music.play();
        music.start();
        music.stop();

    }
}
