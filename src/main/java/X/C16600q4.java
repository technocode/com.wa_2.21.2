package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.0q4  reason: invalid class name and case insensitive filesystem */
public class C16600q4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16590q3();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public int[] A09;

    public int describeContents() {
        return 0;
    }

    public C16600q4() {
    }

    public C16600q4(C16600q4 r2) {
        this.A02 = r2.A02;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A09 = r2.A09;
        this.A01 = r2.A01;
        this.A08 = r2.A08;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A06 = r2.A06;
        this.A04 = r2.A04;
    }

    public C16600q4(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A02 = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A09 = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.A01 = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.A08 = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z = false;
        this.A07 = parcel.readInt() == 1;
        this.A05 = parcel.readInt() == 1;
        this.A06 = parcel.readInt() == 1 ? true : z;
        this.A04 = parcel.readArrayList(C16570q1.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        if (this.A02 > 0) {
            parcel.writeIntArray(this.A09);
        }
        parcel.writeInt(this.A01);
        if (this.A01 > 0) {
            parcel.writeIntArray(this.A08);
        }
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeList(this.A04);
    }
}
