
package com.jfixby.r3.fokker.render.shader;

import com.jfixby.r3.fokker.api.FOKKER_SYSTEM_ASSETS;
import com.jfixby.r3.fokker.assets.api.shader.FokkerShaders;
import com.jfixby.r3.fokker.assets.api.shader.FokkerShader;
import com.jfixby.r3.fokker.assets.api.shader.ShaderParameters;
import com.jfixby.r3.fokker.render.raster.FokkerRasterRenderer;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.geometry.Geometry;
import com.jfixby.scarabei.api.geometry.Rectangle;

public class FokkerShaderRenderer {

	private FokkerRasterRenderer raster_renderer;
	private Rectangle shape;
	private ID fake_asset;

	public void init (final FokkerRasterRenderer raster_renderer) {
		this.raster_renderer = raster_renderer;
		this.shape = Geometry.newRectangle();
		// shape.setPosition(Double.NEGATIVE_INFINITY,
		// Double.POSITIVE_INFINITY);

		this.fake_asset = FOKKER_SYSTEM_ASSETS.RASTER_IS_MISING;
	}

	public void open (final ID fokkerShader, final ShaderParameters params) {
		final Rectangle shape = params.shape();
		if (shape != null) {
			this.shape.setup(shape);
		} else {
			this.resetShape();
		}
		final FokkerShader shader = FokkerShaders.obtain(fokkerShader);
// shader.applyParameters(params);
		this.raster_renderer.open(null, 1f, shader, params);
	}

	private void resetShape () {
		this.shape.setOriginRelative();
		this.shape.setPosition();
		this.shape.setSize(10000, 10000);
	}

	public void close (final ID fokkerShader) {
		final FokkerShader shader = FokkerShaders.obtain(fokkerShader);
		this.raster_renderer.close(null, shader);

	}

	public void applyShader () {
		this.raster_renderer.drawSprite(this.fake_asset, this.shape);
		// final Texture blend_texture = this.current_shader.getBlendTexture();

		// sprites_renderer.drawSprite(spriteAssetID, shape, current_opacity,
		// blend_texture);
	}

}
