package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2tb  reason: invalid class name and case insensitive filesystem */
public final class C61702tb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        C74733bP r2 = new C74733bP();
        ((AbstractC59432ne) r2).A00 = parcel.readInt();
        r2.A06 = parcel.readString();
        r2.A08 = parcel.readString();
        ((AbstractC59432ne) r2).A02 = parcel.readString();
        r2.A05 = parcel.readString();
        ((AbstractC59432ne) r2).A03 = parcel.readString();
        ((AbstractC59432ne) r2).A04 = parcel.readString();
        ((AbstractC59432ne) r2).A01 = parcel.readLong();
        r2.A00 = parcel.readInt();
        r2.A03 = parcel.readString();
        r2.A02 = parcel.readString();
        r2.A04 = parcel.readString();
        return r2;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C74733bP[i];
    }
}
