package GUI_L02_1;

abstract class Singer {
    private static int counter = 1;
    private int startNumber;
    private String name;

    public Singer(String name) {
        this.name = name;
        this.startNumber = counter++;
    }

    abstract String sing();

    @Override
    public String toString() {
        return "(" + startNumber + ") " + name + ": " + sing();
    }

    public static Singer loudest(Singer[] singers) {
        Singer loudestSinger = null;
        int maxCapitalLetters = 0;

        for (Singer singer : singers) {
            int capitalCount = (int) singer.sing().chars().filter(Character::isUpperCase).count();
            if (capitalCount > maxCapitalLetters) {
                maxCapitalLetters = capitalCount;
                loudestSinger = singer;
            }
        }

        return loudestSinger;
    }
}
