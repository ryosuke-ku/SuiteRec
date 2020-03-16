package jp.tcs.expt01;

public class ReturnMidiumNum {

	public int returnMidiumNum(int num1, int num2, int num3)
	{
	    if (num1 < num2) {
	        if (num2 < num3) {
	            return num2;
	        } else if (num1 < num3) {
	            return num3;
	        } else {
	            return num1;
	        }
	    } else {
	        if (num1 < num3) {
	            return num1;
	        } else if (num2 < num3){
	            return num3;
	        } else {
	            return num2;
	        }
	    }
	}
}
