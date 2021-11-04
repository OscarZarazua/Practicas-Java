public class Fish extends Animal implements Pet{
    private String name="";

    public Fish(){
        super(0);
    }

    public void walk(){
        System.out.println("Los pescados no caminan, nadan");
    }
    public void eat(){
        System.out.println(name+" come plakton");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println(name+" le gusta jugar con otros peces");
    }
}

