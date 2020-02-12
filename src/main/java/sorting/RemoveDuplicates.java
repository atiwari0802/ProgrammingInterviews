package sorting;

import java.util.List;

public class RemoveDuplicates {

    public List<Name> removeDuplicates(List<Name> names) {
        names.sort((a, b) -> {
            int comparision = a.firstName.compareTo(b.firstName);
            if ( comparision!= 0) {
                return comparision;
            }
            return a.lastName.compareTo(b.lastName);
        });

        int writeIndex = 0;
        for (int i = 1; i < names.size(); i++) {
            if (names.get(i - 1).firstName.compareTo(names.get(i).firstName) != 0) {
                names.set(++writeIndex, names.get(i));
            }
        }
        names.subList(++writeIndex, names.size()).clear();
        return names;
    }

    public static class Name {
        public String firstName, lastName;

        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
