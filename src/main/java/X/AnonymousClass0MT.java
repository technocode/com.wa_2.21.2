package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.0MT  reason: invalid class name */
public final class AnonymousClass0MT extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        Execution.assertInitialized();
        return Integer.valueOf(Execution.nativeGetExecutionContext());
    }
}
