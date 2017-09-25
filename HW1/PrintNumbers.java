public class PrintNumbers {

    public static void main(String[] args){
        int firstNum = Integer.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int secNum = Integer.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        for(int i = firstNum+1; i < secNum; i++)
            System.out.println(i);

    }
}
