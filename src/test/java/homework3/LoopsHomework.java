package homework3;

import lesson2.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LoopsHomework {
    @Test
    public void loopsHomework() {

        List<String> intNumbers = new ArrayList<String>();
        for (int i = 0; i < 21; i++) {
            System.out.println(i);


        }
    }

    @Test
    public void Students() {

        List<String> studentFirstName = new ArrayList<String>();
        List<String> studentNumber = new ArrayList<String>();

        System.out.println(studentFirstName.isEmpty());
        System.out.println(studentNumber.isEmpty());

        studentFirstName.add("1 Lena Tester");
        studentFirstName.add("2 Masha Tester");
        studentFirstName.add("3 Kris Engineer");
        studentFirstName.add("4 Beate Tester");
        studentFirstName.add("5 Ben Engineer");

        for (String name : studentFirstName) {
            System.out.println(name);
        }

        for (String name : studentFirstName) {

            if (name.contains("Tester")) {
                System.out.println(name + " This student is studying in a Tester course");
            }

            Students lena = new Students();
            lena.setFirstName("Lena");
            lena.setNumber("1");
            lena.setCourse("Tester");

            Students masha = new Students();
            masha.setFirstName("Masha");
            masha.setNumber("2");
            masha.setCourse("Tester");

            Students kris = new Students();
            kris.setFirstName("Kris");
            kris.setNumber("3");
            kris.setCourse("Engineer");

            Students beate = new Students();
            beate.setFirstName("Beate");
            beate.setNumber("4");
            beate.setCourse("Tester");

            Students ben = new Students();
            ben.setFirstName("Ben");
            ben.setNumber("5");
            ben.setCourse("Engineer");

            System.out.println(lena.getFirstName() + " " + lena.getNumber());
            System.out.println(masha.getFirstName() + " " + masha.getNumber());
            System.out.println(kris.getFirstName() + " " + kris.getNumber());
            System.out.println(beate.getFirstName() + " " + beate.getNumber());
            System.out.println(ben.getFirstName() + " " + ben.getNumber());


        }
    }
}
