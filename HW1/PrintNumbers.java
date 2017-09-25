public class PrintNumbers {

    public static void main(String[] args){
        int firstNum = Integer.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int secNum = Integer.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));





       

     
	if((firstNum % 2)==0){
		firstNum+=2;
	}else{
		firstNum++;
	}
	
	for(int i = firstNum; i < secNum; i+=2)

            System.out.println(i);

    }
}
