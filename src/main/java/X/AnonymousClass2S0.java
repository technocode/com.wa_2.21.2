package X;

import java.util.Comparator;

/* renamed from: X.2S0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S0 implements Comparator {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;

    public /* synthetic */ AnonymousClass2S0(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        double d = this.A00;
        double d2 = this.A01;
        C07040Vr r2 = ((C32311eg) obj).A0K;
        double d3 = r2.A00 - d;
        double d4 = r2.A01 - d2;
        double d5 = (d4 * d4) + (d3 * d3);
        C07040Vr r0 = ((C32311eg) obj2).A0K;
        double d6 = r0.A00 - d;
        double d7 = r0.A01 - d2;
        return Double.compare(d5, (d7 * d7) + (d6 * d6));
    }
}
