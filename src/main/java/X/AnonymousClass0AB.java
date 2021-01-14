package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0AB  reason: invalid class name */
public class AnonymousClass0AB {
    public static volatile AnonymousClass0AB A06;
    public final Handler A00;
    public final Handler A01;
    public final Handler A02;
    public final AnonymousClass09F A03;
    public final AnonymousClass0AC A04;
    public final AnonymousClass0AD A05;

    public AnonymousClass0AB(C006903j r7, AnonymousClass09E r8, AnonymousClass09F r9, AnonymousClass0AC r10, AnonymousClass0A8 r11, AnonymousClass0AD r12) {
        this.A03 = r9;
        this.A04 = r10;
        this.A05 = r12;
        this.A00 = new AnonymousClass0AE(this, Looper.getMainLooper(), r10, r9);
        this.A02 = new AnonymousClass0AF(this, Looper.getMainLooper(), r10, r11);
        this.A01 = new AnonymousClass0AG(Looper.getMainLooper(), r9, r10, r8, r7);
    }

    public static AnonymousClass0AB A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0AB.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0AB(C006903j.A00(), AnonymousClass09E.A00(), AnonymousClass09F.A00(), AnonymousClass0AC.A00, AnonymousClass0A8.A00, AnonymousClass0AD.A00);
                }
            }
        }
        return A06;
    }

    public void A01(AbstractC007503q r4, int i) {
        this.A02.post(new RunnableEBaseShape0S0201000_I0(this, i, r4, 13));
    }

    public void A02(AbstractC007503q r4, int i) {
        this.A04.A06(r4, i);
        AnonymousClass09F r2 = this.A03;
        AnonymousClass02N r1 = r4.A0n.A00;
        if (r1 != null) {
            r2.A03(r1, false);
            AnonymousClass0MH r12 = r4.A0F;
            if (r12 != null) {
                this.A05.A02(r12);
                return;
            }
            return;
        }
        throw null;
    }
}
