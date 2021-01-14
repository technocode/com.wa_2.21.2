package X;

import android.content.Context;

/* renamed from: X.1iU  reason: invalid class name and case insensitive filesystem */
public final class C34441iU implements AnonymousClass15D {
    public final Context A00;
    public final AnonymousClass15D A01;

    public C34441iU(Context context, String str) {
        C455725j r1 = new C455725j(str);
        this.A00 = context.getApplicationContext();
        this.A01 = r1;
    }

    @Override // X.AnonymousClass15D
    public AnonymousClass15E A3F() {
        return new C34431iT(this.A00, this.A01.A3F());
    }
}
