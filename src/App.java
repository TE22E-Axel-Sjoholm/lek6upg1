import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner tb = new Scanner(System.in);

        System.out.println("Tal 1 ");
        int tal1 = tb.nextInt();

        System.out.println("Tal 2 ");
        int tal2 = tb.nextInt();

        if(tal1 == tal2){System.out.println("Tal 1 är samma som tal 2");}
        if(tal1 > tal2){System.out.println("Tal 1 är större än tal 2");}
        if(tal1 < tal2){System.out.println("Tal 1 är mindre än tal 2");}
        int[] array = new int[3];
        array[0] = 4;
        array[1] = 5;
        array[2] = 2;
        
        
        if (array[0] > array[1] || array[0] > array[2]) {
            System.out.println("Första elementet är större än andra eller tredje elementet.");
        }

        if (array[0] < array[1] || array[0] < array[2]) {
            System.out.println("Första elementet är mindre än andra eller tredje elementet.");
        }

        if (array[0] == array[1] || array[0] == array[2]) {
            System.out.println("Första elementet är lika med andra eller tredje elementet.");
        }
    }
}
