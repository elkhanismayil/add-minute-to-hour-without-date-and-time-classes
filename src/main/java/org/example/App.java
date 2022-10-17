package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println(addMinutes("9:13 PM", 190));
    }

    public static String addMinutes(String time, int minutes) throws IllegalArgumentException {
        String[] timeParts = time.trim().split(" ");
        String[] hourMinParts = timeParts[0].split(":");

        String amPmPart = timeParts[1];
        int hourPart = Integer.parseInt(hourMinParts[0]);
        if (amPmPart.equalsIgnoreCase("pm")) {
            hourPart += 12;
        }
        int minPart = Integer.parseInt(hourMinParts[1]);
        int totalMinutes = hourPart * 60 + minPart + minutes;

        int calculatedMinPart = totalMinutes % 60;
        int calculatedHourPart = (totalMinutes / 60) % 24;
        int hoursIn12 = calculatedHourPart > 12 ? calculatedHourPart - 12 : calculatedHourPart;

        String modeResult = calculatedHourPart > 12 ? "PM" : "AM";
        String minPartResult = calculatedMinPart < 10 ? "0" + calculatedMinPart : calculatedMinPart + "";
        String hourPartResult = hoursIn12 < 10 ? "0" + hoursIn12 : hoursIn12 + "";

        return hourPartResult + ":" + minPartResult + " " + modeResult;
    }
}
