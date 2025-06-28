package exam.SingerManager;

public abstract class Singer {
    private static int nextStartNumber = 1;

    private String name;
    private int startNumber;

    public Singer(String name) {
        this.name = name;
        this.startNumber = nextStartNumber++;
    }

    public abstract String sing();

    @Override
    public String toString() {
        return "(" + startNumber + ") " + name + ": " + sing();
    }

    public static Singer loudest(Singer[] singers) {

        if (singers == null || singers.length == 0) {
            return null;
        }

        int maxCapitalLetters = -1;
        Singer loudestSinger = null;

        for (Singer singer : singers) {
            String sungText = singer.sing();
            int capital_letter_count = 0;

            // Count captital letters in the sung text
            for (char c : sungText.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    capital_letter_count++;
                }
            }

            if (capital_letter_count > maxCapitalLetters) {
                maxCapitalLetters = capital_letter_count;
                loudestSinger = singer;
            }
        }

        return loudestSinger;
    }
}
