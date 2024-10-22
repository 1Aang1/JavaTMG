public class Main {
    private static B bObject; // Declare B object at class level

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("No function selected. Please pass 'updateA' or 'summarizeC' as the first argument.");
            System.out.println("Usage: java Main <function_name> [arguments]");
            System.exit(1);
        }

        String functionName = args[0];

        // Create an object of class A
        A aObject = new A("Initial value in A");

        // Create objects of class C
        C cObject1 = new C("C1 - first instance");
        C cObject2 = new C("C2 - second instance");

        // Create an array of C objects
        C[] cArray = { cObject1, cObject2 };

        // Create an object of class B
        bObject = new B(aObject, cArray); // Assign to class-level variable

        switch (functionName) {
            case "updateA":
                // Check if the second argument (new value for A) is provided
                if (args.length < 2) {
                    System.out.println("Please provide a new value for A when using 'updateA'.");
                } else {
                    // Call updateAValue with the second argument
                    String newValue = args[1];
                    updateA(newValue);
                }
                break;

            case "summarizeC":
                // Call summarizeCValues and print the result
                System.out.println("Summary of C values:");
                System.out.println(bObject.summarizeCValues());
                break;

            default:
                System.out.println("Invalid function selected. Please pass 'updateA' or 'summarizeC' as the first argument.");
                System.exit(1);
        }
    }

    public static void updateA(String newValue) {
        System.out.println("Before updating A's value:");
        System.out.println(bObject.getAObject());

        bObject.updateAValue(newValue);

        System.out.println("\nAfter updating A's value:");
        System.out.println(bObject.getAObject());
    }
}
