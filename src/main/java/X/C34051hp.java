package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.1hp  reason: invalid class name and case insensitive filesystem */
public final class C34051hp implements AbstractC228013f {
    public static final Parcelable.Creator CREATOR = new AnonymousClass13O();
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public int describeContents() {
        return 0;
    }

    public C34051hp(Parcel parcel) {
        this.A02 = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.A03 = bArr;
        parcel.readByteArray(bArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C34051hp(String str, byte[] bArr, int i, int i2) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34051hp.class != obj.getClass()) {
            return false;
        }
        C34051hp r5 = (C34051hp) obj;
        if (!this.A02.equals(r5.A02) || !Arrays.equals(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.A03) + ((this.A02.hashCode() + 527) * 31)) * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("mdta: key=");
        A0S.append(this.A02);
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        byte[] bArr = this.A03;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
