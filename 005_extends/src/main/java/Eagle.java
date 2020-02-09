import java.util.Arrays;

public class Eagle extends Bird {
    private String[] food;

    public Eagle() {}

    public Eagle(int age, double weight, double flySpeed, String[] food) {
        super(age, weight, flySpeed);
        this.food = food;
    }

    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public void eat(String[] food) {
        Arrays.stream(food).forEach(System.out::print);
    }
}
