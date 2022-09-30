package com.company;

public interface TruckService {

    void changeDriver( Truck truck, Drivers[] drivers);
    void startDriving(String truck, String driver);
    void startRepair(String truck);
}
