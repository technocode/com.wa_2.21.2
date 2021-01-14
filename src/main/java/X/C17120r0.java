package X;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: X.0r0  reason: invalid class name and case insensitive filesystem */
public final class C17120r0 extends Property {
    public C17120r0() {
        super(PointF.class, "bottomRight");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        C17170r5 r6 = (C17170r5) obj;
        PointF pointF = (PointF) obj2;
        if (r6 != null) {
            int round = Math.round(pointF.x);
            r6.A03 = round;
            int round2 = Math.round(pointF.y);
            r6.A00 = round2;
            int i = r6.A01 + 1;
            r6.A01 = i;
            if (r6.A05 == i) {
                C17340rN.A02(r6.A06, r6.A02, r6.A04, round, round2);
                r6.A05 = 0;
                r6.A01 = 0;
                return;
            }
            return;
        }
        throw null;
    }
}
