public class Dog extends Animals {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    private static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробіг " + distance + " м.");
        } else {
            System.out.println(name + " не може пробігти більше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " проплив " + distance + " м.");
        } else {
            System.out.println(name + " не може проплисти більше " + MAX_SWIM_DISTANCE + " м.");
        }
    }

    public static int getCount() {
        return count;
    }
}
