package week15;

public class NegativeBalanceException  extends  RuntimeException{
    public NegativeBalanceException(String message){
        super(message);
    }
}
