package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate extends IInterface {
    IObjectWrapper ACI(CameraPosition cameraPosition);

    IObjectWrapper ACK(LatLng latLng);

    IObjectWrapper ACL(LatLngBounds latLngBounds, int i);

    IObjectWrapper ACM(LatLng latLng, float f);

    IObjectWrapper ARe(float f);
}
