
package com.jfixby.r3.fokker.api;

import com.jfixby.r3.api.EngineState;

public interface UnitsMachineExecutor {

	public void doDeploy ();

	public void doUpdate (EngineState engine_state);

	public void doRender (EngineState engine_state);

	public void doDispose ();

	public void doPause ();

	public void doResume ();

}
