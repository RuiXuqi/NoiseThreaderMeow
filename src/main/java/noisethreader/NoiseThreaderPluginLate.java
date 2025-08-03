package noisethreader;

import net.minecraftforge.fml.common.Loader;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.ArrayList;
import java.util.List;

public class NoiseThreaderPluginLate implements ILateMixinLoader {

	@Override
	public List<String> getMixinConfigs() {
		List<String> mixins = new ArrayList<>();

		if (Loader.isModLoaded("openterraingenerator")) {
			mixins.add("mixins.noisethreader.otg.json");
		}
		if (Loader.isModLoaded("bettercaves")) {
			mixins.add("mixins.noisethreader.bettercaves.json");
		}

		return mixins;
	}
}