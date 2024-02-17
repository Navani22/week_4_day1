public class Practice1_1{
    public static void main(String[] args) {
        // Syntax error
        int x = 10  // not used semicolon 
        System.out.println("Syntax error demo");

        // Logical error
        int age = 5;
        int yearBorn = 1000-age;
        System.out.println("Logical error demo");

        // Runtime error
        int[] array = new int[5];
      //throws ArrayIndexOutOfBoundsException
        System.out.println(array[10]); 
    }
}
