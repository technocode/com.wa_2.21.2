package com.google.android.gms.common.stats;

import X.C008805h;
import X.C239918j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new C239918j();
    public int A00;
    public int A01;
    public long A02 = -1;
    public final float A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.A05 = i;
        this.A07 = j;
        this.A00 = i2;
        this.A09 = str;
        this.A0A = str3;
        this.A0B = str5;
        this.A04 = i3;
        this.A0E = list;
        this.A0C = str2;
        this.A08 = j2;
        this.A01 = i4;
        this.A0D = str4;
        this.A03 = f;
        this.A06 = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A05);
        C008805h.A0w(parcel, 2, this.A07);
        C008805h.A10(parcel, 4, this.A09, false);
        C008805h.A0u(parcel, 5, this.A04);
        C008805h.A11(parcel, 6, this.A0E);
        C008805h.A0w(parcel, 8, this.A08);
        C008805h.A10(parcel, 10, this.A0A, false);
        C008805h.A0u(parcel, 11, this.A00);
        C008805h.A10(parcel, 12, this.A0C, false);
        C008805h.A10(parcel, 13, this.A0D, false);
        C008805h.A0u(parcel, 14, this.A01);
        C008805h.A0t(parcel, 15, this.A03);
        C008805h.A0w(parcel, 16, this.A06);
        C008805h.A10(parcel, 17, this.A0B, false);
        C008805h.A0r(parcel, A032);
    }
}
