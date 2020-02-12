package sorting;

import java.util.*;

public class GroupBy {

    public List<Person> groupPersonsByAge(List<Person> persons) {
        Map<Integer, Integer> ageCount = new HashMap<>();
        Map<Integer, Integer> index = new HashMap<>();

        for (Person person : persons) {
            ageCount.putIfAbsent(person.age, 0);
            ageCount.computeIfPresent(person.age, (k, v) -> {
                v = v + 1;
                return v;
            });
        }
        System.out.println("Count Index " + ageCount);
        int offset = 0;
        for (Map.Entry<Integer, Integer> entry : ageCount.entrySet()) {
            index.put(entry.getKey(), offset);
            offset += entry.getValue();
        }

        System.out.println("Index Is" + index);

        List<Person> result = new LinkedList<>(persons);

        for (Person person : persons) {
            int position = index.get(person.age);
            result.set(position, person);
            position++;
            index.put(person.age, position);
        }
        return result;
    }

    public static class Person {
        public String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
