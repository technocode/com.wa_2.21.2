package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1kH  reason: invalid class name and case insensitive filesystem */
public final class C35401kH extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new C239318d();
    public final int A00;
    public final String A01;
    public final HashMap A02;

    public C35401kH(int i, ArrayList arrayList, String str) {
        this.A00 = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C35411kI r6 = (C35411kI) arrayList.get(i2);
            String str2 = r6.A01;
            HashMap hashMap2 = new HashMap();
            int size2 = r6.A02.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C35421kJ r0 = (C35421kJ) r6.A02.get(i3);
                hashMap2.put(r0.A02, r0.A01);
            }
            hashMap.put(str2, hashMap2);
        }
        this.A02 = hashMap;
        C001801b.A1Q(str);
        this.A01 = str;
        for (Object obj : hashMap.keySet()) {
            Map map = (Map) this.A02.get(obj);
            for (Object obj2 : map.keySet()) {
                ((C35381kF) map.get(obj2)).A01 = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.A02;
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.A02;
        for (String str : hashMap.keySet()) {
            arrayList.add(new C35411kI(str, (Map) hashMap.get(str)));
        }
        C008805h.A12(parcel, 2, arrayList, false);
        C008805h.A10(parcel, 3, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}
