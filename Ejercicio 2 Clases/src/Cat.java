public class Cat extends Animal implements Pet{
    String name="cat";

    public Cat(){
        this("");
    }
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println(name+" Le gusta jugar con la bola de estambre");
    }
    public void eat(){
        System.out.println(name+" come pescados");
    }
}
