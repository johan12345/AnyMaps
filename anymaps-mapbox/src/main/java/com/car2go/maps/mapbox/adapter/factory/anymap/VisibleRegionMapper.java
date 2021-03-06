/*
 * Copyright (c) 2015 Daimler AG / Moovel GmbH
 *
 * All rights reserved
 */

package com.car2go.maps.mapbox.adapter.factory.anymap;

import com.car2go.maps.mapbox.adapter.AnyMapAdapter;
import com.car2go.maps.mapbox.adapter.factory.Mapper;
import com.car2go.maps.model.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.VisibleRegion;

/**
 * Maps Google VisibleRegion to AnyMap VisibleRegion
 */
public class VisibleRegionMapper implements Mapper<VisibleRegion, com.car2go.maps.model.VisibleRegion> {

	private final AnyMapAdapter anyMapAdapter;

	public VisibleRegionMapper(AnyMapAdapter anyMapAdapter) {
		this.anyMapAdapter = anyMapAdapter;
	}

	@Override
	public com.car2go.maps.model.VisibleRegion map(VisibleRegion input) {
		LatLngBounds bounds = anyMapAdapter.map(input.latLngBounds);

		return new com.car2go.maps.model.VisibleRegion(bounds);
	}

}
