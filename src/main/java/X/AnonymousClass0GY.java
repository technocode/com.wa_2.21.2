package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0GY  reason: invalid class name */
public class AnonymousClass0GY {
    public static volatile AnonymousClass0GY A08;
    public final C014408c A00;
    public final C006903j A01;
    public final C016608y A02;
    public final C015308l A03;
    public final C014508d A04;
    public final C02330Bo A05;
    public final C015708p A06;
    public final AnonymousClass09E A07;

    public AnonymousClass0GY(C015308l r1, C014408c r2, C006903j r3, AnonymousClass09E r4, C02330Bo r5, C015708p r6, C014508d r7, C016608y r8) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r7;
        this.A02 = r8;
    }

    public static AnonymousClass0GY A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0GY.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass0GY(C015308l.A00(), C014408c.A00(), C006903j.A00(), AnonymousClass09E.A00(), C02330Bo.A00(), C015708p.A00(), C014508d.A00(), C016608y.A01);
                }
            }
        }
        return A08;
    }

    public void A01() {
        C015308l r1 = this.A03;
        r1.A05.clear();
        r1.A04.clear();
        C02330Bo r3 = this.A05;
        r3.A00.A06(-1);
        AnonymousClass08V r12 = r3.A06.A00;
        synchronized (r12) {
            r12.A06(-1);
        }
        r3.A05.A01.A06(-1);
        ConcurrentHashMap concurrentHashMap = this.A02.A00;
        synchronized (concurrentHashMap) {
            concurrentHashMap.clear();
        }
        this.A06.A02();
        C014508d r0 = this.A04;
        r0.A05();
        r0.A01 = false;
        C006903j r13 = this.A01;
        synchronized (r13) {
            r13.A0A().clear();
            r13.A00 = false;
        }
        C014408c r14 = this.A00;
        synchronized (r14) {
            r14.A06.clear();
            r14.A07.clear();
        }
        ConcurrentHashMap concurrentHashMap2 = this.A07.A05;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
    }
}
