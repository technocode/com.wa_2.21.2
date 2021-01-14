package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.2Ky  reason: invalid class name and case insensitive filesystem */
public class C48112Ky implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C48102Kx();
    public int A00;
    public final List A01;
    public final boolean A02;

    public int describeContents() {
        return 0;
    }

    public C48112Ky(int i, boolean z, List list) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = list;
    }

    public C48112Ky(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.createStringArrayList();
    }

    public static int A00(String str) {
        if (C003701u.A0E(str) || "approved".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            return 2;
        }
        return "deleted".equalsIgnoreCase(str) ? 3 : 1;
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C48112Ky)) {
            return false;
        }
        C48112Ky r8 = (C48112Ky) obj;
        if (!(this.A00 == r8.A00 && this.A02 == r8.A02)) {
            return false;
        }
        List list2 = this.A01;
        if (list2 != null && (list = r8.A01) != null && list2.size() == list.size()) {
            for (int i = 0; i < list2.size(); i++) {
                if (!((String) list2.get(i)).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        } else if (list2 != r8.A01) {
            return false;
        } else {
            return true;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeStringList(this.A01);
    }
}
