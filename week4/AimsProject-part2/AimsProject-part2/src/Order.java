import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered =0;
    private Instant dateOrdered;
    public static final int MAX_LIMITED_ORDERS = 5;
    private static int nOrders = 0;


    public void addDigitalVideoDis(DigitalVideoDisc disc) {
        for(int i=0; i< itemOrdered.length; i++) {

        }
        if(qtyOrdered == 10) {
            return;
        }
        else {
            itemOrdered[qtyOrdered] = disc;
            System.out.println("The disc has cost: " + itemOrdered[qtyOrdered].getCost());
            qtyOrdered++;
            if(qtyOrdered ==9) System.out.println("The order is almost full");
        }
    }
    public void addDigitalVideoDis(DigitalVideoDisc[] dvdList) {
        if(dvdList.length > 10) {
            System.out.println("Cannot add dvd List because it will be full ");
            return;
        }
        else {
            if(dvdList.length + qtyOrdered >10) {
                System.out.println("Cannot add dvd List because it will be full ");
                return;
            }
            else {
                for(int i=0; i< dvdList.length; i++) {
                    itemOrdered[qtyOrdered + i] = dvdList[i];
                }
            }
        }
    }
    public void addDigitalVideoDis(ArrayList<DigitalVideoDisc> dvdList ) {
        if(dvdList.size() > 10) {
            System.out.println("Cannot add dvd List because it will be full ");
            return;
        }
        else {
            if(dvdList.size() + qtyOrdered >10) {
                System.out.println("Cannot add dvd List because it will be full ");
                return;
            }
            else {
                for(int i=0; i< dvdList.size(); i++) {
                    itemOrdered[qtyOrdered + i] = dvdList.get(i);
                }
            }
        }
    }
    public void addDigitalVideoDis(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(qtyOrdered == 10) {
            return;
        }
        else {
            itemOrdered[qtyOrdered] = dvd1;
            System.out.println("The disc has cost: " + itemOrdered[qtyOrdered].getCost());
            qtyOrdered++;
            itemOrdered[qtyOrdered] = dvd2;
            System.out.println("The disc has cost: " + itemOrdered[qtyOrdered].getCost());
            qtyOrdered++;
            if(qtyOrdered ==8) System.out.println("The order is almost full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int check =0;
        if(qtyOrdered == 0) {
            return;
        }
        else {
            for(int i=0; i< qtyOrdered; i++) {
                if(itemOrdered[i] == disc) {
                    check =1;
                    itemOrdered[i] =null;
                    qtyOrdered--;
                }
            }
            if(check ==1) System.out.println("The disc has been removed");
            else {
                System.out.println("Cant find this disc at the order");
            }



        }
    }
    public Float totalCost() {
        Float sum= 0.0f;
        for(int i=0; i< qtyOrdered ; i++) {
            sum += itemOrdered[i].getCost();
        }
        return sum;

    }
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void printing() {
        System.out.println("Date: [" + dateOrdered + "]");
        for(int i=0; i< qtyOrdered; i++) {
            System.out.println((i+1) + ".DVD - [" + itemOrdered[i].getTitle() + "] - [" + itemOrdered[i].getCategory() + "] - [" + itemOrdered[i].getDirector()+ "] - [" + itemOrdered[i].getLength()+ "]:[" + itemOrdered[i].getCost() + "]$");
        }
    }

    public DigitalVideoDisc getALuckyItem() {
        int max = itemOrdered.length -1 ;
        int min =0;
        int range = max - min + 1;
        int luckyNumber = (int)(Math.random() * range) + min;
        itemOrdered[luckyNumber].setCost(0);
        return itemOrdered[luckyNumber];
    }
    public DigitalVideoDisc[] getItemOrdered() {
        return itemOrdered;
    }

    public void setItemOrdered(DigitalVideoDisc[] itemOrdered) {
        this.itemOrdered = itemOrdered;
    }
}
