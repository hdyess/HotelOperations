package com.pluralsight;

public class Reservation {

    // fields
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;


    // constructors


    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }

    // getters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean setIsWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getPrice() {

        double basePrice;

        if(roomType.equalsIgnoreCase("king")) {
            basePrice = 139;
        } else if(roomType.equalsIgnoreCase("double")) {
            basePrice = 124;
        } else {
            return 0; // todo: this should never really happen maybe throw ex instead?
        }

        if(isWeekend) {
            return basePrice * 1.10;
        } else {
            return basePrice;
        }

    }

    public double getReservationTotal(){
        return 0;
    }

    // override
    @Override
    public String toString() {

        return "Reservation{" +
                "roomType=" + this.roomType +
                ", numberOfNights=" + this.numberOfNights +
                ", isWeekend=" + this.isWeekend +
                ", getPrice()=" + this.getPrice() +
                ", getReservationTotal()=" + this.getReservationTotal() +
                "}";

    }

} // closes Reservation class
