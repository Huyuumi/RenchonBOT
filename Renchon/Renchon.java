import twitter4j.*;
import twitter4j.conf.*;
import java.util.*;

public class Renchon {
	public static void main (String[] args)throws Exception{
		Twitter twitter = new TwitterFactory().getInstance();
		//カレンダーオブジェクトの生成
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		Status status = twitter.updateStatus("にゃんぱすー" + hour + "時になったのん！");
		System.out.println("Successfully updated the status");
	}
}
