package X;

/* renamed from: X.2is  reason: invalid class name and case insensitive filesystem */
public class RunnableC56592is implements Runnable, Comparable, AbstractC27381Pn {
    public final Object A00;
    public final Object A01;
    public final Runnable A02;
    public volatile boolean A03 = false;
    public final /* synthetic */ AnonymousClass0EM A04;

    public RunnableC56592is(AnonymousClass0EM r2, Object obj, Runnable runnable, Object obj2) {
        this.A04 = r2;
        this.A01 = obj;
        this.A02 = runnable;
        this.A00 = obj2;
    }

    @Override // X.AbstractC27381Pn
    public void cancel() {
        Runnable runnable = this.A02;
        if (runnable instanceof AbstractC27381Pn) {
            ((AbstractC27381Pn) runnable).cancel();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        RunnableC56592is r3 = (RunnableC56592is) obj;
        Runnable runnable = this.A02;
        if (runnable instanceof Comparable) {
            return ((Comparable) runnable).compareTo(r3.A02);
        }
        return 0;
    }

    public void run() {
        try {
            this.A03 = true;
            this.A02.run();
        } finally {
            this.A04.A05(this.A01, this);
            this.A03 = false;
        }
    }
}
