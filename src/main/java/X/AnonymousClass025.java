package X;

import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.025  reason: invalid class name */
public class AnonymousClass025 {
    public final HashMap A00 = new HashMap();
    public final HashMap A01 = new HashMap();
    public final HashMap A02 = new HashMap();

    public static String A00(Runnable runnable) {
        StringBuilder A0S = AnonymousClass008.A0S("wa_");
        A0S.append(runnable.hashCode());
        return A0S.toString();
    }

    public synchronized AnonymousClass02C A01(String str) {
        AnonymousClass02C r0 = (AnonymousClass02C) this.A00.get(str);
        if (r0 != null) {
            return r0;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A01.get(str);
        if (threadPoolExecutor != null) {
            return A02(threadPoolExecutor).A00;
        }
        return AnonymousClass02C.A01;
    }

    public final synchronized AnonymousClass02D A02(ThreadPoolExecutor threadPoolExecutor) {
        AnonymousClass02D r0;
        r0 = (AnonymousClass02D) this.A02.get(threadPoolExecutor);
        if (r0 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ThreadPoolExecutor ");
            sb.append(threadPoolExecutor.toString());
            sb.append(" must be added using addThreadPoolExecutor");
            throw new IllegalStateException(sb.toString());
        }
        return r0;
    }
}
