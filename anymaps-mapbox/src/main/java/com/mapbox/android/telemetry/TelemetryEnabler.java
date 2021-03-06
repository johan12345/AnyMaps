/*
 * Copyright (c) 2020 Daimler AG / Moovel GmbH
 *
 * All rights reserved
 */

package com.mapbox.android.telemetry;

@SuppressWarnings("unused")
public class TelemetryEnabler {
	public static TelemetryEnabler.State retrieveTelemetryStateFromPreferences() {
		return State.DISABLED;
	}

	public static State updateTelemetryState(State enabled) {
		return enabled;
	}

	public enum State {ENABLED, DISABLED}
}
