package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2te  reason: invalid class name and case insensitive filesystem */
public final class C61732te implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass3Y3[0];
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        AnonymousClass3Y3 r2 = new AnonymousClass3Y3();
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        ((AbstractC43791yx) r2).A01 = z;
        ((AbstractC43791yx) r2).A00 = (AnonymousClass2bX) parcel.readParcelable(AnonymousClass2bX.class.getClassLoader());
        r2.A03 = parcel.readString();
        r2.A02 = parcel.readString();
        r2.A01 = parcel.readString();
        return r2;
    }
}
