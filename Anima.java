abstract class Animal{
    public abstract void sound();
}
class Lion extends Animal{
    public void sound(){
        System.out.println("Roars");
    }
}
class Tiger extends Animal{
    public void sound(){
        System.out.println("Growls");
    }
}
class Main{
    public static void main(String[] args) {
        Animal L=new Lion()
    }
}