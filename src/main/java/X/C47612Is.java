package X;

import java.util.HashMap;

/* renamed from: X.2Is  reason: invalid class name and case insensitive filesystem */
public class C47612Is extends HashMap<C007303n, AbstractC007503q> {
    public boolean finished;
    public final AnonymousClass02M globalUI;
    public final AnonymousClass019 messageObserver;
    public final AnonymousClass0AC messageObservers;

    public C47612Is(AnonymousClass02M r2, AnonymousClass0AC r3, C47612Is r4, AnonymousClass2Ir r5) {
        if (r4 != null) {
            r4.A00();
        }
        this.globalUI = r2;
        this.messageObservers = r3;
        this.finished = false;
        AnonymousClass2aJ r0 = new AnonymousClass2aJ(this, r5);
        this.messageObserver = r0;
        r3.A01(r0);
    }

    public void A00() {
        this.finished = true;
        AnonymousClass02M r2 = this.globalUI;
        r2.A02.post(new RunnableEBaseShape9S0100000_I1_4(this, 4));
    }
}
