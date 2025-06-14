// File: HelloWorld.java
public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        String message = hw.sayHello("DevOps Engineer");
        System.out.println(message);
    }

    public String sayHello(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Stranger!";
        }
        return "Hello, " + name + "!";
    }
}
