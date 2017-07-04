
package com.jfixby.r3.fokker.assets.api.font;

import com.jfixby.rana.api.loader.PackageReader;

public interface FokkerFontPackageReader {
// public static final String PACKAGE_FORMAT_SHADER = "libGDX.Shader";
	public static final String PACKAGE_FORMAT = "TrueTypeFont";

	PackageReader reader ();
}
