
package com.jfixby.r3.fokker.assets.api.font;

import com.jfixby.scarabei.api.ComponentInstaller;
import com.jfixby.scarabei.api.assets.ID;

public class FokkerFonts {

	static private ComponentInstaller<FokkerFontsComponent> componentInstaller = new ComponentInstaller<FokkerFontsComponent>(
		"FokkerFonts");

	public static final void installComponent (final FokkerFontsComponent component_to_install) {
		componentInstaller.installComponent(component_to_install);
	}

	public static final FokkerFontsComponent invoke () {
		return componentInstaller.invokeComponent();
	}

	public static final FokkerFontsComponent component () {
		return componentInstaller.getComponent();
	}

	public static final FokkerFont obtain (final ID assetID) {
		return componentInstaller.getComponent().obtain(assetID);

	}

}
