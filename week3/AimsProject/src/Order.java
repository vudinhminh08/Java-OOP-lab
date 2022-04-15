import java.util.Scanner;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered =0;


    public void addDigitalVideoDis(DigitalVideoDisc disc) {
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
}
