
package com.jfixby.r3.fokker.assets.api.font;

import com.jfixby.scarabei.api.assets.ID;

public interface FokkerFontsComponent {

	public FokkerFontPackageReader packageReader ();

	public FokkerFont obtain (ID assetID);

}
