package log4j_mute;

public class LogicA {

	private static MyLogger logger = MyLogger.getInstans(LogicA.class);

	public static void process(){
		logger.info("処理A!!");
	}
}
