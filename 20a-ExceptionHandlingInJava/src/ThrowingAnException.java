public class ThrowingAnException {
    public static void main(String[] args) {
        try{
            checkAge(17);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if(age<18){
            throw new Exception("Exception: Age must be older than 18.");
        }
        System.out.println("Age is valid.");
    }
}
