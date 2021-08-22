package NameSelector;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Name {
    private String name = "";
    private int nameCount = 0;
    static ArrayList<String> names = new ArrayList<>();
    Scanner read = new Scanner(System.in);
    Random random = new Random();


    public String randomName(){
        int index = random.nextInt(names.size());
        setNameCount();
        return names.get(index);
    }

    public void takeNames(){
        takeFirstName();
        anotherName();
    }

    public void takeFirstName(){
        System.out.println("Podaj pierwsze imię: ");
        setName();
        setNameCount();
        addNameToList();
        printListSize();
    }
    public void takeName(String name){
        setName(name);
        setNameCount();
        addNameToList();
        printListSize();
    }
    public void anotherName(){
        System.out.println("wpisz kolejne imie, 0 aby zakonczyc dodawanie imion");
        String anotherName = read.nextLine();
        if(anotherName.equals("0")){
            endTakingNames();
        }else {
            takeName(anotherName);
            anotherName();
        }
    }
    public void endTakingNames(){
        System.out.println("koniec pobierania imion, drukuje liste:");
        printList();
    }
    public void printList(){
        for (String s : names) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
    public void printList(ArrayList<String> list){
        for (String s : list) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
    public void printListSize(){
        System.out.println(" rozmiar listy: " + names.size());
    }

    public int getNameCount() {
        return nameCount;
    }
    public void setNameCount() {
        this.nameCount = nameCount++;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = read.nextLine();
    }
    public void setName(String tempName) {
        this.name = tempName;
    }
    public void addNameToList(){
        names.add(getName());
    }

    public ArrayList<String> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "name= " + getName() + " count: " + getNameCount();
    }


}
