package X;

import android.os.PowerManager;
import com.whatsapp.util.Log;

/* renamed from: X.0JR  reason: invalid class name */
public class AnonymousClass0JR {
    public static volatile AnonymousClass0JR A07;
    public boolean A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass0I5 A02;
    public final AnonymousClass09K A03;
    public final AnonymousClass03P A04;
    public final C03160Fa A05;
    public final AnonymousClass0C4 A06;

    public AnonymousClass0JR(AnonymousClass02M r1, AnonymousClass0C4 r2, C03160Fa r3, AnonymousClass03P r4, AnonymousClass0I5 r5, AnonymousClass09K r6) {
        this.A01 = r1;
        this.A06 = r2;
        this.A05 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public static AnonymousClass0JR A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0JR.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0JR(AnonymousClass02M.A00(), AnonymousClass0C4.A00(), C03160Fa.A00(), AnonymousClass03P.A00(), AnonymousClass0I5.A00(), AnonymousClass09K.A07);
                }
            }
        }
        return A07;
    }

    public final void A01() {
        StringBuilder A0S = AnonymousClass008.A0S("app/send/active device: ");
        A0S.append(this.A00);
        A0S.append(" web: ");
        AnonymousClass0C4 r1 = this.A06;
        A0S.append(r1.A0I());
        Log.d(A0S.toString());
        if ((this.A03.A06 && this.A00 && !r1.A0I()) || (r1.A0I() && !this.A00)) {
            C03160Fa r2 = this.A05;
            if (r2.A0P != null) {
                r2.A0A.ANl();
                r2.A02();
                r2.A1P.A02();
                r2.A0D(true, false, false);
                r2.A0t.A01();
                return;
            }
            throw null;
        }
    }

    public final void A02() {
        StringBuilder A0S = AnonymousClass008.A0S("app/send/inactive device: ");
        A0S.append(this.A00);
        A0S.append(" web: ");
        AnonymousClass0C4 r1 = this.A06;
        A0S.append(r1.A0I());
        Log.d(A0S.toString());
        if (this.A03.A06 && !this.A00 && !r1.A0I()) {
            PowerManager A0C = this.A04.A0C();
            if (A0C == null) {
                Log.w("app/send/inactive pm=null");
            } else {
                PowerManager.WakeLock A0f = C002001d.A0f(A0C, 1, "sendinactive");
                if (A0f != null) {
                    A0f.acquire(3000);
                    Log.i("app/sendinactive/wl");
                }
            }
            C03160Fa r12 = this.A05;
            if (r12.A0P != null) {
                r12.A0A.ANm();
            } else {
                throw null;
            }
        }
        if (!this.A00) {
            AnonymousClass02M r3 = this.A01;
            r3.A02.post(new RunnableEBaseShape1S0100000_I0_1(this.A02, 48));
        }
    }
}
