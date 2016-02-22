package org.silvercatcher.reforged.api;

import java.util.ArrayList;
import java.util.List;

import org.silvercatcher.reforged.ReforgedMod;
import org.silvercatcher.reforged.ReforgedRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;

public class APIRegistry {
	
	/**All the Dependencies for our mod*/
	public static final String Deps = "after:Thaumcraft";
	
	/**Saves all the instances of the Integration APIs*/
	public static List<APIBase> regList = new ArrayList<APIBase>();
	
	/**The Creative Tab for all Integration-Items*/
    public static CreativeTabs tabReforgedIntegration;
	
	/**Adds all the Integration APIs to the List {@link APIRegistry#regList}*/
	public static void addAPIs() {
		if(Loader.isModLoaded(new Thaumcraft().getModName())) {
			regList.add(new Thaumcraft());
		}
		if(!regList.isEmpty()) {
			tabReforgedIntegration = new CreativeTabs(ReforgedMod.ID + "_integration") {
				@Override
				public Item getTabIconItem() {
					return ReforgedRegistry.GOLDEN_KATANA;
				}
			};
		}
	}
}