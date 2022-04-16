import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private String date;

    public MyDate() {
    }

    public MyDate(String date) {
        this.date = date;
    }
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getStrDate() {
        String[] stringMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] stringOrder = {"st", "nd", "rd", "th"};
        return stringMonth[month-1] + " " + day + stringOrder[Math.min(4, day)-1]  + " " + year ;
    }
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a date(dd/mm/yyyy): ");
        String[] input = sc.nextLine().split("/");
        setDay(Integer.valueOf(input[0]));
        setMonth(Integer.valueOf(input[1]));
        setYear(Integer.valueOf(input[2]));
        setDate(getStrDate());

    }
    public void print() {
        System.out.println(date);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
