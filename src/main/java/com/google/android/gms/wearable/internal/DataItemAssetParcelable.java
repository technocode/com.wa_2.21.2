package com.google.android.gms.wearable.internal;

import X.AnonymousClass008;
import X.AnonymousClass066;
import X.AnonymousClass1C7;
import X.AnonymousClass1CG;
import X.C001801b;
import X.C008805h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;

@KeepName
public class DataItemAssetParcelable extends AnonymousClass066 implements AnonymousClass1C7, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1CG();
    public final String A00;
    public final String A01;

    public DataItemAssetParcelable(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public DataItemAssetParcelable(AnonymousClass1C7 r2) {
        String id = r2.getId();
        C001801b.A1Q(id);
        this.A00 = id;
        String A5v = r2.A5v();
        C001801b.A1Q(A5v);
        this.A01 = A5v;
    }

    @Override // X.AnonymousClass1C7
    public String A5v() {
        return this.A01;
    }

    @Override // X.AnonymousClass1C7
    public String getId() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0Y = AnonymousClass008.A0Y("DataItemAssetParcelable[", "@");
        A0Y.append(Integer.toHexString(hashCode()));
        String str = this.A00;
        if (str == null) {
            A0Y.append(",noid");
        } else {
            A0Y.append(",");
            A0Y.append(str);
        }
        A0Y.append(", key=");
        return AnonymousClass008.A0O(A0Y, this.A01, "]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A00, false);
        C008805h.A10(parcel, 3, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}
