package X;

import android.text.TextUtils;

/* renamed from: X.0iE  reason: invalid class name and case insensitive filesystem */
public class C12520iE {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final int[] A06;
    public final int[] A07;
    public final String[] A08;
    public final String[] A09;
    public final String[] A0A;
    public final String[] A0B;

    public C12520iE(String[] strArr) {
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        int length;
        int length2;
        int length3 = strArr.length;
        if (length3 >= 12) {
            boolean z = false;
            String str = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            String str4 = strArr[3];
            String str5 = strArr[4];
            String str6 = strArr[5];
            if (str2 == null || str3 == null) {
                throw new IllegalArgumentException();
            }
            this.A03 = str2;
            this.A02 = str;
            this.A00 = Integer.parseInt(str3);
            String[] strArr5 = null;
            if (str4 == null || str4.trim().length() <= 0) {
                iArr = null;
            } else {
                String[] split = TextUtils.split(str4, ",");
                if (split == null || (length2 = split.length) == 0) {
                    iArr = null;
                } else {
                    iArr = new int[length2];
                    int i = 0;
                    do {
                        iArr[i] = Integer.parseInt(split[i]);
                        i++;
                    } while (i < length2);
                }
            }
            this.A07 = iArr;
            if (str5 == null || str5.trim().length() <= 0) {
                iArr2 = null;
            } else {
                String[] split2 = TextUtils.split(str5, ",");
                if (split2 == null || (length = split2.length) == 0) {
                    iArr2 = null;
                } else {
                    iArr2 = new int[length];
                    int i2 = 0;
                    do {
                        iArr2[i2] = Integer.parseInt(split2[i2]);
                        i2++;
                    } while (i2 < length);
                }
            }
            this.A06 = iArr2;
            if (str6 == null || str6.trim().length() <= 0) {
                strArr2 = null;
            } else {
                strArr2 = TextUtils.split(str6, ",");
            }
            this.A0B = strArr2;
            String str7 = strArr[7];
            z = (str7.length() > 0 || strArr[8].length() > 0 || strArr[9].length() > 0) ? true : z;
            this.A05 = z;
            if (z) {
                strArr3 = TextUtils.split(str7, ";");
            } else {
                strArr3 = null;
            }
            this.A0A = strArr3;
            if (this.A05) {
                strArr4 = TextUtils.split(strArr[8], ";");
            } else {
                strArr4 = null;
            }
            this.A08 = strArr4;
            this.A09 = this.A05 ? TextUtils.split(strArr[9], ";") : strArr5;
            this.A01 = strArr[10];
            this.A04 = length3 >= 14 ? strArr[13] : "";
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int A00(int i) {
        int i2;
        int i3;
        int length;
        int length2;
        int[] iArr = this.A06;
        if (iArr == null || (length2 = iArr.length) == 0) {
            i2 = 5;
        } else {
            i2 = iArr[0];
            for (int i4 = 1; i4 < length2; i4++) {
                if (iArr[i4] < i2) {
                    i2 = iArr[i4];
                }
            }
        }
        if (i < i2) {
            return -1;
        }
        if (iArr == null || (length = iArr.length) == 0) {
            i3 = 14;
        } else {
            i3 = iArr[0];
            for (int i5 = 1; i5 < length; i5++) {
                if (iArr[i5] > i3) {
                    i3 = iArr[i5];
                }
            }
        }
        if (i > i3) {
            return 1;
        }
        if (iArr == null || (r2 = iArr.length) == 0) {
            return 0;
        }
        for (int i6 : iArr) {
            if (i6 == i) {
                return 0;
            }
        }
        return 1;
    }
}
