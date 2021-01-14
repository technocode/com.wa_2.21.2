package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1kD  reason: invalid class name and case insensitive filesystem */
public final class C35361kD extends AnonymousClass066 implements AnonymousClass18Z {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18X();
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public C35361kD() {
        this.A00 = 1;
        this.A02 = new HashMap();
        this.A01 = new SparseArray();
    }

    public C35361kD(int i, ArrayList arrayList) {
        this.A00 = i;
        this.A02 = new HashMap();
        this.A01 = new SparseArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C35351kC r0 = (C35351kC) obj;
            String str = r0.A02;
            int i3 = r0.A01;
            this.A02.put(str, Integer.valueOf(i3));
            this.A01.put(i3, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.A02;
        for (String str : hashMap.keySet()) {
            arrayList.add(new C35351kC(str, ((Number) hashMap.get(str)).intValue()));
        }
        C008805h.A12(parcel, 2, arrayList, false);
        C008805h.A0r(parcel, A03);
    }
}
