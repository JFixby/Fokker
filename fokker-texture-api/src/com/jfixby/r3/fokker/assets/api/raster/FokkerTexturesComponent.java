
package com.jfixby.r3.fokker.assets.api.raster;

import com.jfixby.scarabei.api.assets.ID;

public interface FokkerTexturesComponent {

	public FokkerTexturePackageReader packageReader ();

	public FokkerTexture obtain (ID assetID);

}
