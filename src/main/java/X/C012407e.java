package X;

import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.07e  reason: invalid class name and case insensitive filesystem */
public final class C012407e {
    public final AnonymousClass05T A00;
    public final C012007a A01;
    public final C012507f A02;
    public final AnonymousClass07Z A03;
    public final Executor A04;

    public C012407e(AnonymousClass05T r3, C012007a r4, Executor executor, AnonymousClass07Z r6) {
        r3.A03();
        C012507f r0 = new C012507f(r3.A00, r4);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r0;
        this.A04 = executor;
        this.A03 = r6;
    }

    public static final AbstractC011406u A00(AbstractC011406u r5) {
        Executor executor = AnonymousClass1Eo.A00;
        C37041nR r3 = new C37041nR();
        C011506v r52 = (C011506v) r5;
        C011506v r2 = new C011506v();
        r52.A03.A01(new C36181li(executor, r3, r2));
        r52.A06();
        return r2;
    }

    public final AbstractC011406u A01(AbstractC011406u r6) {
        Executor executor = this.A04;
        C37051nS r3 = new C37051nS(this);
        C011506v r62 = (C011506v) r6;
        if (r62 != null) {
            C011506v r2 = new C011506v();
            r62.A03.A01(new C36181li(executor, r3, r2));
            r62.A06();
            return r2;
        }
        throw null;
    }

    public final AbstractC011406u A02(String str, String str2, String str3, Bundle bundle) {
        String str4;
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String obj;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        AnonymousClass05T r0 = this.A00;
        r0.A03();
        bundle.putString("gmp_app_id", r0.A02.A01);
        C012007a r2 = this.A01;
        bundle.putString("gmsv", Integer.toString(r2.A02()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", r2.A04());
        synchronized (r2) {
            if (r2.A03 == null) {
                r2.A05();
            }
            str4 = r2.A03;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        AnonymousClass07Z r3 = this.A03;
        Set set = r3.A00.A00;
        synchronized (set) {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        if (unmodifiableSet.isEmpty()) {
            obj = r3.A01;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(r3.A01);
            sb.append(' ');
            synchronized (set) {
                unmodifiableSet2 = Collections.unmodifiableSet(set);
            }
            sb.append(AnonymousClass07Z.A00(unmodifiableSet2));
            obj = sb.toString();
        }
        bundle.putString("Firebase-Client", obj);
        C24611Bq r32 = new C24611Bq();
        this.A04.execute(new RunnableEBaseShape0S0300000_I0_0(this, bundle, r32, 6));
        return r32.A00;
    }
}
