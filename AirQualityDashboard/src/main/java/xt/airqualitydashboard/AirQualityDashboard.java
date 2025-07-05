import java.util.*;

public class AirQualityDashboard {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random rand = new Random();
        int hazardousDays = 0;

        // i) Generate 30 random AQI readings between 1 and 300
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = rand.nextInt(300) + 1;
            if (aqiReadings[i] > 200) {
                hazardousDays++;
            }
        }

        // ii) Compute and display the median AQI value
        Arrays.sort(aqiReadings);
        double median;
        int mid = aqiReadings.length / 2;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[mid - 1] + aqiReadings[mid]) / 2.0;
        } else {
            median = aqiReadings[mid];
        }

        // Display Results
        System.out.println("AQI Readings: " + Arrays.toString(aqiReadings));
        System.out.println("Median AQI: " + median);

        // iii) Identify and count "hazardous" days (AQI > 200)
        System.out.println("Number of hazardous days: " + hazardousDays);
    }
}



