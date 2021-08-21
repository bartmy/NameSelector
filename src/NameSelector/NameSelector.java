package NameSelector;

import java.util.Scanner;

public class NameSelector {
    Name name = new Name();
    Selector selector = new Selector();

    public void programStart(){
        System.out.println("Witam w programie losujacym imię. \n" +
                "Jesli zastanawiasz się nad kilkoma imionami dla dziecka ten program pomoże Ci wybrać zdając się na ślepy los.\n" +
                "Dziekujemy za skorzystanie i gratualcje :) \n");
        programMenu();
    }

    public void programMenu(){
        System.out.println("Podaj co chcesz zrobić");
        System.out.println("1. Podaj imiona i wylosuj jedno\n" +
                "2. Podaj imiona oraz ilość losowań, zobaczysz które imię pokazuje się najczęściej\n" +
                "3. Wylosuje jedno imie z naszej listy \n" +
                "4. Skorzystaj z naszej listy na wiele losowań \n" +
                "5. Koniec");
        menuOptions();
    }

    public void menuOptions(){
        switch (switchChoice()){
            case 1:
                chooseOne();
                break;
            case 2:
                chooseMultiple();
                break;
            case 3:
                predefinedOne();
                break;
            case 4:
                predefinedMultiple();
                break;
            case 5:
                System.out.println("dziekujemy za skorzystanie z programu");
                // koniec
                break;
            default:
                System.out.println("nie rozpoznałem");
                programMenu();
                break;
        }
    }
    public void isThatAll(){
        System.out.println("czy to wszystko ? 1- menu, 2-end");
        switch (switchChoice()){
            case 1:
                programMenu();
                break;
            case 2:
                break;
            default:
                System.out.println("nie rozpoznałem");
                isThatAll();
                break;
        }

    }
    public void chooseOne(){
        name.takeNames(); // uzytkownik tworzy liste imion
        selector.randomOneName(); // losujemy jedno imie z podanej listy
    }
    public void chooseMultiple(){
        name.takeNames(); // uzytkownik tworzy liste imion
        selector.randomNamesList(); // losujemy imie z listy na x ilosci prob
        selector.countNamesInList(); // liczymy ile razy ktore imie sie pokazuje
    }
    public void predefinedOne(){
        selector.predefinedList(); // lista naszych imion zeby bylo szybciej
        selector.randomOneName(); // losujemy jedno imie z podanej listy
    }
    public void predefinedMultiple(){
        selector.predefinedList(); // lista naszych imion zeby bylo szybciej
        selector.randomNamesList(); // losujemy imie z listy na x ilosci prob
        selector.countNamesInList(); // liczymy ile razy ktore imie sie pokazuje
    }
    public Integer switchChoice(){
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }



    /*program losuje imie z podanej listy
    * mozna podac ilosc proby*/

    // program wyswietla wyniki, procentowo, i w ilosciach
}
