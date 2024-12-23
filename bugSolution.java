public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (args.length > 0) {
            try {
                int index = Integer.parseInt(args[0]);
                if (index >= 0 && index < arr.length) {
                    System.out.println(arr[index]);
                } else {
                    System.out.println("Index out of bounds");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Please provide an index as a command-line argument.");
        }
    }
}