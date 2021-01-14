package com.google.android.gms.maps.model;

import X.AnonymousClass066;
import X.AnonymousClass185;
import X.AnonymousClass1BT;
import X.C001801b;
import X.C008805h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LatLngBounds extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1BT();
    public final LatLng A00;
    public final LatLng A01;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C001801b.A1R(latLng, "null southwest");
        C001801b.A1R(latLng2, "null northeast");
        double d = latLng2.A00;
        double d2 = latLng.A00;
        C001801b.A1c(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.A01 = latLng;
        this.A00 = latLng2;
    }

    public final boolean A00(LatLng latLng) {
        double d = latLng.A00;
        LatLng latLng2 = this.A01;
        if (latLng2.A00 <= d) {
            LatLng latLng3 = this.A00;
            if (d <= latLng3.A00) {
                double d2 = latLng.A01;
                double d3 = latLng2.A01;
                double d4 = latLng3.A01;
                if (d3 <= d4) {
                    if (d3 > d2 || d2 > d4) {
                        return false;
                    }
                } else if (d3 <= d2 || d2 <= d4) {
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.A01.equals(latLngBounds.A01) && this.A00.equals(latLngBounds.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("southwest", this.A01);
        r2.A00("northeast", this.A00);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0z(parcel, 2, this.A01, i, false);
        C008805h.A0z(parcel, 3, this.A00, i, false);
        C008805h.A0r(parcel, A03);
    }
}
