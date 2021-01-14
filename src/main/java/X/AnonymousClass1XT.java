package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1XT  reason: invalid class name */
public class AnonymousClass1XT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C64282xv();
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1XT(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        parcel.readList(arrayList, AnonymousClass1XS.class.getClassLoader());
        this.A00 = parcel.readInt();
    }

    public AnonymousClass1XT(String str, String str2, String str3, List list, int i) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = list;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeList(this.A04);
        parcel.writeInt(this.A00);
    }
}
