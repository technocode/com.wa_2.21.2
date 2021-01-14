package X;

/* renamed from: X.0Il  reason: invalid class name and case insensitive filesystem */
public class C03960Il {
    public final int[] A00;

    public C03960Il(String str) {
        int codePointCount = str.codePointCount(0, str.length());
        this.A00 = new int[codePointCount];
        int i = 0;
        for (int i2 = 0; i2 < codePointCount; i2++) {
            this.A00[i2] = str.codePointAt(i);
            i += Character.charCount(this.A00[i2]);
        }
    }

    public C03960Il(int[] iArr) {
        this.A00 = iArr;
    }

    public static String A00(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C03960Il.class != obj.getClass()) {
            return false;
        }
        int[] iArr = this.A00;
        int[] iArr2 = ((C03960Il) obj).A00;
        if (iArr == iArr2) {
            return true;
        }
        int length = iArr.length;
        if (length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 : this.A00) {
            i = (i * 31) + i2;
        }
        return i;
    }

    public String toString() {
        return A00(this.A00);
    }
}
