
package com.jfixby.r3.fokker.texture.red;

import com.jfixby.r3.fokker.texture.api.FokkerTexture;
import com.jfixby.rana.api.Asset;
import com.jfixby.rana.api.AssetsGroup;
import com.jfixby.scarabei.api.assets.ID;

public class RedFokkerRasterData implements FokkerTexture, Asset {

	private final ID asset_id;
	private final com.badlogic.gdx.graphics.g2d.Sprite gdx_sprite;

	private final RedFokkerRasterDataGroup master;

	public RedFokkerRasterData (final ID raster_id, final com.badlogic.gdx.graphics.g2d.Sprite gdx_sprite,
		final RedFokkerRasterDataGroup redFokkerRasterDataGroup) {
		this.gdx_sprite = gdx_sprite;
		this.asset_id = raster_id;
		this.master = redFokkerRasterDataGroup;
	}

	public com.badlogic.gdx.graphics.g2d.Sprite getGdxSprite () {
		return this.gdx_sprite;
	}

	@Override
	public ID getAssetID () {
		return this.asset_id;
	}

	@Override
	public AssetsGroup getGroup () {
		return this.master;
	}

	@Override
	public String toString () {
		return "RedFokkerRasterData[" + this.master + "]";
	}

}
