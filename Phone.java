package Phones;

public class Phone {
    private String communicationInterface;
    private String color;

    void call(String number){
        System.out.println("You are going to call number: " + number);
    }
}
