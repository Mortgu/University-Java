package de.oskar.exercises.excersiseTwo;

import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    private final List<RevenueSection> revenues;

    public ExerciseTwo() {
        this.revenues = new ArrayList<>();
    }

    public void printRevenue() {
        for (RevenueSection revenue : revenues) {
            if (revenue == null) return;
            System.out.println(revenue.section + " (" + revenue.revenue + ")");
        }
    }

    public static double avgRevenue(List<RevenueSection> revenues) {
        int countEntries = 0;
        double countUmsaetze = 0;
        for (RevenueSection revenueSection : revenues) {
            countEntries += 1;
            countUmsaetze += revenueSection.revenue;
        }
        return countUmsaetze/countEntries;
    }

    public static void switchPosition(List<RevenueSection> revenues, int pos1, int pos2) {
        RevenueSection temp = revenues.get(pos1);
        revenues.set(pos1, revenues.get(pos2));
        revenues.set(pos2, temp);
    }

    public static int indexOfMinRevenue(List<RevenueSection> revenues) {
        RevenueSection temp = null;
        for (RevenueSection revenueSection : revenues) {
            if (temp == null) temp = revenueSection;
            if (revenueSection.revenue < temp.revenue) {
                temp = revenueSection;
            }
        }
        return revenues.indexOf(temp);
    }

    public static int indexOfMaxRevenue(List<RevenueSection> revenues) {
        RevenueSection temp = null;
        for (RevenueSection revenueSection : revenues) {
            if (temp == null) temp = revenueSection;
            if (revenueSection.revenue > temp.revenue) {
                temp = revenueSection;
            }
        }
        return revenues.indexOf(temp);
    }

    public void setRevenue(String name, double revenue) {
        this.revenues.add(new RevenueSection(name, revenue));
    }

    public List<RevenueSection> getRevenues() {
        return revenues;
    }

    public static void setFlop(List<RevenueSection> revenues) {
        RevenueSection minRevenue = revenues.get(indexOfMinRevenue(revenues));
        RevenueSection maxRevenue = revenues.get(indexOfMaxRevenue(revenues));

        switchPosition(revenues, revenues.indexOf(minRevenue), revenues.indexOf(maxRevenue));

        System.out.println("min: " + minRevenue.revenue + " max: " + maxRevenue.revenue);
    }
}
