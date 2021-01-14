package X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.1hK  reason: invalid class name and case insensitive filesystem */
public class C33761hK {
    public long A00;

    public C33761hK() {
        long jni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jni_YGConfigNewJNI != 0) {
            this.A00 = jni_YGConfigNewJNI;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public void finalize() {
        try {
            long j = this.A00;
            if (j != 0) {
                this.A00 = 0;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
