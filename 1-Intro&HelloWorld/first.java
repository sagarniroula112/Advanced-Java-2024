import javax.swing.JOptionPane;
class Test{
	public static void main(String[] args){
		System.out.print("Hello World!");

		JOptionPane.showMessageDialog(null, "Hello");
	}
}

/*
	NOTE: Bytecode makes it platform independent. exe files only run in windows

	a> Compilation (javac): source code(.java file => byte code(.class file))
		i> Syntactic analysis (in proper java format)
		ii> Semantic analysis ()
			eg. defined a variable but it is not used, doesnot stop compilation
		
	b> Run(JVM):
		bytecode => machine code(0/1) => output

*/