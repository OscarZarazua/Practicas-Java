
public class Main {

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.walk();
        spider.eat();

        System.out.println("\n");
        Cat cat = new Cat("Wiskas");
        cat.eat();
        cat.play();

        System.out.println("\n");
        Fish fish = new Fish();
        fish.eat();
        fish.walk();
        fish.play();

        System.out.println("\n");
        cat.play();
        fish.eat();
        spider.eat();
    }
}