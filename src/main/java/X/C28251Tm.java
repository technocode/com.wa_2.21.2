package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Tm  reason: invalid class name and case insensitive filesystem */
public class C28251Tm implements Parcelable {
    public static final C28251Tm A04 = new C28251Tm(null, null, null, null);
    public static final Parcelable.Creator CREATOR = new AnonymousClass2G0();
    public final Double A00;
    public final Double A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public C28251Tm(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A02 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A03 = readString2;
                if (parcel.readByte() == 0) {
                    this.A00 = null;
                } else {
                    this.A00 = Double.valueOf(parcel.readDouble());
                }
                if (parcel.readByte() == 0) {
                    this.A01 = null;
                } else {
                    this.A01 = Double.valueOf(parcel.readDouble());
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public C28251Tm(String str, String str2, Double d, Double d2) {
        this.A02 = str == null ? "" : str;
        this.A03 = str2 == null ? "" : str2;
        this.A00 = d;
        this.A01 = d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28251Tm.class != obj.getClass()) {
            return false;
        }
        C28251Tm r5 = (C28251Tm) obj;
        if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03)) {
            return false;
        }
        Double d = this.A00;
        if (d != null) {
            if (!d.equals(r5.A00)) {
                return false;
            }
        } else if (r5.A00 != null) {
            return false;
        }
        Double d2 = this.A01;
        Double d3 = r5.A01;
        if (d2 != null) {
            return d2.equals(d3);
        }
        if (d3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.A03.hashCode() + (this.A02.hashCode() * 31)) * 31;
        Double d = this.A00;
        int i2 = 0;
        if (d != null) {
            i = d.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Double d2 = this.A01;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        Object obj = this.A00;
        Object obj2 = "";
        if (obj == null) {
            obj = obj2;
        }
        objArr[2] = obj;
        Double d = this.A01;
        if (d != null) {
            obj2 = d;
        }
        objArr[3] = obj2;
        return String.format("%s, %s, %s, %s", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Double d = this.A00;
        if (d == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.A01;
        if (d2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeDouble(d2.doubleValue());
    }
}
