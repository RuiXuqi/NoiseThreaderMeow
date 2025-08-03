package noisethreader;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import zone.rong.mixinbooter.IEarlyMixinLoader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.12.2")
public class NoiseThreaderPluginEarly implements IFMLLoadingPlugin, IEarlyMixinLoader {

	public NoiseThreaderPluginEarly() {
	}

	@Override
	public String[] getASMTransformerClass()
	{
		return new String[0];
	}
	
	@Override
	public String getModContainerClass()
	{
		return null;
	}
	
	@Override
	public String getSetupClass()
	{
		return null;
	}
	
	@Override
	public void injectData(Map<String, Object> data) { }
	
	@Override
	public String getAccessTransformerClass()
	{
		return null;
	}

	@Override
	public List<String> getMixinConfigs() {
		List<String> mixins = new ArrayList<>();
		mixins.add("mixins.noisethreader.vanilla.json");

		if (Loader.isModLoaded("openterraingenerator")) {
			mixins.add("mixins.noisethreader.otg.json");
		}
		if (Loader.isModLoaded("bettercaves")) {
			mixins.add("mixins.noisethreader.bettercaves.json");
		}

		return Collections.singletonList("mixins.noisethreader.vanilla.json");
	}
}