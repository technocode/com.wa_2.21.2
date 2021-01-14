package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2LQ  reason: invalid class name */
public class AnonymousClass2LQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LP();
    public final String A00;
    public final List A01;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass2LQ(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readStringList(arrayList);
    }

    public AnonymousClass2LQ(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }
}
