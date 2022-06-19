package hust.soict.globalict.aims.media;

import java.util.Scanner;

public abstract class Media implements Comparable<Media> {
    private String title;
    private String category;
    private float cost;
    private int id;
    public boolean equals(Object o) {
        try {
            Media tmp =(Media) o;
            return ((tmp.getTitle().equals(this.getTitle()) && tmp.getCost()==this.getCost())) ;
        } catch (NullPointerException e) {
            System.out.println("The object is null");
            return false;
        }catch(ClassCastException a) {
            System.out.println("Can not cast the object!");
            return false;
        }

    }
    public int compareTo(Media m) {
        try {
            int cp = this.title.compareTo(m.title);
            if (cp == 0) cp = this.category.compareTo(m.category);
            return cp;
        } catch (NullPointerException e) {
            System.out.println("The media is null!");
            return -1;
        } catch (ClassCastException a) {
            System.out.println("The media can not be compared!");
            return -1;
        }
    }
    public int compareCost(Media m1, Media m2) {
        if (m1.getCost()>m2.getCost()) return 1;
        else return -1;
    }
    
    private static int increaseID = 0;
    public Media() {
        super();
        id = ++increaseID;
    }
    public Media(String title) {
        super();
        id = ++increaseID;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public Media(String title, String category) {
        super();
        id = ++increaseID;
        this.title = title;
        this.category = category;
    }
    public Media(String title, String category, float cost) {
        super();
        id = ++increaseID;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String toString() {
        return title + " - " + category + " - " + cost + "$" + " - "+ id;
    }
    public void inputInfo(Scanner scanner) {
        System.out.println("Title: ");
        title = scanner.nextLine();
        System.out.println("Category: ");
        category = scanner.nextLine();
        System.out.println("Cost: ");
        cost = scanner.nextFloat();
    }
}
