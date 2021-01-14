package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0FE  reason: invalid class name */
public class AnonymousClass0FE {
    public static volatile AnonymousClass0FE A0m;
    public long A00 = (System.currentTimeMillis() - 200);
    public Handler A01;
    public AnonymousClass0FJ A02;
    public boolean A03;
    public final AnonymousClass0C2 A04;
    public final AnonymousClass009 A05;
    public final AnonymousClass088 A06;
    public final AnonymousClass02M A07;
    public final AnonymousClass01I A08;
    public final AnonymousClass0XY A09;
    public final AnonymousClass0IY A0A;
    public final C000300f A0B;
    public final C03170Fb A0C;
    public final AnonymousClass0HI A0D;
    public final AnonymousClass1PG A0E;
    public final C27331Pi A0F;
    public final AnonymousClass1Pw A0G;
    public final AnonymousClass0HJ A0H;
    public final AnonymousClass01A A0I;
    public final C014308b A0J;
    public final AnonymousClass0L2 A0K;
    public final AnonymousClass03P A0L;
    public final AnonymousClass00S A0M;
    public final AnonymousClass00G A0N;
    public final AnonymousClass03C A0O;
    public final AnonymousClass00D A0P;
    public final AnonymousClass01X A0Q;
    public final C006903j A0R;
    public final AnonymousClass01Q A0S;
    public final AnonymousClass01K A0T;
    public final AnonymousClass01T A0U;
    public final AnonymousClass0AP A0V;
    public final AnonymousClass095 A0W;
    public final AnonymousClass0BW A0X;
    public final C04270Js A0Y;
    public final C58612mD A0Z = new C58612mD(this);
    public final AnonymousClass0BS A0a;
    public final AnonymousClass0FF A0b;
    public final C29031Wt A0c;
    public final C014708f A0d;
    public final AnonymousClass0BB A0e;
    public final C02570Cp A0f;
    public final WebpUtils A0g;
    public final C04260Jr A0h;
    public final AnonymousClass0Fh A0i;
    public final AnonymousClass0C4 A0j;
    public final Map A0k = new HashMap();
    public volatile long A0l;

    public AnonymousClass0FE(AnonymousClass00G r5, AnonymousClass00S r6, AnonymousClass02M r7, AnonymousClass01I r8, C03170Fb r9, AnonymousClass009 r10, WebpUtils webpUtils, C006903j r12, AnonymousClass088 r13, AnonymousClass095 r14, AnonymousClass0C4 r15, C000300f r16, AnonymousClass0L2 r17, AnonymousClass0Fh r18, C27331Pi r19, AnonymousClass1Pw r20, AnonymousClass0HJ r21, AnonymousClass01A r22, AnonymousClass03P r23, C014308b r24, AnonymousClass01X r25, C29031Wt r26, C02570Cp r27, C04260Jr r28, AnonymousClass01K r29, AnonymousClass0AP r30, AnonymousClass0BB r31, AnonymousClass0BS r32, AnonymousClass0HI r33, C04270Js r34, AnonymousClass0FF r35, AnonymousClass0BW r36, AnonymousClass00D r37, AnonymousClass01Q r38, AnonymousClass03C r39, AnonymousClass0IY r40, AnonymousClass01T r41, AnonymousClass0XY r42, C014708f r43, AnonymousClass0C2 r44, AnonymousClass1PG r45) {
        this.A0N = r5;
        this.A0M = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A0C = r9;
        this.A05 = r10;
        this.A0g = webpUtils;
        this.A0R = r12;
        this.A06 = r13;
        this.A0W = r14;
        this.A0j = r15;
        this.A0B = r16;
        this.A0K = r17;
        this.A0i = r18;
        this.A0F = r19;
        this.A0G = r20;
        this.A0H = r21;
        this.A0I = r22;
        this.A0L = r23;
        this.A0J = r24;
        this.A0Q = r25;
        this.A0c = r26;
        this.A0f = r27;
        this.A0h = r28;
        this.A0T = r29;
        this.A0V = r30;
        this.A0e = r31;
        this.A0a = r32;
        this.A0D = r33;
        this.A0Y = r34;
        this.A0b = r35;
        this.A0X = r36;
        this.A0P = r37;
        this.A0S = r38;
        this.A0O = r39;
        this.A0A = r40;
        this.A0U = r41;
        this.A09 = r42;
        this.A0d = r43;
        this.A04 = r44;
        this.A0E = r45;
        r45.A01.A00(new C58642mG(this));
    }

    public static AnonymousClass0FE A00() {
        if (A0m == null) {
            synchronized (AnonymousClass0FE.class) {
                if (A0m == null) {
                    A0m = new AnonymousClass0FE(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass01I.A00(), C03170Fb.A00(), AnonymousClass009.A00(), WebpUtils.A00(), C006903j.A00(), AnonymousClass088.A00(), AnonymousClass095.A00(), AnonymousClass0C4.A00(), C000300f.A00(), AnonymousClass0L2.A01(), AnonymousClass0Fh.A00(), C27331Pi.A00(), AnonymousClass1Pw.A00(), AnonymousClass0HJ.A02(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass01X.A00(), C29031Wt.A00(), C02570Cp.A01(), C04260Jr.A00(), AnonymousClass01K.A00(), AnonymousClass0AP.A00(), AnonymousClass0BB.A00(), AnonymousClass0BS.A01(), AnonymousClass0HI.A00(), C04270Js.A00(), AnonymousClass0FF.A00(), AnonymousClass0BW.A00(), AnonymousClass00D.A00(), AnonymousClass01Q.A00(), AnonymousClass03C.A00(), AnonymousClass0IY.A00(), AnonymousClass01T.A00(), AnonymousClass0XY.A01, C014708f.A00(), AnonymousClass0C2.A00(), AnonymousClass1PG.A00());
                }
            }
        }
        return A0m;
    }

    public static final String A01(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC007503q) it.next()).A0n.A01);
            sb.append(' ');
        }
        return sb.toString();
    }

    public final synchronized Handler A02() {
        Handler handler;
        handler = this.A01;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("Notifications", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A01 = handler;
        }
        return handler;
    }

    public void A03() {
        PendingIntent broadcast;
        AnonymousClass0C4 r4 = this.A0j;
        if (r4.A0L.A03() && (broadcast = PendingIntent.getBroadcast(r4.A0G.A00, 0, new Intent("com.whatsapp.alarm.WEB_RENOTIFY").setPackage("com.whatsapp"), 536870912)) != null) {
            Log.d("qrsession/renotify/cancel");
            AlarmManager A022 = r4.A0E.A02();
            if (A022 != null) {
                A022.cancel(broadcast);
            } else {
                Log.w("WebSession/cancelReNotify AlarmManager is null");
            }
            broadcast.cancel();
        }
        AnonymousClass0FF r1 = this.A0b;
        synchronized (r1) {
            r1.A01 = null;
            r1.A00 = null;
        }
    }

    public void A04() {
        A0A(null, true, true, false);
    }

    public void A05(AnonymousClass02N r4) {
        A02().post(new RunnableEBaseShape3S0200000_I0_2(this, r4, 25));
        A03();
    }

    public void A06(AnonymousClass02N r4, AbstractC007503q r5) {
        A02().post(new RunnableEBaseShape0S0300000_I0_0(this, r4, r5, 46));
    }

    public void A07(AnonymousClass02N r4, AbstractC007503q r5) {
        A02().post(new RunnableEBaseShape0S0300000_I0_0(this, r5, r4, 45));
    }

    public void A08(C007303n r4, boolean z, boolean z2) {
        if (r4 != null) {
            AbstractC007503q A052 = this.A0T.A0J.A05(r4);
            if (A052 != null) {
                StringBuilder A0S2 = AnonymousClass008.A0S("messagenotification/refreshStatusBarNotificationIfMessageExists ");
                A0S2.append(AnonymousClass0FI.A0B(A052));
                A0S2.append(' ');
                A0S2.append(z);
                A0S2.append(' ');
                A0S2.append(z2);
                Log.d(A0S2.toString());
                A0A(A052, false, z, z2);
                return;
            }
            Log.i("messagenotification/refreshStatusBarNotificationIfMessageExists/no-message");
            return;
        }
        Log.e("messagenotification/refreshStatusBarNotificationIfMessageExists/no-messag-key");
    }

    public void A09(AbstractC007503q r8, boolean z, boolean z2) {
        A0B(r8, z, this.A03, false, false, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r9 != false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.AbstractC007503q r8, boolean r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            r1 = r8
            r2 = r9
            if (r8 == 0) goto L_0x0007
            r6 = 1
            if (r9 == 0) goto L_0x0008
        L_0x0007:
            r6 = 0
        L_0x0008:
            r5 = 0
            r0 = r7
            r4 = r11
            r3 = r10
            r0.A0B(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FE.A0A(X.03q, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0146, code lost:
        if (r13 != false) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AbstractC007503q r62, boolean r63, boolean r64, boolean r65, boolean r66, boolean r67) {
        /*
        // Method dump skipped, instructions count: 550
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FE.A0B(X.03q, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0C(boolean z) {
        A02().post(new RunnableEBaseShape0S0110000_I0(this, z, 4));
        A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r1.contains(r0.A03) == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r0.A07() != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(X.AbstractC007503q r7) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FE.A0D(X.03q):boolean");
    }
}
