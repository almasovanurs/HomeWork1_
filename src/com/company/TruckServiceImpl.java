package com.company;

import java.util.Scanner;

public class TruckServiceImpl implements TruckService {
 private String truckName;
    private String driverName = null;
    private Drivers drive = new Drivers();
    private String driver;

    Scanner scanner = new Scanner(System.in);
    public void truckMethod(Truck[] truck, int truckId, Drivers[] drivers) {
        for (int i = 0; i < truck.length; i++) {
            if (truck[i].getId() == truckId) {
                if (truck[i].getDrivers().equals(" ")) {
                    driver = " ";
                } else {
                    driver = String.valueOf(truck[i].getDrivers().equals(" "));
                }
                truckName = truck[i].getName();
                System.out.println("N:      " + truck[i].getId());
                System.out.println("Truck:      " + truck[i].getName());
                System.out.println("Driver:      " + driver);
                System.out.println("State:      " + truck[i].getStates());

                if (truck[i].getStates().equals(States.BASE)) {
                    System.out.println("if you want to send the path click on 1");
                    System.out.println("if you want to send for repair click on 2");
                    System.out.println("if you want to select a driver click on 3");

                    int click = scanner.nextInt();
                    if (click == 3) {
                        changeDriver(truck[i],drivers);
                        truck[i].setDrivers(String.valueOf(drive));
                        System.out.println("If you want to send it on the road then press 1 if not then 0");
                        click=scanner.nextInt();
                    }
                    switch (click){
                        case 1 -> changeDriver(truck[i],drivers);
                        case 2 ->startRepair(truckName);
                        case 3 ->startDriving(driver,truckName);
                    }

                    if (click ==1){
                        changeDriver(truck[i],drivers);
                        truck[i].setDrivers(String.valueOf(drive));
                        startDriving(truckName,driverName);
                        truck[i].setStates(States.REMOTE);
                    } else if (click==0) {
                        System.out.println("The truck remained at the base");
                    } else if (click==2) {
                        startRepair(truckName);
                        truck[i].setStates(States.REPAIR);
                    }

                } else if (truck[i].getStates().equals(States.REMOTE)) {
                    System.out.println("You have chosen a truck " +truckName + "and he's on his way ");
                } else if (truck[i].getStates().equals(States.REPAIR)) {
                    System.out.println("You have chosen a truck " + truckName +"and it's under renovation ");
                }

            }if (truckId>truck.length){
                throw new RuntimeException("Choose one of 3");
            }
        }
    }


    @Override
    public void changeDriver(Truck truck, Drivers[] drivers) {
        if (truck.getStates().equals(States.REMOTE)) {
            System.out.println("truck on the way impossible to change the driver");
        }else if (truck.getStates().equals(States.REPAIR)) {
            System.out.println("can't change driver");
        }else {

            for (int i = 0; i < drivers.length; i++) {
                if (drivers[i].getId() == truck.getId()) {
                    driverName = drivers[i].getName();
                    driver = String.valueOf((drivers[i]));
                }
            }
            System.out.println("Now the truck - + " + truckName + ", the driver leads- " + driverName);
        }
    }


    @Override
    public void startDriving(String truck, String driver) {
        System.out.println("Now the truck " + truck + "on the way and leads him " + driver);
    }

    @Override
    public void startRepair(String truck) {
        System.out.println("Now the truck " + truck + " for repairs");
    }

}

