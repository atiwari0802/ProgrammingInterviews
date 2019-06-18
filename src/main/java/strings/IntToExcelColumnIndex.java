package strings;

public class IntToExcelColumnIndex {

    public String intToExcelColumnIndex(int columnNumber) {

        StringBuffer buffer = new StringBuffer();

        while (columnNumber != 0) {
            int remainder = columnNumber % 26;
            buffer.append((char)(remainder + 'A' - 1));
            columnNumber /= 26;
        }

        return buffer.reverse().toString();
    }

}
