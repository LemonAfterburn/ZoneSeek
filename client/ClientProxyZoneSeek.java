package ZoneSeek.client;

import ZoneSeek.common.CommonProxyZoneSeek;
import ZoneSeek.common.entities.EntityInfectedArrow;
import ZoneSeek.common.entities.InfectedCow;
import ZoneSeek.common.entities.InfectedPig;
import ZoneSeek.common.entities.LagoonSlug;
import ZoneSeek.common.entities.render.RenderInfectedArrow;
import ZoneSeek.common.entities.render.RenderInfectedCow;
import ZoneSeek.common.entities.render.RenderInfectedPig;
import ZoneSeek.common.entities.render.RenderLagoonSlug;
import ZoneSeek.common.models.ModelInfectedCow;
import ZoneSeek.common.models.ModelInfectedPig;
import ZoneSeek.common.models.ModelLagoonSlug;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyZoneSeek extends CommonProxyZoneSeek{

	@Override
	public void registerRenders(){
		RenderingRegistry.registerEntityRenderingHandler(EntityInfectedArrow.class, new RenderInfectedArrow());
		RenderingRegistry.registerEntityRenderingHandler(InfectedPig.class, new RenderInfectedPig(new ModelInfectedPig(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(InfectedCow.class, new RenderInfectedCow(new ModelInfectedCow(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(LagoonSlug.class, new RenderLagoonSlug(new ModelLagoonSlug(), 0.5F));
	}
	
	public int addArmor(String Armor){
		return RenderingRegistry.addNewArmourRendererPrefix(Armor);
	}

}