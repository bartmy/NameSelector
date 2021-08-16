package NameSelector;

public class NameSelector {

    public void programStart(){
        System.out.println("Witam w programie losujacym imię. \n" +
                "Jesli zastanawiasz się nad kilkoma imionami dla dziecka ten program pomoże Ci wybrać zdając się na ślepy los.\n" +
                "Dziekujemy za skorzystanie i gratualcje :) \n");
        Name name = new Name();
        Selector selector = new Selector();

//        name.takeNames(); // uzytkownik tworzy liste imion
        selector.predefinedList(); // lista naszych imion zeby bylo szybciej

//        selector.randomOneName(); // losujemy jedno imie z podanej listy
        selector.randomNamesList(); // losujemy imie z listy na x ilosci prob
        selector.countNamesInList();
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
