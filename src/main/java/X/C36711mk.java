package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1mk  reason: invalid class name and case insensitive filesystem */
public class C36711mk extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1DI();
    public final int A00;

    public C36711mk(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
    }

    public C36711mk(Parcelable parcelable, int i) {
        super(parcelable);
        this.A00 = i;
    }
}
