package X;

import java.util.Map;

/* renamed from: X.1p1  reason: invalid class name and case insensitive filesystem */
public class C37931p1 implements AbstractC25321Gj {
    public final /* synthetic */ C222910v A00;

    public C37931p1(C222910v r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC25321Gj
    public boolean AR3(AnonymousClass05l r7) {
        AbstractC008905s r72 = (AbstractC008905s) r7;
        C222910v r5 = this.A00;
        Map map = r5.A00;
        Object obj = map.get(r72);
        long j = (long) r72.A07;
        if (obj != null) {
            r5.A01.put(r72, obj);
        }
        Long valueOf = Long.valueOf(j);
        Object obj2 = map.get(valueOf);
        if (obj2 == null) {
            return false;
        }
        r5.A01.put(valueOf, obj2);
        return false;
    }
}
