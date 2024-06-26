public class UseOfFinallyBlock {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }catch(Exception e){
            System.out.println("Exception: Cannot divide by zero.");
        }finally {
            System.out.println("This block always executes.");
        }
    }
}
