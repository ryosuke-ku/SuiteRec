package jp.tcs.expt03;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreResultTest {


	  @Test //score1が負の数の場合Errorを返す
	  public void returnError_Score1IsNegative()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult((-150), 10);
	      assertEquals("Error", actual);
	  }

	  @Test //score2が負の数の場合Errorを返す
	  public void returnError_Score2IsNegative()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(90, (-300));
	      assertEquals("Error", actual);
	  }

	  @Test //score1が100を超える場合Errorを返す
	  public void returnError_Score1over100()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(120, 50);
	      assertEquals("Error", actual);
	  }

	  @Test //score2が100を超える場合Errorを返す
	  public void returnError_Score2over100()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(80, 130);
	      assertEquals("Error", actual);
	  }

	  @Test //score1が0の場合Errorを返す
	  public void returnError_Score1Is0()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(0, 10);
	      assertEquals("failure", actual);
	  }

	  @Test //score2が0の場合Errorを返す
	  public void returnError_Score2Is0()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(50, 0);
	      assertEquals("failure", actual);
	  }

	  @Test //score1に60,score2に60を入力してpassを返す
	  public void returnPass_ScoreOf60and60()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(60, 60);
	      assertEquals("pass", actual);
	  }

	  @Test //score1に40,score2に80を入力してpassを返す
	  public void returnPass_ScoreOf33and87()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(40, 80);
	      assertEquals("pass", actual);
	  }

	  @Test //score1に20,score2に90を入力してpassを返す
	  public void returnPass_ScoreOf30and95()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(20, 90);
	      assertEquals("pass", actual);
	  }

	  @Test //score1に100,score2に1を入力してpassを返す
	  public void returnPass_ScoreOf100and1()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(100, 1);
	      assertEquals("pass", actual);
	  }

	  @Test //score1に76,score2に33を入力してfailureを返す
	  public void returnPass_ScoreOf76and33()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(76, 33);
	      assertEquals("failure", actual);
	  }

	  @Test //score1に10,score2に29を入力してfailureを返す
	  public void returnFailure_ScoreOf10and29()  throws Throwable  {
	      ScoreResult sut = new ScoreResult();
	      String actual = sut.scoreResult(10, 29);
	      assertEquals("failure", actual);
	  }

}
