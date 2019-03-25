
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("laps.txt"))) {

            Map<String, Integer> collect = br.lines().map(s -> stringToPerson(s))
                    .collect(Collectors.groupingBy(Person::getFullName, Collectors.summingInt(p -> p.laptop.getPriceTag())));

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(collect.entrySet());
            entries.sort(Map.Entry.comparingByValue());


            entries.forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
        }
    }



     public static Person stringToPerson(String s) {
        String[] split = s.split(",");
        Laptop laptop = new Laptop(split[2], Integer.parseInt(split[3]));
        Person person = new Person(split[0], split[1], laptop);
        return person;

    }
    public static String fullName(Person p){
        return p.firstName + p.lastName;
    }
}