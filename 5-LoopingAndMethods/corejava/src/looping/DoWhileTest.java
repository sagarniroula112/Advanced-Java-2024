package ControlStatements.looping;

public class DoWhileTest {
	/*
	 *  -------- do-while -------
	 *  
	 *  # syntax:
	 *  	do{
	 *  		//statements
	 *  	}while(condition);
	 */ //trial software haru diye jastai, taste garnalai
	public static void main(String[] args) {
		int count = 1;
		int n = 4;
		int res = 1;
		
		do {
			res = n * count;
			System.out.println(n + " * " + count + " = " + res);
			count++;
		}while(count<=10);
	}
}


