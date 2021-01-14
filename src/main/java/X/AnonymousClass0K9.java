package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.0K9  reason: invalid class name */
public class AnonymousClass0K9 extends AnonymousClass019 {
    public static volatile AnonymousClass0K9 A05;
    public AnonymousClass0KA A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0KB A02;
    public final Map A03 = new LinkedHashMap();
    public final Executor A04;

    public AnonymousClass0K9(AnonymousClass00T r4, AnonymousClass0KA r5, AnonymousClass0KB r6) {
        AnonymousClass02H r2 = new AnonymousClass02H(r4, false);
        this.A00 = r5;
        this.A02 = r6;
        this.A04 = r2;
    }

    public static AnonymousClass0K9 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0K9.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0K9(C002101e.A00(), AnonymousClass0KA.A00, AnonymousClass0KB.A00());
                }
            }
        }
        return A05;
    }

    public final void A04() {
        AnonymousClass0KA r1 = this.A00;
        ArrayList arrayList = new ArrayList(this.A03.values());
        if (r1 != null) {
            AnonymousClass00E.A01();
            Iterator it = r1.A00.iterator();
            while (true) {
                AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                if (r12.hasNext()) {
                    C09510d4 r2 = ((AnonymousClass3PH) r12.next()).A00;
                    if (arrayList.isEmpty()) {
                        C09520d5 r13 = r2.A03;
                        r13.A00 = false;
                        r13.A01 = false;
                    } else {
                        C09520d5 r14 = r2.A03;
                        if (!r14.A00) {
                            r14.A00 = true;
                            r14.A01 = true;
                        }
                    }
                    r2.A00();
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public final void A05(AbstractC007503q r4, int i) {
        AnonymousClass0M4 r1;
        C007303n r12 = r4.A0n;
        if (AnonymousClass1VY.A0b(r12.A00) && r12.A02) {
            if ((r4 instanceof AnonymousClass0M3) && (i != 1 || (r1 = ((AnonymousClass0M3) r4).A02) == null || !r1.A0O || r1.A0a || !r1.A0P)) {
                return;
            }
            if ((r4 instanceof AnonymousClass0ZJ) && ((AnonymousClass0ZJ) r4).A00 == null) {
                return;
            }
            if (this.A02 != null) {
                this.A04.execute(new RunnableEBaseShape4S0200000_I0_3(this, r4, 3));
                return;
            }
            throw null;
        }
    }
}
