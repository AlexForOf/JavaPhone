package Phones;

public class Main {
    public static void main(String[] args) {
//        Phone phone = new Phone();
//        phone.call("+380934015060");
//        MobilePhone mobilePhone = new MobilePhone();
//        for (int i = 0; i < 10; i++) {
//            mobilePhone.call("+3893123" + i + "2231");
//        }
//        mobilePhone.showHistory();
        Smartphone smartphone = new Smartphone();
        for (int i = 0; i < 10; i++) {
            smartphone.call("+3893123" + i + "2231");
        }
        smartphone.showHistory();
    }
}
