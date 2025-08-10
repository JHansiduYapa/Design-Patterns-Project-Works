/// Legacy code that the client code need to interact with
/// this code should not be modified because this code can be a library function
class AdvancedMediaPlayer {
    void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}