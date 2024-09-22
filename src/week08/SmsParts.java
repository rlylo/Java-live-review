package week08;

public class SmsParts {
    public static void main(String[] args) {
        String sms = "Sender: <Mike Smith>. From Number: [202-123-3456]. Message: {I love programming}";
        int senderStart = sms.indexOf("<") + 1;
        int senderEnd = sms.indexOf(">");
        String sender = sms.substring(senderStart, senderEnd);
        System.out.println("sender: " + sender);

        String phone = sms.substring(sms.indexOf("[") + 1, sms.indexOf("]"));
        System.out.println("phone: " + phone);

        String message = sms.substring(sms.indexOf("{") + 1, sms.indexOf("}"));
        System.out.println("message: " + message);


    }
}
