package lesson2;

import org.junit.jupiter.api.Test;

public class First {

    @Test
    public void first() {
        int a = 3;
        int b = 16;
        int c = sum(a, b);
        System.out.println(c);


        c = sum(22, 15);
       System.out.println(sum(22, 15));
}

    private int sum(int a, int b) {
        System.out.println("First digit is: " + a + " and second is:" + b + "!");
        int c = a + b;
        return c;

    }
@Test
    public void usingObjects() {
        Student jelena = new Student();
        jelena.setFirstName( "Jelena" );
        jelena.setLastName( "The greatest" );
        jelena.setAge(18);
        jelena.setPersonalCode("12345-112278");

        Student timur = new Student();
        timur.setFirstName( "Timur" );
        timur.setLastName( "H" );
        timur.setAge(25);
        timur.setPersonalCode("5634863");

    System.out.println(jelena.getFirstName() + " " + jelena.getLastName());
    System.out.println(timur.getFirstName() + " " + timur.getLastName());
}
}
