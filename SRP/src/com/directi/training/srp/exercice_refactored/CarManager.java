package com.directi.training.srp.exercice_refactored;


public class CarManager
{
    private final CarDb carsDb;
    private final CarTools carTools;
    public CarManager(){
        this.carsDb = new CarDb();
        this.carTools = new CarTools();
    }

    public String getCarsName() {
        return carTools.composeCarsName(carsDb.getCarsDb());
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : carsDb.getCarsDb()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
