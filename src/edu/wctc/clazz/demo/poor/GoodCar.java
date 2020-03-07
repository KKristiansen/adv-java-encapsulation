package edu.wctc.clazz.demo.poor;

import edu.wctc.clazz.demo.good.Engine;

public class GoodCar {
    private Engine engine;

    public GoodCar(int engineCylinders) {
        engine = new Engine(engineCylinders);
    }

    public void start() {
        engine.start();
    }

    public void turnOff() {
        engine.stop();
    }

    public boolean isRunning() {
        return engine.isRunning();
    }

    public int getEngineType() {
        return engine.getCylinderCount();
    }
}
