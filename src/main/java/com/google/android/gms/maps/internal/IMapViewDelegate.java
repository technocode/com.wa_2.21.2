package com.google.android.gms.maps.internal;

import X.AnonymousClass1BH;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface IMapViewDelegate extends IInterface {
    void A7D(AnonymousClass1BH v);

    IObjectWrapper A9l();

    void AEh(Bundle bundle);

    void AIJ();

    void AJj();

    void AJl(Bundle bundle);

    void onDestroy();

    void onLowMemory();
}
