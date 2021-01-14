package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.14B  reason: invalid class name */
public final class AnonymousClass14B {
    public final int A00 = -1;
    public final int[] A01 = new int[0];
    public final long[] A02 = new long[0];
    public final Uri[] A03 = new Uri[0];

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass14B.class != obj.getClass()) {
            return false;
        }
        AnonymousClass14B r5 = (AnonymousClass14B) obj;
        if (!Arrays.equals(this.A03, r5.A03) || !Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A02) + ((Arrays.hashCode(this.A01) + ((-31 + Arrays.hashCode(this.A03)) * 31)) * 31);
    }
}
