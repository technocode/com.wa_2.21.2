package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.293  reason: invalid class name */
public class AnonymousClass293 extends AnonymousClass26I {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = new AnonymousClass16V();
    public AnonymousClass294 A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    public AnonymousClass293() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }

    static {
        HashMap hashMap = new HashMap();
        A06 = hashMap;
        hashMap.put("authenticatorInfo", new C35381kF(11, false, 11, false, "authenticatorInfo", 2, AnonymousClass294.class));
        HashMap hashMap2 = A06;
        hashMap2.put("signature", new C35381kF(7, false, 7, false, "signature", 3, null));
        hashMap2.put("package", new C35381kF(7, false, 7, false, "package", 4, null));
    }

    public AnonymousClass293(Set set, int i, AnonymousClass294 r3, String str, String str2, String str3) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = r3;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        Set set = this.A05;
        if (set.contains(1)) {
            C008805h.A0u(parcel, 1, this.A04);
        }
        if (set.contains(2)) {
            C008805h.A0z(parcel, 2, this.A00, i, true);
        }
        if (set.contains(3)) {
            C008805h.A10(parcel, 3, this.A02, true);
        }
        if (set.contains(4)) {
            C008805h.A10(parcel, 4, this.A01, true);
        }
        if (set.contains(5)) {
            C008805h.A10(parcel, 5, this.A03, true);
        }
        C008805h.A0r(parcel, A032);
    }
}
