package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.294  reason: invalid class name */
public class AnonymousClass294 extends AnonymousClass26I {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = new AnonymousClass16W();
    public int A00;
    public PendingIntent A01;
    public C34591im A02;
    public String A03;
    public byte[] A04;
    public final int A05;
    public final Set A06;

    public AnonymousClass294(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, C34591im r7) {
        this.A06 = set;
        this.A05 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A04 = bArr;
        this.A01 = pendingIntent;
        this.A02 = r7;
    }

    static {
        HashMap hashMap = new HashMap();
        A07 = hashMap;
        hashMap.put("accountType", new C35381kF(7, false, 7, false, "accountType", 2, null));
        HashMap hashMap2 = A07;
        hashMap2.put("status", new C35381kF(0, false, 0, false, "status", 3, null));
        hashMap2.put("transferBytes", new C35381kF(8, false, 8, false, "transferBytes", 4, null));
    }

    public AnonymousClass294() {
        this.A06 = new AnonymousClass03V(3);
        this.A05 = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        Set set = this.A06;
        if (set.contains(1)) {
            C008805h.A0u(parcel, 1, this.A05);
        }
        if (set.contains(2)) {
            C008805h.A10(parcel, 2, this.A03, true);
        }
        if (set.contains(3)) {
            C008805h.A0u(parcel, 3, this.A00);
        }
        if (set.contains(4)) {
            C008805h.A14(parcel, 4, this.A04, true);
        }
        if (set.contains(5)) {
            C008805h.A0z(parcel, 5, this.A01, i, true);
        }
        if (set.contains(6)) {
            C008805h.A0z(parcel, 6, this.A02, i, true);
        }
        C008805h.A0r(parcel, A032);
    }
}
