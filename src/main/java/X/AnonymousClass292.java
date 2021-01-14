package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.292  reason: invalid class name */
public class AnonymousClass292 extends AnonymousClass26I {
    public static final AnonymousClass05V A06;
    public static final Parcelable.Creator CREATOR = new AnonymousClass16U();
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    public AnonymousClass292() {
        this.A05 = 1;
    }

    static {
        AnonymousClass05V r2 = new AnonymousClass05V();
        A06 = r2;
        r2.put("registered", C35381kF.A00("registered", 2));
        AnonymousClass05V r22 = A06;
        r22.put("in_progress", C35381kF.A00("in_progress", 3));
        r22.put("success", C35381kF.A00("success", 4));
        r22.put("failed", C35381kF.A00("failed", 5));
        r22.put("escrowed", C35381kF.A00("escrowed", 6));
    }

    public AnonymousClass292(int i, List list, List list2, List list3, List list4, List list5) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A05);
        C008805h.A11(parcel, 2, this.A00);
        C008805h.A11(parcel, 3, this.A01);
        C008805h.A11(parcel, 4, this.A02);
        C008805h.A11(parcel, 5, this.A03);
        C008805h.A11(parcel, 6, this.A04);
        C008805h.A0r(parcel, A032);
    }
}
