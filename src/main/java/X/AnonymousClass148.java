package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.148  reason: invalid class name */
public final class AnonymousClass148 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass147();
    public int A00;
    public final int A01;
    public final AnonymousClass126[] A02;

    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: X.126[] */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass148(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new AnonymousClass126[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = parcel.readParcelable(AnonymousClass126.class.getClassLoader());
        }
    }

    public AnonymousClass148(AnonymousClass126... r3) {
        int length = r3.length;
        C002001d.A3A(length > 0);
        this.A02 = r3;
        this.A01 = length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass148.class != obj.getClass()) {
            return false;
        }
        AnonymousClass148 r5 = (AnonymousClass148) obj;
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
        int hashCode = 527 + Arrays.hashCode(this.A02);
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
