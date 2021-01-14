package X;

import android.os.Bundle;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: X.1b7  reason: invalid class name and case insensitive filesystem */
public class C30311b7 extends AbstractC15640oQ {
    public final AbstractC005102k A00;
    public final C30301b6 A01;

    public C30311b7(AbstractC005102k r7, AnonymousClass0O5 r8) {
        this.A00 = r7;
        AnonymousClass0O4 r5 = C30301b6.A02;
        String canonicalName = C30301b6.class.getCanonicalName();
        if (canonicalName != null) {
            String A0K = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            HashMap hashMap = r8.A00;
            AnonymousClass0SD r1 = (AnonymousClass0SD) hashMap.get(A0K);
            if (!C30301b6.class.isInstance(r1)) {
                if (r5 instanceof AbstractC06820Uv) {
                    r1 = ((AbstractC06820Uv) r5).A01(A0K, C30301b6.class);
                } else {
                    r1 = ((C30291b5) r5).A3B(C30301b6.class);
                }
                AnonymousClass0SD r0 = (AnonymousClass0SD) hashMap.put(A0K, r1);
                if (r0 != null) {
                    r0.A00();
                }
            } else if (r5 instanceof C06830Uw) {
                ((C06830Uw) r5).A00(r1);
            }
            this.A01 = (C30301b6) r1;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final C15650oR A04(int i, Bundle bundle, AbstractC15630oP r9, C15650oR r10) {
        try {
            C30301b6 r5 = this.A01;
            r5.A01 = true;
            C15650oR AEk = r9.AEk(i, bundle);
            if (AEk != null) {
                Class<?> cls = AEk.getClass();
                if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                    C08890bv r4 = new C08890bv(i, bundle, AEk, r10);
                    r5.A00.A05(i, r4);
                    r5.A01 = false;
                    AbstractC005102k r3 = this.A00;
                    C15650oR r2 = r4.A05;
                    C30281b4 r1 = new C30281b4(r2, r9);
                    r4.A03(r3, r1);
                    C30281b4 r0 = r4.A01;
                    if (r0 != null) {
                        r4.A06(r0);
                    }
                    r4.A00 = r3;
                    r4.A01 = r1;
                    return r2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                sb.append(AEk);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.A01.A01 = false;
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AnonymousClass0N2.A1S(this.A00, sb);
        sb.append("}}");
        return sb.toString();
    }
}
