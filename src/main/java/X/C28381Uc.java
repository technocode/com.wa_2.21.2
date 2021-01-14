package X;

import java.util.Arrays;

/* renamed from: X.1Uc  reason: invalid class name and case insensitive filesystem */
public final class C28381Uc {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;

    public C28381Uc(String str, byte[] bArr, byte[] bArr2) {
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28381Uc.class != obj.getClass()) {
            return false;
        }
        C28381Uc r5 = (C28381Uc) obj;
        if (!Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02) || !C006803i.A0q(this.A00, r5.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.A02) + ((Arrays.hashCode(this.A01) + 31) * 31)) * 31;
        String str = this.A00;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
