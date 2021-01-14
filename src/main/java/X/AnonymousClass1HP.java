package X;

import android.content.Context;

/* renamed from: X.1HP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HP extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0HN A01;
    public final /* synthetic */ C006903j A02;
    public final /* synthetic */ C02100Aq A03;
    public final /* synthetic */ AnonymousClass094 A04;
    public final /* synthetic */ C03160Fa A05;
    public final /* synthetic */ AnonymousClass00T A06;

    public /* synthetic */ AnonymousClass1HP(Context context, C006903j r2, AnonymousClass00T r3, C03160Fa r4, AnonymousClass0HN r5, C02100Aq r6, AnonymousClass094 r7) {
        this.A00 = context;
        this.A02 = r2;
        this.A06 = r3;
        this.A05 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A04 = r7;
    }

    public final void run() {
        Context context = this.A00;
        C006903j r1 = this.A02;
        C003001n.A01(context, r1, this.A06, this.A05, this.A01, this.A03, this.A04);
        r1.A0A();
    }
}
