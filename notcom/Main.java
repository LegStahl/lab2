import java.util.Collections;
import java.util.LinkedList;

public class Main{
	public static void main(String [] args){
		Matrix name = new Matrix(2);
		Matrix name2 = new Matrix(2);
		//Matrix name3 = new Matrix(3);
		name.setMtrx(0, 1, 1);
		name.setMtrx(1, 0, 1);
		name.setMtrx(1, 1, 0);
		System.out.println(name);
		name2.setMtrx(0, 1, 1);
		name2.setMtrx(1, 0, 1);
		name2.setMtrx(1, 1, 0);
		//System.out.println(name2);
		//name3 = name.sum(name2);
		//System.out.println(name3);
		for( int i = 0; i < 10; i++){
			System.out.println(name);
			name = name.product(name2);
		}
		System.out.println(name);
	}
}