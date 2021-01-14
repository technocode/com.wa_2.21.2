package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Um  reason: invalid class name and case insensitive filesystem */
public class C28481Um implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C47872Ka();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;

    public int describeContents() {
        return 0;
    }

    public C28481Um() {
    }

    public C28481Um(Parcel parcel) {
        this.A06 = parcel.readInt();
        this.A0G = parcel.readLong();
        this.A03 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0C = parcel.readLong();
        this.A0A = parcel.readLong();
        this.A0D = parcel.readLong();
        this.A0F = parcel.readLong();
        this.A0B = parcel.readLong();
        this.A0E = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A06);
        parcel.writeLong(this.A0G);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A07);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A0A);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0F);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0E);
    }
}
