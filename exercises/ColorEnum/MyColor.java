package exercises.ColorEnum;

public enum MyColor {
    
    RED(true),
    GREEN(true),
    WHITE,
    BLACK{
        @Override
        public String toString() {
            return "color: black";
        }
    };

    private boolean isBasicColor;

    MyColor() {
        isBasicColor = false;
    }

    MyColor(boolean isBasicColor) {
        this.isBasicColor = isBasicColor;
    }

    public boolean isBasicColor() {
        return isBasicColor;
    }
}
