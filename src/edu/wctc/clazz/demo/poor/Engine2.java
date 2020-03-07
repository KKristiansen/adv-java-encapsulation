package edu.wctc.clazz.demo.poor;

public class Engine2 {
    private int cylinderCount;
    private boolean running;

    public Engine2() {

    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public void start() {
        this.running=true;
    }

    public void stop() {
        this.running=false;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public boolean isRunning() {
        return running;
    }
}
