package X;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0G8  reason: invalid class name */
public class AnonymousClass0G8 extends HandlerThread {
    public long A00;
    public C11270g0 A01;
    public HandlerC11280g1 A02;
    public AnonymousClass0Wz A03;
    public AnonymousClass0XJ A04;
    public AnonymousClass0X2 A05;
    public AnonymousClass0OT A06;
    public final C001100q A07;
    public final C03180Fc A08;
    public final C03290Fp A09;
    public final C03320Fs A0A;
    public final AnonymousClass009 A0B;
    public final AnonymousClass01I A0C;
    public final C03250Fl A0D;
    public final AnonymousClass09T A0E;
    public final AnonymousClass03B A0F;
    public final C000300f A0G;
    public final AnonymousClass0CL A0H;
    public final C03170Fb A0I;
    public final C017009c A0J;
    public final AnonymousClass01A A0K;
    public final AnonymousClass04j A0L;
    public final AnonymousClass03P A0M;
    public final AnonymousClass00S A0N;
    public final AnonymousClass00G A0O;
    public final AnonymousClass00D A0P;
    public final AnonymousClass01X A0Q;
    public final AnonymousClass01K A0R;
    public final C014508d A0S;
    public final C02090Ap A0T;
    public final C000800l A0U;
    public final C002701k A0V;
    public final AnonymousClass038 A0W;
    public final AnonymousClass00Y A0X;
    public final AnonymousClass0EO A0Y;
    public final C03280Fo A0Z;
    public final AnonymousClass01S A0a;
    public final AbstractC03370Fx A0b;
    public final C03240Fj A0c;
    public final AnonymousClass0Wy A0d;
    public final C03380Fy A0e = new C03380Fy("connection_thread/logged_flag/connected", false);
    public final C03380Fy A0f = new C03380Fy("connection_thread/logged_flag/disconnecting", false);
    public final C03380Fy A0g = new C03380Fy("connection_thread/logged_flag/quit", false);
    public final C03160Fa A0h;
    public final C015808q A0i;
    public final C03230Fi A0j;
    public final AnonymousClass09M A0k;
    public final C03330Ft A0l;
    public final C28991Wn A0m;
    public final AnonymousClass2VK A0n;
    public final C03340Fu A0o;
    public final C01970Ad A0p;
    public final C03100Eu A0q;
    public final C03210Ff A0r;
    public final C03300Fq A0s;
    public final C03310Fr A0t;
    public final AnonymousClass0AL A0u;
    public final C03200Fe A0v;
    public final C014708f A0w;
    public final C03260Fm A0x;
    public final AbstractC29211Xn A0y;
    public final AnonymousClass03U A0z;
    public final C03190Fd A10;
    public final AnonymousClass0Fh A11;
    public final C02400Bv A12;
    public final AnonymousClass0C4 A13;
    public final Random A14;

    public AnonymousClass0G8(AbstractC03370Fx r4, AnonymousClass00S r5, C002701k r6, C000800l r7, AnonymousClass009 r8, AnonymousClass01I r9, C03170Fb r10, AnonymousClass00G r11, AnonymousClass03B r12, AnonymousClass0CL r13, AnonymousClass00Y r14, C02400Bv r15, AnonymousClass0C4 r16, C000300f r17, C001100q r18, C03180Fc r19, C03190Fd r20, C03200Fe r21, C03210Ff r22, AnonymousClass0Fh r23, C03230Fi r24, AnonymousClass01A r25, C03160Fa r26, AnonymousClass03P r27, AnonymousClass01X r28, C03240Fj r29, AnonymousClass0AL r30, C01970Ad r31, C03100Eu r32, AnonymousClass01K r33, AnonymousClass0EO r34, C03250Fl r35, AnonymousClass09T r36, C015808q r37, C03260Fm r38, AnonymousClass03U r39, AnonymousClass038 r40, C02090Ap r41, C03280Fo r42, C03290Fp r43, C28991Wn r44, C014508d r45, AnonymousClass04j r46, C03300Fq r47, AnonymousClass00D r48, C03310Fr r49, C03320Fs r50, AbstractC29211Xn r51, C03330Ft r52, AnonymousClass2VK r53, C03340Fu r54, C017009c r55, AnonymousClass01S r56, C014708f r57, AnonymousClass09M r58) {
        super("ConnectionThread", 1);
        this.A0b = r4;
        this.A0O = r11;
        this.A0B = r8;
        this.A0X = r14;
        this.A0G = r17;
        this.A0h = r26;
        this.A0N = r5;
        this.A0V = r6;
        this.A0U = r7;
        this.A0C = r9;
        this.A0I = r10;
        this.A0F = r12;
        this.A0H = r13;
        this.A12 = r15;
        this.A13 = r16;
        this.A07 = r18;
        this.A08 = r19;
        this.A10 = r20;
        this.A0v = r21;
        this.A0r = r22;
        this.A11 = r23;
        this.A0j = r24;
        this.A0K = r25;
        this.A0M = r27;
        this.A0Q = r28;
        this.A0c = r29;
        this.A0u = r30;
        this.A0p = r31;
        this.A0q = r32;
        this.A0R = r33;
        this.A0Y = r34;
        this.A0D = r35;
        this.A0E = r36;
        this.A0i = r37;
        this.A0x = r38;
        this.A0z = r39;
        this.A0W = r40;
        this.A0T = r41;
        this.A0Z = r42;
        this.A09 = r43;
        this.A0m = r44;
        this.A0S = r45;
        this.A0L = r46;
        this.A0s = r47;
        this.A0P = r48;
        this.A0t = r49;
        this.A0A = r50;
        this.A0y = r51;
        this.A0l = r52;
        this.A0n = r53;
        this.A0o = r54;
        this.A0J = r55;
        this.A0a = r56;
        this.A0w = r57;
        this.A0k = r58;
        this.A14 = new Random();
        this.A0d = new AnonymousClass0Wy(r39);
    }

    public static void A00(AnonymousClass038 r4, AnonymousClass00D r5, AnonymousClass0M5 r6) {
        String A0G2 = r6.A0G("location", null);
        if (TextUtils.isEmpty(A0G2) || A0G2.length() < 40) {
            r4.A03(2795, A0G2, 0);
            r4.A03(2795, A0G2, 1);
            if (r5 == null) {
                throw null;
            } else if (TextUtils.isEmpty(A0G2)) {
                AnonymousClass008.A0j(r5, "last_datacenter");
            } else {
                AnonymousClass008.A0m(r5, "last_datacenter", A0G2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(1:5)|6|7|(1:9)|(3:10|11|(2:13|14)(1:20))) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a A[Catch:{ Exception -> 0x001d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C11270g0 r2) {
        /*
            java.lang.String r0 = "ConnectionThread/closeSocket"
            com.whatsapp.util.Log.i(r0)
            if (r2 == 0) goto L_0x0030
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x0012 }
            boolean r0 = r1.isOutputShutdown()     // Catch:{ Exception -> 0x0012 }
            if (r0 != 0) goto L_0x0012
            r1.shutdownOutput()     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x001d }
            boolean r0 = r1.isInputShutdown()     // Catch:{ Exception -> 0x001d }
            if (r0 != 0) goto L_0x001d
            r1.shutdownInput()     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r1.isClosed()     // Catch:{ Exception -> 0x0029 }
            if (r0 != 0) goto L_0x002f
            r1.close()     // Catch:{ Exception -> 0x0029 }
            return
        L_0x0029:
            r1 = move-exception
            java.lang.String r0 = "ConnectionSocketDefault/closeSocket "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x002f:
            return
        L_0x0030:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0G8.A01(X.0g0):void");
    }

    public final void A02(boolean z) {
        boolean hasMessages = this.A03.hasMessages(0);
        this.A03.removeCallbacksAndMessages(null);
        C03380Fy r2 = this.A0e;
        if (r2.A00) {
            C03380Fy r5 = this.A0f;
            if (!r5.A00) {
                if (z) {
                    Log.i("xmpp/connection/forced_disconnect/reader_thread/mark_finished");
                    HandlerC11280g1 r1 = this.A02;
                    if (r1 != null) {
                        Log.d("xmpp/connection/reader_thread/finished");
                        r1.A00 = true;
                    }
                    A01(this.A01);
                    this.A04.ANh();
                    ((HandlerC03360Fw) this.A0b).A00(true);
                    r2.A00(false);
                    if (this.A0g.A00) {
                        Log.i("xmpp/connection/quit during forced disconnect");
                        this.A05.quit();
                        quit();
                        return;
                    }
                    return;
                }
                this.A03.sendEmptyMessageDelayed(0, 10000);
                this.A04.ANp(Message.obtain(null, 0, 13, 0));
                r5.A00(true);
                return;
            }
        }
        if (hasMessages && z) {
            AnonymousClass0Wz r12 = this.A03;
            if (r12 != null) {
                Log.w("xmpp/connection/fire-logout-timeout");
                r12.sendEmptyMessage(0);
                return;
            }
            throw null;
        }
    }

    public final void A03(boolean z) {
        this.A0e.A00(false);
        this.A0f.A00(false);
        if (!this.A0g.A00) {
            this.A03.removeMessages(0);
            this.A04.ANh();
            ((HandlerC03360Fw) this.A0b).A00(z);
        } else {
            Log.i("xmpp/connection/quit");
            this.A05.quit();
            quit();
        }
        this.A03.removeCallbacksAndMessages(null);
    }

    public final void A04(boolean z, int i, int i2, long j, boolean z2) {
        int i3;
        long j2;
        AnonymousClass20O r6 = new AnonymousClass20O();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i4 = 2;
        int i5 = 2;
        if (z) {
            i5 = 1;
        }
        r6.A03 = Integer.valueOf(i5);
        r6.A06 = Long.valueOf((long) i);
        r6.A07 = Long.valueOf((long) i2);
        r6.A05 = Long.valueOf(elapsedRealtime - j);
        C03160Fa r8 = this.A0h;
        r6.A00 = Boolean.valueOf(!r8.A0H());
        r6.A01 = Boolean.valueOf(z2);
        Object obj = r8.A1T;
        synchronized (obj) {
            C03390Fz r0 = r8.A08;
            i3 = r0.A00;
            j2 = r0.A02;
        }
        if (i3 != 0) {
            if (j2 > 0) {
                Long valueOf = Long.valueOf(j2);
                if (valueOf == null) {
                    throw null;
                } else if (j - valueOf.longValue() < TimeUnit.SECONDS.toMillis(10)) {
                    r6.A04 = Long.valueOf(elapsedRealtime - j2);
                    Integer valueOf2 = Integer.valueOf(i3);
                    if (valueOf2 != null) {
                        int intValue = valueOf2.intValue();
                        if (intValue == 1) {
                            i4 = 1;
                        } else if (intValue != 2) {
                            i4 = 3;
                            if (intValue == 3) {
                                i4 = 4;
                            }
                        }
                        r6.A02 = Integer.valueOf(i4);
                    } else {
                        throw null;
                    }
                }
            }
            r6.A02 = 3;
        } else {
            r6.A02 = 3;
        }
        AnonymousClass00Y r1 = this.A0X;
        if (z) {
            r1.A0B(r6, null, false);
            synchronized (obj) {
                C03390Fz r2 = r8.A08;
                r2.A00 = 0;
                r2.A02 = 0;
                r2.A01 = 0;
            }
            return;
        }
        r1.A09(r6, 1);
        AnonymousClass00Y.A01(r6, "");
        synchronized (obj) {
            r8.A08.A01++;
        }
    }

    public final void A05(boolean z, long j) {
        if (j > 0) {
            long j2 = this.A00;
            if (j2 > j) {
                AnonymousClass008.A1P(AnonymousClass008.A0V("xmpp/connection/recv/disconnect/skip disconnectRequestTime:", j, " lastConnectedTime:"), j2);
                return;
            }
        }
        A02(z);
    }

    public void onLooperPrepared() {
        this.A03 = new AnonymousClass0Wz(this);
        AnonymousClass0X2 r0 = new AnonymousClass0X2(new AnonymousClass0X0(this), this.A0B, this.A0H, this.A0E, this.A0A);
        this.A05 = r0;
        r0.start();
        C03330Ft r1 = this.A0l;
        synchronized (r1) {
            if (!r1.A00) {
                AnonymousClass09M r2 = r1.A04;
                r2.A02((AnonymousClass0C0) r1.A0I.get());
                r2.A02(r1.A03);
                r2.A02(r1.A0H.A02);
                r2.A02(r1.A0F);
                r2.A02(r1.A02);
                r2.A02((AnonymousClass0C0) r1.A0K.get());
                r2.A02((AnonymousClass0C0) r1.A0J.get());
                r2.A02(r1.A08);
                r2.A02(r1.A0B);
                r2.A02((AnonymousClass0C0) r1.A0M.get());
                r2.A02(r1.A07);
                r2.A02((AnonymousClass0C0) r1.A0L.get());
                r2.A02(r1.A0D);
                r2.A02(r1.A0E);
                r2.A02(r1.A0A);
                r2.A02(r1.A09);
                r2.A02(r1.A0C);
                r2.A02(r1.A06);
                r2.A02(r1.A05);
                r2.A02(r1.A01);
                r2.A02(r1.A0G);
                r1.A00 = true;
            }
        }
    }
}
