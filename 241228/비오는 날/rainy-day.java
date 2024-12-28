import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Weather[] weathers = new Weather[n];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            LocalDate date = LocalDate.parse(input[0]);
            String day = input[1];
            String weather = input[2];
            weathers[i] = new Weather(date, day, weather);
        }

        LocalDate referenceDate = LocalDate.of(2000, 1, 1);
        Weather closestRainyDay = null;
        for (Weather w : weathers) {
            if (w.weather.equals("Rain")) {
                if (closestRainyDay == null ||
                    Math.abs(referenceDate.toEpochDay() - w.date.toEpochDay()) <
                    Math.abs(referenceDate.toEpochDay() - closestRainyDay.date.toEpochDay())) {
                    closestRainyDay = w;
                }
            }
        }

        if (closestRainyDay != null) {
            System.out.println(closestRainyDay);
        }
    }
}

class Weather {
    LocalDate date;
    String day;
    String weather;

    public Weather(LocalDate date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    @Override
    public String toString() {
        return date + " " + day + " " + weather;
    }
}