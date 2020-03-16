package jp.tcs.expt03;

public class ScoreResult {

	public String scoreResult(int score1, int score2){
		if(( score1 < 0 || score2 < 0 ) || ( score1 > 100 || score2 > 100 )) {
			return "Error";
		}else if( score1 == 0 || score2 == 0 ){
			return "failure";
		}else if( score1 >= 60 && score2 >= 60 ){
		    return "pass";
		}else if( ( score1 + score2 ) >= 120 ) {
			return "pass";
		}else if( ( score1 + score2 ) >= 100 && ( score1 >= 90 || score2 >= 90 ) ) {
			return "pass";
		}else {
			return "failure";
		}
	}
	
}
