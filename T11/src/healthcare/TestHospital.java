package healthcare;

public class TestHospital {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Hospital h1 = new Hospital("Szpital Miejski", 1500);
        Hospital h2 = h1.clone();

        h2.setName("Szpital Wojewódzki");
        System.out.println(h1.toString());
        System.out.println(h2.toString());



    }
}
