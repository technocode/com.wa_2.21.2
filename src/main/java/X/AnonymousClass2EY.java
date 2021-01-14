package X;

/* renamed from: X.2EY  reason: invalid class name */
public class AnonymousClass2EY {
    public AnonymousClass1Fh A00;
    public AnonymousClass2EX A01;
    public final int A02 = 3;
    public final C37251nt A03 = new C37251nt();
    public final AnonymousClass2EW A04;
    public final AbstractC46582Ea A05;
    public volatile boolean A06 = false;

    public AnonymousClass2EY(int i, AbstractC46582Ea r4, AnonymousClass2EW r5) {
        this.A05 = r4;
        this.A04 = r5;
    }

    public AnonymousClass2EY(AbstractC46582Ea r2, AnonymousClass2EW r3) {
        this.A05 = r2;
        this.A04 = r3;
    }

    public synchronized void A00() {
        this.A00 = null;
    }

    public synchronized void A01() {
        if (this.A06) {
            this.A06 = false;
            AnonymousClass2EX r0 = this.A01;
            if (r0 != null) {
                r0.interrupt();
                this.A01 = null;
                return;
            }
            throw null;
        }
    }

    public synchronized void A02() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass2EX r0 = new AnonymousClass2EX(this);
            this.A01 = r0;
            r0.start();
        }
    }
}
