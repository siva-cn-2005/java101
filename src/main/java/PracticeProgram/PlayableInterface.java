package PracticeProgram;

interface Playable {
    void play();

    default void pause() {
        System.out.println("Pausing playback.");
    }

    static void displayInstructions() {
        System.out.println("To play, press the play button.");
    }
}
class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music...");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }
}

public class PlayableInterface {
    public static void main(String[] args) {

        MusicPlayer music = new MusicPlayer();
        VideoPlayer video = new VideoPlayer();

        music.play();
        music.pause();

        System.out.println();

        video.play();
        video.pause();

        System.out.println();

        Playable.displayInstructions();
    }
}
