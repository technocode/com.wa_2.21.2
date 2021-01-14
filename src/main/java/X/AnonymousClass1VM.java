package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1VM  reason: invalid class name */
public abstract class AnonymousClass1VM implements Parcelable {
    public int A00 = 0;
    public int A01 = 0;
    public int A02;
    public long A03;
    public long A04;
    public C05870Qv A05 = C05870Qv.A0F;
    public AbstractC43781yw A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public byte[] A0B;

    public static String A02(int i) {
        switch (i) {
            case 1:
                return "Debit";
            case 2:
                return "Bank Account";
            case 3:
                return "PaymentWallet";
            case 4:
                return "Credit";
            case 5:
                return "Business Account";
            case 6:
                return "Combo";
            case 7:
            default:
                return null;
            case 8:
                return "Prepaid";
        }
    }

    public static int A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1211756856) {
            if (hashCode != 35394935) {
                if (hashCode != 2066319421 || !str.equals("FAILED")) {
                    return 0;
                }
                return 2;
            } else if (str.equals("PENDING")) {
                return 1;
            } else {
                return 0;
            }
        } else if (str.equals("VERIFIED")) {
            return 3;
        } else {
            return 0;
        }
    }

    public static AnonymousClass1VM A01(int i, String str, C05870Qv r8, String str2, String str3) {
        if (i != 1) {
            if (i == 2) {
                C43751yt r1 = new C43751yt(r8);
                r1.A07 = str2;
                r1.A0A = str3;
                r1.A08 = str;
                return r1;
            } else if (i == 3) {
                C43801yy r12 = new C43801yy(r8, str2, 0, 0, str3, BigDecimal.ZERO);
                r12.A06 = null;
                return r12;
            } else if (!(i == 4 || i == 6 || i == 8)) {
                return null;
            }
        }
        return new C43761yu(r8, str2, str, i, 0, 0, str3, C43761yu.A05(str));
    }

    public static List A03(List list, C05870Qv r6) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1VM r2 = (AnonymousClass1VM) it.next();
            if (C002001d.A3h(r6.A06, r2.A04())) {
                if (r2.A01 == 2) {
                    arrayList.add(0, r2);
                } else {
                    arrayList.add(r2);
                }
            }
        }
        return arrayList;
    }

    public int A04() {
        if (this instanceof C43801yy) {
            return 3;
        }
        if (this instanceof C43771yv) {
            return 5;
        }
        if (!(this instanceof C43761yu)) {
            return 2;
        }
        return ((C43761yu) this).A00;
    }

    public Bitmap A05() {
        byte[] bArr;
        int A042 = A04();
        if ((A042 == 1 || A042 == 2 || A042 == 3 || A042 == 4 || A042 == 6 || A042 == 7) && (bArr = this.A0B) != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public void A06(int i) {
        int A042;
        if (this.A01 != 1 || this.A05.A01 == (A042 = A04())) {
            this.A00 = i;
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("PAY: ");
        A0S.append(A042);
        A0S.append(" in country cannot be primary account type");
        throw new IllegalArgumentException(A0S.toString());
    }

    public void A07(int i) {
        int A042;
        if (i != 1 || this.A05.A00 == (A042 = A04())) {
            this.A01 = i;
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("PAY: ");
        A0S.append(A042);
        A0S.append(" in country cannot be primary account type");
        throw new IllegalArgumentException(A0S.toString());
    }

    public void A08(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A05 = C05870Qv.A00(parcel.readString().trim().toUpperCase(Locale.US));
        this.A0A = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A0B = null;
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            this.A0B = bArr;
            parcel.readByteArray(bArr);
        }
        this.A06 = null;
        if (parcel.readByte() == 1) {
            this.A06 = (AbstractC43781yw) parcel.readParcelable(AnonymousClass0RL.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AnonymousClass1VM) && (str = ((AnonymousClass1VM) obj).A07) != null && str.equals(this.A07)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.A07;
        if (str == null) {
            return super.hashCode();
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("credential-id: ");
        A0S.append(this.A07);
        A0S.append(" country: ");
        A0S.append(this.A05.A02);
        A0S.append(" issuerName: ");
        A0S.append(this.A08);
        A0S.append(" payment-mode: ");
        A0S.append(this.A01);
        A0S.append(" payout-mode: ");
        A0S.append(this.A00);
        A0S.append(" merchant-credential-id: ");
        A0S.append(this.A09);
        A0S.append(" payout-verification-status: ");
        A0S.append(this.A02);
        A0S.append(" countrydata: ");
        A0S.append(this.A06);
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A07);
        parcel.writeString(this.A05.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        byte[] bArr = this.A0B;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        parcel.writeInt(length);
        byte[] bArr2 = this.A0B;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        byte b = 0;
        if (this.A06 != null) {
            b = 1;
        }
        parcel.writeByte(b);
        AbstractC43781yw r0 = this.A06;
        if (r0 != null) {
            parcel.writeParcelable(r0, 0);
        }
    }
}
