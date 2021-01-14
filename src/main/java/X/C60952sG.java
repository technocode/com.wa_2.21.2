package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2sG  reason: invalid class name and case insensitive filesystem */
public final class C60952sG implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        AnonymousClass3XM r2 = new AnonymousClass3XM();
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        ((AbstractC43791yx) r2).A01 = z;
        ((AbstractC43791yx) r2).A00 = (AnonymousClass2bX) parcel.readParcelable(AnonymousClass2bX.class.getClassLoader());
        r2.A0G = parcel.readString();
        r2.A0D = parcel.readString();
        r2.A0B = parcel.readString();
        r2.A0C = parcel.readString();
        r2.A09 = parcel.readString();
        r2.A0A = parcel.readString();
        r2.A05 = parcel.readLong();
        r2.A07 = parcel.readString();
        r2.A04 = parcel.readLong();
        r2.A01 = parcel.readInt();
        r2.A00 = parcel.readInt();
        r2.A02 = parcel.readInt();
        r2.A0H = parcel.readString();
        r2.A0F = parcel.readString();
        r2.A08 = parcel.readString();
        r2.A0E = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            r2.A06 = new C60882s9(readString);
        }
        return r2;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AnonymousClass3XM[i];
    }
}
