
package com.jfixby.r3.fokker.font.api;

import com.jfixby.r3.render.api.FontParameters;
import com.jfixby.scarabei.api.assets.ID;

public interface FokkerFontsComponent {

	public FokkerFontPackageReader packageReader ();

	public FokkerFont obtainFont (ID assetID);

	public FokkerString obtainString (final ID fontID, final FontParameters fontParams, final String stringValue);

}
