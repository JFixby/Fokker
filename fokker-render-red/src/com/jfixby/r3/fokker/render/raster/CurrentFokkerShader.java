
package com.jfixby.r3.fokker.render.raster;

import com.jfixby.r3.fokker.assets.api.shader.FokkerShaderHandler;
import com.jfixby.scarabei.api.util.JUtils;

public class CurrentFokkerShader {

	private com.badlogic.gdx.graphics.glutils.ShaderProgram gdx_shader_program;
	private FokkerShaderHandler current_shader;
	private boolean the_same;

	public final boolean setShader (final FokkerShaderHandler shader_handler) {
		this.the_same = equals(this.current_shader, shader_handler);
		if (this.the_same) {
			return false;
		}
		this.current_shader = shader_handler;
		this.gdx_shader_program = this.current_shader.getGdxShaderProgram();
		return true;
	}

	static final private boolean equals (final FokkerShaderHandler a, final FokkerShaderHandler b) {
		return JUtils.equalObjects(a, b);
	}

	public final com.badlogic.gdx.graphics.glutils.ShaderProgram getGdxShaderProgram () {
		return this.gdx_shader_program;
	}

}
