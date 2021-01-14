package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2Ps  reason: invalid class name and case insensitive filesystem */
public final class C49262Ps implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2Pp();
    public final int A00;
    public final C49252Pr A01;
    public final C49252Pr A02;
    public final C49252Pr A03;
    public final String A04;
    public final boolean A05;

    public int describeContents() {
        return 0;
    }

    public C49262Ps(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A02 = (C49252Pr) parcel.readParcelable(C49252Pr.class.getClassLoader());
        this.A03 = (C49252Pr) parcel.readParcelable(C49252Pr.class.getClassLoader());
        this.A01 = (C49252Pr) parcel.readParcelable(C49252Pr.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A05 = parcel.readInt() != 1 ? false : true;
    }

    public C49262Ps(String str, C49252Pr r2, C49252Pr r3, C49252Pr r4, int i, boolean z) {
        this.A04 = str;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = i;
        this.A05 = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C49262Ps.class.getName());
        sb.append("{");
        sb.append("id='");
        AnonymousClass008.A1W(sb, this.A04, '\'', ", preview='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", staticPreview='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", content='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
