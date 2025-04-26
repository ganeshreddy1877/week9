 interface playable{
    void play();
}
 class volleyball implements playable{
    public void play(){
        System.out.println("volleyball is a sport");

    }
}
 class basketball implements playable{
    public void play(){
        System.out.println("basketbal is also a sport");

    }
}
 class football implements playable{
    public void play(){
        System.out.println("football is a sport ");

    }
}

public class games {
public static void main(String[] args) {
    playable vb =new volleyball();
    playable bb=new basketball();
    playable fb=new football();
    vb.play();
    bb.play();
    fb.play();
}  
}
