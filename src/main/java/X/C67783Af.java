package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3Af  reason: invalid class name and case insensitive filesystem */
public class C67783Af {
    public static volatile C67783Af A02;
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public C67783Af() {
        A02(AnonymousClass3AW.class, AnonymousClass3AW.A00);
        A02(C67793Ag.class, C67793Ag.A03);
        A02(AnonymousClass3Ah.class, AnonymousClass3Ah.A01);
        A02(AnonymousClass3VU.class, AnonymousClass3VU.A00);
        A02(AnonymousClass3VJ.class, AnonymousClass3VJ.A02);
        A02(C73183Vu.class, C73183Vu.A02);
        A02(C73153Vr.class, C73153Vr.A04);
        A02(AnonymousClass3VK.class, AnonymousClass3VK.A00);
        A02(C67743Ab.class, C67743Ab.A04);
        this.A00.put(C67763Ad.class, C67763Ad.A03);
        this.A00.put(AnonymousClass3AZ.class, AnonymousClass3AZ.A01);
    }

    public static C67783Af A00() {
        if (A02 == null) {
            synchronized (C67783Af.class) {
                if (A02 == null) {
                    A02 = new C67783Af();
                }
            }
        }
        return A02;
    }

    public static AbstractC02170Ax A01(Class cls) {
        AbstractC02170Ax r1;
        AbstractC02170Ax r2 = (AbstractC02170Ax) A00().A01.get(cls);
        if (r2 == null && (r1 = (AbstractC02170Ax) A00().A00.get(cls)) != null) {
            r2 = new C02180Ay(r1, null);
        }
        StringBuilder sb = new StringBuilder("WaBloks Failed to Obtain ");
        sb.append(cls);
        AnonymousClass00E.A04(r2, sb.toString());
        return r2;
    }

    public final void A02(Class cls, AbstractC02170Ax r5) {
        if (r5 instanceof AbstractC02190Az) {
            this.A01.put(cls, r5);
        } else {
            this.A01.put(cls, new C02180Ay(r5, null));
        }
    }
}
