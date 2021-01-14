package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1mb  reason: invalid class name and case insensitive filesystem */
public class C36661mb extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1D5();
    public float A00;
    public int A01;
    public boolean A02;

    public C36661mb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readByte() != 0;
    }

    public C36661mb(Parcelable parcelable) {
        super(parcelable);
    }
}
