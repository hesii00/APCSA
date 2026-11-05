public class StringManipulator {
    private String text1;
    private String text2;

    
    public StringManipulator() {
        text1 = "";
        text2 = "";
    }

    
    public StringManipulator(String x, String y) {
        text1 = x;
        text2 = y;
    }

    public String combineStrings() {
        return text1 + text2;
    }

    public int getCombinedLength() {
        return text1.length() + text2.length();
    }

    public String firstHalf() {
        return text1.substring(0, text1.length() / 2);
    }

    public int indexOfFirstLetter() {
        if (text2.isEmpty()) {
            return -1;
        }
        String firstChar = text2.substring(0, 1);
        return text1.indexOf(firstChar);
    }

    public String swapFirstAndSecondHalf() {
        int halfLength = text1.length() / 2;
        String firstHalf = text1.substring(0, halfLength);
        String secondHalf = text1.substring(halfLength);
        return secondHalf + firstHalf; 
    }
}