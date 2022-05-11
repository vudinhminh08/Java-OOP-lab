import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class DateUtils {
	
	public static int compareDate(MyDate d1, MyDate d2) {
		LocalDateTime localDateTime1 = LocalDateTime.of(d1.getYear(), d1.getMonth(), d1.getDay(), 0, 0, 0);
		LocalDateTime localDateTime2 = LocalDateTime.of(d2.getYear(), d2.getMonth(), d2.getDay(), 0, 0, 0);
		return localDateTime1.compareTo(localDateTime2);
	}
	public static void sort(MyDate[] myList, int length) {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(compareDate(myList[i], myList[j]) < 0) {
					MyDate temp = myList[i];
					myList[i] = myList[j];
					myList[j] = temp;
				}
			}
		}
		MyDate.print(myList, 4);
	}
}
