package week13.final_keyword;

public final class FinalExample {

    public int a = 10;
    public int b;

    public static final int C = 22;
    public static final int D;

    static {
        D = 55;
    }

    public FinalExample(int b){
        this.b = b;
    }

}

/*
class Sub extends FinalExample{

}*/
