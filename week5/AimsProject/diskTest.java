public class diskTest {
    public static void main(String[] args) {
        Order newOrder = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);

        //add the dvd to the Order
        newOrder.addDigitalVideoDis(dvd1);
        newOrder.getALuckyItem();
        //System.out.println("Test the lion king: " );
    }
}
