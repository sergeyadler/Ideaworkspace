package serg.homework.de;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;

public class PersonReader {
    public static void main(String [] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("people.txt"));
             PrintWriter pw = new PrintWriter(
                     new FileWriter("sorted_people.txt"))) {
            br.lines()
                    .map(PersonReader::stringToPerson)
                    .sorted(Comparator.comparing(Person::getAge))
                    .forEach(pw::println);

        }
    }


    public static Person stringToPerson(String s) {
        String [] p = s.split(",");
        return new Person(p[0], Integer.parseInt(p[1]));
    }

    public static String personToString(Person p) {
        return p.name + "," + p.age;
    }
}
