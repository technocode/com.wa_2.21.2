package X;

import java.util.Iterator;

/* renamed from: X.1vS  reason: invalid class name and case insensitive filesystem */
public class C41681vS implements AbstractC27521Qi {
    public long A00 = 0;
    public final /* synthetic */ C41691vT A01;

    public C41681vS(C41691vT r3) {
        this.A01 = r3;
    }

    @Override // X.AbstractC27521Qi
    public void AEp(long j) {
        long j2 = this.A00 + j;
        this.A00 = j2;
        if (j > 0) {
            C41691vT r0 = this.A01;
            C41401uy r5 = r0.A00;
            long j3 = r0.A01.A00;
            synchronized (((AnonymousClass01G) r5).A00) {
                Iterator it = ((AnonymousClass01G) r5).A00.iterator();
                while (true) {
                    AnonymousClass0AY r52 = (AnonymousClass0AY) it;
                    if (r52.hasNext()) {
                        ((AbstractC09090cH) r52.next()).AHm(j2, j3);
                    }
                }
            }
        }
    }
}
