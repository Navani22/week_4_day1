public class Practice1_2 {

        public static void main(String[] args) {
            try {
                int a = 5;
                int b = 0;
                int result = a / b; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("HaHa");
            }
    
            // IllegalArgumentException
             catch (IllegalArgumentException e) {
                System.out.println("HeHe");
            }
        }
    
    
}
