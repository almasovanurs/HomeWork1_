package com.company;

public class Truck {
    private int id;
    private String name;
    private String drivers;
    private States states;

    public static Truck carPark(int id, String name, String drivers, States states) {
        Truck park = new Truck();
        park.id = id;
        park.name = name;
        park.drivers = drivers;
        park.states = states;
        return park;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivers() {
        return drivers;
    }

    public void setDrivers(String drivers) {
        this.drivers = drivers;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", drivers='" + drivers + '\'' +
                ", states=" + states +
                '}';
    }
}