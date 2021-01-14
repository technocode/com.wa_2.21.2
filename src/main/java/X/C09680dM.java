package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0dM  reason: invalid class name and case insensitive filesystem */
public class C09680dM extends ThreadLocal {
    public final /* synthetic */ AbstractC09630dH A00;

    public C09680dM(AbstractC09630dH r1) {
        this.A00 = r1;
    }

    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        return new WeakReference(this.A00.A00());
    }
}
