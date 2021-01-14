package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3F5  reason: invalid class name */
public class AnonymousClass3F5 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C62052uA();
    public String A00 = "WEBVIEW";
    public final String A01;
    public final boolean A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass3F5(String str, boolean z) {
        this.A01 = str;
        this.A02 = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
    }
}
