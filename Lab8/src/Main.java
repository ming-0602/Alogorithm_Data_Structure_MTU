import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Medals medals = new Medals();
        medals.set(0,0, 1);
        medals.set(0, 2, 1);
        medals.set(1, 0, 1);

        //etc
        medals.display();

        int totalMedals = medals.total();

        System.out.println("\n\nTotal medals " + totalMedals);

        int[] countryTotals = medals.calculateRowTotals();
        int[] countryTotals2 = medals.calculateColumnTotals();

        //Display the row totals
        System.out.println("Row Totals: ");
        for (int i = 0; i < countryTotals.length; i++) {
            System.out.println(countryTotals[i]);
        }

        System.out.println("Columns Totals: ");
        System.out.println(Arrays.toString(countryTotals2));

    }
}
