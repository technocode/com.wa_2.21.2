package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.126  reason: invalid class name */
public final class AnonymousClass126 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass125();
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final AnonymousClass135 A0H;
    public final C228113g A0I;
    public final C234815z A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final List A0Q;
    public final byte[] A0R;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass126(Parcel parcel) {
        byte[] bArr;
        this.A0M = parcel.readString();
        this.A0N = parcel.readString();
        this.A0L = parcel.readString();
        this.A0P = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        if (parcel.readInt() != 0) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A0R = bArr;
        this.A0E = parcel.readInt();
        this.A0J = (C234815z) parcel.readParcelable(C234815z.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0O = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int readInt = parcel.readInt();
        this.A0Q = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A0Q.add(parcel.createByteArray());
        }
        this.A0H = (AnonymousClass135) parcel.readParcelable(AnonymousClass135.class.getClassLoader());
        this.A0I = (C228113g) parcel.readParcelable(C228113g.class.getClassLoader());
    }

    public AnonymousClass126(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C234815z r21, int i7, int i8, int i9, int i10, int i11, int i12, String str6, int i13, long j, List list, AnonymousClass135 r33, C228113g r34) {
        int i14 = i5;
        float f3 = f2;
        int i15 = i11;
        int i16 = i10;
        List list2 = list;
        this.A0M = str;
        this.A0N = str2;
        this.A0L = str3;
        this.A0P = str4;
        this.A0K = str5;
        this.A04 = i;
        this.A09 = i2;
        this.A0F = i3;
        this.A08 = i4;
        this.A01 = f;
        this.A0B = i14 == -1 ? 0 : i14;
        this.A02 = f2 == -1.0f ? 1.0f : f3;
        this.A0R = bArr;
        this.A0E = i6;
        this.A0J = r21;
        this.A05 = i7;
        this.A0C = i8;
        this.A0A = i9;
        this.A06 = i16 == -1 ? 0 : i16;
        this.A07 = i15 == -1 ? 0 : i15;
        this.A0D = i12;
        this.A0O = str6;
        this.A03 = i13;
        this.A0G = j;
        this.A0Q = list == null ? Collections.emptyList() : list2;
        this.A0H = r33;
        this.A0I = r34;
    }

    public static AnonymousClass126 A00(String str, String str2, int i, int i2, int i3, List list, String str3) {
        return new AnonymousClass126(str, null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i, i2, i3, -1, -1, 0, str3, -1, Long.MAX_VALUE, list, null, null);
    }

    public AnonymousClass126 A01(int i, int i2) {
        return new AnonymousClass126(this.A0M, this.A0N, this.A0L, this.A0P, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0R, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i, i2, this.A0D, this.A0O, this.A03, this.A0G, this.A0Q, this.A0H, this.A0I);
    }

    public AnonymousClass126 A02(C228113g r49) {
        return new AnonymousClass126(this.A0M, this.A0N, this.A0L, this.A0P, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0R, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0O, this.A03, this.A0G, this.A0Q, this.A0H, r49);
    }

    public boolean A03(AnonymousClass126 r7) {
        List list = this.A0Q;
        int size = list.size();
        List list2 = r7.A0Q;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass126.class != obj.getClass()) {
            return false;
        }
        AnonymousClass126 r7 = (AnonymousClass126) obj;
        int i2 = this.A00;
        if ((i2 == 0 || (i = r7.A00) == 0 || i2 == i) && this.A04 == r7.A04 && this.A09 == r7.A09 && this.A0F == r7.A0F && this.A08 == r7.A08 && Float.compare(this.A01, r7.A01) == 0 && this.A0B == r7.A0B && Float.compare(this.A02, r7.A02) == 0 && this.A0E == r7.A0E && this.A05 == r7.A05 && this.A0C == r7.A0C && this.A0A == r7.A0A && this.A06 == r7.A06 && this.A07 == r7.A07 && this.A0G == r7.A0G && this.A0D == r7.A0D && AnonymousClass0W2.A08(this.A0M, r7.A0M) && AnonymousClass0W2.A08(this.A0N, r7.A0N) && AnonymousClass0W2.A08(this.A0O, r7.A0O) && this.A03 == r7.A03 && AnonymousClass0W2.A08(this.A0L, r7.A0L) && AnonymousClass0W2.A08(this.A0P, r7.A0P) && AnonymousClass0W2.A08(this.A0K, r7.A0K) && AnonymousClass0W2.A08(this.A0H, r7.A0H) && AnonymousClass0W2.A08(this.A0I, r7.A0I) && AnonymousClass0W2.A08(this.A0J, r7.A0J) && Arrays.equals(this.A0R, r7.A0R) && A03(r7)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        String str = this.A0M;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (527 + hashCode) * 31;
        String str2 = this.A0L;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.A0P;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str4 = this.A0K;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i6 = (((((((((((i5 + hashCode4) * 31) + this.A04) * 31) + this.A0F) * 31) + this.A08) * 31) + this.A05) * 31) + this.A0C) * 31;
        String str5 = this.A0O;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i7 = (((i6 + hashCode5) * 31) + this.A03) * 31;
        AnonymousClass135 r0 = this.A0H;
        if (r0 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r0.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        C228113g r02 = this.A0I;
        if (r02 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = r02.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        String str6 = this.A0N;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((Float.floatToIntBits(this.A02) + ((Float.floatToIntBits(this.A01) + ((((((i9 + i2) * 31) + this.A09) * 31) + ((int) this.A0G)) * 31)) * 31)) * 31) + this.A0B) * 31) + this.A0E) * 31) + this.A0A) * 31) + this.A06) * 31) + this.A07) * 31) + this.A0D;
        this.A00 = floatToIntBits;
        return floatToIntBits;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Format(");
        A0S.append(this.A0M);
        A0S.append(", ");
        A0S.append(this.A0N);
        A0S.append(", ");
        A0S.append(this.A0L);
        A0S.append(", ");
        A0S.append(this.A0P);
        A0S.append(", ");
        A0S.append(this.A0K);
        A0S.append(", ");
        A0S.append(this.A04);
        A0S.append(", ");
        A0S.append(this.A0O);
        A0S.append(", [");
        A0S.append(this.A0F);
        A0S.append(", ");
        A0S.append(this.A08);
        A0S.append(", ");
        A0S.append(this.A01);
        A0S.append("], [");
        A0S.append(this.A05);
        A0S.append(", ");
        return AnonymousClass008.A0N(A0S, this.A0C, "])");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0R;
        int i2 = 0;
        if (bArr != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0G);
        List list = this.A0Q;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray((byte[]) list.get(i3));
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}
