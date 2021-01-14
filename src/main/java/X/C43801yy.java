package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.1yy  reason: invalid class name and case insensitive filesystem */
public final class C43801yy extends AnonymousClass1VM {
    public static final Parcelable.Creator CREATOR = new C48132La();
    public long A00;
    public C05900Qy A01;

    public int describeContents() {
        return 0;
    }

    public C43801yy(C05870Qv r3, String str, int i, int i2, String str2, BigDecimal bigDecimal) {
        if (r3 != null) {
            this.A05 = r3;
            A07(i);
            A06(i2);
            this.A07 = str;
            this.A0A = str2;
            if (bigDecimal != null) {
                this.A01 = new C05900Qy(bigDecimal, AnonymousClass1VK.A00(this).A5z());
                return;
            }
            return;
        }
        throw null;
    }

    public C43801yy(Parcel parcel) {
        A08(parcel);
        String readString = parcel.readString();
        C05870Qv r0 = this.A05;
        BigDecimal bigDecimal = new BigDecimal(readString);
        if (r0 != null) {
            this.A01 = new C05900Qy(bigDecimal, AnonymousClass1VK.A00(this).A5z());
        }
    }

    @Override // X.AnonymousClass1VM
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ WALLET: ");
        A0S.append(super.toString());
        A0S.append(" balance: ");
        A0S.append(this.A01);
        A0S.append(" ]");
        return A0S.toString();
    }

    @Override // X.AnonymousClass1VM
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01.toString());
    }
}
