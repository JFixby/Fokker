
package com.jfixby.r3.fokker.assets.api.shader;

import com.jfixby.r3.fokker.api.ShaderSettings;

public interface FokkerShader {

	com.badlogic.gdx.graphics.glutils.ShaderProgram getGdxShaderProgram ();

	boolean isOverlay ();

	void applyParameters (ShaderSettings params);

	void setOpacity (double opacity);

}
