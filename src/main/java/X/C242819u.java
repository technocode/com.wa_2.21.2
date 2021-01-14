package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.19u  reason: invalid class name and case insensitive filesystem */
public class C242819u {
    public static volatile C242819u A0A;
    public final Context A00;
    public final Context A01;
    public final AnonymousClass16M A02;
    public final AbstractC240018k A03 = C35431kL.A00;
    public final AnonymousClass26L A04;
    public final AnonymousClass1A1 A05 = new AnonymousClass1A1(this);
    public final AnonymousClass26S A06;
    public final AnonymousClass26U A07;
    public final AnonymousClass26W A08;
    public final AnonymousClass26X A09;

    public C242819u(AnonymousClass19w r15) {
        Context context = r15.A00;
        C001801b.A1R(context, "Application context can't be null");
        Context context2 = r15.A01;
        C001801b.A1Q(context2);
        this.A00 = context;
        this.A01 = context2;
        AnonymousClass26U r8 = new AnonymousClass26U(this);
        r8.A0B();
        this.A07 = r8;
        A01(r8);
        String str = C242719t.A00;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        r8.A02(4, sb.toString(), null, null, null);
        AnonymousClass26W r0 = new AnonymousClass26W(this);
        r0.A0B();
        this.A08 = r0;
        AnonymousClass26X r02 = new AnonymousClass26X(this);
        r02.A0B();
        this.A09 = r02;
        AnonymousClass26L r3 = new AnonymousClass26L(this, r15);
        AnonymousClass26Q r6 = new AnonymousClass26Q(this);
        AnonymousClass26K r5 = new AnonymousClass26K(this);
        AnonymousClass26O r4 = new AnonymousClass26O(this);
        AnonymousClass26R r2 = new AnonymousClass26R(this);
        C001801b.A1Q(context);
        if (AnonymousClass16M.A04 == null) {
            synchronized (AnonymousClass16M.class) {
                if (AnonymousClass16M.A04 == null) {
                    AnonymousClass16M.A04 = new AnonymousClass16M(context);
                }
            }
        }
        AnonymousClass16M r1 = AnonymousClass16M.A04;
        r1.A00 = new C242919v(this);
        this.A02 = r1;
        C34521ie r12 = new C34521ie(this);
        r6.A0B();
        r5.A0B();
        r4.A0B();
        r2.A0B();
        AnonymousClass26S r03 = new AnonymousClass26S(this);
        r03.A0B();
        this.A06 = r03;
        r3.A0B();
        this.A04 = r3;
        C242819u r13 = r12.A00;
        A01(r13.A09);
        AnonymousClass26X r14 = r13.A09;
        r14.A0C();
        r14.A0C();
        if (r14.A04) {
            r14.A0C();
        }
        r14.A0C();
        AnonymousClass26P r32 = r3.A00;
        r32.A0C();
        C001801b.A1b(!r32.A02, "Analytics backend already started");
        r32.A02 = true;
        AnonymousClass16M r22 = ((C242619s) r32).A00.A02;
        C001801b.A1Q(r22);
        RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0 = new RunnableEBaseShape5S0100000_I1_0(r32, 48);
        C001801b.A1Q(runnableEBaseShape5S0100000_I1_0);
        r22.A02.submit(runnableEBaseShape5S0100000_I1_0);
    }

    public static C242819u A00(Context context) {
        C001801b.A1Q(context);
        if (A0A == null) {
            synchronized (C242819u.class) {
                if (A0A == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C242819u r3 = new C242819u(new AnonymousClass19w(context));
                    A0A = r3;
                    synchronized (C34521ie.class) {
                        List<Runnable> list = C34521ie.A01;
                        if (list != null) {
                            for (Runnable runnable : list) {
                                runnable.run();
                            }
                            C34521ie.A01 = null;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    long longValue = ((Long) AnonymousClass1A5.A09.A00).longValue();
                    if (elapsedRealtime2 > longValue) {
                        AnonymousClass26U r32 = r3.A07;
                        A01(r32);
                        r32.A0A("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return A0A;
    }

    public static void A01(AbstractC35671kk r1) {
        C001801b.A1R(r1, "Analytics service not created/initialized");
        boolean z = r1.A00;
        boolean z2 = false;
        if (z) {
            z2 = true;
        }
        C001801b.A1a(z2, "Analytics service not initialized");
    }
}
