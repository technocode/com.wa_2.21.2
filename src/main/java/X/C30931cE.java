package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.1cE  reason: invalid class name and case insensitive filesystem */
public class C30931cE extends AbstractC17470rb {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public C30931cE(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new AnonymousClass05V(), new AnonymousClass05V(), new AnonymousClass05V());
    }

    public C30931cE(Parcel parcel, int i, int i2, String str, AnonymousClass05V r7, AnonymousClass05V r8, AnonymousClass05V r9) {
        super(r7, r8, r9);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A02 = 0;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = i;
        this.A07 = str;
    }
}
