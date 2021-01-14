package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1XS  reason: invalid class name */
public class AnonymousClass1XS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C64292xw();
    public final String A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1XS(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readList(arrayList, AnonymousClass1XR.class.getClassLoader());
    }

    public AnonymousClass1XS(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }
}
