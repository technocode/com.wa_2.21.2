package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2O2  reason: invalid class name */
public final class AnonymousClass2O2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2O1();
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public long A04;
    public AnonymousClass2O3 A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass2O2(AnonymousClass2O3 r2) {
        this.A05 = r2;
    }

    public AnonymousClass2O2(Parcel parcel) {
        boolean z = false;
        this.A05 = AnonymousClass2O3.values()[parcel.readInt()];
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A01 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A0G = parcel.readByte() != 0 ? true : z;
        this.A0A = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        this.A04 = parcel.readLong();
        this.A09 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A06 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05.ordinal());
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
    }
}
