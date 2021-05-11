package HWL12;

public enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    @Override
    public String toString() {
        String s = name();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i, i+1);

            if (i % 2 == 1) {
                result.append(tmp.toLowerCase()).append(" ");
            } else {
                result.append(tmp.toUpperCase()).append(" ");
            }
        }
        return result.toString();
    }
}
