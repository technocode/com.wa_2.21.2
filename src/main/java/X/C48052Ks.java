package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ks  reason: invalid class name and case insensitive filesystem */
public final class C48052Ks implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C48042Kr();
    public boolean A00;
    public final C05910Qz A01;
    public final C48112Ky A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final BigDecimal A09;
    public final List A0A;

    public int describeContents() {
        return 0;
    }

    public C48052Ks(Parcel parcel) {
        BigDecimal bigDecimal;
        this.A06 = parcel.readString();
        this.A08 = parcel.readString();
        this.A03 = parcel.readString();
        String readString = parcel.readString();
        C05910Qz r2 = null;
        if (TextUtils.isEmpty(readString)) {
            bigDecimal = null;
        } else {
            bigDecimal = new BigDecimal(readString);
        }
        this.A09 = bigDecimal;
        String readString2 = parcel.readString();
        this.A01 = !TextUtils.isEmpty(readString2) ? new C05910Qz(readString2) : r2;
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0A = parcel.createTypedArrayList(C48072Ku.CREATOR);
        this.A02 = (C48112Ky) parcel.readParcelable(C48112Ky.class.getClassLoader());
        this.A04 = parcel.readString();
        this.A00 = parcel.readByte() != 0;
    }

    public C48052Ks(String str, String str2, String str3, BigDecimal bigDecimal, C05910Qz r6, String str4, String str5, List list, C48112Ky r10, String str6, boolean z) {
        this.A06 = str;
        this.A08 = str2;
        if (bigDecimal == null || r6 == null) {
            this.A09 = null;
            this.A01 = null;
        } else {
            this.A09 = bigDecimal;
            this.A01 = r6;
        }
        this.A05 = str4;
        this.A07 = str5;
        this.A03 = str3;
        this.A04 = str6;
        this.A0A = A00() ? new ArrayList() : list;
        this.A02 = r10;
        this.A00 = z;
    }

    public boolean A00() {
        String str = this.A04;
        return "FETCH_FAILED".equals(str) || "PARTIAL_FETCH".equals(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48052Ks)) {
            return false;
        }
        C48052Ks r8 = (C48052Ks) obj;
        if (!(C003701u.A0F(this.A06, r8.A06) && C003701u.A0F(this.A08, r8.A08) && C003701u.A0F(this.A03, r8.A03))) {
            return false;
        }
        C05910Qz r1 = this.A01;
        if (!(r1 == null || r1.equals(r8.A01)) || (r1 == null && r8.A01 != null)) {
            return false;
        }
        BigDecimal bigDecimal = this.A09;
        if (!((bigDecimal == null || bigDecimal.equals(r8.A09)) && ((bigDecimal != null || r8.A09 == null) && C003701u.A0F(this.A05, r8.A05) && C003701u.A0F(this.A07, r8.A07)))) {
            return false;
        }
        C48112Ky r12 = this.A02;
        if (!(r12 == null || r12.equals(r8.A02)) || (r12 == null && r8.A02 != null)) {
            return false;
        }
        List list = this.A0A;
        int size = list.size();
        List list2 = r8.A0A;
        if (size != list2.size()) {
            return false;
        }
        if (list != list2) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(list2.get(i))) {
                    return false;
                }
            }
        }
        return this.A00 == r8.A00;
    }

    public int hashCode() {
        C05910Qz r2;
        int hashCode = this.A08.hashCode() + ((this.A06.hashCode() + 217) * 31);
        String str = this.A03;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        BigDecimal bigDecimal = this.A09;
        if (!(bigDecimal == null || (r2 = this.A01) == null)) {
            hashCode = r2.hashCode() + bigDecimal.hashCode() + (hashCode * 31);
        }
        String str2 = this.A05;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.A07;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        C48112Ky r0 = this.A02;
        if (r0 != null) {
            hashCode = (hashCode * 31) + r0.hashCode();
        }
        for (C48072Ku r02 : this.A0A) {
            hashCode = (hashCode * 31) + r02.A02.hashCode();
        }
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String obj;
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        BigDecimal bigDecimal = this.A09;
        String str = null;
        if (bigDecimal == null) {
            obj = null;
        } else {
            obj = bigDecimal.toString();
        }
        parcel.writeString(obj);
        C05910Qz r0 = this.A01;
        if (r0 != null) {
            str = r0.A00;
        }
        parcel.writeString(str);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeTypedList(this.A0A);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
