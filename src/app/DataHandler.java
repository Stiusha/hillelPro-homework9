package app;

public class DataHandler {

    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append("(").append(i + 1).append(")\t").append(items[i]).append("\t");
        }
        if (!sb.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
