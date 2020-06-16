public class makeDoubleShowInt{
    public static void main(String[]args){
        Double d = 6.023e3;
        String firstNumberAsString = String.format ("%.0f", d);
        System.out.println(firstNumberAsString);
    }
}
