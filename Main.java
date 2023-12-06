public class Main{
    public static void main(String[] args){
        RouteCipher test = new RouteCipher(3,2);
        test.fillBlock("MOON");
        System.out.println(test.encryptBlock());
    }
}