package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Zz  reason: invalid class name and case insensitive filesystem */
public class C29681Zz extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new C13550kR();
    public int A00;
    public boolean A01;

    public C29681Zz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() != 0;
    }

    public C29681Zz(Parcelable parcelable) {
        super(parcelable);
    }
}
