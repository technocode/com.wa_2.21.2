package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.10P  reason: invalid class name */
public final class AnonymousClass10P implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass10M();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C33381ge A06;
    public AnonymousClass10O A07;
    public Object A08;
    public Object A09;
    public String A0A;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass10P() {
    }

    public AnonymousClass10P(long j, String str, C33381ge r4, int i, Object obj, Object obj2, long j2, int i2, int i3, int i4, AnonymousClass10O r13) {
        this.A05 = j;
        this.A0A = str;
        this.A06 = r4;
        this.A01 = i;
        this.A09 = obj;
        this.A08 = obj2;
        this.A04 = j2;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A07 = r13;
    }

    public AnonymousClass10P(AnonymousClass10P r15, int i) {
        this(r15.A05, r15.A0A, r15.A06, r15.A01, r15.A09, r15.A08, r15.A04, r15.A02, r15.A03, i, r15.A07);
    }

    public AnonymousClass10P(Parcel parcel) {
        this.A05 = parcel.readLong();
        this.A0A = parcel.readString();
        this.A01 = parcel.readInt();
        this.A09 = null;
        this.A08 = null;
        this.A04 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (AnonymousClass10O) AnonymousClass10O.CREATOR.createFromParcel(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        this.A07.writeToParcel(parcel, i);
    }
}
