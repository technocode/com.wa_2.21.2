package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0PT  reason: invalid class name */
public class AnonymousClass0PT {
    public static volatile AnonymousClass0PT A05;
    public AnonymousClass0PU A00;
    public final AnonymousClass0PP A01;
    public final AnonymousClass0PO A02;
    public final AnonymousClass0PM A03;
    public final AbstractC02190Az A04;

    public AnonymousClass0PT(AnonymousClass0PM r1, AnonymousClass0PO r2, AbstractC02190Az r3, AnonymousClass0PP r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A01 = r4;
    }

    public static AnonymousClass0PT A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0PT.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0PT(AnonymousClass0PM.A00(), AnonymousClass0PO.A00(), new C02180Ay(C06300Sr.A00, null), AnonymousClass0PP.A00());
                }
            }
        }
        return A05;
    }

    public static void A01(Map map, AnonymousClass0PN r3) {
        if (r3 != null) {
            String str = r3.A0A;
            if (str != null) {
                if (map.containsKey(str)) {
                    AnonymousClass008.A19("MigrationRegistry/addMigration/duplicate; name=", str);
                }
                map.put(str, r3);
                return;
            }
            throw null;
        }
        throw null;
    }

    public AnonymousClass0PU A02() {
        synchronized (this) {
            if (this.A00 == null) {
                AnonymousClass0PQ r4 = (AnonymousClass0PQ) this.A04.get();
                HashMap hashMap = new HashMap();
                C015308l r7 = r4.A0I;
                AnonymousClass0AN r5 = r4.A0J;
                C015408m r12 = r4.A0Z;
                C015708p r1 = r4.A0h;
                A01(hashMap, new C43531yX(r7, r5, r12, r1, r4));
                AnonymousClass0AM r52 = r4.A0F;
                C43511yV r0 = r52.A00;
                if (r0 == null) {
                    r0 = new C43511yV(r12, r52, r4);
                    r52.A00 = r0;
                }
                A01(hashMap, r0);
                A01(hashMap, new C43541yY(r4.A0K, r12, r1, r4));
                AnonymousClass09W r53 = r4.A07;
                AnonymousClass09Q r10 = r4.A0M;
                A01(hashMap, new C43561ya(r53, r10, r12, r1, r4));
                A01(hashMap, C02340Bp.A01(r4));
                C014408c r8 = r4.A0A;
                AnonymousClass09X r02 = r4.A0j;
                AnonymousClass09Y r6 = r4.A0k;
                A01(hashMap, new C43701yo(r8, r02, r12, r1, r6, r4));
                A01(hashMap, new C43721yq(r12, r4.A0l, r4));
                A01(hashMap, new C43521yW(r12, r1, r4.A0G, r4));
                AnonymousClass09V r13 = r4.A06;
                A01(hashMap, new C43611yf(r10, r13, r4.A0T, r4));
                A01(hashMap, C017509h.A01(r4));
                AnonymousClass01I r11 = r4.A02;
                A01(hashMap, new C43661yk(r11, r12, r13, r4.A0b, r4.A0d, r4.A0V, r4));
                A01(hashMap, new C43691yn(r12, r4.A0i, r4.A0R, r4));
                A01(hashMap, new C43581yc(r12, r4.A0O, r7, r1, r4));
                A01(hashMap, new C43671yl(r12, r1, r4.A0e, r4));
                A01(hashMap, new C43501yU(r7, r12, r1, r4.A0E, r4));
                A01(hashMap, new C43551yZ(r8, r12, r1, r4.A0L, r4));
                A01(hashMap, C015208k.A01(r4));
                A01(hashMap, new C43621yg(r7, r11, r12, r4.A0W, r4));
                A01(hashMap, new AnonymousClass2A0(r1, r4));
                A01(hashMap, AnonymousClass09Z.A02(r4));
                A01(hashMap, new AnonymousClass27t(r8, r12, r1, r4.A0N, r4));
                A01(hashMap, new C43681ym(r12, r1, r4.A0g, r4));
                A01(hashMap, new C43711yp(r6, r12, r1, r4));
                A01(hashMap, new C43641yi(r7, r12, r1, r4.A0X, r4));
                A01(hashMap, this.A03);
                A01(hashMap, this.A02);
                A01(hashMap, this.A01);
                A01(hashMap, new C464129z(r1, r4));
                A01(hashMap, new C43491yS(r4.A08, r53, r4));
                A01(hashMap, new AnonymousClass27y(r11, r4.A0f, r13, r4.A0Q, r4.A0p, r4));
                this.A00 = AnonymousClass0PU.A00(hashMap);
            }
        }
        return this.A00;
    }
}
