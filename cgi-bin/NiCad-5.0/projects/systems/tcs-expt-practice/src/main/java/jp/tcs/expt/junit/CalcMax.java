package jp.tcs.expt.junit;

public class CalcMax {
	/**
	 * 3引数a, b, cの最大値を返す．
	 * テストの練習のため，わかりにくいコードにしてある．
	 * @return a, b, cの最大値
	 */
	public int max(int a, int b, int c) {
		int x;
		if (a > b) {
			if(a > c){
				x = a;
			} else {
				x = c;
			}
		} else {
			if (b > c) {
				x = b;
			} else {
				x = c;
			}
		}
		return x;
	}
}
