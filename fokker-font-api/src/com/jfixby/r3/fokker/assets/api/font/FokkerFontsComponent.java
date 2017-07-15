
package com.jfixby.r3.fokker.assets.api.font;

import com.jfixby.r3.fokker.api.StringHandler;
import com.jfixby.scarabei.api.assets.ID;

public interface FokkerFontsComponent {

	public FokkerFontPackageReader packageReader ();

	public FokkerFont obtainFont (ID assetID);

	public FokkerString obtainString (StringHandler stringID);

}
