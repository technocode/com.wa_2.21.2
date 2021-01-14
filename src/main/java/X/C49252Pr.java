package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Pr  reason: invalid class name and case insensitive filesystem */
public final class C49252Pr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C49242Pq();
    public final int A00;
    public final int A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public C49252Pr(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C49252Pr(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C49252Pr.class.getName());
        sb.append("{url='");
        AnonymousClass008.A1W(sb, this.A02, '\'', ", width=");
        sb.append(this.A01);
        sb.append(", height=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
