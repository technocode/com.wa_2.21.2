package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Ku  reason: invalid class name and case insensitive filesystem */
public final class C48072Ku implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C48062Kt();
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public int describeContents() {
        return 0;
    }

    public C48072Ku(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C48072Ku(String str, String str2, String str3, int i, int i2) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof C48072Ku) && this.A02.equals(((C48072Ku) obj).A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
