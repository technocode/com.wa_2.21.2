package X;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: X.0qz  reason: invalid class name and case insensitive filesystem */
public final class C17110qz extends Property {
    public C17110qz() {
        super(PointF.class, "topLeft");
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
            r6.A02 = round;
            int round2 = Math.round(pointF.y);
            r6.A04 = round2;
            int i = r6.A05 + 1;
            r6.A05 = i;
            if (i == r6.A01) {
                C17340rN.A02(r6.A06, round, round2, r6.A03, r6.A00);
                r6.A05 = 0;
                r6.A01 = 0;
                return;
            }
            return;
        }
        throw null;
    }
}
