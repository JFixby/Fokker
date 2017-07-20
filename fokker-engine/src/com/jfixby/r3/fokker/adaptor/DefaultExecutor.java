
package com.jfixby.r3.fokker.adaptor;

import com.jfixby.r3.api.EngineState;
import com.jfixby.r3.api.UnitsMachineExecutor;
import com.jfixby.scarabei.api.log.L;

public class DefaultExecutor implements UnitsMachineExecutor {

	@Override
	public void doUpdate (final EngineState gdxAdaptor) {
		L.d("doUpdate", gdxAdaptor);
	}

	@Override
	public void doRender (final EngineState gdxAdaptor) {
		L.d("doRender", gdxAdaptor);
	}

	@Override
	public void doDeploy () {
		L.d("doDeploy");
	}

	@Override
	public void doPause () {
		L.d("doPause");
	}

	@Override
	public void doDispose () {
		L.d("doDispose");
	}

	@Override
	public void doResume () {
		L.d("doResume");
	}

}
