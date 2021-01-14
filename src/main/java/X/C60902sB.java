package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.2sB  reason: invalid class name and case insensitive filesystem */
public final class C60902sB implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        C74463ay r3 = new C74463ay();
        r3.A07 = parcel.readString();
        r3.A06 = parcel.readString();
        boolean z = false;
        boolean z2 = false;
        if (parcel.readByte() == 1) {
            z2 = true;
        }
        r3.A0G = z2;
        r3.A02 = parcel.readInt();
        r3.A00 = parcel.readInt();
        r3.A04 = parcel.readInt();
        r3.A0A = parcel.readString();
        ((AnonymousClass27v) r3).A01 = parcel.readString();
        ((AnonymousClass27v) r3).A02 = parcel.readString();
        r3.A0D = parcel.readString();
        r3.A0E = parcel.readString();
        r3.A09 = parcel.readString();
        r3.A03 = parcel.readInt();
        r3.A0B = parcel.readString();
        r3.A0C = parcel.readString();
        ArrayList arrayList = new ArrayList();
        r3.A0F = arrayList;
        parcel.readStringList(arrayList);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            ((AnonymousClass27v) r3).A09 = bArr;
            parcel.readByteArray(bArr);
        }
        ((AnonymousClass27v) r3).A04 = parcel.readString();
        ((AnonymousClass27v) r3).A05 = parcel.readString();
        ((AnonymousClass27v) r3).A06 = parcel.readString();
        ((AnonymousClass27v) r3).A00 = parcel.readLong();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z3 = true;
        }
        ((AnonymousClass27v) r3).A07 = z3;
        if (parcel.readInt() == 1) {
            z = true;
        }
        ((AnonymousClass27v) r3).A08 = z;
        r3.A08 = parcel.readString();
        return r3;
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new C74463ay[i];
    }
}
