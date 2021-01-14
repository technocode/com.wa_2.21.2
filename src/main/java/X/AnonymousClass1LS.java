package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1LS  reason: invalid class name */
public class AnonymousClass1LS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1LR();
    public final String A00;
    public final String A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1LS(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public AnonymousClass1LS(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("DeviceSimInfo{countryCode='");
        AnonymousClass008.A1W(A0S, this.A00, '\'', ", phoneNumber='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", networkOperatorName='");
        A0S.append(this.A01);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
