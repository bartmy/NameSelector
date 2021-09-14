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
                    "Dziekujemy za skorzystanie z programu i serdecznie gratulujemy :) \n");
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
                thankYouEndProgram();
                // koniec
                break;
            default:
                didNotRecognize();
                programMenu();
                break;
        }
        isThatAll();
    }

    public void isThatAll(){
        System.out.println("czy to wszystko ? 1- menu, 3-end"); // add 2- rerun
        switch (switchChoice()){
            case 1:
                programMenu();
                break;
            case 3:
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
}
