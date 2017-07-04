
package com.jfixby.r3.fokker.assets.api.raster;

import com.jfixby.rana.api.loader.PackageReader;

public interface FokkerTexturePackageReader {

	public static final String PACKAGE_FORMAT_ATLAS = "libGDX.Atlas";
	public static final String PACKAGE_FORMAT_TEXTURE = "libGDX.Texture";

	PackageReader reader ();

}
