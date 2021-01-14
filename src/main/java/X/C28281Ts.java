package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Ts  reason: invalid class name and case insensitive filesystem */
public class C28281Ts implements Parcelable {
    public static final C28281Ts A04 = new C28281Ts(null, null, C28251Tm.A04);
    public static final Parcelable.Creator CREATOR = new AnonymousClass2G1();
    public final C28251Tm A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public C28281Ts(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A03 = readString2;
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    this.A02 = readString3;
                    C28251Tm r0 = (C28251Tm) parcel.readParcelable(C28251Tm.class.getClassLoader());
                    if (r0 != null) {
                        this.A00 = r0;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public C28281Ts(String str, String str2, C28251Tm r4) {
        this.A01 = "";
        this.A03 = str == null ? "" : str;
        this.A02 = str2 == null ? "" : str2;
        this.A00 = r4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28281Ts.class != obj.getClass()) {
            return false;
        }
        C28281Ts r4 = (C28281Ts) obj;
        if (this.A01.equals(r4.A01) && this.A03.equals(r4.A03) && this.A02.equals(r4.A02)) {
            return this.A00.equals(r4.A00);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int hashCode2 = this.A02.hashCode();
        return this.A00.hashCode() + ((hashCode2 + ((this.A03.hashCode() + hashCode) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append(" ");
        sb.append(this.A02);
        sb.append(" ");
        sb.append(this.A00);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
