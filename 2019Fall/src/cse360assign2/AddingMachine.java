// * Author: Tianyi Liang
// * Asu ID: 1213381791
// * Assignment: assignment 2
// * Date: 2019/10/09
// * Description: learn to use version a control system. add sub values. 
//https://github.com/tliang11/terryliang/tree/master/2019Fall/src/cse360assign2
 





package cse360assign2;

public class AddingMachine {

	private int total;
	private StringBuffer data = new StringBuffer("0");//use string buffer to save values.
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		
	}
	
	public int getTotal () {
		return total;//return totaal
	}
	
	public void add (int value) {
		total = total + value;
		data.append("+");//use append to save add values.
		data.append(value);
	}
	
	public void subtract (int value) {
		total = total - value;
		data.append("-");////use append to save sub values.
		data.append(value);
	}
		
	public String toString () {
		return data.toString();
	}

	public void clear() {
	    total = 0;
	    data.delete(0, data.length());//delete all values.
	}
}
