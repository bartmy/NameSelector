package NameSelector;

import java.util.Scanner;

public class NameSelector {
    Name name = new Name();
    Selector selector = new Selector();
    static boolean programEnd;

    public void programStart(){
        while (!programEnd){
            System.out.println("Witam w programie losujacym imię. \n" +
                    "Jesli zastanawiasz się nad kilkoma imionami dla dziecka ten program pomoże Ci wybrać zdając się na ślepy los.\n" +
                    "Dziekujemy za skorzystanie i gratualcje :) \n");
            programMenu();
        }

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
                isThatAll();
                break;
            case 2:
                chooseMultiple();
                isThatAll();
                break;
            case 3:
                predefinedOne();
                isThatAll();
                break;
            case 4:
                predefinedMultiple();
                isThatAll();
                break;
            case 5:
                thankYouEndProgram();
                // koniec
                break;
            default:
                didNotRecognize();
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
                thankYouEndProgram();
                break;
            default:
                didNotRecognize();
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
        selector.randomMultipleNames(); // losujemy imie z listy na x ilosci prob
    }
    public void predefinedOne(){
        selector.predefinedList(); // lista naszych imion zeby bylo szybciej
        selector.randomOneName(); // losujemy jedno imie z podanej listy
    }
    public void predefinedMultiple(){
        selector.predefinedList(); // lista naszych imion zeby bylo szybciej
        selector.randomMultipleNames(); // losujemy imie z listy na x ilosci prob
    }
    public Integer switchChoice(){
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }
    public void didNotRecognize(){
        System.out.println("nie rozpoznałem");
    }
    public void thankYouEndProgram(){
        System.out.println("dziekujemy za skorzystanie z programu");
        programEnd = true;
    }



    /*program losuje imie z podanej listy
    * mozna podac ilosc proby*/

    // program wyswietla wyniki, procentowo, i w ilosciach
}
