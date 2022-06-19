package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Track(String title, int length) {
        super();
        this.title = title;
        this.length = length;
    }
    public void play() throws PlayerException {
        if(this.getLength() <= 0) {
            System.err.println("ERROR: DVD length is 0");
            throw (new PlayerException());
        }
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
}
