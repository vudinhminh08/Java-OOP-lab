import java.util.Scanner;

public class DisplayDays {
    public static int check(String month, int year) {
        if(year <100) return -1;
        else {
            if (month.compareTo("Jan.") ==0  || month.compareTo("Jan")==0 || month.compareTo("1")==0 ) return 31;
            else if(month.compareTo("Feb.") ==0  || month.compareTo("Feb")==0 || month.compareTo("2")==0) {
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    return  29;
                } else {
                    return 28;
                }
            }
            else if (month.compareTo("Mar.") ==0  || month.compareTo("Mar")==0 || month.compareTo("3")==0) return 31;
            else if(month.compareTo("Apr.") ==0  || month.compareTo("Apr")==0 || month.compareTo("4")==0) return 30;
            else if(month.compareTo("May.") ==0  || month.compareTo("May")==0 || month.compareTo("5")==0) return 31;
            else if(month.compareTo("Jun.") ==0  || month.compareTo("Jun")==0 || month.compareTo("6")==0) return 30;
            else if(month.compareTo("Jul.") ==0  || month.compareTo("Jul")==0 || month.compareTo("7")==0) return 31;
            else if(month.compareTo("Aug.") ==0  || month.compareTo("Aug")==0 || month.compareTo("8")==0) return 31;
            else if(month.compareTo("Sep.") ==0  || month.compareTo("Sep")==0 || month.compareTo("9")==0) return 30;
            else if(month.compareTo("Oct.") ==0  || month.compareTo("Oct")==0 || month.compareTo("10")==0) return 31;
            else if(month.compareTo("Nov.") ==0  || month.compareTo("Nov")==0 || month.compareTo("11")==0 ) return 30;
            else if(month.compareTo("Dec.") ==0  || month.compareTo("Dec")==0 || month.compareTo("12")==0) return 31;
            else return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("Enter month");
            String month = sc.nextLine();
            System.out.println("Enter year");
            int year = Integer.parseInt(sc.nextLine());
            if(check(month, year) >0) {
                System.out.println("Thang " + month + " nam " + year + " co " + check(month, year) + " ngay");
                break;
            }
        }


    }
}
