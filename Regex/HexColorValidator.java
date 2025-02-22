class HexColorValidator {
    public static boolean isValid(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
    public static void main(String[] args) {
        System.out.println(isValid("#FFAABB"));
    }
}