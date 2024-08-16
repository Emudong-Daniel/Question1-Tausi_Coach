/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trainstopscalculator;

/**
 *
 * @author Liam
 */
public class TrainStopsCalculator {

    public static void main(String[] args) {
        int totalDistance = 10000; 
        int passengerStopInterval = 150;
        int refuelStopInterval = 200;

        // Computing count of passenger stops
        int passengerStops = totalDistance / passengerStopInterval;
        if (totalDistance % passengerStopInterval != 0) {
            passengerStops++; // Adjust for the final segment if it's a multiple of the interval
        }

        // Computing count of refuel stops
        int refuelStops = totalDistance / refuelStopInterval;
        if (totalDistance % refuelStopInterval != 0) {
            refuelStops++; // Adjust for the final segment if it's a multiple of the interval
        }

       
        int totalStops = passengerStops + refuelStops - 1; // Subtract 1 to avoid double-counting the start point

        System.out.println("Total number of stops: " + totalStops);
    }
}


