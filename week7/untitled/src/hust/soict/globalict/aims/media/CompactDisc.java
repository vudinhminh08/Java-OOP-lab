package hust.soict.globalict.aims.media;

import java.util.Scanner;

public class CompactDisc extends Media{
    private String director;
    private int length;
    public CompactDisc() {
        super();
    }
    public CompactDisc(String title) {
        super(title);
    }
    public CompactDisc(String title, String category) {
        super(title, category);
    }
    public CompactDisc(String title, String category, String director) {
        super(title, category);
        this.director = director;
    }
    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String toString() {
        return "cd - " + super.toString() + " - " + length;
    }
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo(scanner);
        System.out.println("Input length: ");
        length = scanner.nextInt();
        System.out.println("Input director: ");
        scanner.nextLine();
        director = scanner.nextLine();
    }
}