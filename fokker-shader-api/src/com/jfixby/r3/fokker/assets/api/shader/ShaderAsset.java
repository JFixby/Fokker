
package com.jfixby.r3.fokker.assets.api.shader;

import com.jfixby.scarabei.api.collections.Mapping;

public interface ShaderAsset {

	public VertexProgram getVertexProgram ();

	public FragmentProgram getFragmentProgram ();

	public Mapping<String, ShaderParameter> listParameters ();

	public boolean isOverlay ();

}
