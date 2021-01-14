package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.14s  reason: invalid class name and case insensitive filesystem */
public final class C231814s implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C231714r();
    public final int A00;
    public final int A01;
    public final int[] A02;

    public int describeContents() {
        return 0;
    }

    public C231814s(int i, int... iArr) {
        this.A00 = i;
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length);
        this.A02 = copyOf;
        this.A01 = length;
        Arrays.sort(copyOf);
    }

    public C231814s(Parcel parcel) {
        this.A00 = parcel.readInt();
        int readByte = parcel.readByte();
        this.A01 = readByte;
        int[] iArr = new int[readByte];
        this.A02 = iArr;
        parcel.readIntArray(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C231814s.class != obj.getClass()) {
            return false;
        }
        C231814s r5 = (C231814s) obj;
        if (this.A00 != r5.A00 || !Arrays.equals(this.A02, r5.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02) + (this.A00 * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        int[] iArr = this.A02;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
    }
}
