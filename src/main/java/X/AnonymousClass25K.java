package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.25K  reason: invalid class name */
public class AnonymousClass25K extends YogaNodeJNIBase {
    public AnonymousClass25K() {
        super(YogaNative.jni_YGNodeNewJNI());
    }

    public AnonymousClass25K(C33761hK r3) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(r3.A00));
    }

    @Override // java.lang.Object
    public void finalize() {
        try {
            long j = this.mNativePointer;
            if (j != 0) {
                this.mNativePointer = 0;
                YogaNative.jni_YGNodeFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
