package NameSelector;

import java.util.*;

public class Selector {
    Name name = new Name();
    Random random = new Random();
    Scanner read = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

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
    public void randomMultipleNames(){
        System.out.println("wybieramy losotw imie z listy na podstawie zalozonej liczby prób.");
        System.out.println("Podaj ile razy namy probowac: ");
        int x = read.nextInt();
        int lp = 0;
//        String tempName = randomName();
        for (int i = 0; i < x; i++){
            String tempName = name.randomName();
            list.add(tempName);
            lp++;
//            System.out.println(lp + " " + tempName + " " + name.getNameCount());
        }
        System.out.println("dokonano " + list.size() + " losowań");
        countNamesInList();
    }
    public void countNamesInList(){
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i<Name.names.size(); i++){
            String name = Name.names.get(i);
            int count = Collections.frequency(list,name);
//            System.out.println(name + " wybrano " + count + " razy");
            map.put(name,count);
        }
        // sorting algorithm added from stackoverflow https://stackoverflow.com/questions/21054415/how-to-sort-a-hashmap-by-the-integer-value
        Object[] a = map.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });
        System.out.println("wylosowane imiona w kolejności od największej liczby wylosowań do najmniejszej: ");
        for (Object e : a) {
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
                    + ((Map.Entry<String, Integer>) e).getValue());
        }
    }
}
