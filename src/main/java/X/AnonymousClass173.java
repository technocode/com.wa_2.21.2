package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.173  reason: invalid class name */
public class AnonymousClass173 {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final AnonymousClass16z A03;
    public final AnonymousClass178 A04 = new AnonymousClass263(this);
    public final AnonymousClass17F A05;
    public final AnonymousClass17J A06;
    public final C237017e A07;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (r0 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
        if (r5 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f3, code lost:
        if (r0 != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0068, code lost:
        if (r5 != null) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass173(android.app.Activity r9, X.AnonymousClass16z r10, X.AnonymousClass172 r11) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass173.<init>(android.app.Activity, X.16z, X.172):void");
    }

    public AnonymousClass173(Context context, AnonymousClass16z r4, AnonymousClass172 r5) {
        C001801b.A1R(context, "Null context is not permitted.");
        C001801b.A1R(r4, "Api must not be null.");
        C001801b.A1R(r5, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.A01 = context.getApplicationContext();
        this.A03 = r4;
        this.A02 = r5.A00;
        this.A07 = new C237017e(r4, null);
        AnonymousClass17J A002 = AnonymousClass17J.A00(this.A01);
        this.A06 = A002;
        this.A00 = A002.A0B.getAndIncrement();
        this.A05 = r5.A01;
        Handler handler = this.A06.A05;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public C238317t A00() {
        C238317t r3 = new C238317t();
        Set emptySet = Collections.emptySet();
        AnonymousClass03V r1 = r3.A00;
        if (r1 == null) {
            r1 = new AnonymousClass03V(0);
            r3.A00 = r1;
        }
        r1.addAll(emptySet);
        Context context = this.A01;
        r3.A03 = context.getClass().getName();
        r3.A02 = context.getPackageName();
        return r3;
    }

    public final AbstractC011406u A01(AnonymousClass17R r6) {
        C24611Bq r4 = new C24611Bq();
        AnonymousClass17J r1 = this.A06;
        AnonymousClass265 r3 = new AnonymousClass265(r6, r4, this.A05);
        Handler handler = r1.A05;
        handler.sendMessage(handler.obtainMessage(4, new C236617a(r3, r1.A0C.get(), this)));
        return r4.A00;
    }

    public final void A02(AbstractC457025y r5) {
        r5.A05();
        AnonymousClass17J r0 = this.A06;
        C35001jZ r3 = new C35001jZ(r5);
        Handler handler = r0.A05;
        handler.sendMessage(handler.obtainMessage(4, new C236617a(r3, r0.A0C.get(), this)));
    }
}
