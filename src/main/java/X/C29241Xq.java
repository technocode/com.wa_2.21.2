package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Xq  reason: invalid class name and case insensitive filesystem */
public class C29241Xq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass33C();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C29251Xr A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;

    public int describeContents() {
        return 0;
    }

    public C29241Xq() {
    }

    public C29241Xq(Parcel parcel) {
        if (parcel != null) {
            this.A0A = parcel.readString();
            this.A06 = parcel.readString();
            this.A08 = parcel.readString();
            this.A09 = parcel.readString();
            this.A02 = parcel.readInt();
            this.A03 = parcel.readInt();
            this.A0C = parcel.readString();
            this.A07 = parcel.readString();
            this.A00 = parcel.readInt();
            this.A0D = parcel.readString();
            this.A05 = parcel.readString();
        }
    }

    /* renamed from: A00 */
    public C29241Xq clone() {
        C29241Xq r2 = new C29241Xq();
        r2.A0A = this.A0A;
        String str = this.A07;
        if (str != null) {
            int i = this.A01;
            r2.A07 = str;
            r2.A01 = i;
        }
        r2.A0D = this.A0D;
        r2.A06 = this.A06;
        r2.A05 = this.A05;
        r2.A09 = this.A09;
        r2.A08 = this.A08;
        r2.A00 = this.A00;
        r2.A03 = this.A03;
        r2.A02 = this.A02;
        r2.A04 = this.A04;
        return r2;
    }

    public boolean A01() {
        return (this.A07 == null || this.A01 == 1) ? false : true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Sticker{");
        stringBuffer.append(", mimeType='");
        AnonymousClass008.A1J(stringBuffer, this.A09, ", height=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", width=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", metadata=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", saltedFileHash='");
        AnonymousClass008.A1J(stringBuffer, this.A0B, ", fileSize=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A05);
    }
}
