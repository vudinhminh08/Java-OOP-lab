
public class TestMethod {
	public static void main(String[] args) {
		MyDate myList[] = new MyDate[10];
		
		myList[0] = new MyDate(4, 3, 2001);
		myList[1] = new MyDate(5, 6, 2003);
		myList[2] = new MyDate(12, 7, 2004);
		myList[3] = new MyDate(12, 3, 2000);
		myList[4] = new MyDate(7, 2, 2005);
		myList[5] = new MyDate(18, 3, 2000);
		myList[6] = new MyDate(19,2,2001)
		System.out.println("\n\nIn ra danh sach: ");
		MyDate.print(myList, 4);
		
		System.out.println("\n\nshow compare date: ");
		showCompare(myList, 0, 1);
		showCompare(myList, 2, 3);
		System.out.println("\n\nSap xep: ");
		DateUtils.sort(myList, 4);
	}
	public static void showCompare(MyDate myList[], int x, int y) {
		System.out.print("Ngay, thang, nam thu 1 ");
		myList[x].print(1);
		System.out.print("Ngay, thang, nam thu 2 ");
		myList[y].print(1);
		System.out.println("Su khac biet la: " + DateUtils.compareDate(myList[x], myList[y]));
	}
}
