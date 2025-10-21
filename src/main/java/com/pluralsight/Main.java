package com.pluralsight;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        ArrayList<Room> rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(3);
        Room r104 = new Room(4);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        System.out.println("rooms have 2 checked out");

        r101.checkIn();
        r102.checkIn();

        for (Room r: rooms) {
            System.out.println(r);
        }

        r102.checkOut();

        System.out.println("one room checked out");

        for (Room r : rooms) {
            System.out.println(r);
        }



        ArrayList<Reservation> reservations = new ArrayList<>();

        Reservation res1 = new Reservation("king", 2, false);
        Reservation res2 = new Reservation("king", 2, false);
        Reservation res3 = new Reservation("king", 2, false);
        Reservation res4 = new Reservation("king", 2, false);

        reservations.add(res1);
        reservations.add(res2);
        reservations.add(res3);
        reservations.add(res4);

        for (Reservation r : reservations) {
            System.out.println(r);
        }


        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1, "Matt", "IT", 23, 0);
        Employee emp2 = new Employee(2, "Dave", "HR", 25, 0);
        Employee emp3 = new Employee(3, "Kate", "Front Desk", 19, 0);
        Employee emp4 = new Employee(4, "Alex", "Housekeeping", 18, 0);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for (Employee e : employees) {
            System.out.println(e);
        }

    }// closes main method
}// closes main class
