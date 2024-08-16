/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnjourneytimecalculator;

/**
 *
 * @author Liam
 */
public class ReturnJourneyTimeCalculator {
    public static void main(String[] args) {
        int totalDistance = 10000; // distance from Kabale to Kampala in km
        double speed = 250; // speed in km/hr
        int refuelStopInterval = 200;
        int stopTimeMinutes = 5; // time taken per refuel stop in minutes

        // Computing count of refuel stops
        int refuelStops = totalDistance / refuelStopInterval;
        if (totalDistance % refuelStopInterval != 0) {
            refuelStops++;
        }

        // Computing travel time
        double travelTimeHours = (double) totalDistance / speed;

        // Compute the total refuel stop time in hours
        double totalStopTimeHours = (refuelStops * stopTimeMinutes) / 60.0;

        // Total time with stops
        double totalTimeHours = travelTimeHours + totalStopTimeHours;

        System.out.printf("Total time taken for the return journey including refueling stops: %.2f hours\n", totalTimeHours);
    }
}
