import java.util.HashMap;
import java.util.Map;

public class UC8{

    public static void main(String[] args) {

       
        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        
        String message = "OOPS";

       
        displayBanner(message, patternMap);
    }

   
    private static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        return map;
    }

    
    private static void displayBanner(String message, Map<Character, String[]> patternMap) {

        // Banner has 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Loop through each character in the message
            for (char ch : message.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                lineBuilder.append(pattern[row]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}