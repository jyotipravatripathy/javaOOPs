package Test;
	public abstract class ForLoop {

			String s1 = "John";

			public void printName(){

			System.out.println(s1);

			}

			public void printSection(){

			System.out.println(s1+ "A section");

			}

			}

			class B extends ForLoop{

			public void printName(){

			System.out.println(s1);

			}

			public static void main(String[] args){

			B obj = new B();

			obj.printName();

			obj.printSection();

			}

			}