public class HandleNullPointerEx {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println("Exception: String is null!");
        }
    }
}
