package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.0q1  reason: invalid class name and case insensitive filesystem */
public class C16570q1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16560q0();
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    public int describeContents() {
        return 0;
    }

    public C16570q1() {
    }

    public C16570q1(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() != 1 ? false : true;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A03 = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("FullSpanItem{mPosition=");
        A0S.append(this.A01);
        A0S.append(", mGapDir=");
        A0S.append(this.A00);
        A0S.append(", mHasUnwantedGapAfter=");
        A0S.append(this.A02);
        A0S.append(", mGapPerSpan=");
        A0S.append(Arrays.toString(this.A03));
        A0S.append('}');
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.A03);
    }
}
