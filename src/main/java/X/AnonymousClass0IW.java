package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0IW  reason: invalid class name */
public class AnonymousClass0IW {
    public static volatile AnonymousClass0IW A0A;
    public C06120Rv A00;
    public AnonymousClass0Rw A01;
    public AtomicInteger A02 = new AtomicInteger();
    public boolean A03 = false;
    public boolean[] A04;
    public boolean[] A05;
    public final AnonymousClass009 A06;
    public final C000300f A07;
    public final AnonymousClass00Y A08;
    public final AnonymousClass02H A09;

    public AnonymousClass0IW(AnonymousClass009 r3, AnonymousClass00Y r4, C000300f r5, AnonymousClass02H r6) {
        this.A06 = r3;
        this.A08 = r4;
        this.A07 = r5;
        this.A09 = r6;
        this.A05 = new boolean[6];
        this.A04 = new boolean[6];
    }

    public static AnonymousClass0IW A00() {
        if (A0A == null) {
            synchronized (AnonymousClass0IW.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass0IW(AnonymousClass009.A00(), AnonymousClass00Y.A00(), C000300f.A00(), new AnonymousClass02H(C002101e.A00(), false));
                }
            }
        }
        return A0A;
    }

    public void A01(int i, boolean z) {
        this.A09.execute(new RunnableEBaseShape0S0111000_I0(this, i, z, 0));
    }

    public final void A02(String str) {
        float f;
        AnonymousClass0Rw r3 = this.A01;
        if (r3 != null) {
            boolean A002 = r3.A02 & r3.A04.A00(r3.A00);
            r3.A02 = A002;
            AnonymousClass0RZ r5 = null;
            if (A002) {
                AnonymousClass0RZ r1 = r3.A00;
                AnonymousClass0RZ r0 = r3.A01;
                AnonymousClass0RZ r2 = r3.A03;
                r1.A00(r0, r2);
                if (r2 != null) {
                    AnonymousClass0RZ r12 = r3.A01;
                    r3.A01 = r3.A00;
                    r3.A00 = r12;
                    r5 = r2;
                }
            }
            C06130Rx r52 = (C06130Rx) r5;
            if (r52 == null) {
                Log.d("BatteryMetrics: CompositeMetrics are null");
                return;
            }
            C08860br r4 = new C08860br();
            r4.A09 = str;
            AnonymousClass0RY r32 = (AnonymousClass0RY) r52.A01(AnonymousClass0RY.class);
            r4.A08 = Long.valueOf(r32.realtimeMs);
            r4.A07 = Long.valueOf(r32.uptimeMs);
            C05940Rc r22 = (C05940Rc) r52.A01(C05940Rc.class);
            r4.A00 = Double.valueOf(r22.systemTimeS);
            r4.A01 = Double.valueOf(r22.userTimeS);
            C05960Re r6 = (C05960Re) r52.A01(C05960Re.class);
            r4.A02 = Long.valueOf(r6.mobileBytesRx);
            r4.A03 = Long.valueOf(r6.mobileBytesTx);
            r4.A04 = Long.valueOf(r6.wifiBytesRx);
            r4.A05 = Long.valueOf(r6.wifiBytesTx);
            StringBuilder sb = new StringBuilder();
            boolean[] zArr = this.A04;
            if (zArr[0]) {
                sb.append("daily_cron ");
            }
            if (zArr[1]) {
                sb.append("db_backup ");
            }
            if (zArr[2]) {
                sb.append("gdrive_backup ");
            }
            if (zArr[3]) {
                sb.append("voice_call ");
            }
            if (zArr[4]) {
                sb.append("video_call ");
            }
            if (zArr[5]) {
                sb.append("db_migration");
            }
            r4.A0A = sb.toString();
            r4.A06 = Long.valueOf(this.A02.longValue());
            this.A08.A0B(r4, null, false);
            StringBuilder sb2 = new StringBuilder("BatteryMetrics: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(r52.toString());
            Log.d(sb2.toString());
            double d = (((r22.systemTimeS + r22.userTimeS) * 1000.0d) / ((double) r32.realtimeMs)) * 3600.0d;
            C000300f r13 = this.A07;
            C006203c r02 = AbstractC000400g.A2m;
            if (r13 != null) {
                synchronized (AbstractC000400g.class) {
                    f = r13.A00.getFloat(r13.A08(r02), r02.A00);
                }
                if (d >= ((double) f)) {
                    this.A06.A04("CriticalBatteryUsageEvent", Double.toString(d), false);
                }
                int i = 0;
                do {
                    this.A04[i] = this.A05[i];
                    i++;
                } while (i < 6);
                this.A02.set(0);
                return;
            }
            throw null;
        }
        throw null;
    }
}
