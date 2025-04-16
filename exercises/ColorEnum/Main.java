package exercises.ColorEnum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyColor color = MyColor.RED;
        System.out.println(color);
        System.out.println(color.ordinal());
        System.out.println(MyColor.GREEN.ordinal());
        System.out.println(color.name());
        System.out.println(MyColor.BLACK);
        System.out.println(MyColor.valueOf("BLACK"));
        System.out.println(color.isBasicColor());
        System.out.println(MyColor.WHITE.isBasicColor());
        System.out.println(Arrays.toString(MyColor.values()));
    }
}
