class Solution {
    public String reorderSpaces(String text) {
        int space = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') space++;
        }

        String[] temp = text.trim().split(" +");  
        int word = temp.length;

        int divide = word > 1 ? space / (word - 1) : 0;
        int extra = word > 1 ? space % (word - 1) : space;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i]);
            if (i != temp.length - 1) {
                for (int j = 0; j < divide; j++) sb.append(" ");
            }
        }

        for (int i = 0; i < extra; i++) sb.append(" ");

        return sb.toString();
    }
}
