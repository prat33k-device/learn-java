public class MethodOverloading {

    // All are valid method overloading, because args or sequence of args are different
    public static void func(int a) {
    }

    public static void func(float a) {
    }

    public static void func(int a, float b) {
    }

    public static void func(float b, int a) {
    }

    // This will throw an error because return types basea
    public static void func2(int a) {
    }

    public static void func2(int b ) {
    }

    public static int func2(int a) {
        return 0;
    }

}
