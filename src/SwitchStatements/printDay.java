package SwitchStatements;

import java.util.Scanner;

public class printDay {
    public static void main(String[] args) {
        System.out.println("Enter the day");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        System.out.println(findaDay(day));
        System.out.println(findDay1(day));
        System.out.println(findDay2(Day.MONDAY));
    }

    public static String findaDay(String day) {
        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> {
                return "Workday";
            }
            case "saturday", "sunday" -> {
                return "Weekend";
            }
        }
        return "invalid";
    }

    public static String findDay1(String day) {
        String dayType = switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> "Workday";
            case "saturday", "sunday" -> "Weekend";
            default -> {
                if (day.isEmpty()) {
                    yield "invalid";
                } else {
                    yield "null";
                }
            }
        };
        return dayType;
    }

    public  static String findDay2(Day day) {
        String dayType = switch (day) {
            case SUNDAY -> "sunday";
            case MONDAY -> "monday";
            case TUEDAY -> "tuesday";
        };
        return dayType;
    }
}

    enum Day {
        SUNDAY, MONDAY, TUEDAY
    };