package X;

import android.os.Message;
import android.util.Pair;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.30E  reason: invalid class name */
public class AnonymousClass30E {
    public static volatile AnonymousClass30E A04;
    public final AnonymousClass01I A00;
    public final C04360Kb A01;
    public final AnonymousClass0DH A02;
    public final AnonymousClass0KJ A03;

    public AnonymousClass30E(AnonymousClass01I r1, AnonymousClass0DH r2, C04360Kb r3, AnonymousClass0KJ r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass30E A00() {
        if (A04 == null) {
            synchronized (AnonymousClass30E.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass30E(AnonymousClass01I.A00(), AnonymousClass0DH.A00(), C04360Kb.A00(), AnonymousClass0KJ.A00());
                }
            }
        }
        return A04;
    }

    public void A01(String str, AnonymousClass1Xa r12) {
        Set set;
        AnonymousClass0KJ r2 = this.A03;
        boolean z = false;
        if (r12 != null) {
            z = true;
        }
        if (z) {
            AnonymousClass0C4 r1 = r2.A05;
            AnonymousClass0K4 A022 = r1.A02(r1.A0L.A01().A00);
            if (!(A022 == null || A022.A03 == 0)) {
                AnonymousClass0DW r4 = r2.A02;
                String str2 = A022.A08;
                synchronized (r4) {
                    r4.A01();
                    r4.A04 = str;
                    r4.A00 = 2;
                    r4.A02 = str2;
                    r4.A01 = r4.A06.ANO(new RunnableEBaseShape2S0100000_I0_2(r4, 21), 10000);
                }
            }
            set = Collections.emptySet();
        } else {
            AnonymousClass0DM r8 = null;
            boolean A012 = r2.A01(null);
            if (A012) {
                r8 = AnonymousClass0DL.A0C;
            }
            AnonymousClass0DH r3 = r2.A01;
            AnonymousClass0DT r22 = r3.A0E;
            C02720De r13 = (C02720De) r22.A02("setting_pushName");
            if ((!A012 || !r3.A0O(r13)) && !r3.A0K()) {
                set = Collections.emptySet();
            } else {
                set = r22.A03(Collections.singletonList(new C52762bi(null, str, r13.A03.A05(), r8, r13.A01)));
            }
        }
        this.A00.A06(str);
        this.A02.A0J(set);
        C04360Kb r14 = this.A01;
        if (r14.A0B.A06) {
            r14.A0w.A09(Message.obtain(null, 0, 3, 0, Pair.create(str, r12)));
        }
    }
}
