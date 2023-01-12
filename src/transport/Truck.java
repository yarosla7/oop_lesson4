package transport;

import driver.LicenseC;

public class Truck extends Transport {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    //методы родительского класса:

    @Override
    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + " started the engine and started moving on a route.");
        System.out.println(getBrand() + " is moving right now.");
    }

    @Override
    public void endMoving() {
        System.out.println(getBrand() + " " + getModel() + " slows down.");
        System.out.println(getBrand() + " " + getModel() + " has stopped.");
    } //желательно их убрать вообще, так как машины получается поедут без водителей и привязать классы автомобилей к водителю

    @Override
    public String toString() {
        return "Truck " + super.toString();
    }


    //методы интерфейса в родительском классе. так как методы интерфейса по сути несут информацию общего характера для каждого объекта, переопределять методы под классы наследники не стал.

    //методы водителя для взаимодействия с автомобилем:

    public void willParticipate(LicenseC driver) {
        if (driver.isHasDrivesLicense()) {
            System.out.println("Driver " + driver.getFullName() + " drives " + this + " and will participate in the race.");
        } else {
            System.out.println("Driver " + driver.getFullName() + " excluded.");
        }
    }
}
