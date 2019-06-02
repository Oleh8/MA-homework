package hw.three;

public class SortByPart {

    public static String printTextPerRole(String[] parts, String[] lines) {
        StringBuilder output = new StringBuilder("");
        for (String part : parts) {
            output.append(part + ":\n");
            for (int i = 0; i < lines.length; i++) {
                if (lines[i].startsWith(part + ":")) {
                    output.append(i + 1 + ") ");
                    output.append(lines[i].substring(part.length() + 2));
                    output.append("\n");
                }
            }
            output.append("\n");
        }
        return output.toString();
    }
}
