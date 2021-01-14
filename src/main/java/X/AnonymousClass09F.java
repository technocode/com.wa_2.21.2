package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.09F  reason: invalid class name */
public class AnonymousClass09F {
    public static volatile AnonymousClass09F A09;
    public final AnonymousClass02M A00;
    public final AnonymousClass09T A01;
    public final AnonymousClass09G A02;
    public final C27331Pi A03;
    public final AnonymousClass01A A04;
    public final C43401yJ A05;
    public final C006903j A06;
    public final AnonymousClass0A8 A07;
    public final AnonymousClass01Q A08;

    public AnonymousClass09F(AnonymousClass02M r1, C006903j r2, AnonymousClass09G r3, C27331Pi r4, AnonymousClass01A r5, AnonymousClass09T r6, C43401yJ r7, AnonymousClass01Q r8, AnonymousClass0A8 r9) {
        this.A00 = r1;
        this.A06 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r6;
        this.A05 = r7;
        this.A08 = r8;
        this.A07 = r9;
    }

    public static AnonymousClass09F A00() {
        if (A09 == null) {
            synchronized (AnonymousClass09F.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass09F(AnonymousClass02M.A00(), C006903j.A00(), AnonymousClass09G.A00(), C27331Pi.A00(), AnonymousClass01A.A00(), AnonymousClass09T.A00(), C43401yJ.A00(), AnonymousClass01Q.A00(), AnonymousClass0A8.A00);
                }
            }
        }
        return A09;
    }

    public void A01() {
        this.A07.A02();
        this.A03.A02();
    }

    public void A02(AnonymousClass02N r8) {
        C006903j r1 = this.A06;
        if (r1.A0C(r8)) {
            AnonymousClass01Q r3 = this.A08;
            long A042 = r1.A04(r8);
            r3.A00.A0A();
            r3.A0F(r8, A042, r8);
            this.A07.A02();
            UserJid of = UserJid.of(r8);
            if (of != null) {
                C43401yJ r12 = this.A05;
                C007003k A0A = this.A04.A0A(of);
                AnonymousClass00E.A01();
                Iterator it = r12.A00.iterator();
                while (true) {
                    AnonymousClass0AY r13 = (AnonymousClass0AY) it;
                    if (r13.hasNext()) {
                        AnonymousClass0HN r4 = ((AnonymousClass0RT) ((AbstractC28291Tt) r13.next())).A00;
                        if (r4 != null) {
                            Jid A022 = A0A.A02(UserJid.class);
                            if (A022 != null) {
                                AnonymousClass01I r0 = r4.A01;
                                r0.A04();
                                if (!A022.equals(r0.A03) && (!AnonymousClass1VY.A0a(A022)) && !A0A.A0W && A0A.A08 == null) {
                                    AnonymousClass0Hz r14 = new AnonymousClass0Hz(EnumC03840Hy.INTERACTIVE_DELTA_SIDELIST);
                                    r14.A06 = true;
                                    r14.A02();
                                    if (A022 != null) {
                                        r14.A02.add(A022);
                                    }
                                    r4.A02(r14.A01(), true);
                                }
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void A03(AnonymousClass02N r5, boolean z) {
        AnonymousClass0A8 r0;
        C006903j r1 = this.A06;
        if (r1.A0C(r5)) {
            AnonymousClass01Q r3 = this.A08;
            long A042 = r1.A04(r5);
            r3.A00.A0A();
            if (!r3.A0F(r5, A042, r5)) {
                r0 = this.A07;
                r0.A05(r5);
            }
            r0 = this.A07;
            r0.A02();
        } else {
            this.A08.A0D(r5);
            this.A03.A02();
            r0 = this.A07;
            r0.A02();
        }
        if (z) {
            r0.A06(r5);
        }
    }
}
