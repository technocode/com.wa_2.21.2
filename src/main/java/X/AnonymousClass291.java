package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.291  reason: invalid class name */
public final class AnonymousClass291 extends AnonymousClass26I {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = new AnonymousClass16T();
    public int A00;
    public AnonymousClass292 A01;
    public ArrayList A02;
    public final int A03;
    public final Set A04;

    public AnonymousClass291(Set set, int i, ArrayList arrayList, int i2, AnonymousClass292 r5) {
        this.A04 = set;
        this.A03 = i;
        this.A02 = arrayList;
        this.A00 = i2;
        this.A01 = r5;
    }

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("authenticatorData", new C35381kF(11, true, 11, true, "authenticatorData", 2, AnonymousClass293.class));
        A05.put("progress", new C35381kF(11, false, 11, false, "progress", 4, AnonymousClass292.class));
    }

    public AnonymousClass291() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        Set set = this.A04;
        if (set.contains(1)) {
            C008805h.A0u(parcel, 1, this.A03);
        }
        if (set.contains(2)) {
            C008805h.A12(parcel, 2, this.A02, true);
        }
        if (set.contains(3)) {
            C008805h.A0u(parcel, 3, this.A00);
        }
        if (set.contains(4)) {
            C008805h.A0z(parcel, 4, this.A01, i, true);
        }
        C008805h.A0r(parcel, A032);
    }
}
