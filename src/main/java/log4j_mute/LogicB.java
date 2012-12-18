package log4j_mute;

public class LogicB {

	private static MyLogger logger = MyLogger.getInstans(LogicB.class);

	public static void process(){
		logger.info("処理B!!");
	}

	public static void mute(){
		logger = MyLogger.getInstansNoConsole(LogicB.class);
	}

}
