package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2tW  reason: invalid class name and case insensitive filesystem */
public final class C61652tW implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        C74713bN r2 = new C74713bN();
        r2.A05 = parcel.readString();
        r2.A02 = parcel.readString();
        r2.A00 = parcel.readInt();
        r2.A03 = parcel.readString();
        ((AnonymousClass27v) r2).A01 = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        r2.A04 = z;
        ((AnonymousClass27v) r2).A03 = parcel.readString();
        ((AnonymousClass27v) r2).A04 = parcel.readString();
        r2.A06 = parcel.readString();
        ((AnonymousClass27v) r2).A00 = parcel.readLong();
        return r2;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C74713bN[i];
    }
}
