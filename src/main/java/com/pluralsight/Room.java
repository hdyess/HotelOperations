package com.pluralsight;

public class Room {

    // fields
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    // constructors
    public Room(int numberOfBeds) {

        this.numberOfBeds = numberOfBeds;
        this.price = 120.00;
        this.isOccupied = false;
        this.isDirty = false;


    }


    // getters setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return (!(isOccupied || isDirty));
    }


    // override
    @Override
    public String toString() {

        return "Room{" +
                "numberOfBeds=" + this.numberOfBeds +
                ", price=" + this.price +
                ", isOccupied=" + this.isOccupied +
                ", isDirty=" + this.isDirty +
                ", isAvailable=" + this.isAvailable() +
                "}";

    }

    //

}// closes room class
