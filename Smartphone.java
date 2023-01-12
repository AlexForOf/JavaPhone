package Phones;

public class Smartphone extends MobilePhone{
    Person[] contacts = new Person[(int)(Math.random() * (5 - 2) + 2)];

    public Smartphone(){
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new Person(i);
        }
    }

    void showHistory(){
        for (int i = 0; i < callsHistory.length; i++) {
            String nameCaller = null;
            String surnameCaller = null;
            String numberCaller = null;
            for (int j = 0; j < contacts.length; j++) {
                if (callsHistory[i].equals(contacts[j].number)){
                    nameCaller = contacts[j].name;
                    surnameCaller = contacts[j].surname;
                    numberCaller = contacts[j].number;
                    break;
                }
            }
            if(nameCaller != null){
                System.out.println((i+1) + ". " + "The number: " + callsHistory[i] + " is from your contact list!");
                System.out.println("Name: " + nameCaller + " Surname: " + surnameCaller + " Number: " + numberCaller);
            }else{
                System.out.println((i+1) + ". " + "The number: " + callsHistory[i] + " is not from your contact list!");
                System.out.println("Number: " + callsHistory[i]);
            }
        }
    }
}
