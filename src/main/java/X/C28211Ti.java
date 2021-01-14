package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ti  reason: invalid class name and case insensitive filesystem */
public class C28211Ti implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C46962Fx();
    public final String A00;
    public final String A01;
    public final List A02;

    public int describeContents() {
        return 0;
    }

    public C28211Ti(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C28221Tj.CREATOR);
        if (createTypedArrayList != null) {
            this.A02 = createTypedArrayList;
            return;
        }
        throw null;
    }

    public C28211Ti(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28211Ti)) {
            return false;
        }
        C28211Ti r4 = (C28211Ti) obj;
        if (!TextUtils.equals(this.A01, r4.A01) || !TextUtils.equals(this.A00, r4.A00) || !this.A02.equals(r4.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.A01;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.A02.hashCode() + ((i3 + i2) * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("timezone: ");
        A0S.append(this.A01);
        A0S.append(", note: ");
        A0S.append(this.A00);
        for (Object obj : this.A02) {
            A0S.append(obj.toString());
            A0S.append(";");
        }
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A02);
    }
}
