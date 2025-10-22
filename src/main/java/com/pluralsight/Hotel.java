package com.pluralsight;

public class Hotel {

    String name;

    int numberOfSuites;
    int numberOfBasicRooms;

    int bookedSuites;
    int bookedBasicRooms;


    public void Hotel(String name, int numberOfSuites, int numberOfBasicRooms) {
        this.name = name;

        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedBasicRooms = 0;

        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = 0;
    }

    public void Hotel(String name, int numberOfSuites, int numberOfBasicRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;

        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedBasicRooms = bookedBasicRooms;

        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = bookedSuites;
    }

    public boolean bookRoom(int numberToBook, boolean isSuite) {
        if (isSuite) {

            if ( numberToBook + bookedSuites <= numberOfSuites ) {
                bookedSuites += numberToBook;
                return true;
            }
            return false;

        }

        if ( numberToBook + bookedBasicRooms <= numberOfBasicRooms ) {
            bookedBasicRooms += numberToBook;
            return true;
        }
        return false;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableBasicRooms() {
        return numberOfBasicRooms - bookedBasicRooms;
    }


}// closes Hotel class
