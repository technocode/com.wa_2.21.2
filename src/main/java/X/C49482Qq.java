package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.2Qq  reason: invalid class name and case insensitive filesystem */
public class C49482Qq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C49472Qp();
    public final C49462Qo A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final ArrayList A05;
    public final boolean A06;

    public int describeContents() {
        return 0;
    }

    public C49482Qq(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A05 = parcel.createTypedArrayList(CREATOR);
        this.A06 = parcel.readByte() != 0;
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (C49462Qo) parcel.readParcelable(C49462Qo.class.getClassLoader());
    }

    public C49482Qq(String str, String str2, ArrayList arrayList, boolean z, String str3, String str4, C49462Qo r7) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = arrayList;
        this.A06 = z;
        this.A01 = str3;
        this.A04 = str4;
        this.A00 = r7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C49482Qq) {
            C49482Qq r8 = (C49482Qq) obj;
            if (r8.A02.equals(this.A02) && r8.A03.equals(this.A03) && r8.A06 == this.A06) {
                ArrayList arrayList = this.A05;
                ArrayList arrayList2 = r8.A05;
                if (arrayList == null) {
                    if (arrayList2 == null) {
                        return true;
                    }
                } else if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                    return false;
                } else {
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (!arrayList.get(i).equals(arrayList2.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeTypedList(this.A05);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }
}
