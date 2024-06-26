public class HandleArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {
        try{
            int[] array = {1,2,3};
            System.out.println(array[3]);
        }catch(Exception e){
            System.out.println("Exception: Array index is out of bounds!");
        }
    }
}
