package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1yu  reason: invalid class name and case insensitive filesystem */
public final class C43761yu extends AnonymousClass1VM {
    public static final Parcelable.Creator CREATOR = new AnonymousClass2LN();
    public int A00;
    public int A01;

    public int describeContents() {
        return 0;
    }

    public C43761yu(C05870Qv r2, String str, String str2, int i, int i2, int i3, String str3, int i4) {
        this.A00 = i;
        this.A01 = i4;
        this.A08 = str2;
        if (r2 != null) {
            this.A05 = r2;
            A07(i2);
            A06(i3);
            this.A07 = str;
            if (str3 != null) {
                this.A0A = str3;
                return;
            }
            return;
        }
        throw null;
    }

    public C43761yu(Parcel parcel) {
        A08(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public static int A04(String str) {
        if ("debit".equals(str)) {
            return 1;
        }
        if ("credit".equals(str)) {
            return 4;
        }
        if ("combo".equals(str)) {
            return 6;
        }
        if ("prepaid".equals(str)) {
            return 8;
        }
        return "UNKNOWN".equals(str) ? 7 : 0;
    }

    public static int A05(String str) {
        if ("visa".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("mastercard".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("amex".equalsIgnoreCase(str)) {
            return 3;
        }
        return "discover".equalsIgnoreCase(str) ? 4 : 0;
    }

    @Override // X.AnonymousClass1VM
    public String toString() {
        return AnonymousClass008.A0O(AnonymousClass008.A0S("[ CARD: "), super.toString(), " ]");
    }

    @Override // X.AnonymousClass1VM
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
