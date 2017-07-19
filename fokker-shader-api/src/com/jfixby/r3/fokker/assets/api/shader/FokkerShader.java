
package com.jfixby.r3.fokker.assets.api.shader;

import com.jfixby.r3.fokker.api.Shader;
import com.jfixby.r3.fokker.api.ShaderSettings;

public interface FokkerShader extends Shader {

	com.badlogic.gdx.graphics.glutils.ShaderProgram getGdxShaderProgram ();

	boolean isOverlay ();

	void applySettings (ShaderSettings params);

	void setOpacity (double opacity);

}
