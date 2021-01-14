package X;

/* renamed from: X.2K8  reason: invalid class name */
public class AnonymousClass2K8 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02 = 300.0f;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ AbstractC59392na A06;
    public final /* synthetic */ Runnable A07;

    public AnonymousClass2K8(AbstractC59392na r2, long j, float f, float f2, float f3, float f4, Runnable runnable) {
        this.A06 = r2;
        this.A05 = j;
        this.A04 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A07 = runnable;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        float f = this.A02;
        float min = Math.min(f, (float) (currentTimeMillis - this.A05));
        float f2 = this.A04;
        AbstractC59392na r2 = this.A06;
        r2.A02((this.A03 * min) + f2, this.A00, this.A01);
        Runnable runnable = this.A07;
        if (runnable != null) {
            runnable.run();
        }
        if (min < f) {
            r2.A09.post(this);
        }
    }
}
