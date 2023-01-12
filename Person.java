package Phones;

public class Person {

    String name;
    String surname;
    String number;

    String[] numbers = {"+389312302231", "+389312312231", "+389312322231", "+389312332231",
                        "+389312332231", "+389312342231", "+389312352231", "+389312362231",
                        "+389312372231", "+389312382231", "+389312392231"};

    public Person(int order){
        if (order % 2 != 0){
            this.name = "Bob";
            this.surname = "Marley";
        }else{
            this.name = "Jane";
            this.surname = "Doe";
        }
        this.number = numbers[(int)(Math.random() * numbers.length)];
    }
}
