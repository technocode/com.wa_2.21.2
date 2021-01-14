package X;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.071  reason: invalid class name */
public abstract class AnonymousClass071 implements Iterable, Serializable {
    public static final AbstractC05020Mv A00;
    public static final AnonymousClass071 A01 = new AnonymousClass072(AnonymousClass07G.A01);
    public int hash = 0;

    public abstract boolean equals(Object obj);

    static {
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        A00 = z ? new AnonymousClass0Mu() : new C37161ne();
    }

    public static AnonymousClass071 A00(byte[] bArr, int i, int i2) {
        return new AnonymousClass072(A00.A39(bArr, i, i2));
    }

    public final byte[] A01() {
        int length = ((AnonymousClass072) this).bytes.length;
        if (length == 0) {
            return AnonymousClass07G.A01;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(((AnonymousClass072) this).bytes, 0, bArr, 0, length);
        return bArr;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int length = ((AnonymousClass072) this).bytes.length;
            byte[] bArr = ((AnonymousClass072) this).bytes;
            i = length;
            for (int i2 = 0; i2 < 0 + length; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new AnonymousClass1FF(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(((AnonymousClass072) this).bytes.length));
    }
}
