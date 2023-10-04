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
    }
}
