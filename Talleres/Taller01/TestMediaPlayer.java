public class TestMediaPlayer {

    public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer();

        System.out.println("Volume: " + player.getVolume());
        System.out.println("State: " + player.getPlaybackState());

        player.play();
        System.out.println("State after play: " + player.getPlaybackState());

        player.increaseVolume();
        player.increaseVolume();

        System.out.println("Volume after increasing: " + player.getVolume());

        player.stop();
        System.out.println("State after stop: " + player.getPlaybackState());

        while (player.increaseVolume()) {
            System.out.println("Volume: " + player.getVolume());
        }

        System.out.println("Attempt to exceed maximum volume: "
                + player.increaseVolume());

        while (player.decreaseVolume()) {
            System.out.println("Volume: " + player.getVolume());
        }

        System.out.println("Attempt to go below minimum volume: "
                + player.decreaseVolume());
    }
}