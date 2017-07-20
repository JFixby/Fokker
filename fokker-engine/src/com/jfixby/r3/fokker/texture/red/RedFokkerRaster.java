
package com.jfixby.r3.fokker.texture.red;

import com.jfixby.r3.fokker.texture.api.FokkerTexture;
import com.jfixby.r3.fokker.texture.api.FokkerTexturePackageReader;
import com.jfixby.r3.fokker.texture.api.FokkerTexturesComponent;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Map;

public class RedFokkerRaster implements FokkerTexturesComponent {

	final FokkerTextureLoader loader = new FokkerTextureLoader(this);
	final Map<ID, FokkerTexture> registry = Collections.newMap();

	public void register (final ID raster_id, final FokkerTexture data) {
		this.registry.put(raster_id, data);
	}

	@Override
	public FokkerTexturePackageReader packageReader () {
		return this.loader;
	}

	@Override
	public FokkerTexture obtain (final ID assetID) {
		return this.registry.get(assetID);
	}

}
