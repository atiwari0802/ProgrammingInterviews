package arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Pagination {

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
        if (sortOrder == 0){
            items.sort((l1, l2) ->  l1.get(sortParameter).compareTo(l2.get(sortParameter)));
        } else {
            items.sort((l1, l2) ->  l2.get(sortParameter).compareTo(l1.get(sortParameter)));
        }

        int startIndex = (items.size() / itemsPerPage) * pageNumber;
        int endIndex = startIndex + itemsPerPage;

        return items.subList(startIndex, endIndex).stream().map(list -> list.get(0)).collect(Collectors.toList());
    }
}
