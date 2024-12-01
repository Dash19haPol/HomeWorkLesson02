public abstract class Animals {
    protected String name;

    private static int animalCount = 0;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}
