package com.klef.jfsd.exam.inherit;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Insert a generic Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Generic Vehicles");
        vehicle.setType("Transport2");
        vehicle.setMaxSpeed(200);
        vehicle.setColor("Green");
        session.save(vehicle);

        // Insert a Car
        Car car = new Car();
        car.setName("Benz");
        car.setType("Car");
        car.setMaxSpeed(180);
        car.setColor("Black");
        car.setNumberOfDoors(4);
        session.save(car);

        // Insert a Truck
        Truck truck = new Truck();
        truck.setName("FireTrucker");
        truck.setType("Truck");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(10000);
        session.save(truck);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully.");
    }
}
