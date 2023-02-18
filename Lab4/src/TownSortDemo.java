import java.util.*;

import java.util.Collections;

public class TownSortDemo {
    public static void main(String[] args) {
        Town[] towns = new Town[5];
        towns[0] = new Town("Tralee", "Kerry", 23000);
        towns[1] = new Town("Macroom", "Cork", 3800);
        towns[2] = new Town("Listowel", "Kerry", 4820);
        towns[3] = new Town("Adare", "Limerick", 2650);
        towns[4] = new Town("Killarney", "Kerry", 14500);

        displayArray(towns);

        Arrays.sort(towns);
        System.out.println("\nSorted List");
        displayArray(towns);

        Scanner scn = new Scanner(System.in);
        System.out.print("\nPlease Enter Town Name: ");
        String input = scn.nextLine();
        System.out.println(findtownbyNameArray(towns, input));

        ArrayList<Town> towns1 = new ArrayList<Town>();

        towns1.add(new Town("Tralee", "Kerry", 23000));
        towns1.add(new Town("Macroom", "Cork", 3800));
        towns1.add(new Town("Listowel", "Kerry", 4820));
        towns1.add(new Town("Adare", "Limerick", 2650));
        towns1.add(new Town("Killarney", "Kerry", 14500));

        System.out.println("\nArrayList");
        displayArrayList(towns1);

        Collections.sort(towns1);
        System.out.println("\nSorted ArrayList");
        displayArrayList(towns1);

        System.out.println("\nPlease Enter a Name: ");
        String input2 = scn.nextLine();
        System.out.println(findtownbyNameArrayList(towns1,input2));




    }

    private static void displayArray(Town[] towns) {
        for (int i = 0; i < towns.length; i++) {
            System.out.println(towns[i]);
        }
    }

    private static void displayArrayList(ArrayList<Town> towns1) {
        for (Town t : towns1) {
            System.out.println(t);
        }
    }

    private static int findtownbyNameArray(Town[] towns, String name){//binary search
        String[] names = new String[towns.length];//create array
        for (int i = 0; i < towns.length; i++) {
            names[i] = towns[i].getName();//add into array
        }
        return Arrays.binarySearch(names,name);//original java function binary search

    }

    private static int findtownbyNameArrayList(ArrayList<Town> towns1, String name){
        ArrayList<String> temTown = new ArrayList<>();//create a list and put everything into it
        for (Town town: towns1) {
            temTown.add(town.getName());//getneme() is just a java function to get the string
        }
        return Collections.binarySearch(temTown, name);
    }



}