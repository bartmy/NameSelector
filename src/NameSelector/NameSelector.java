package NameSelector;

import java.util.ArrayList;
import java.util.Scanner;

public class NameSelector {


    public void programStart(){
        System.out.println("Witam w programie losujacym imię. \n" +
                "Jesli zastanawiasz się nad kilkoma imionami dla dziecka ten program pomoże Ci wybrać zdając się na ślepy los.\n" +
                "Dziekujemy za skorzystanie i gratualcje :)");
        System.out.println("Podaj pierwsze imię: ");
        Name name = new Name();
        name.takeNames();
//        Selector select = new Selector();
//        select.selectName();
    }

    // program prosi o podanie imion
    public void programMenu(){
        System.out.println("podaj co chcesz zrobić");
        System.out.println("1. podaj imie do wylosowania\n" +
                "2. ");
    }


    /*program losuje imie z podanej listy
    * mozna podac ilosc proby*/

    // program wyswietla wyniki, procentowo, i w ilosciach
}
