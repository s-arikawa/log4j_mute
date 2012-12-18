package log4j_mute;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args ) {

		LogicA.process();

		LogicB.mute();
		LogicB.process();

	}
}
