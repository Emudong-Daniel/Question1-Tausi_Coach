/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.traveltimecalculator;

/**
 *
 * @author Liam
 */
public class TravelTimeCalculator {

  public static void main(String[] args) {
        int totalDistance = 10000; // distance from Kampala to Kabale in km
        double speed = 250; // speed in km/hr
        int stopTimeMinutes = 5; // time taken per stop in minutes
        int passengerStopInterval = 150;
        int refuelStopInterval = 200;

        // Computing count of stops
        int passengerStops = totalDistance / passengerStopInterval;
        if (totalDistance % passengerStopInterval != 0) {
            passengerStops++;
        }
        int refuelStops = totalDistance / refuelStopInterval;
        if (totalDistance % refuelStopInterval != 0) {
            refuelStops++;
        }
        int totalStops = passengerStops + refuelStops - 1;
      
        double travelTimeHours = (double) totalDistance / speed;

        double totalStopTimeHours = (totalStops * stopTimeMinutes) / 60.0;
               
        double totalTimeHours = travelTimeHours + totalStopTimeHours;

        System.out.printf("Total time taken including stops: %.2f hours\n", totalTimeHours);
    }
}
