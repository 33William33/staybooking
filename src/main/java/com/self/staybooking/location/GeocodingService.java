package com.self.staybooking.location;

import com.self.staybooking.model.GeoPoint;
import org.springframework.stereotype.Service;

@Service
public class GeocodingService {
    public GeoPoint getGeoPoint(String address) {
        // call Google Geocoding API to get geo point
        return new GeoPoint(0, 0);
    }
}
