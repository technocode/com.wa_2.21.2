package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.15z  reason: invalid class name and case insensitive filesystem */
public final class C234815z implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C234715y();
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public int describeContents() {
        return 0;
    }

    public C234815z(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C234815z.class != obj.getClass()) {
            return false;
        }
        C234815z r5 = (C234815z) obj;
        if (this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03 && Arrays.equals(this.A04, r5.A04)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A04) + ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31);
        this.A00 = hashCode;
        return hashCode;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ColorInfo(");
        A0S.append(this.A02);
        A0S.append(", ");
        A0S.append(this.A01);
        A0S.append(", ");
        A0S.append(this.A03);
        A0S.append(", ");
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        A0S.append(z);
        A0S.append(")");
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        int i2 = 0;
        if (bArr != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
