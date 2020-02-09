public class Bird extends Animal{
    private double flySpeed;
    public Bird(int age, double weight, double flySpeed) {
        super(age, weight);
        this.flySpeed = flySpeed;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void flyWay() {
        System.out.println("Birds fly way!");
    }

}
