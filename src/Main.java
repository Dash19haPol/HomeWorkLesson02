public  class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобік");
        Dog dogMumu = new Dog("Рекс");

        Cat catMatroskin = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсік");

        dogBobik.run(150);
        dogBobik.swim(5);
        dogMumu.run(501);
        dogMumu.swim(11);

        catMatroskin.run(100);
        catMatroskin.swim(5);
        catBarsik.run(201);

        System.out.println("Кількість собак: " + Dog.getDogCount());
        System.out.println("Кількість котів: " + Cat.getCatCount());
        System.out.println("Всього тварин: " + Animals.getAnimalCount());
    }

}
