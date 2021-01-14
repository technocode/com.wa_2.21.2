package com.google.android.gms.auth;

import X.AnonymousClass05S;
import X.AnonymousClass066;
import X.C001801b;
import X.C008805h;
import X.C236016o;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;

public class TokenData extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C236016o();
    public final int A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.A00 = i;
        C001801b.A1T(str);
        this.A03 = str;
        this.A01 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.A03, tokenData.A03) || !AnonymousClass05S.A0H(this.A01, tokenData.A01) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !AnonymousClass05S.A0H(this.A04, tokenData.A04) || !AnonymousClass05S.A0H(this.A02, tokenData.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A04, this.A02});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A10(parcel, 2, this.A03, false);
        Long l = this.A01;
        if (l != null) {
            C008805h.A0v(parcel, 3, 8);
            parcel.writeLong(l.longValue());
        }
        C008805h.A13(parcel, 4, this.A05);
        C008805h.A13(parcel, 5, this.A06);
        C008805h.A11(parcel, 6, this.A04);
        C008805h.A10(parcel, 7, this.A02, false);
        C008805h.A0r(parcel, A032);
    }
}
