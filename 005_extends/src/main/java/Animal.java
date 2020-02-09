public class Animal {
    private int age;
    private double weight;


    public Animal() {}

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat(String food) {
        System.out.println("animal eat" + food);
    }

    public void sleep() {
        System.out.println("睡觉了！");
    }
}
