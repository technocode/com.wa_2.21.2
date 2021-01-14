package X;

import java.util.HashMap;

/* renamed from: X.0O6  reason: invalid class name */
public class AnonymousClass0O6 {
    public final AnonymousClass0O4 A00;
    public final AnonymousClass0O5 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0O6(X.AbstractC005302m r3) {
        /*
            r2 = this;
            X.0O5 r1 = r3.A9n()
            boolean r0 = r3 instanceof X.AbstractC005502p
            if (r0 == 0) goto L_0x0012
            X.02p r3 = (X.AbstractC005502p) r3
            X.0O4 r0 = r3.A62()
        L_0x000e:
            r2.<init>(r1, r0)
            return
        L_0x0012:
            X.1b3 r0 = X.C30271b3.A00
            if (r0 != 0) goto L_0x001d
            X.1b3 r0 = new X.1b3
            r0.<init>()
            X.C30271b3.A00 = r0
        L_0x001d:
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0O6.<init>(X.02m):void");
    }

    public AnonymousClass0O6(AnonymousClass0O5 r1, AnonymousClass0O4 r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public AnonymousClass0SD A00(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String A0K = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = this.A01.A00;
            AnonymousClass0SD r2 = (AnonymousClass0SD) hashMap.get(A0K);
            if (cls.isInstance(r2)) {
                AnonymousClass0O4 r1 = this.A00;
                if (r1 instanceof C06830Uw) {
                    ((C06830Uw) r1).A00(r2);
                }
            } else {
                AnonymousClass0O4 r12 = this.A00;
                if (r12 instanceof AbstractC06820Uv) {
                    r2 = ((AbstractC06820Uv) r12).A01(A0K, cls);
                } else {
                    r2 = r12.A3B(cls);
                }
                AnonymousClass0SD r0 = (AnonymousClass0SD) hashMap.put(A0K, r2);
                if (r0 != null) {
                    r0.A00();
                    return r2;
                }
            }
            return r2;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
