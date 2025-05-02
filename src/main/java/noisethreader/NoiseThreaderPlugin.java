package noisethreader;

import java.util.*;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import zone.rong.mixinbooter.ILateMixinLoader;

@IFMLLoadingPlugin.MCVersion("1.12.2")
public class NoiseThreaderPlugin implements IFMLLoadingPlugin, ILateMixinLoader {

	public NoiseThreaderPlugin() {
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
		return Loader.isModLoaded("openterraingenerator") ? Arrays.asList("mixins.noisethreader.vanilla.json","mixins.noisethreader.otg.json") : Collections.singletonList("mixins.noisethreader.vanilla.json");
	}
}