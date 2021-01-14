package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1be  reason: invalid class name and case insensitive filesystem */
public class C30621be extends AbstractC15200nf {
    public static final Parcelable.Creator CREATOR = new C16500pu();
    public Parcelable A00;

    public C30621be(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? AnonymousClass0VT.class.getClassLoader() : classLoader);
    }

    public C30621be(Parcelable parcelable) {
        super(parcelable);
    }
}
