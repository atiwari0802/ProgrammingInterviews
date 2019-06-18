package strings;

public class ExcelColumnIndexToInt {

    public int columnIndexToInt(String columnIndex) {

        return columnIndex.chars()
                .reduce(0, (sum, c) -> sum * 26 + c - 'A' + 1);
    }

  /*  public int columnIndexToIntStartingWithZero(String columnIndex) {

        return columnIndex.chars()
                .reduce(0, (sum, c) -> sum * 26 + c - 'A');
    }*/
}
