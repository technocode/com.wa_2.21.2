package com.google.android.gms.maps;

import X.AnonymousClass066;
import X.AnonymousClass185;
import X.AnonymousClass1BY;
import X.C008805h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1BY();
    public int A00 = -1;
    public CameraPosition A01;
    public LatLngBounds A02 = null;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Float A0F = null;
    public Float A0G = null;

    public GoogleMapOptions() {
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.A03 = C008805h.A0V(b);
        this.A04 = C008805h.A0V(b2);
        this.A00 = i;
        this.A01 = cameraPosition;
        this.A05 = C008805h.A0V(b3);
        this.A06 = C008805h.A0V(b4);
        this.A07 = C008805h.A0V(b5);
        this.A08 = C008805h.A0V(b6);
        this.A09 = C008805h.A0V(b7);
        this.A0A = C008805h.A0V(b8);
        this.A0B = C008805h.A0V(b9);
        this.A0C = C008805h.A0V(b10);
        this.A0D = C008805h.A0V(b11);
        this.A0F = f;
        this.A0G = f2;
        this.A02 = latLngBounds;
        this.A0E = C008805h.A0V(b12);
    }

    public final String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("MapType", Integer.valueOf(this.A00));
        r2.A00("LiteMode", this.A0B);
        r2.A00("Camera", this.A01);
        r2.A00("CompassEnabled", this.A06);
        r2.A00("ZoomControlsEnabled", this.A05);
        r2.A00("ScrollGesturesEnabled", this.A07);
        r2.A00("ZoomGesturesEnabled", this.A08);
        r2.A00("TiltGesturesEnabled", this.A09);
        r2.A00("RotateGesturesEnabled", this.A0A);
        r2.A00("ScrollGesturesEnabledDuringRotateOrZoom", this.A0E);
        r2.A00("MapToolbarEnabled", this.A0C);
        r2.A00("AmbientEnabled", this.A0D);
        r2.A00("MinZoomPreference", this.A0F);
        r2.A00("MaxZoomPreference", this.A0G);
        r2.A00("LatLngBoundsForCameraTarget", this.A02);
        r2.A00("ZOrderOnTop", this.A03);
        r2.A00("UseViewLifecycleInFragment", this.A04);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0s(parcel, 2, C008805h.A00(this.A03));
        C008805h.A0s(parcel, 3, C008805h.A00(this.A04));
        C008805h.A0u(parcel, 4, this.A00);
        C008805h.A0z(parcel, 5, this.A01, i, false);
        C008805h.A0s(parcel, 6, C008805h.A00(this.A05));
        C008805h.A0s(parcel, 7, C008805h.A00(this.A06));
        C008805h.A0s(parcel, 8, C008805h.A00(this.A07));
        C008805h.A0s(parcel, 9, C008805h.A00(this.A08));
        C008805h.A0s(parcel, 10, C008805h.A00(this.A09));
        C008805h.A0s(parcel, 11, C008805h.A00(this.A0A));
        C008805h.A0s(parcel, 12, C008805h.A00(this.A0B));
        C008805h.A0s(parcel, 14, C008805h.A00(this.A0C));
        C008805h.A0s(parcel, 15, C008805h.A00(this.A0D));
        Float f = this.A0F;
        if (f != null) {
            C008805h.A0v(parcel, 16, 4);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A0G;
        if (f2 != null) {
            C008805h.A0v(parcel, 17, 4);
            parcel.writeFloat(f2.floatValue());
        }
        C008805h.A0z(parcel, 18, this.A02, i, false);
        C008805h.A0s(parcel, 19, C008805h.A00(this.A0E));
        C008805h.A0r(parcel, A032);
    }
}
