package X;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2cS  reason: invalid class name */
public class AnonymousClass2cS implements AbstractC662633n {
    public final C53022cH A00;
    public final WeakReference A01;

    public AnonymousClass2cS(C53022cH r2, C48522Mp r3) {
        this.A00 = r2;
        this.A01 = new WeakReference(r3);
    }

    @Override // X.AbstractC662633n
    public void AIA(AnonymousClass33N r6) {
        C48522Mp r3 = (C48522Mp) this.A01.get();
        if (r3 != null) {
            List A002 = C48522Mp.A00(r3, r6);
            C48522Mp.A01(r3, A002);
            Map map = r3.A0g;
            String str = r6.A0D;
            map.put(str, r6);
            r3.A0h.put(str, A002);
            AnonymousClass2cQ r4 = r3.A0X;
            r4.A04.put(str, r4.A09(r6));
            r4.A0B();
            ((AbstractC16300pa) r4).A01.A04(r4.A05.size(), r4.A05() - r4.A05.size(), null);
            r4.A0C();
        }
    }

    @Override // X.AbstractC662633n
    public void AIB(List list) {
        C48522Mp r5 = (C48522Mp) this.A01.get();
        if (r5 != null) {
            for (int i = 0; i < list.size(); i++) {
                AnonymousClass33N r3 = (AnonymousClass33N) list.get(i);
                List A002 = C48522Mp.A00(r5, r3);
                C48522Mp.A01(r5, A002);
                Map map = r5.A0g;
                String str = r3.A0D;
                map.put(str, r3);
                r5.A0h.put(str, A002);
            }
            AnonymousClass2cQ r4 = r5.A0X;
            AnonymousClass00E.A07(r4.A06);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass33N r0 = (AnonymousClass33N) it.next();
                r4.A04.put(r0.A0D, r4.A09(r0));
            }
            r4.A0B();
            ((AbstractC16300pa) r4).A01.A02(r4.A05.size(), r4.A05() - r4.A05.size());
        }
    }

    @Override // X.AbstractC662633n
    public void AIC() {
        C48522Mp r3 = (C48522Mp) this.A01.get();
        if (r3 != null) {
            C53022cH r2 = this.A00;
            synchronized (r2) {
                r2.A05.clear();
            }
            for (Collection collection : r3.A0h.values()) {
                r2.A02(collection);
            }
            AnonymousClass2cQ r32 = r3.A0X;
            AnonymousClass00E.A07(r32.A06);
            r32.A06 = false;
            ((AbstractC16300pa) r32).A01.A03(r32.A05(), 1);
            r32.A0C();
        }
    }

    @Override // X.AbstractC662633n
    public void AID(String str) {
        C48522Mp r1 = (C48522Mp) this.A01.get();
        if (r1 != null) {
            r1.A0g.remove(str);
            r1.A0h.remove(str);
            r1.A0X.A0D(str);
        }
    }
}
