package com.google.android.gms.maps.model;

import X.AnonymousClass066;
import X.AnonymousClass1BU;
import X.C008805h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLng extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1BU();
    public final double A00;
    public final double A01;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.A01 = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.A01 = d2;
        }
        this.A00 = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.A00) == Double.doubleToLongBits(latLng.A00) && Double.doubleToLongBits(this.A01) == Double.doubleToLongBits(latLng.A01);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.A01);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d = this.A00;
        double d2 = this.A01;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        double d = this.A00;
        C008805h.A0v(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.A01;
        C008805h.A0v(parcel, 3, 8);
        parcel.writeDouble(d2);
        C008805h.A0r(parcel, A03);
    }
}
