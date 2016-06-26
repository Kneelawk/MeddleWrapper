import net.fybertech.meddle.Meddle;

public class MeddleWrapper extends Meddle {

	/**
	 * Slightly hacky fix to make sure meddle doesn't output any launch arguments.
	 */
	@Override
	public String[] getLaunchArguments() {
		return new String[0];
	}
}
