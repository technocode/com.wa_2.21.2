package com.google.android.gms.wearable;

import X.AnonymousClass008;
import X.AnonymousClass05S;
import X.AnonymousClass066;
import X.C008805h;
import X.C24801Cn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public class ConnectionConfiguration extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C24801Cn();
    public String A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public volatile String A07;
    public volatile boolean A08;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A03 = i2;
        this.A06 = z;
        this.A08 = z2;
        this.A07 = str3;
        this.A01 = z3;
        this.A00 = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        if (!AnonymousClass05S.A0H(this.A04, connectionConfiguration.A04) || !AnonymousClass05S.A0H(this.A05, connectionConfiguration.A05) || !AnonymousClass05S.A0H(Integer.valueOf(this.A02), Integer.valueOf(connectionConfiguration.A02)) || !AnonymousClass05S.A0H(Integer.valueOf(this.A03), Integer.valueOf(connectionConfiguration.A03)) || !AnonymousClass05S.A0H(Boolean.valueOf(this.A06), Boolean.valueOf(connectionConfiguration.A06)) || !AnonymousClass05S.A0H(Boolean.valueOf(this.A01), Boolean.valueOf(connectionConfiguration.A01))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, Integer.valueOf(this.A02), Integer.valueOf(this.A03), Boolean.valueOf(this.A06), Boolean.valueOf(this.A01)});
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.A04);
        if (valueOf.length() != 0) {
            str = "mName=".concat(valueOf);
        } else {
            str = new String("mName=");
        }
        sb.append(str);
        String valueOf2 = String.valueOf(this.A05);
        if (valueOf2.length() != 0) {
            str2 = ", mAddress=".concat(valueOf2);
        } else {
            str2 = new String(", mAddress=");
        }
        sb.append(str2);
        int i = this.A02;
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append(", mType=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.A03;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append(", mRole=");
        sb3.append(i2);
        sb.append(sb3.toString());
        boolean z = this.A06;
        StringBuilder sb4 = new StringBuilder(16);
        sb4.append(", mEnabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.A08;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append(", mIsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String valueOf3 = String.valueOf(this.A07);
        if (valueOf3.length() != 0) {
            str3 = ", mPeerNodeId=".concat(valueOf3);
        } else {
            str3 = new String(", mPeerNodeId=");
        }
        sb.append(str3);
        boolean z3 = this.A01;
        StringBuilder sb6 = new StringBuilder(21);
        sb6.append(", mBtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String valueOf4 = String.valueOf(this.A00);
        return AnonymousClass008.A0O(sb, valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new String(", mNodeId="), "]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A04, false);
        C008805h.A10(parcel, 3, this.A05, false);
        C008805h.A0u(parcel, 4, this.A02);
        C008805h.A0u(parcel, 5, this.A03);
        C008805h.A13(parcel, 6, this.A06);
        C008805h.A13(parcel, 7, this.A08);
        C008805h.A10(parcel, 8, this.A07, false);
        C008805h.A13(parcel, 9, this.A01);
        C008805h.A10(parcel, 10, this.A00, false);
        C008805h.A0r(parcel, A032);
    }
}
