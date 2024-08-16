/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrivaltimecalculator;

/**
 *
 * @author Liam
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ArrivalTimeCalculator {
    public static void main(String[] args) {
        int totalDistanceKm = 10000; // distance from Kabale to Kampala in km
        double speedMps = 225.5; // speed in meters per second
        int totalDistanceMeters = totalDistanceKm * 1000; // convert km to meters
        LocalTime departureTime = LocalTime.of(9, 0); // departure time is 09:00

        // Calculate travel time in seconds
        double travelTimeSeconds = (double) totalDistanceMeters / speedMps;

        // Convert travel time to hours and minutes
        int travelTimeMinutes = (int) (travelTimeSeconds / 60);
        int travelTimeSecondsRemainder = (int) (travelTimeSeconds % 60);

        // Calculate arrival time
        LocalTime arrivalTime = departureTime.plusMinutes(travelTimeMinutes).plusSeconds(travelTimeSecondsRemainder);

        // Format the arrival time for output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Approximate arrival time in Kampala: " + arrivalTime.format(formatter));
    }
}


