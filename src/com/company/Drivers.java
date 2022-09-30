
package com.company;
public class Drivers {
    private  int id;
    private  String name;
    private  String truck;


    public Drivers(){

    }
    public static Drivers drivers(int id, String name, String truck) {
        Drivers drivers = new Drivers();
        drivers.id=id;
        drivers.name = name;
        drivers.truck = truck;

        return drivers;
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

    @Override
    public String toString() {return "";
    }
}
