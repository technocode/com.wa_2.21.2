package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.14A  reason: invalid class name */
public final class AnonymousClass14A implements Parcelable {
    public static final AnonymousClass14A A03 = new AnonymousClass14A(new AnonymousClass148[0]);
    public static final Parcelable.Creator CREATOR = new AnonymousClass149();
    public int A00;
    public final int A01;
    public final AnonymousClass148[] A02;

    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: X.148[] */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass14A(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new AnonymousClass148[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = parcel.readParcelable(AnonymousClass148.class.getClassLoader());
        }
    }

    public AnonymousClass14A(AnonymousClass148... r2) {
        this.A02 = r2;
        this.A01 = r2.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass14A.class != obj.getClass()) {
            return false;
        }
        AnonymousClass14A r5 = (AnonymousClass14A) obj;
        if (this.A01 != r5.A01 || !Arrays.equals(this.A02, r5.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }
}
