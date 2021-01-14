package X;

/* renamed from: X.0Rv  reason: invalid class name and case insensitive filesystem */
public class C06120Rv extends AbstractC05930Rb {
    public final AnonymousClass05W A00;

    public C06120Rv(AnonymousClass0RX r3) {
        AnonymousClass05W r1 = new AnonymousClass05W();
        this.A00 = r1;
        r1.A08(r3.A00);
    }

    public C06130Rx A01() {
        Object r1;
        C06130Rx r6 = new C06130Rx();
        AnonymousClass05W r5 = this.A00;
        int i = r5.A00;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = r5.A02;
            int i3 = i2 << 1;
            Object obj = objArr[i3];
            AbstractC05930Rb r12 = (AbstractC05930Rb) objArr[i3 + 1];
            if (r12 instanceof C05920Ra) {
                r1 = new AnonymousClass0RY();
            } else if (r12 instanceof C05970Rf) {
                r1 = new C05960Re();
            } else if (!(r12 instanceof C05950Rd)) {
                r1 = ((C06120Rv) r12).A01();
            } else {
                r1 = new C05940Rc();
            }
            r6.mMetricsMap.put(obj, r1);
            r6.mMetricsValid.put(obj, Boolean.FALSE);
        }
        return r6;
    }
}
