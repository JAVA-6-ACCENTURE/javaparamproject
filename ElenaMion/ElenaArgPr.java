public class ElenaArgPr{
	public static void main(String[] args){
		for (int i = args[0].length(); i>0; i--)
		System.out.print(args[0].charAt(i-1));
	}
}