package X;

/* renamed from: X.072  reason: invalid class name */
public class AnonymousClass072 extends AnonymousClass073 {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    public AnonymousClass072(byte[] bArr) {
        this.bytes = bArr;
    }

    @Override // X.AnonymousClass071
    public final boolean equals(Object obj) {
        int length;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass071) || (length = this.bytes.length) != ((AnonymousClass072) ((AnonymousClass071) obj)).bytes.length) {
            return false;
        }
        if (length == 0) {
            return true;
        }
        if (!(obj instanceof AnonymousClass072)) {
            return obj.equals(this);
        }
        AnonymousClass072 r9 = (AnonymousClass072) obj;
        int i = this.hash;
        int i2 = r9.hash;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int length2 = r9.bytes.length;
        if (length <= length2) {
            int i3 = 0 + length;
            if (i3 <= length2) {
                byte[] bArr = this.bytes;
                byte[] bArr2 = r9.bytes;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    if (bArr[i4] != bArr2[i5]) {
                        return false;
                    }
                    i4++;
                    i5++;
                }
                return true;
            }
            StringBuilder A0U = AnonymousClass008.A0U("Ran off end of other: ", 0, ", ", length, ", ");
            A0U.append(length2);
            throw new IllegalArgumentException(A0U.toString());
        }
        StringBuilder sb = new StringBuilder("Length too large: ");
        sb.append(length);
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }
}
