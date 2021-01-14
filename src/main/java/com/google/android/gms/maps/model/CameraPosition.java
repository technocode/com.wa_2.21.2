package com.google.android.gms.maps.model;

import X.AnonymousClass066;
import X.AnonymousClass185;
import X.AnonymousClass1BS;
import X.C008805h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class CameraPosition extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1BS();
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r9 > 90.0f) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CameraPosition(com.google.android.gms.maps.model.LatLng r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "null camera target"
            X.C001801b.A1R(r7, r0)
            r1 = 1
            r4 = 0
            r3 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0016
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r1[r4] = r0
            java.lang.String r0 = "Tilt needs to be between 0 and 90 inclusive: %s"
            X.C001801b.A1c(r2, r0, r1)
            r6.A03 = r7
            r6.A02 = r8
            float r9 = r9 + r3
            r6.A01 = r9
            double r4 = (double) r10
            r2 = 0
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0036
            float r10 = r10 % r1
            float r10 = r10 + r1
        L_0x0036:
            float r10 = r10 % r1
            r6.A00 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CameraPosition.<init>(com.google.android.gms.maps.model.LatLng, float, float, float):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.A03.equals(cameraPosition.A03) && Float.floatToIntBits(this.A02) == Float.floatToIntBits(cameraPosition.A02) && Float.floatToIntBits(this.A01) == Float.floatToIntBits(cameraPosition.A01) && Float.floatToIntBits(this.A00) == Float.floatToIntBits(cameraPosition.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Float.valueOf(this.A02), Float.valueOf(this.A01), Float.valueOf(this.A00)});
    }

    public final String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("target", this.A03);
        r2.A00("zoom", Float.valueOf(this.A02));
        r2.A00("tilt", Float.valueOf(this.A01));
        r2.A00("bearing", Float.valueOf(this.A00));
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0z(parcel, 2, this.A03, i, false);
        C008805h.A0t(parcel, 3, this.A02);
        C008805h.A0t(parcel, 4, this.A01);
        C008805h.A0t(parcel, 5, this.A00);
        C008805h.A0r(parcel, A032);
    }
}
