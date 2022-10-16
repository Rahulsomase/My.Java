package Day_11;

interface X {
    abstract void xabsMethod();
    default void xdefMethod(){
        System.out.println("Defaulat Method of X");
    };

    void xstaticMethod();
}
interface Y {
    abstract void yabsMethod();
    default void ydefMethod(){
        System.out.println("Defaulat Method of Y");
    };

    void ystaticMethod();
}

interface Z extends X,Y{
    abstract void zabsMethd();
}

class ZImpl implements Z{
    @Override
    public void xabsMethod() {
        System.out.println("xabsmethod inside zimpl");
    }

    @Override
    public void xstaticMethod() {
        System.out.println("xstatic inside zimpl");
    }

    @Override
    public void yabsMethod() {
        System.out.println("yabsmethod inside zimpl");
    }

    @Override
    public void ystaticMethod() {
        System.out.println("ystatic inside zimpl");
    }

    @Override
    public void zabsMethd() {
        System.out.println("zabsmethod inside zimpl");
    }

    @Override
    public void xdefMethod() {
        System.out.println("X default mehod over ride indise the Zimp class");
    }
}
public class question1 {
    public static void main(String[] args) {
        ZImpl obj = new ZImpl();

        obj.xabsMethod();
        obj.xdefMethod();
        obj.xstaticMethod();
        obj.yabsMethod();
        obj.ystaticMethod();
        obj.ydefMethod();
        obj.zabsMethd();

    }
}
