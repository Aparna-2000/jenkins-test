public class Test
{

    private final String message = "Hello World!";

    public Test() {}

    public static void main(String[] args) {
        System.out.println(new Test().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}