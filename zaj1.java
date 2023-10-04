import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
        //String string1 = scanner.next();
        //String string2 = scanner.next();
       // System.out.printf(string1);
        //System.out.printf(string2);
       /* double liczba1, liczba2, liczba3, liczba4;
        System.out.println("Podaj pierwsza liczbe: ");
        liczba1 = scanner.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        liczba2 = scanner.nextDouble();
        System.out.println("Podaj trzecia liczbe: ");
        liczba3 = scanner.nextDouble();
        System.out.println("Podaj czwarta liczbe: ");
        liczba4 = scanner.nextDouble();

        System.out.println("Wynik dodawania to: " +(liczba1+liczba2+liczba3+liczba4));
        //System.out.println("Wynik odejmowania to: " +(liczba1-liczba2));
        //System.out.println("Wynik mnozenia to: " +(liczba1*liczba2));
        //System.out.println("Wynik dzielenia to: " +(liczba1/liczba2));

        double bok;
        System.out.println("Podaj dlugosc boku kwadratu: ");
        bok = scanner.nextDouble();
        System.out.println("Pole kwadratu wynosi: " +(bok*bok));*/

       /* int a, b, c;
        System.out.println("Podaj pierwsza liczbe: ");
        a = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        b = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Najwieksza liczba to: " +a);
        }
        else if (b >= c && b >= a) {
            System.out.println("Najwieksza liczba to: " +b);
        }
        else {
            System.out.println("Najwieksza liczba to: " +c);
        }*/

       /* int rok;
        System.out.println("Podaj rok: ");
        rok = scanner.nextInt();
        if (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0)) {
            System.out.println("Rok " +rok+ " jest przestepny");
        }
        else {
            System.out.println("Rok " +rok+ " nie jest przestepny");
        }*/

       // for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
       // }

        int x, suma = 0;
        while (suma <= 100) {
            System.out.println("Podaj liczbe calkowita: ");
            x = scanner.nextInt();
            suma += x;
        }
        System.out.println("Suma wynosi " + suma);
    }
}