package X;

import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.0x5  reason: invalid class name and case insensitive filesystem */
public class C20660x5 {
    public int A00;
    public final int A01;
    public final int A02;
    public final Queue A03;

    public C20660x5(int i, int i2, int i3) {
        boolean z = true;
        AnonymousClass0N2.A1Z(i > 0);
        AnonymousClass0N2.A1Z(i2 >= 0);
        AnonymousClass0N2.A1Z(i3 < 0 ? false : z);
        this.A01 = i;
        this.A02 = i2;
        this.A03 = new LinkedList();
        this.A00 = i3;
    }

    public Object A00() {
        Object obj;
        if (!(this instanceof C32931fq)) {
            return this.A03.poll();
        }
        C32931fq r4 = (C32931fq) this;
        C20040w1 r3 = (C20040w1) r4.A03.poll();
        SoftReference softReference = r3.A00;
        if (softReference == null) {
            obj = null;
        } else {
            obj = softReference.get();
        }
        if (softReference != null) {
            softReference.clear();
            r3.A00 = null;
        }
        SoftReference softReference2 = r3.A01;
        if (softReference2 != null) {
            softReference2.clear();
            r3.A01 = null;
        }
        SoftReference softReference3 = r3.A02;
        if (softReference3 != null) {
            softReference3.clear();
            r3.A02 = null;
        }
        r4.A00.add(r3);
        return obj;
    }
}
