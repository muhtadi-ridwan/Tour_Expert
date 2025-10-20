package com.example.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItineraryGenerator {

    // Map hotel names to their city/destination key
    private static final Map<String, String> HOTEL_TO_DESTINATION = new HashMap<>();
    static {
        // Cox's Bazar hotels
        HOTEL_TO_DESTINATION.put("Long Beach Hotel", "Cox_Bazar");
        HOTEL_TO_DESTINATION.put("Hotel Sea World Cox's Bazar", "Cox_Bazar");
        HOTEL_TO_DESTINATION.put("Cox Hill Tower", "Cox_Bazar");
        HOTEL_TO_DESTINATION.put("Best Western Heritage", "Cox_Bazar");

        // Bandarban hotels
        HOTEL_TO_DESTINATION.put("Hotel Night Heaven", "Bandarban");
        HOTEL_TO_DESTINATION.put("Hotel Hill View", "Bandarban");
        HOTEL_TO_DESTINATION.put("Holiday Inn Resort", "Bandarban");
        HOTEL_TO_DESTINATION.put("Hotel Green Land", "Bandarban");

        // Sreemangal hotels
        HOTEL_TO_DESTINATION.put("Green Leaf Guest House", "Sreemangal");
        HOTEL_TO_DESTINATION.put("Hotel Skypark", "Sreemangal");
        HOTEL_TO_DESTINATION.put("Grand Selim Resort & Tour – GSRT", "Sreemangal");
        HOTEL_TO_DESTINATION.put("Jungle cottage", "Sreemangal");

        // St. Martin's Island hotels
        HOTEL_TO_DESTINATION.put("Secrets St. Martin Resort & Spa", "St. Martin's Island");
        HOTEL_TO_DESTINATION.put("Fantastic Hotel", "St. Martin's Island");
        HOTEL_TO_DESTINATION.put("Grand Case Beach Club", "St. Martin's Island");
        HOTEL_TO_DESTINATION.put("Hommage Hotel & Residences", "St. Martin's Island");
    }

    public static List<String> generateItinerary(String hotelName, int days) {
        List<String> itinerary = new ArrayList<>();
        String destination = HOTEL_TO_DESTINATION.getOrDefault(hotelName, "");

        String[] activities = null;

        if ("Cox_Bazar".equalsIgnoreCase(destination)) {
            activities = new String[]{
                    "Check-in, Laboni Beach, seafood dinner",
                    "Himchori Waterfall, local shopping and Burmese market",
                    "Inani Beach, Marine Drive, beach sports",
                    "Cox's Bazar city tour, Ramu Buddhist Temple",
                    "Sugandha Beach, souvenir shopping, departure"
            };
        } else if ("Bandarban".equalsIgnoreCase(destination)) {
            activities = new String[]{
                    "Nilachal, Golden Temple, Meghla Tourist Complex",
                    "Nilgiri Hills, tribal village visit, Shoilo Propat waterfall",
                    "Sangu River boat ride, Bamboo food lunch",
                    "Rijuk Waterfall, Baklai trek",
                    "Chimbuk Hill, Meghla Lake, departure"
            };
        } else if ("Sreemangal".equalsIgnoreCase(destination)) {
            activities = new String[]{
                    "Tea garden tour, Lawachara National Park",
                    "Madhabpur Lake, tribal village and lemon orchard",
                    "Baikka Beel wetland, cycling tour",
                    "7-layer tea experience, local handicraft shopping",
                    "Fruit garden, Departure/relaxation"
            };
        } else if ("St. Martin's Island".equalsIgnoreCase(destination)) {
            activities = new String[]{
                    "Coral reef beach, sunset view, beach walk",
                    "Island boat tour, snorkeling, seafood lunch",
                    "Cycling tour, west beach picnic",
                    "Shell market, St. Martin village visit",
                    "Lighthouse visit, coconut garden, departure"
            };
        }

        if (activities != null) {
            // show a plan for exactly (check-in to day before check-out) days
            for (int i = 0; i < days && i < activities.length; i++) {
                itinerary.add("Day " + (i + 1) + ": " + activities[i]);
            }
        } else {
            itinerary.add("No itinerary available for this destination.");
        }

        return itinerary;
    }
}
