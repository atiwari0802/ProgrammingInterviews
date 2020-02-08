package sorting;

import org.junit.jupiter.api.Test;

public class ComparableTest {

    static class Person implements Comparable<Integer> {

        public Integer age;

        @Override
        public int compareTo(Integer o) {
            return this.age.compareTo(o);
        }
    }

    @Test
    public void testCompareTo() {
        Person person = new Person();
        person.age = 10;

        System.out.println(person.compareTo(1));
        System.out.println(person.compareTo(10));
        System.out.println(person.compareTo(11));
    }


}
