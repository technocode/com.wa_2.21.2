package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.14q  reason: invalid class name and case insensitive filesystem */
public final class C231614q implements Parcelable {
    public static final C231614q A0K = new C231614q();
    public static final Parcelable.Creator CREATOR = new C231514p();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseArray A08;
    public final SparseBooleanArray A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public int describeContents() {
        return 0;
    }

    public C231614q() {
        SparseArray sparseArray = new SparseArray();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.A08 = sparseArray;
        this.A09 = sparseBooleanArray;
        this.A0A = null;
        this.A0B = null;
        this.A0I = false;
        this.A00 = 0;
        this.A0H = false;
        this.A0G = false;
        this.A0C = false;
        this.A0D = true;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0F = true;
        this.A0E = true;
        this.A07 = Integer.MAX_VALUE;
        this.A06 = Integer.MAX_VALUE;
        this.A0J = true;
        this.A05 = 0;
    }

    public C231614q(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        boolean z = false;
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put(parcel.readParcelable(AnonymousClass14A.class.getClassLoader()), parcel.readParcelable(C231814s.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.A08 = sparseArray;
        this.A09 = parcel.readSparseBooleanArray();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A0I = parcel.readInt() != 0;
        this.A00 = parcel.readInt();
        this.A0H = parcel.readInt() != 0;
        this.A0G = parcel.readInt() != 0;
        this.A0C = parcel.readInt() != 0;
        this.A0D = parcel.readInt() != 0;
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0F = parcel.readInt() != 0;
        this.A0E = parcel.readInt() != 0;
        this.A07 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0J = parcel.readInt() != 0 ? true : z;
        this.A05 = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C231614q.class != obj.getClass()) {
            return false;
        }
        C231614q r11 = (C231614q) obj;
        if (this.A0I == r11.A0I && this.A00 == r11.A00 && this.A0H == r11.A0H && this.A0G == r11.A0G && this.A0C == r11.A0C && this.A0D == r11.A0D && this.A04 == r11.A04 && this.A03 == r11.A03 && this.A02 == r11.A02 && this.A0F == r11.A0F && this.A0E == r11.A0E && this.A0J == r11.A0J && this.A07 == r11.A07 && this.A06 == r11.A06 && this.A01 == r11.A01 && this.A05 == r11.A05 && TextUtils.equals(this.A0A, r11.A0A) && TextUtils.equals(this.A0B, r11.A0B)) {
            SparseBooleanArray sparseBooleanArray = this.A09;
            SparseBooleanArray sparseBooleanArray2 = r11.A09;
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                        i++;
                    } else {
                        SparseArray sparseArray = this.A08;
                        SparseArray sparseArray2 = r11.A08;
                        int size2 = sparseArray.size();
                        if (sparseArray2.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            Object key = entry.getKey();
                                            if (map2.containsKey(key)) {
                                                if (!AnonymousClass0W2.A08(entry.getValue(), map2.get(key))) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = (((((((((((((((((((((((((((((((this.A0I ? 1 : 0) * 31) + this.A00) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0J ? 1 : 0)) * 31) + this.A07) * 31) + this.A06) * 31) + this.A01) * 31) + this.A05) * 31;
        String str = this.A0A;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.A0B;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.A08;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A05);
    }
}
