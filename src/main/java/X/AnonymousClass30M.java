package X;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.30M  reason: invalid class name */
public class AnonymousClass30M extends RunnableEmptyBase implements Runnable {
    public int A00 = 0;
    public long A01 = 0;
    public Handler A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final AnonymousClass02M A05;
    public final AnonymousClass01I A06;
    public final AnonymousClass0I4 A07;
    public final AnonymousClass0ES A08;
    public final AnonymousClass01J A09;
    public final AnonymousClass01A A0A;
    public final AnonymousClass08B A0B;
    public final C014308b A0C;
    public final AnonymousClass0HN A0D;
    public final AnonymousClass0IB A0E;
    public final AnonymousClass0EQ A0F;
    public final AnonymousClass00D A0G;
    public final AnonymousClass01X A0H;
    public final AnonymousClass0AQ A0I;
    public final AnonymousClass0I6 A0J;
    public final AnonymousClass09E A0K;
    public final AnonymousClass00Y A0L;
    public final AnonymousClass0EO A0M;
    public final AnonymousClass0FZ A0N;
    public final AnonymousClass0AR A0O;
    public final AnonymousClass0GQ A0P;
    public final C70743Mf A0Q;
    public final AnonymousClass0HM A0R;
    public final AbstractC658231r A0S;
    public final AbstractC658731w A0T;
    public final AnonymousClass321 A0U;
    public final AnonymousClass323 A0V;
    public final AnonymousClass0AT A0W;

    public AnonymousClass30M(AbstractC658731w r3, AnonymousClass02M r4, AnonymousClass01I r5, AnonymousClass00Y r6, AnonymousClass0AR r7, AnonymousClass09E r8, AnonymousClass01J r9, AnonymousClass01A r10, C014308b r11, AnonymousClass01X r12, AnonymousClass323 r13, AnonymousClass08B r14, AnonymousClass0AT r15, AnonymousClass0EO r16, AnonymousClass0EQ r17, AnonymousClass0HN r18, AnonymousClass0FZ r19, AnonymousClass0ES r20, AnonymousClass0HM r21, AnonymousClass00D r22, AnonymousClass0I4 r23, AnonymousClass321 r24, AnonymousClass0GQ r25, AbstractC658231r r26, AnonymousClass0I6 r27, AnonymousClass0AQ r28, AnonymousClass0IB r29, C70743Mf r30, Handler handler) {
        this.A0T = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A0L = r6;
        this.A0O = r7;
        this.A0K = r8;
        this.A09 = r9;
        this.A0A = r10;
        this.A0C = r11;
        this.A0H = r12;
        this.A0V = r13;
        this.A0B = r14;
        this.A0W = r15;
        this.A0M = r16;
        this.A0F = r17;
        this.A0D = r18;
        this.A0N = r19;
        this.A08 = r20;
        this.A0R = r21;
        this.A0G = r22;
        this.A07 = r23;
        this.A0U = r24;
        this.A0P = r25;
        this.A0S = r26;
        this.A0J = r27;
        this.A0I = r28;
        this.A0E = r29;
        this.A0Q = r30;
        this.A02 = handler;
    }

    public void run() {
        AnonymousClass0EO r1;
        boolean isEmpty;
        try {
            C446220v r8 = new C446220v();
            Log.i("registername/initializer/run");
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A01 == 0) {
                this.A01 = uptimeMillis;
            }
            this.A0E.A02();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            AnonymousClass0Hz r0 = new AnonymousClass0Hz(EnumC03840Hy.REGISTRATION_FULL);
            r0.A04 = true;
            r0.A02();
            r0.A03 = true;
            AnonymousClass0QK A012 = this.A0D.A01(r0.A01());
            r8.A02 = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2);
            AnonymousClass0EQ r10 = this.A0F;
            if (r10.A04.A03()) {
                HashSet hashSet = new HashSet();
                Set A0C2 = r10.A03.A0C();
                Iterator it = r10.A01.A0F().iterator();
                while (it.hasNext()) {
                    C007003k r13 = (C007003k) it.next();
                    if (!C002001d.A3V(r13.A09) && r13.A02(UserJid.class) != null) {
                        AnonymousClass0QW r02 = r13.A08;
                        if (r02 == null || TextUtils.isEmpty(r02.A01)) {
                            if (!((HashSet) A0C2).contains(r13.A09)) {
                                continue;
                            } else {
                                Jid A022 = r13.A02(UserJid.class);
                                if (A022 != null) {
                                    hashSet.add(A022);
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    r10.A02((UserJid[]) hashSet.toArray(new UserJid[0]), 3);
                }
            }
            StringBuilder sb = new StringBuilder("registername/initializer/sync/done result=");
            sb.append(A012);
            Log.i(sb.toString());
            if (A012 == AnonymousClass0QK.NETWORK_UNAVAILABLE) {
                this.A00 = 1;
            } else if (A012 == AnonymousClass0QK.FAILED) {
                this.A00 = 3;
            } else if (A012 == AnonymousClass0QK.EXCEPTION) {
                this.A00 = 3;
            } else {
                Log.i("registername/setconnection/active");
                this.A0N.A04(true);
                r8.A00 = Boolean.FALSE;
                long uptimeMillis3 = SystemClock.uptimeMillis() - this.A01;
                while (true) {
                    r1 = this.A0M;
                    if (r1.A0l && uptimeMillis3 < 45000) {
                        uptimeMillis3 += 200;
                        SystemClock.sleep(200);
                    }
                }
                if (uptimeMillis3 >= 45000 && r1.A0l) {
                    r1.A09(3);
                    r8.A00 = Boolean.TRUE;
                }
                r8.A03 = Long.valueOf(SystemClock.uptimeMillis() - this.A01);
                Log.i("registername/shouldrefreshlists");
                AnonymousClass00D r9 = this.A0G;
                AnonymousClass008.A0n(r9, "refresh_broadcast_lists", true);
                this.A0O.A04();
                AnonymousClass0I4 r03 = this.A07;
                new AnonymousClass3LE(r03.A03, new C40401tD(r03, null)).A00();
                C014508d r04 = this.A0J.A00;
                r04.A05();
                if (r04.A08.exists() && !this.A0K.A0H()) {
                    AnonymousClass01J r05 = this.A09;
                    r05.A00.A01(GetStatusPrivacyJob.A00());
                }
                this.A0P.A02(true, false);
                Log.i("registername/reintialized payments");
                AnonymousClass008.A0n(r9, "registration_biz_registered_on_device", false);
                long uptimeMillis4 = SystemClock.uptimeMillis();
                HashSet hashSet2 = new HashSet();
                Iterator it2 = ((ArrayList) this.A0I.A04(50)).iterator();
                while (it2.hasNext()) {
                    C007003k r102 = (C007003k) it2.next();
                    if (r102.A02(AnonymousClass02N.class) != null) {
                        this.A08.A03((AnonymousClass02N) r102.A02(AnonymousClass02N.class), 0, 2, null);
                        hashSet2.add(r102.A02(AnonymousClass02N.class));
                    }
                }
                ArrayList A0F2 = this.A0A.A0F();
                Collections.sort(A0F2, new C26381Kq(this.A0C, this.A0H));
                Iterator it3 = A0F2.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    C007003k r14 = (C007003k) it3.next();
                    if (r14.A0X && r14.A02(UserJid.class) != null && !hashSet2.contains(r14.A02(UserJid.class))) {
                        i++;
                        this.A08.A03((AnonymousClass02N) r14.A02(UserJid.class), 0, 2, null);
                        hashSet2.add(r14.A02(UserJid.class));
                        if (i > 50) {
                            break;
                        }
                    }
                }
                AnonymousClass01I r92 = this.A06;
                r92.A04();
                AnonymousClass0HR r06 = r92.A01;
                if (r06 != null && r06.A01 == 0) {
                    AnonymousClass0ES r12 = this.A08;
                    r92.A04();
                    r12.A03(r92.A03, 0, 1, null);
                }
                int i2 = 0;
                while (true) {
                    AnonymousClass0AU r15 = this.A0W.A02;
                    synchronized (r15) {
                        isEmpty = r15.A01.isEmpty();
                    }
                    if (isEmpty || ((long) i2) >= 10000) {
                        boolean z = false;
                    } else {
                        SystemClock.sleep(200);
                        i2 += 200;
                    }
                }
                boolean z2 = false;
                if (((long) i2) >= 10000) {
                    z2 = true;
                }
                r8.A01 = Boolean.valueOf(z2);
                r8.A04 = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis4);
                AnonymousClass02M r93 = this.A05;
                r93.A02.post(new RunnableEBaseShape12S0100000_I1_7(this, 25));
                this.A04 = true;
                this.A0R.A0C(3);
                r8.A05 = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                this.A0L.A0B(r8, null, false);
                Log.i("registername/setregverified");
                this.A01 = 0;
                Log.i("registername/fin/done");
            }
        } finally {
            this.A03 = true;
            Handler handler = this.A02;
            if (handler != null) {
                handler.sendEmptyMessage(0);
            }
        }
    }
}
