package Amazon;

public class ExcelSheetColumnTile {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            sb.append((char) ((columnNumber % 26) + 'A'));
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}