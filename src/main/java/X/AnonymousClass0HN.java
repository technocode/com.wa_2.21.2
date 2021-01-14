package X;

import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0HN  reason: invalid class name */
public class AnonymousClass0HN {
    public static volatile AnonymousClass0HN A0F;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass0Fk A02;
    public final AnonymousClass0I4 A03;
    public final AnonymousClass01J A04;
    public final AnonymousClass01A A05;
    public final AnonymousClass0I7 A06;
    public final AnonymousClass0IB A07;
    public final AnonymousClass04j A08;
    public final AnonymousClass03P A09;
    public final AnonymousClass0I6 A0A;
    public final AnonymousClass09E A0B;
    public final AnonymousClass0AR A0C;
    public final AnonymousClass321 A0D;
    public final AnonymousClass00T A0E;

    public AnonymousClass0HN(AnonymousClass009 r1, AnonymousClass01I r2, AnonymousClass00T r3, AnonymousClass0AR r4, AnonymousClass09E r5, AnonymousClass01J r6, AnonymousClass01A r7, AnonymousClass03P r8, AnonymousClass0Fk r9, AnonymousClass04j r10, AnonymousClass0I4 r11, AnonymousClass321 r12, AnonymousClass0I6 r13, AnonymousClass0I7 r14, AnonymousClass0IB r15) {
        this.A00 = r1;
        this.A01 = r2;
        this.A0E = r3;
        this.A0C = r4;
        this.A0B = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A09 = r8;
        this.A02 = r9;
        this.A08 = r10;
        this.A03 = r11;
        this.A0D = r12;
        this.A0A = r13;
        this.A06 = r14;
        this.A07 = r15;
    }

    public static AnonymousClass0HN A00() {
        if (A0F == null) {
            synchronized (AnonymousClass0HN.class) {
                if (A0F == null) {
                    A0F = new AnonymousClass0HN(AnonymousClass009.A00(), AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass0AR.A00(), AnonymousClass09E.A00(), AnonymousClass01J.A00(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), AnonymousClass0Fk.A01, AnonymousClass04j.A00(), AnonymousClass0I4.A00(), AnonymousClass321.A00(), AnonymousClass0I6.A00(), AnonymousClass0I7.A00(), AnonymousClass0IB.A00());
                }
            }
        }
        return A0F;
    }

    public AnonymousClass0QK A01(AnonymousClass0I0 r3) {
        if (!this.A08.A05()) {
            Log.i("contactsyncmethods/network_unavailable");
            return AnonymousClass0QK.NETWORK_UNAVAILABLE;
        }
        try {
            return (AnonymousClass0QK) A02(r3, false).get();
        } catch (InterruptedException | ExecutionException unused) {
            return AnonymousClass0QK.FAILED;
        }
    }

    public final AnonymousClass0I1 A02(AnonymousClass0I0 r6, boolean z) {
        AnonymousClass0RC r4 = new AnonymousClass0RC(z);
        r6.A03.add(r4);
        AnonymousClass0I7 r3 = this.A06;
        r3.A0Q.execute(new RunnableEBaseShape2S0200000_I0_1(r3, r6, 8));
        return r4;
    }

    public AnonymousClass0I1 A03(Collection collection, EnumC03840Hy r13) {
        StringBuilder A0S = AnonymousClass008.A0S("contactsyncmethods/requestSyncDevicesWithRetry/start sync user device size=");
        A0S.append(collection.size());
        Log.d(A0S.toString());
        AnonymousClass0Hz r3 = new AnonymousClass0Hz(r13);
        r3.A04 = true;
        r3.A00 = new AnonymousClass0RB(false, false, false, false, true, false);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass02N r1 = (AnonymousClass02N) it.next();
            this.A05.A0A(r1);
            if (r1 != null) {
                r3.A02.add(r1);
            }
        }
        return A02(r3.A01(), true);
    }

    public void A04() {
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        if (r0.A00 != null) {
            this.A0E.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 27));
        }
    }

    public void A05() {
        EnumC03840Hy r0;
        boolean z = false;
        if (this.A02.A00 == 3) {
            z = true;
        }
        if (!z) {
            r0 = EnumC03840Hy.INTERACTIVE_DELTA;
        } else {
            r0 = EnumC03840Hy.BACKGROUND_DELTA;
        }
        AnonymousClass0Hz r1 = new AnonymousClass0Hz(r0);
        r1.A05 = true;
        r1.A06 = true;
        r1.A02();
        A02(r1.A01(), true);
    }

    public void A06() {
        EnumC03840Hy r0;
        boolean z = false;
        if (this.A02.A00 == 3) {
            z = true;
        }
        if (!z) {
            r0 = EnumC03840Hy.INTERACTIVE_DELTA;
        } else {
            r0 = EnumC03840Hy.BACKGROUND_DELTA;
        }
        AnonymousClass0Hz r1 = new AnonymousClass0Hz(r0);
        r1.A05 = true;
        r1.A06 = true;
        r1.A02();
        r1.A04 = true;
        A02(r1.A01(), true);
    }

    public final void A07(EnumC03840Hy r13, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        PowerManager.WakeLock A0f;
        PowerManager A0C2 = this.A09.A0C();
        if (A0C2 == null) {
            Log.w("contactsyncmethods/forceFullSync pm=null");
            A0f = null;
        } else {
            A0f = C002001d.A0f(A0C2, 1, "fullsync");
        }
        if (A0f != null) {
            try {
                A0f.acquire();
                Log.i("contactsyncmethods/forceFullSync/wl/acquire");
            } catch (RuntimeException e) {
                this.A00.A05(e, 3);
                if (A0f == null || !A0f.isHeld()) {
                    return;
                }
            } catch (Throwable th) {
                if (A0f != null && A0f.isHeld()) {
                    A0f.release();
                    Log.i("contactsyncmethods/forceFullSync/wl/release");
                }
                throw th;
            }
        }
        AnonymousClass0Hz r0 = new AnonymousClass0Hz(r13);
        r0.A04 = true;
        r0.A03 = z;
        r0.A00 = new AnonymousClass0RB(z2, z3, z4, z5, z6, z7);
        A01(r0.A01());
        if (A0f == null || !A0f.isHeld()) {
            return;
        }
        A0f.release();
        Log.i("contactsyncmethods/forceFullSync/wl/release");
    }
}
