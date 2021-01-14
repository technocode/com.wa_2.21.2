package X;

import java.util.Arrays;

/* renamed from: X.1Ue  reason: invalid class name and case insensitive filesystem */
public final class C28401Ue {
    public final String A00;
    public final byte[] A01;

    public C28401Ue(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28401Ue.class != obj.getClass()) {
            return false;
        }
        C28401Ue r5 = (C28401Ue) obj;
        if (!Arrays.equals(this.A01, r5.A01) || !C006803i.A0q(this.A00, r5.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.A01) + 31) * 31;
        String str = this.A00;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
