package hust.soict.globalict;

import java.util.*;
import hust.soict.globalict.aims.media.*;

public class testCompareTo {

    public static void main(String[] args) {
        java.util.Collection collection = new java.util.ArrayList();
        java.util.Collection collection1 = new java.util.ArrayList();
        java.util.Collection collection2 = new java.util.ArrayList();
        Track track1 = new Track("Tears",5);
        Track track2 = new Track("Track10",4);
        Track track3 = new Track("Backseat",3);
        Track[] trackA = new Track[] {track1,track2,track3};
        ArrayList<Track> trackB = new ArrayList<Track>(Arrays.asList(trackA));

        CompactDisc CD1 = new CompactDisc("Crash","Pop",20.99f,47,"Charli XCX");
        CompactDisc CD2 = new CompactDisc("POP2","Pop",28.99f,47 , "Charli XCX",trackB);
        CompactDisc CD3 = new CompactDisc("Melodrama","Pop",27.45f,56,"Lorde");

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                "Roger Allers",90,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin","Animation","Alex Phill",102,18.99f);

        Book book1 = new Book("War And Peace","Novel",22f, "Happy together");
        Book book2 = new Book("Zhivago","Novel",14f, "Live long life");
        Book book3 = new Book("Doraemon","Comic",5f, "A perfect teacher");

        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);
        collection1.add(CD1);
        collection1.add(CD2);
        collection1.add(CD3);
        collection2.add(book1);
        collection2.add(book2);
        collection2.add(book3);

        java.util.Iterator iterator = collection.iterator();
        System.out.println("---------------------------");
        System.out.println("The DVDs currently in the order are:");
        while (iterator.hasNext()) {
            ((DigitalVideoDisc) iterator.next()).play();;
        }
        java.util.Collections.sort((java.util.List)collection);
        iterator = collection.iterator();
        System.out.println("Sorted DVDs: ");
        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }

        java.util.Iterator iterator1 = collection1.iterator();
        System.out.println("The CDs currently in the order are:");
        while (iterator1.hasNext()) {
            ((CompactDisc) iterator1.next()).play();
        }
        java.util.Collections.sort((java.util.List) collection1);
        iterator1 = collection1.iterator();
        System.out.println("---------------------------");
        System.out.println("The CDs in sorted order are: ");
        while (iterator1.hasNext()) {
            System.out.println(((CompactDisc)iterator1.next()).getTitle());
        }
        java.util.Iterator iterator2 = collection2.iterator();
        System.out.println("The Books currently in the order are:");
        while (iterator2.hasNext()) {
            System.out.println(((Book) iterator2.next()).getTitle());
        }
        java.util.Collections.sort((java.util.List) collection2);
        iterator2 = collection2.iterator();

        System.out.println("The Books in sorted order are: ");
        while (iterator2.hasNext()) {
            System.out.println(((Book)iterator2.next()).getTitle());
        }

    }

}
