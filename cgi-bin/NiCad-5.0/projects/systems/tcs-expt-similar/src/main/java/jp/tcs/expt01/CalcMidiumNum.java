package jp.tcs.expt01;

public class CalcMidiumNum {

	public int calcMidiumNum(int x, int y, int z)
	{
	    if (x < y) {
	        if (y < z) {
	            return y;
	        } else if (x < z) {
	            return z;
	        } else {
	            return x;
	        }
	    } else {
	        if (x < z) {
	            return x;
	        } else if (y < z){
	            return z;
	        } else {
	            return y;
	        }
	    }
	}
	
}
