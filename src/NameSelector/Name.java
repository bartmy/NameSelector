package NameSelector;

import java.util.ArrayList;
import java.util.Scanner;

public class Name {
    private String name = "";
    static ArrayList<String> names = new ArrayList<>();
    Scanner read = new Scanner(System.in);

    public void takeNames(){
        takeFirstName();
        anotherName();
    }

    public void takeFirstName(){
        setName();
        addNameToList();
        System.out.println(" rozmiar listy: " + names.size());
    }
    public void takeName(String name){
        setName(name);
        addNameToList();
        System.out.println(" rozmiar listy: " + names.size());
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
        Selector select = new Selector();
        select.selectName();
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
    public void printList(){
        for (String s : names) {
            System.out.println(s);
        }
    }

    public ArrayList<String> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "name= " + getName();
    }


}
