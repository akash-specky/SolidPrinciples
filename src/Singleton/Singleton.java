package Singleton;

public class Singleton {
    public static void main(String[] args) {
        ABC abc = ABC.getInstance();
        System.out.println(abc.ab);
    }
}

class ABC{
    static ABC abc = new ABC();
    String ab="aa";
    private ABC(){

    }
    public static ABC getInstance(){
        return abc;
    }
}
