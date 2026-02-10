package coffee.axle.antifirm;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AntiFirm implements ClientModInitializer {
	public static final String MOD_ID = "antifirm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Meow! (Prime debugging)");
	}
}