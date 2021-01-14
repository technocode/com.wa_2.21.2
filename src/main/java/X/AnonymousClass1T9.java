package X;

/* renamed from: X.1T9  reason: invalid class name */
public class AnonymousClass1T9 {
    public static final int[] A00 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
    public static final int[] A01 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    public static boolean A00(String str, int[] iArr) {
        int i;
        int i2;
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = length - 2;
            if (i3 >= i) {
                break;
            }
            int i5 = i3 + 1;
            i4 += Character.getNumericValue(str.charAt(i3)) * iArr[i5];
            i3 = i5;
        }
        int i6 = 11 - (i4 % 11);
        if (i6 > 9) {
            i6 = 0;
        }
        if (Character.getNumericValue(str.charAt(i)) != i6) {
            return false;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = length - 1;
            if (i7 >= i2) {
                break;
            }
            i8 += Character.getNumericValue(str.charAt(i7)) * iArr[i7];
            i7++;
        }
        int i9 = 11 - (i8 % 11);
        if (i9 > 9) {
            i9 = 0;
        }
        if (Character.getNumericValue(str.charAt(i2)) != i9) {
            return false;
        }
        boolean z = false;
        for (int i10 = 1; i10 < length; i10++) {
            z = true;
            if (str.charAt(i10 - 1) != str.charAt(i10)) {
                break;
            }
            z = false;
        }
        return z;
    }
}
