import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class Loops {
    @Test
    public void loopsLesson() {

        List<String> studentNames = new ArrayList<String>();

        System.out.println(studentNames.isEmpty());

        studentNames.add("Lena");
        studentNames.add("Masha");
        studentNames.add("Kris");
        studentNames.add("Beate");
        studentNames.add("Ben");
        studentNames.add("Dima");
        studentNames.add("Kelly");
        studentNames.add("Lily");

        System.out.println(studentNames.get(1));
        System.out.println(studentNames.size());
        System.out.println(studentNames.isEmpty());

        //-------------FOR-----------------------

        for (int i = 0; i < studentNames.size(); i = i + 1) {   //i = i + 1 ---> i++   (bolee kratkaja zapisj virazhenija)

            System.out.println(studentNames.get(i));

            //----------FOREACH-----------------
            for (String name : studentNames) {
                System.out.println(name);

            }
            for (String name : studentNames) {

                if (name.startsWith("D")) {
                    System.out.println(name);

                }
            }

            //----------------------IF--ELSE----------
            for (String name : studentNames) {

                if (name.startsWith("D")) {
                    System.out.println(name + "This name starts with D");


                } else {
                    System.out.println(name + "This name doesn't starts with D");
                }

            }
        }
    }
}