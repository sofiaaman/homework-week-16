package ru.itgirl;

import java.util.Scanner;

public class App {
    public String day(String dayEnglish) {
        String message = "";
        switch (dayEnglish) {
            case "Monday":
                message = "ponedelnik";
                break;
            case "Tuesday":
                message = "vtornik";
                break;
            case "Wednesday":
                message = "sreda";
                break;
            case "Thursday":
                message = "chetverg";
                break;
            case "Friday":
                message = "pjatnica";
                break;
            case "Saturday":
                message = "subbota";
                break;
            case "Sunday":
                message = "voskresenie";
                break;
            default:
                message = "Such a day does not exist";
                break;
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println("Input day of week in english");
        Scanner myScanner = new Scanner(System.in);
        String dayEnglish = myScanner.nextLine();
        App app = new App();
        String dayRussian=app.day(dayEnglish);
        System.out.println(dayRussian);
    }

}

