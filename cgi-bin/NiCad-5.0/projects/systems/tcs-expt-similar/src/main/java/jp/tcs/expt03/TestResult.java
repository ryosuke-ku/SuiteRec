package jp.tcs.expt03;

public class TestResult {

	public String testResult(int test1, int test2){
		if(( test1 < 0 || test2 < 0 ) || ( test1 > 100 || test2 > 100 )){
			return "Invalid input";
		}else if( test1 == 0 || test2 == 0 ){
			return "failure";
		}else if( test1 >= 60 && test2 >= 60 ){
		    return "pass";
		}else if( ( test1 + test2 ) >= 130 ){
			return "pass";
		}else if( ( test1 + test2 ) >= 100 && ( test1 >= 90 ||test2 >= 90 ) ){
			return "pass";
		}else {
			return "failure";
		}
	}
}
