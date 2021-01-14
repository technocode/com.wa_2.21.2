package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.134  reason: invalid class name */
public final class AnonymousClass134 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass133();
    public int A00;
    public final String A01;
    public final String A02;
    public final UUID A03;
    public final boolean A04;
    public final byte[] A05;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass134(Parcel parcel) {
        this.A03 = new UUID(parcel.readLong(), parcel.readLong());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.createByteArray();
        this.A04 = parcel.readByte() != 0;
    }

    public boolean A00(UUID uuid) {
        UUID uuid2 = AnonymousClass11u.A02;
        UUID uuid3 = this.A03;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass134)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AnonymousClass134 r4 = (AnonymousClass134) obj;
        if (!AnonymousClass0W2.A08(this.A01, r4.A01) || !AnonymousClass0W2.A08(this.A02, r4.A02) || !AnonymousClass0W2.A08(this.A03, r4.A03) || !Arrays.equals(this.A05, r4.A05)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode2 = this.A03.hashCode() * 31;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        int hashCode3 = Arrays.hashCode(this.A05) + ((this.A02.hashCode() + i2) * 31);
        this.A00 = hashCode3;
        return hashCode3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.A03;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A05);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
    }
}
