package Phones;

public class MobilePhone extends Phone{
    String[] callsHistory = new String[10];

    int currentElement;

    public MobilePhone(){
        currentElement = 0;
    }

    void call(String number){
        System.out.println("You are going to call the number "  + number + ", that is going to be saved" +
                "in calls history");
        callsHistory[currentElement] = number;
        currentElement++;
        if (currentElement == 10){
            currentElement = 0;
        }
    }

    void showHistory(){
        for (int i = 0; i < callsHistory.length; i++) {
            System.out.println((i+1) + ". " + callsHistory[i]);
        }
    }
}
