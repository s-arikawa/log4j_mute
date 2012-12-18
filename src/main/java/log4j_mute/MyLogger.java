package log4j_mute;

import org.apache.log4j.Logger;


public class MyLogger {

	private Logger logger = null;

	private static final String NoConsole = "NoConsole";

	private MyLogger(Class<?> clazz){
		logger = Logger.getLogger(clazz.getName());
	}

	private MyLogger(String prefix, Class<?> clazz){
		logger = Logger.getLogger(prefix+"."+clazz.getName());
	}

	public static MyLogger getInstans(Class<?> clazz){
		return new MyLogger(clazz);
	}

	public static MyLogger getInstansNoConsole(Class<?> clazz){
		return new MyLogger(NoConsole, clazz);
	}


	public void info(String msg){
		logger.info(msg);
	}

	public void warn(String msg){
		logger.warn(msg);
	}

	public void error(String msg){
		logger.error(msg);
	}

	public void error(Throwable t){
		logger.error(null, t);
	}

	public void error(String msg, Throwable t){
		logger.error(msg, t);
	}
}
