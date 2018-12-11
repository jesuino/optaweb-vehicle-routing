package org.optaweb.tsp.optawebtspplanner.core;

import java.util.Objects;

public class Location {

    private final long id;
    private final LatLng latLng;

    public Location(long id, LatLng latLng) {
        Objects.requireNonNull(latLng);
        this.id = id;
        this.latLng = latLng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location that = (Location) o;
        return id == that.id &&
                latLng.equals(that.latLng);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, latLng);
    }
}
