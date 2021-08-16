package NameSelector;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Selector {
    Name name = new Name();
    Random random = new Random();
    Scanner read = new Scanner(System.in);

    public void predefinedList(){
        System.out.println("Lista naszych imion, żeby było szybciej.");
        Name.names.add("Michał");
        Name.names.add("Staś");
        Name.names.add("Wojtek");
        Name.names.add("Kuba");
        name.printList();
    }
    public String randomOneName(){
        System.out.println("wybieramy losowe imie z " + Name.names.size() + " podanych przez Ciebie imion.");
        int index = random.nextInt(Name.names.size());
        String randomOneName = Name.names.get(index);

        System.out.println("Wybrane imię to: " + randomOneName);
        return randomOneName;
    }
    public String randomName(){
        int index = random.nextInt(Name.names.size());
        return Name.names.get(index);
    }
    public void multipleRandomNames(){
        System.out.println("wybieramy losotw imie z listy na podstawie zalozonej liczby prób.");
        System.out.println("Podaj ile razy namy probowac: ");
        int x = read.nextInt();
        int lp = 0;
//        String tempName = randomName();
        for (int i = 0; i < x; i++){
            String tempName = randomName();
            lp++;
            System.out.println(lp + " " + tempName + " " + name.getNameCount());
        }
    }


}
