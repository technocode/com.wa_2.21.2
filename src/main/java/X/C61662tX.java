package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2tX  reason: invalid class name and case insensitive filesystem */
public final class C61662tX implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        C74723bO r2 = new C74723bO();
        boolean z = false;
        boolean z2 = false;
        if (parcel.readByte() == 1) {
            z2 = true;
        }
        r2.A0X = z2;
        r2.A0A = parcel.readString();
        r2.A0B = parcel.readString();
        r2.A09 = parcel.readString();
        r2.A0O = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() == 1) {
            z3 = true;
        }
        r2.A0T = z3;
        ((AbstractC460627w) r2).A03 = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() == 1) {
            z4 = true;
        }
        r2.A0V = z4;
        boolean z5 = false;
        if (parcel.readByte() == 1) {
            z5 = true;
        }
        r2.A0U = z5;
        ((AbstractC460627w) r2).A06 = parcel.readLong();
        ((AbstractC460627w) r2).A04 = parcel.readInt();
        r2.A0G = parcel.readString();
        r2.A0H = parcel.readString();
        ((AbstractC460627w) r2).A00 = parcel.readInt();
        boolean z6 = false;
        if (parcel.readByte() == 1) {
            z6 = true;
        }
        r2.A0Q = z6;
        boolean z7 = false;
        if (parcel.readByte() == 1) {
            z7 = true;
        }
        r2.A0P = z7;
        r2.A0J = parcel.readString();
        ((AbstractC460627w) r2).A05 = parcel.readLong();
        ((AbstractC460627w) r2).A01 = parcel.readInt();
        boolean z8 = false;
        if (parcel.readByte() == 1) {
            z8 = true;
        }
        r2.A07 = z8;
        r2.A03 = parcel.readString();
        r2.A06 = parcel.readString();
        r2.A00 = parcel.readInt();
        r2.A04 = parcel.readString();
        r2.A01 = parcel.readInt();
        r2.A0C = parcel.readString();
        r2.A0E = parcel.readString();
        r2.A0D = parcel.readString();
        ((AbstractC460627w) r2).A07 = Long.valueOf(parcel.readLong());
        r2.A05 = parcel.readString();
        r2.A0F = parcel.readString();
        r2.A0I = parcel.readString();
        boolean z9 = false;
        if (parcel.readByte() == 1) {
            z9 = true;
        }
        r2.A0S = z9;
        boolean z10 = false;
        if (parcel.readByte() == 1) {
            z10 = true;
        }
        r2.A0W = z10;
        if (parcel.readByte() == 1) {
            z = true;
        }
        r2.A0R = z;
        r2.A0N = parcel.readString();
        r2.A0M = parcel.readString();
        r2.A0L = parcel.readString();
        r2.A0K = parcel.readString();
        return r2;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C74723bO[i];
    }
}
