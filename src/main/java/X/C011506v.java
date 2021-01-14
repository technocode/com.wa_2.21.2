package X;

/* renamed from: X.06v  reason: invalid class name and case insensitive filesystem */
public final class C011506v extends AbstractC011406u {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final C24641Bt A03 = new C24641Bt();
    public final Object A04 = new Object();
    public volatile boolean A05;

    public final void A05() {
        synchronized (this.A04) {
            if (!this.A02) {
                this.A02 = true;
                this.A05 = true;
                this.A03.A00(this);
            }
        }
    }

    public final void A06() {
        boolean z;
        synchronized (this.A04) {
            z = this.A02;
        }
        if (z) {
            this.A03.A00(this);
        }
    }

    public final void A07(Exception exc) {
        C001801b.A1R(exc, "Exception must not be null");
        synchronized (this.A04) {
            C001801b.A1b(!this.A02, "Task is already complete");
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A00(this);
    }

    public final void A08(Object obj) {
        synchronized (this.A04) {
            C001801b.A1b(!this.A02, "Task is already complete");
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A00(this);
    }
}
