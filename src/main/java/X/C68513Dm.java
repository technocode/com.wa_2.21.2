package X;

/* renamed from: X.3Dm  reason: invalid class name and case insensitive filesystem */
public class C68513Dm implements AbstractC61182sd {
    public final /* synthetic */ C61172sc A00;

    public C68513Dm(C61172sc r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC61182sd
    public void AFb(C61072sS r5) {
        C61172sc r3 = this.A00;
        if (r3.A01.compareAndSet(false, true)) {
            r3.A02.decrementAndGet();
            r3.A00.AFb(r5);
        }
    }

    @Override // X.AbstractC61182sd
    public void AKj(String str) {
        this.A00.A00(0, str);
    }
}
