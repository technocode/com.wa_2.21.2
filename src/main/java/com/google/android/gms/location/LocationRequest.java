package com.google.android.gms.location;

import X.AnonymousClass008;
import X.AnonymousClass066;
import X.C008805h;
import X.C24461Ar;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationRequest extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C24461Ar();
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;

    public LocationRequest() {
        this.A01 = 102;
        this.A04 = 3600000;
        this.A05 = 600000;
        this.A07 = false;
        this.A03 = Long.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A00 = 0.0f;
        this.A06 = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.A01 = i;
        this.A04 = j;
        this.A05 = j2;
        this.A07 = z;
        this.A03 = j3;
        this.A02 = i2;
        this.A00 = f;
        this.A06 = j4;
    }

    public static void A00(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Request[");
        int i = this.A01;
        A0S.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i != 105) {
            A0S.append(" requested=");
            A0S.append(this.A04);
            A0S.append("ms");
        }
        A0S.append(" fastest=");
        A0S.append(this.A05);
        A0S.append("ms");
        long j = this.A06;
        if (j > this.A04) {
            A0S.append(" maxWait=");
            A0S.append(j);
            A0S.append("ms");
        }
        float f = this.A00;
        if (f > 0.0f) {
            A0S.append(" smallestDisplacement=");
            A0S.append(f);
            A0S.append("m");
        }
        long j2 = this.A03;
        if (j2 != Long.MAX_VALUE) {
            A0S.append(" expireIn=");
            A0S.append(j2 - SystemClock.elapsedRealtime());
            A0S.append("ms");
        }
        int i2 = this.A02;
        if (i2 != Integer.MAX_VALUE) {
            A0S.append(" num=");
            A0S.append(i2);
        }
        A0S.append(']');
        return A0S.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.A01 == locationRequest.A01) {
            long j = this.A04;
            long j2 = locationRequest.A04;
            if (j == j2 && this.A05 == locationRequest.A05 && this.A07 == locationRequest.A07 && this.A03 == locationRequest.A03 && this.A02 == locationRequest.A02 && this.A00 == locationRequest.A00) {
                long j3 = this.A06;
                if (j3 >= j) {
                    j = j3;
                }
                long j4 = locationRequest.A06;
                if (j4 < j2) {
                    j4 = j2;
                }
                if (j == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Long.valueOf(this.A04), Float.valueOf(this.A00), Long.valueOf(this.A06)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A01);
        C008805h.A0w(parcel, 2, this.A04);
        C008805h.A0w(parcel, 3, this.A05);
        C008805h.A13(parcel, 4, this.A07);
        C008805h.A0w(parcel, 5, this.A03);
        C008805h.A0u(parcel, 6, this.A02);
        C008805h.A0t(parcel, 7, this.A00);
        C008805h.A0w(parcel, 8, this.A06);
        C008805h.A0r(parcel, A032);
    }
}
