public class MediaPlayer {

    private int volume = 0;
    private String playbackState = "stopped";

    public int getVolume() {
        return volume;
    }
    public String getPlaybackState() {
        return playbackState;
    }
    public boolean increaseVolume() {
        if (volume + 5 <= 100) {
            volume += 5;
            return true;
        }
        return false;
    }
    public boolean decreaseVolume() {
        if (volume - 5 >= 0) {
            volume -= 5;
            return true;
        }
        return false;
    }
    public void play() {
        playbackState = "playing";
    }
    public void stop() {
        playbackState = "stopped";
    }
}