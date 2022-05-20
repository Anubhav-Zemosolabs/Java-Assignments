package anubhav.assignment4.org;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public class KnowYourCustomer {
    public static String dateRange(String date1, String date2) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar lastDateRange = Calendar.getInstance();
        Calendar startDateRange = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();

        lastDateRange.clear();
        startDateRange.clear();
        currentDate.clear();
        // to handle the ParseException and NullPointerException.
        try {
            // setting the date value;
            lastDateRange.setTime(dateFormat.parse(date1 /*string*/));
            startDateRange.setTime(dateFormat.parse(date1 /*string*/));
            currentDate.setTime(dateFormat.parse(date2 /*string*/));

            // anniversary will come after on year;
            if ((currentDate.get(Calendar.YEAR) - lastDateRange.get(Calendar.YEAR) == 0))
                return "No range";

            startDateRange.add(Calendar.YEAR, (currentDate.get(Calendar.YEAR) -
                    lastDateRange.get(Calendar.YEAR)));
            lastDateRange.add(Calendar.YEAR, (currentDate.get(Calendar.YEAR) -
                    lastDateRange.get(Calendar.YEAR)));

            lastDateRange.add(Calendar.DATE, 30);
            startDateRange.add(Calendar.DATE, -30);

            if (currentDate.after(lastDateRange)) // so that it can be back dated.
                return dateFormat.format(startDateRange.getTime()) + " "
                        + dateFormat.format(lastDateRange.getTime());

            else if (currentDate.after(startDateRange) && currentDate.before(lastDateRange))
                //can't go in the future.
                return dateFormat.format(startDateRange.getTime()) + " "
                        + dateFormat.format(currentDate.getTime());
            else
                return "No range";

        } catch (ParseException e) {
            return "please check input format";
        } catch (Exception e) {
            return "Exception";
        }

    }
    public static void main(String[] args) {
        int numberOfInput = -1;
        String range;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("please enter number of input to be passed");
            try {
                numberOfInput = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("please enter integer only");
                System.exit(-1);
            }
            if (numberOfInput < 1) {
                System.out.println("At least one date is necessary");
                System.exit(-1);
            }
            String[][] input = new String[numberOfInput][2];
            String str = null;
            System.out.println("enter the Input only in format of \"dd-mm-yyyy dd-mm-yyyy\"");
            for (int i = 0; i < numberOfInput; i++) {
                str = sc.nextLine();
                input[i] = str.split("\\s+");
            }
            for (int i = 0; i < numberOfInput; i++) {
                try {
                    range = KnowYourCustomer.dateRange(input[i][0], input[i][1]);
                    System.out.println(range);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("please enter input in given format only");
                    continue;
                }
            }
        }


    }

}
