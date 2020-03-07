package edu.wctc.method.demo.poor;

public class Dog2 {

    private int age;
    private boolean isGood;

    public Dog2(int age) {
        setAge(age);
    }

    public void setGood(boolean isGood) {
        this.isGood = isGood;
    }

    public void chaseMailCarrier() {
        startRunning();
        navigateToMailCarrier();
        closeGapToMailCarrier();
    }

    private void closeGapToMailCarrier() {
        System.out.println("closing gap");
    }

    private void startRunning() {
        System.out.println("starting to run");
    }

    private void navigateToMailCarrier() {
        System.out.println("navigating");
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age can't be negative.");
        this.age = age;
    }

}
