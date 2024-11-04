package week14.exception;

public class Checked {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            Thread.sleep(1000);    //pauses code execution
            System.out.println("Finish");
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}

class Sleep{
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");
        Thread.sleep(1000);    //pauses code execution
        System.out.println("Finish");



    }
}
