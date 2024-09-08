package week06.methods_with_return;

public class ShoesSize {
    public static void main(String[] args) {
        System.out.println(getShoeSize(30));
    }


    public static int getShoeSize(double cm) {
        if (cm < 28.9 || cm > 33) {
            System.out.println("Sorry we don't have that size avaiable");
            return 0;
        }
        if (cm == 33) {
            return 13;
        } else if (cm >= 32.2) {
            return 12;
        } else if (cm>=31.4) {
            return 11;
        } else if (cm>=30.5) {
            return 10;
        } else if (cm>=29.7) {
            return 9;
        } else {
            return 8;
        }
    }
}
