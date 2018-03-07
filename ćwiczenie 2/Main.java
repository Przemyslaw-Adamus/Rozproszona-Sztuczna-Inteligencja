
import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws IOException {
        boolean variableBool=true;
        byte variableByte=1;
        int variableInt=22;
        char variableChar=7;
        double variableDouble=-4.2;
        int tab1D[]=new int[variableInt];
        int tab2D[][]=new int [2][2];
        int choice = 4;


        while(choice!=0)
        {
            System.out.println(variableChar);
            System.out.println("********************");
            System.out.println("*       MENU       *");
            System.out.println("********************");
            System.out.println("1.      Dzwonek     ");
            System.out.println("2.      100 -> -4.2 ");
            System.out.println("0.      Wyjście     ");
            System.out.println("********************");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    variableBool=true;
                    break;
                case 2:
                    variableBool=false;
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            for(int i=0;i<100;i++)
            {
                if(variableBool!=false)System.out.println(variableChar);
                else System.out.println(variableDouble);

            }

            System.out.println("\nWciśnij Enter, aby kontynuować...");
            System.in.read();
        }
        System.out.println("     ****************************************");
        System.out.println("\n     Koniec programu\n\n");

    }
}
