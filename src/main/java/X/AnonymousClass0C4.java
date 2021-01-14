package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.TriggerEventListener;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.WebSessionVerificationReceiver;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0C4  reason: invalid class name */
public class AnonymousClass0C4 {
    public static volatile AnonymousClass0C4 A0W;
    public Sensor A00;
    public SensorManager A01;
    public TriggerEventListener A02;
    public C67833Ar A03;
    public Map A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass0C2 A08;
    public final AnonymousClass0C1 A09;
    public final AnonymousClass02M A0A;
    public final C000300f A0B;
    public final C02420Bx A0C;
    public final C02410Bw A0D;
    public final AnonymousClass03P A0E;
    public final AnonymousClass00S A0F;
    public final AnonymousClass00G A0G;
    public final AnonymousClass00D A0H;
    public final AnonymousClass01X A0I;
    public final AnonymousClass0C5 A0J;
    public final AnonymousClass00T A0K;
    public final C02400Bv A0L;
    public final AnonymousClass0C8 A0M;
    public final AnonymousClass0C9 A0N;
    public final AnonymousClass0C6 A0O;
    public final String A0P;
    public final SecureRandom A0Q = new SecureRandom();
    public final List A0R;
    public final List A0S;
    public final AtomicInteger A0T;
    public final AtomicReference A0U = new AtomicReference();
    public volatile Map A0V;

    public AnonymousClass0C4(AnonymousClass00G r6, AnonymousClass00S r7, AnonymousClass02M r8, AnonymousClass00T r9, C02400Bv r10, C000300f r11, AnonymousClass03P r12, AnonymousClass01X r13, AnonymousClass0C5 r14, AnonymousClass0C6 r15, AnonymousClass00D r16, AnonymousClass0C1 r17, C02410Bw r18, AnonymousClass0C2 r19, C02420Bx r20) {
        boolean z;
        Sensor sensor;
        this.A0G = r6;
        this.A0F = r7;
        this.A0A = r8;
        this.A0K = r9;
        this.A0L = r10;
        this.A0B = r11;
        this.A0E = r12;
        this.A0I = r13;
        this.A0J = r14;
        this.A0O = r15;
        this.A0H = r16;
        this.A09 = r17;
        this.A0D = r18;
        this.A08 = r19;
        this.A0C = r20;
        HandlerThread handlerThread = new HandlerThread("web-session-disk-cache-handler", 10);
        handlerThread.start();
        this.A0M = new AnonymousClass0C8(this, handlerThread.getLooper());
        this.A0N = new AnonymousClass0C9(this);
        boolean z2 = false;
        try {
            Class.forName("android.hardware.TriggerEventListener");
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 18 && z) {
            SensorManager A072 = r12.A07();
            this.A01 = A072;
            if (A072 != null) {
                sensor = A072.getDefaultSensor(17);
            } else {
                sensor = null;
            }
            this.A00 = sensor;
            this.A02 = new AnonymousClass0CA(this);
        }
        if (!(this.A01 == null || this.A00 == null)) {
            z2 = true;
        }
        this.A06 = z2;
        this.A0S = new CopyOnWriteArrayList();
        this.A0R = Collections.synchronizedList(new ArrayList());
        byte[] bArr = new byte[8];
        this.A0Q.nextBytes(bArr);
        this.A0P = C003701u.A0A(bArr);
        this.A0T = new AtomicInteger(1);
    }

    public static AnonymousClass0C4 A00() {
        if (A0W == null) {
            synchronized (AnonymousClass0C4.class) {
                if (A0W == null) {
                    AnonymousClass00G r3 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass00T A004 = C002101e.A00();
                    C02400Bv A005 = C02400Bv.A00();
                    C000300f A006 = C000300f.A00();
                    AnonymousClass03P A007 = AnonymousClass03P.A00();
                    AnonymousClass01X A008 = AnonymousClass01X.A00();
                    AnonymousClass0C5 A009 = AnonymousClass0C5.A00();
                    AnonymousClass0C6 A0010 = AnonymousClass0C6.A00();
                    C001000o.A00();
                    A0W = new AnonymousClass0C4(r3, A002, A003, A004, A005, A006, A007, A008, A009, A0010, AnonymousClass00D.A00(), AnonymousClass0C1.A01(), C02410Bw.A00(), AnonymousClass0C2.A00(), C02420Bx.A00());
                }
            }
        }
        return A0W;
    }

    public final AnonymousClass0K4 A01(AnonymousClass0K4 r7) {
        if (r7 == null) {
            return null;
        }
        if (r7.A0E) {
            long j = r7.A04;
            if (j != 0 && j < System.currentTimeMillis()) {
                StringBuilder A0S2 = AnonymousClass008.A0S("webSession/getUnexpiredSession browser timed out ");
                String str = r7.A0I;
                AnonymousClass008.A1U(A0S2, str);
                A0H(false, str);
                return null;
            }
        }
        return r7;
    }

    public AnonymousClass0K4 A02(String str) {
        if (str == null) {
            return null;
        }
        return (AnonymousClass0K4) A05().get(str);
    }

    public String A03() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0P);
        sb.append(".--");
        sb.append(Integer.toHexString(this.A0T.getAndIncrement()));
        return sb.toString();
    }

    public List A04() {
        Iterator it = new ArrayList(A05().values()).iterator();
        while (it.hasNext()) {
            A01((AnonymousClass0K4) it.next());
        }
        return new ArrayList(A05().values());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0104, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A05() {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C4.A05():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A06(boolean r9) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C4.A06(boolean):java.util.Map");
    }

    public void A07() {
        Log.i("qrsession/deleteAllSessions");
        AnonymousClass0JK A012 = this.A0L.A01();
        A012.A08.edit().clear().apply();
        A012.A07 = null;
        A012.A05 = null;
        A012.A06 = null;
        A012.A02 = null;
        A012.A00 = null;
        A05().clear();
        this.A0O.A03.A02().A01("sessions", null, null, "deleteAllSessions/DELETE_SESSIONS");
        A06(false).clear();
        this.A0M.sendEmptyMessage(2);
        A0A();
    }

    public void A08() {
        if (this.A0R.size() > 0) {
            this.A0K.ANF(new RunnableEBaseShape4S0100000_I0_4(this, 48));
        }
    }

    public void A09() {
        if (this.A0L.A03()) {
            this.A07 = true;
            if (this.A06) {
                this.A01.requestTriggerSensor(this.A02, this.A00);
            }
        }
    }

    public final void A0A() {
        for (AnonymousClass0KL r0 : this.A0S) {
            r0.ALq();
        }
    }

    public final void A0B() {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass0C9 r6 = this.A0N;
            if (!r6.hasMessages(2) && !r6.hasMessages(3)) {
                long min = Math.min(r6.A00 + 30000, ((long) r6.A01.A0B.A06(AbstractC000400g.A4D)) * 1000);
                r6.A00 = min;
                boolean sendEmptyMessageDelayed = r6.sendEmptyMessageDelayed(3, min);
                StringBuilder A0S2 = AnonymousClass008.A0S("qrsession/fservice/delayed timeout=");
                A0S2.append(r6.A00);
                A0S2.append(" success:");
                A0S2.append(sendEmptyMessageDelayed);
                A0S2.append(" uptime:");
                A0S2.append(SystemClock.uptimeMillis());
                Log.i(A0S2.toString());
            }
        }
    }

    public void A0C(long j, String str) {
        AnonymousClass0K4 r1;
        if (str != null && j > 0 && (r1 = (AnonymousClass0K4) A05().get(str)) != null) {
            r1.A05 = j;
            r1.A06 = j;
            AnonymousClass0C6 r6 = this.A0O;
            if (r6 != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_active", Long.valueOf(j));
                AnonymousClass0C7 r5 = r6.A03;
                r5.A02().A00("sessions", contentValues, "browser_id = ?", new String[]{str}, "setLastActive/UPDATE_SESSIONS");
                long j2 = r1.A06;
                if (r6 != null) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("last_push_sent", Long.valueOf(j2));
                    r5.A02().A00("sessions", contentValues2, "browser_id = ?", new String[]{str}, "setLastPushSent/UPDATE_SESSIONS");
                    A0A();
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    public void A0D(Context context, long j) {
        AnonymousClass008.A0z("WebSession/scheduleWebSessionVerificationAlarm/ whenMillis ", j);
        AlarmManager A022 = this.A0E.A02();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, WebSessionVerificationReceiver.class), 134217728);
        if (A022 == null) {
            Log.w("WebSession/scheduleWebSessionVerificationAlarm AlarmManager is null");
        } else if (Build.VERSION.SDK_INT >= 19) {
            A022.setExact(0, j, broadcast);
        } else {
            A022.set(0, j, broadcast);
        }
    }

    public void A0E(String str, int i) {
        A06(true).put(str, Integer.valueOf(i));
        this.A0M.sendEmptyMessageDelayed(1, 2000);
        AnonymousClass008.A1S(new StringBuilder("caching epoch="), this.A0L.A01().A01);
    }

    public final void A0F(boolean z) {
        C02400Bv r2 = this.A0L;
        r2.A01().A03 = null;
        r2.A01().A00("ref");
        if (z) {
            A0H(false, r2.A01().A00);
            AnonymousClass0JK A012 = r2.A01();
            A012.A07 = null;
            A012.A05 = null;
            A012.A06 = null;
            A012.A02 = null;
            A012.A00 = null;
            AnonymousClass0JK A013 = r2.A01();
            A013.A00("key");
            A013.A00("token");
            A013.A00("browser");
            A0A();
            this.A0N.sendEmptyMessage(2);
        } else {
            AnonymousClass0K4 r6 = (AnonymousClass0K4) A05().get(r2.A01().A00);
            if (r6 != null && r6.A0E) {
                r6.A04 = System.currentTimeMillis() + 600000;
                AnonymousClass0C6 r4 = this.A0O;
                String str = r2.A01().A00;
                long j = r6.A04;
                if (r4 != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("expiration", Long.valueOf(j));
                    r4.A03.A02().A00("sessions", contentValues, "browser_id = ?", new String[]{str}, "setSessionExpiration/UPDATE_SESSIONS");
                } else {
                    throw null;
                }
            }
        }
        this.A0R.clear();
        this.A07 = false;
        if (this.A06) {
            this.A01.cancelTriggerSensor(this.A02, this.A00);
        }
    }

    public final void A0G(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass0C9 r2 = this.A0N;
            r2.removeMessages(2);
            r2.removeMessages(3);
            Message.obtain(r2, 1, z ? 1 : 0, 0).sendToTarget();
        }
    }

    public void A0H(boolean z, String str) {
        AnonymousClass008.A18("qrsession/deleteSession bid=", str);
        C02400Bv r2 = this.A0L;
        if (r2.A01().A01(str)) {
            A06(false).clear();
            this.A0M.sendEmptyMessage(2);
            AnonymousClass0JK A012 = r2.A01();
            A012.A07 = null;
            A012.A05 = null;
            A012.A06 = null;
            A012.A02 = null;
            A012.A00 = null;
        }
        A05().remove(str);
        this.A0O.A03.A02().A01("sessions", "browser_id = ?", new String[]{str}, "deleteSession/DELETE_SESSIONS");
        if (z) {
            A0A();
        }
    }

    public boolean A0I() {
        return this.A0L.A03() && this.A05;
    }

    public boolean A0J(String str) {
        return str != null && str.equals(this.A0L.A01().A00) && A0I();
    }
}
