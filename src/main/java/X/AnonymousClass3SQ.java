package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.3SQ  reason: invalid class name */
public class AnonymousClass3SQ extends AnonymousClass0EM {
    public final C017009c A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass08C A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass0CN A05;

    public AnonymousClass3SQ(AnonymousClass00G r3, AnonymousClass0CN r4, AnonymousClass01A r5, AnonymousClass01X r6, AnonymousClass08C r7, C017009c r8, ThreadPoolExecutor threadPoolExecutor) {
        super(new C02180Ay(null, threadPoolExecutor));
        this.A03 = r3;
        this.A05 = r4;
        this.A01 = r5;
        this.A04 = r6;
        this.A02 = r7;
        this.A00 = r8;
    }

    public void A07() {
        Iterator it = ((AbstractCollection) A02()).iterator();
        while (it.hasNext()) {
            A06(it.next());
        }
        synchronized (this) {
            ((ThreadPoolExecutor) super.A00.get()).shutdown();
        }
    }
}
