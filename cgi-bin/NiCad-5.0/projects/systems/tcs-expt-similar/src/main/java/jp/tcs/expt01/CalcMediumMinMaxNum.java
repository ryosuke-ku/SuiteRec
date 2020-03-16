package jp.tcs.suiterec;

public class CalcMediumMinMaxNum {

	/**
	 * 1つの引数selectが"Medium"の場合、残り3引数a, b, cの中央値を返す．
	 * 1つの引数selectが"max"の場合、残り3引数a, b, cの最大値を返す．
	 * 1つの引数selectが"min"の場合、残り3引数a, b, cの最小値を返す．
	 * 1つの引数selectが上記以外の場合、-1を返す．
	 * テストの実験のため，わかりにくいコードにしてある．
	 * @return a, b, cの中央値
	 */

	public int calcMediumMinMaxNum(String select,int x, int y, int z)
	{
		if (select == "Medium"){
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
		else if (select == "max"){
			return Math.max(x, Math.max(y,z));
		}
		else if (select == "min"){
			return Math.min(x, Math.min(y,z));
		}
		else {
			return -1;
		}
	}
	
}