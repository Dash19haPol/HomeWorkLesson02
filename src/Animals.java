public abstract class Animals {
    protected String name;

    private static int count = 0;

    public Animals(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCount() {
        return count;
    }
}
