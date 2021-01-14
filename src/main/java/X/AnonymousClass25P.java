package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.25P  reason: invalid class name */
public final class AnonymousClass25P extends AbstractC34101hu {
    public static final Parcelable.Creator CREATOR = new C228313i();
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public AnonymousClass25P(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public AnonymousClass25P(String str, byte[] bArr) {
        super("APIC");
        this.A02 = str;
        this.A01 = null;
        this.A00 = 3;
        this.A03 = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass25P.class != obj.getClass()) {
            return false;
        }
        AnonymousClass25P r5 = (AnonymousClass25P) obj;
        if (this.A00 != r5.A00 || !AnonymousClass0W2.A08(this.A02, r5.A02) || !AnonymousClass0W2.A08(this.A01, r5.A01) || !Arrays.equals(this.A03, r5.A03)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = (527 + this.A00) * 31;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.A03) + ((i4 + i3) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.A00);
        sb.append(": mimeType=");
        sb.append(this.A02);
        sb.append(", description=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
