import entity.Holiday;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Holiday> holidays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        holidays.add(new Holiday(1, "	January", "     New Year's Day"));
        holidays.add(new Holiday(1, 	"	May", "         Labour Day"));
        holidays.add(new Holiday(4, 	"	May", "         Restoration of Independence Day"));
        holidays.add(new Holiday(13, 	"May", "         Anna's birthday"));
        holidays.add(new Holiday(23, 	"June	", "    Midsummer's Eve"));
        holidays.add(new Holiday(24, 	"June	", "    Midsummer's Day"));
        holidays.add(new Holiday(18, 	"November	", "Proclamation Day of the Republic of Latvia"));
        holidays.add(new Holiday(24, 	"December	", "Christmas Eve"));
        holidays.add(new Holiday(25, 	"December	", "Christmas Day "));
        holidays.add(new Holiday(26, 	"December	", "Second Day of Christmas"));
        holidays.add(new Holiday(31, 	"December	", "New Year's Eve"));


        System.out.print("Enter month: ");

        String inputMonth = scanner.nextLine();


        System.out.println("\nThese are holidays in "+inputMonth.toUpperCase()+": ");

        for (Holiday holiday: holidays){
            if (holiday.month.toLowerCase().contains(inputMonth.trim().toLowerCase())){
                System.out.println(holiday.day+". "+holiday.month+" "+holiday.name);
        }


        }

    }
}
