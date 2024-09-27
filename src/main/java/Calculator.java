public class Calculator     {
    public static void main(String[] args) {
        System.out.println(addMe(12, 5));
        System.out.println(subMe(12, 5));
        System.out.println(mulMe(12, 5));
    }
    public static int addMe(int a, int b) {
        return a + b;
    }
    public static int subMe(int a, int b) {
        return a - b;
    }
    public static int mulMe(int a, int b) {
        return a * b;
    }
}
