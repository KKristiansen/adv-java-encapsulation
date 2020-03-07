package edu.wctc.clazz.demo.poor;

public class Driver {
    public static void main(String[] args) {
        Engine2 e = new Engine2();
        e.setCylinderCount(4);
        Car2 c = new Car2();
        c.setEngine(e);

        e.start();

        System.out.println("Car running status: " + c.getEngine().isRunning());
        System.out.println("Engine cyclinders: " + c.getEngine().getCylinderCount());


        GoodCar goodCar = new GoodCar(6);
        goodCar.start();
        System.out.println("Car running status:" + goodCar.isRunning());
        System.out.println("Engine cyclinders: " + goodCar.getEngineType());
    }
}
