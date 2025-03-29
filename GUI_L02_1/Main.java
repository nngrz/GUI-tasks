package GUI_L02_1;

public class Main {
    public static void main(String[] args) {
        Singer s1 = new Singer("Eminem") {
            @Override
            public String sing() {
                return "You own it, you better never let it go";
            }
        };

        Singer s2 = new Singer("Eagles") {
            @Override
            public String sing(){
                return "Hotel California";
            }
        };

        Singer s3 = new Singer("Simon & Garfunkel") {
            @Override
            public String sing(){
                return "Hello darkness, my old friend. I‘ve come to talk with you again";
            }
        };

        Singer sp[] = {s1, s2, s3};

        for (Singer s : sp) {
            System.out.println(s);
        }

        System.out.println("\n" + Singer.loudest(sp));
    }
}
