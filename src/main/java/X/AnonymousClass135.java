package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: X.135  reason: invalid class name */
public final class AnonymousClass135 implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR = new AnonymousClass132();
    public int A00;
    public final int A01;
    public final String A02;
    public final AnonymousClass134[] A03;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass135(Parcel parcel) {
        this.A02 = parcel.readString();
        AnonymousClass134[] r0 = (AnonymousClass134[]) parcel.createTypedArray(AnonymousClass134.CREATOR);
        this.A03 = r0;
        this.A01 = r0.length;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        UUID uuid = AnonymousClass11u.A02;
        UUID uuid2 = ((AnonymousClass134) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((AnonymousClass134) obj2).A03;
        if (equals) {
            return uuid.equals(uuid3) ? 0 : 1;
        }
        return uuid2.compareTo(uuid3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass135.class != obj.getClass()) {
            return false;
        }
        AnonymousClass135 r5 = (AnonymousClass135) obj;
        if (!AnonymousClass0W2.A08(this.A02, r5.A02) || !Arrays.equals(this.A03, r5.A03)) {
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
        String str = this.A02;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.A03);
        this.A00 = hashCode2;
        return hashCode2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
