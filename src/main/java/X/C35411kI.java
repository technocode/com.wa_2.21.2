package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1kI  reason: invalid class name and case insensitive filesystem */
public final class C35411kI extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C239418e();
    public final int A00;
    public final String A01;
    public final ArrayList A02;

    public C35411kI(int i, String str, ArrayList arrayList) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = arrayList;
    }

    public C35411kI(String str, Map map) {
        ArrayList arrayList;
        this.A00 = 1;
        this.A01 = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new C35421kJ(str2, (C35381kF) map.get(str2)));
            }
        }
        this.A02 = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A10(parcel, 2, this.A01, false);
        C008805h.A12(parcel, 3, this.A02, false);
        C008805h.A0r(parcel, A03);
    }
}
