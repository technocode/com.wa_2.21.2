package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.29M  reason: invalid class name */
public final class AnonymousClass29M extends AnonymousClass269 {
    public final C24701Ca A00;
    public final C24701Ca A01;
    public final C24701Ca A02;
    public final C24701Ca A03;
    public final C24701Ca A04;
    public final C24701Ca A05;
    public final C24701Ca A06;
    public final C24701Ca A07;
    public final C24791Ck A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass29M(Context context, Looper looper, AnonymousClass176 r13, AnonymousClass177 r14, C238417u r15) {
        super(context, looper, 14, r15, r13, r14);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        C001801b.A1Q(context);
        synchronized (C24791Ck.class) {
            if (C24791Ck.A01 == null) {
                C24791Ck.A01 = new C24791Ck(context);
            }
        }
        C24791Ck r1 = C24791Ck.A01;
        this.A00 = new C24701Ca();
        this.A01 = new C24701Ca();
        this.A02 = new C24701Ca();
        this.A03 = new C24701Ca();
        this.A04 = new C24701Ca();
        this.A05 = new C24701Ca();
        this.A06 = new C24701Ca();
        this.A07 = new C24701Ca();
        C001801b.A1Q(newCachedThreadPool);
        this.A08 = r1;
    }

    @Override // X.AbstractC238217s
    public final void A04(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("onPostInitHandler: statusCode ");
            sb.append(i);
            Log.v("WearableClient", sb.toString());
        }
        if (i == 0) {
            this.A00.A00(iBinder);
            this.A01.A00(iBinder);
            this.A02.A00(iBinder);
            this.A03.A00(iBinder);
            this.A04.A00(iBinder);
            this.A05.A00(iBinder);
            this.A06.A00(iBinder);
            this.A07.A00(iBinder);
        }
        super.A04(i, iBinder, bundle, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r6 < 8600000) goto L_0x0024;
     */
    @Override // X.AbstractC238217s, X.AbstractC34701j2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A2x(X.AbstractC237817o r8) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass29M.A2x(X.17o):void");
    }

    @Override // X.AbstractC238217s, X.AbstractC34701j2
    public final boolean AMu() {
        return !this.A08.A02();
    }
}
