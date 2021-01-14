package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Fa  reason: invalid class name and case insensitive filesystem */
public class C03160Fa {
    public static CountDownLatch A1Y = new CountDownLatch(1);
    public static final long A1Z = TimeUnit.MINUTES.toMillis(15);
    public static final AtomicBoolean A1a = new AtomicBoolean();
    public static volatile C03160Fa A1b;
    public int A00;
    public long A01 = -1;
    public long A02 = 0;
    public long A03;
    public HandlerThread A04;
    public AnonymousClass0KY A05;
    public AnonymousClass0KY A06;
    public UserJid A07;
    public C03390Fz A08 = new C03390Fz();
    public AnonymousClass0G8 A09;
    public AnonymousClass0GA A0A;
    public AtomicBoolean A0B = new AtomicBoolean();
    public AtomicBoolean A0C = new AtomicBoolean();
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public final BroadcastReceiver A0G = new AnonymousClass0G0(this);
    public final BroadcastReceiver A0H = new AnonymousClass0G1(this);
    public final Handler A0I = new Handler(new C50432Ur(this));
    public final AnonymousClass0C2 A0J;
    public final C001100q A0K;
    public final C03180Fc A0L;
    public final C03290Fp A0M;
    public final C03320Fs A0N;
    public final AnonymousClass009 A0O;
    public final AnonymousClass02M A0P;
    public final AnonymousClass01I A0Q;
    public final C03250Fl A0R;
    public final AnonymousClass0Fk A0S;
    public final AnonymousClass09T A0T;
    public final AnonymousClass03B A0U;
    public final C000300f A0V;
    public final AnonymousClass0CL A0W;
    public final C03170Fb A0X;
    public final AnonymousClass09K A0Y;
    public final C017009c A0Z;
    public final AnonymousClass01A A0a;
    public final AnonymousClass04j A0b;
    public final AnonymousClass03P A0c;
    public final C03270Fn A0d;
    public final AnonymousClass00S A0e;
    public final AnonymousClass00G A0f;
    public final AnonymousClass03C A0g;
    public final AnonymousClass00D A0h;
    public final AnonymousClass01X A0i;
    public final AnonymousClass01K A0j;
    public final C014508d A0k;
    public final C02090Ap A0l;
    public final C000800l A0m;
    public final C002701k A0n;
    public final AnonymousClass0ET A0o;
    public final AnonymousClass038 A0p;
    public final AnonymousClass00Y A0q;
    public final C03280Fo A0r;
    public final AnonymousClass0EU A0s;
    public final AnonymousClass0G3 A0t;
    public final C03240Fj A0u;
    public final C03380Fy A0v = new C03380Fy("message_handler/logged_flag/disconnected", true);
    public final C03380Fy A0w = new C03380Fy("message_handler/logged_flag/must_ignore_network_once", false);
    public final C03380Fy A0x = new C03380Fy("message_handler/logged_flag/must_reconnect", true);
    public final AnonymousClass09L A0y;
    public final AnonymousClass09H A0z;
    public final HandlerC03360Fw A10 = new HandlerC03360Fw(this, Looper.getMainLooper());
    public final AnonymousClass0G2 A11;
    public final AnonymousClass0G6 A12;
    public final C015808q A13;
    public final AnonymousClass0AR A14;
    public final C03230Fi A15;
    public final AnonymousClass09M A16;
    public final C03330Ft A17;
    public final C28991Wn A18;
    public final AnonymousClass2VK A19;
    public final C03340Fu A1A;
    public final C01970Ad A1B;
    public final C03100Eu A1C;
    public final C03210Ff A1D;
    public final C03300Fq A1E;
    public final C03310Fr A1F;
    public final AnonymousClass0AL A1G;
    public final C03200Fe A1H;
    public final C014708f A1I;
    public final C03260Fm A1J;
    public final AnonymousClass0C5 A1K;
    public final C03350Fv A1L;
    public final AbstractC29211Xn A1M;
    public final AnonymousClass03U A1N;
    public final C03190Fd A1O;
    public final AnonymousClass0CZ A1P;
    public final AnonymousClass0Fh A1Q;
    public final C02400Bv A1R;
    public final AnonymousClass0C4 A1S;
    public final Object A1T = new Object();
    public final Random A1U = new Random();
    public volatile boolean A1V = true;
    public volatile boolean A1W;
    public volatile boolean A1X;

    public C03160Fa(AnonymousClass00G r11, AnonymousClass00S r12, C002701k r13, C000800l r14, AnonymousClass02M r15, AnonymousClass009 r16, AnonymousClass01I r17, C03170Fb r18, AnonymousClass03B r19, AnonymousClass0CL r20, AnonymousClass00Y r21, C02400Bv r22, AnonymousClass0C4 r23, AnonymousClass0AR r24, C000300f r25, C001100q r26, C03180Fc r27, C03190Fd r28, C03200Fe r29, C03210Ff r30, AnonymousClass09H r31, AnonymousClass0Fh r32, C03230Fi r33, AnonymousClass01A r34, AnonymousClass03P r35, AnonymousClass01X r36, C03240Fj r37, AnonymousClass0AL r38, AnonymousClass0Fk r39, C01970Ad r40, C03100Eu r41, AnonymousClass01K r42, AnonymousClass0C5 r43, C03250Fl r44, AnonymousClass09T r45, AnonymousClass09K r46, AnonymousClass0ET r47, C015808q r48, C03260Fm r49, AnonymousClass03U r50, C03270Fn r51, AnonymousClass038 r52, C02090Ap r53, C03280Fo r54, C03290Fp r55, C28991Wn r56, C014508d r57, AnonymousClass04j r58, C03300Fq r59, AnonymousClass00D r60, C03310Fr r61, C03320Fs r62, AbstractC29211Xn r63, C03330Ft r64, AnonymousClass2VK r65, C03340Fu r66, AnonymousClass03C r67, C017009c r68, AnonymousClass09L r69, C014708f r70, AnonymousClass0C2 r71, AnonymousClass09M r72, C03350Fv r73, AnonymousClass0EU r74) {
        AnonymousClass0G6 r3;
        this.A0f = r11;
        this.A0e = r12;
        this.A0n = r13;
        this.A0m = r14;
        this.A0P = r15;
        this.A0O = r16;
        this.A0Q = r17;
        this.A0X = r18;
        this.A0U = r19;
        this.A0W = r20;
        this.A0q = r21;
        this.A1R = r22;
        this.A1S = r23;
        this.A14 = r24;
        this.A0V = r25;
        this.A0K = r26;
        this.A0L = r27;
        this.A1O = r28;
        this.A1H = r29;
        this.A1D = r30;
        this.A0z = r31;
        this.A1Q = r32;
        this.A15 = r33;
        this.A0a = r34;
        this.A0c = r35;
        this.A0i = r36;
        this.A0u = r37;
        this.A1G = r38;
        this.A0S = r39;
        this.A1B = r40;
        this.A1C = r41;
        this.A0j = r42;
        this.A1K = r43;
        this.A0R = r44;
        this.A0T = r45;
        this.A0Y = r46;
        this.A0o = r47;
        this.A13 = r48;
        this.A1J = r49;
        this.A1N = r50;
        this.A0d = r51;
        this.A0p = r52;
        this.A0l = r53;
        this.A0r = r54;
        this.A0M = r55;
        this.A18 = r56;
        this.A0k = r57;
        this.A0b = r58;
        this.A1E = r59;
        this.A0h = r60;
        this.A1F = r61;
        this.A0N = r62;
        this.A1M = r63;
        this.A17 = r64;
        this.A19 = r65;
        this.A1A = r66;
        this.A0g = r67;
        this.A0Z = r68;
        this.A0y = r69;
        this.A1I = r70;
        this.A0J = r71;
        this.A16 = r72;
        this.A1L = r73;
        this.A0s = r74;
        this.A1P = new AnonymousClass0CZ(1, 17280);
        this.A11 = new AnonymousClass0G2(this, Looper.getMainLooper());
        this.A0t = new AnonymousClass0G3(r11, r25, r35, Looper.getMainLooper(), r46);
        Application application = r11.A00;
        application.registerReceiver(this.A0H, new IntentFilter("com.whatsapp.MessageHandler.LOGOUT_ACTION"), "com.whatsapp.permission.BROADCAST", null);
        application.registerReceiver(new AnonymousClass0G4(this), new IntentFilter("com.whatsapp.MessageHandler.RECONNECT_ACTION"), "com.whatsapp.permission.BROADCAST", null);
        if (Build.VERSION.SDK_INT >= 29) {
            r3 = new AnonymousClass0G5(this.A0c, this, this.A0d);
        } else {
            r3 = new AnonymousClass0G7(this.A0f, this, this.A0d, this.A0b);
        }
        this.A12 = r3;
    }

    public static C03160Fa A00() {
        if (A1b == null) {
            synchronized (C03160Fa.class) {
                if (A1b == null) {
                    AnonymousClass00G r9 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C002701k A003 = C002701k.A00();
                    C000800l A004 = C000800l.A00();
                    AnonymousClass02M A005 = AnonymousClass02M.A00();
                    AnonymousClass009 A006 = AnonymousClass009.A00();
                    AnonymousClass01I A007 = AnonymousClass01I.A00();
                    C03170Fb A008 = C03170Fb.A00();
                    AnonymousClass03B A009 = AnonymousClass03B.A00();
                    AnonymousClass0CL A0010 = AnonymousClass0CL.A00();
                    AnonymousClass00Y A0011 = AnonymousClass00Y.A00();
                    C02400Bv A0012 = C02400Bv.A00();
                    AnonymousClass0C4 A0013 = AnonymousClass0C4.A00();
                    AnonymousClass0AR A0014 = AnonymousClass0AR.A00();
                    C000300f A0015 = C000300f.A00();
                    C001100q A0016 = C001100q.A00();
                    C03180Fc r25 = C03180Fc.A05;
                    C03190Fd A0017 = C03190Fd.A00();
                    C03200Fe A0018 = C03200Fe.A00();
                    C03210Ff A0019 = C03210Ff.A00();
                    AnonymousClass09H A012 = AnonymousClass09H.A01();
                    AnonymousClass0Fh A0020 = AnonymousClass0Fh.A00();
                    if (C03230Fi.A07 == null) {
                        synchronized (C03230Fi.class) {
                            if (C03230Fi.A07 == null) {
                                C03230Fi.A07 = new C03230Fi(AnonymousClass009.A00(), AnonymousClass01I.A00(), C000300f.A00(), C02770Dj.A00(), AnonymousClass01A.A00(), C03100Eu.A00(), C02130At.A00());
                            }
                        }
                    }
                    C03230Fi r31 = C03230Fi.A07;
                    AnonymousClass01A A0021 = AnonymousClass01A.A00();
                    AnonymousClass03P A0022 = AnonymousClass03P.A00();
                    AnonymousClass01X A0023 = AnonymousClass01X.A00();
                    C03240Fj A0024 = C03240Fj.A00();
                    AnonymousClass0AL A013 = AnonymousClass0AL.A01();
                    AnonymousClass0Fk r37 = AnonymousClass0Fk.A01;
                    C01970Ad A0025 = C01970Ad.A00();
                    C03100Eu A0026 = C03100Eu.A00();
                    AnonymousClass01K A0027 = AnonymousClass01K.A00();
                    AnonymousClass0C5 A0028 = AnonymousClass0C5.A00();
                    C03250Fl A0029 = C03250Fl.A00();
                    AnonymousClass09T A0030 = AnonymousClass09T.A00();
                    AnonymousClass09K r44 = AnonymousClass09K.A07;
                    AnonymousClass0ET A0031 = AnonymousClass0ET.A00();
                    C015808q A0032 = C015808q.A00();
                    C03260Fm A0033 = C03260Fm.A00();
                    AnonymousClass03U A0034 = AnonymousClass03U.A00();
                    C03270Fn A0035 = C03270Fn.A00();
                    AnonymousClass038 A0036 = AnonymousClass038.A00();
                    C02090Ap A0037 = C02090Ap.A00();
                    C03280Fo A0038 = C03280Fo.A00();
                    C03290Fp A0039 = C03290Fp.A00();
                    C28991Wn A0040 = C28991Wn.A00();
                    C014508d A0041 = C014508d.A00();
                    AnonymousClass04j A0042 = AnonymousClass04j.A00();
                    C03300Fq A0043 = C03300Fq.A00();
                    AnonymousClass00D A0044 = AnonymousClass00D.A00();
                    C03310Fr r59 = C03310Fr.A00;
                    C03320Fs r60 = C03320Fs.A00;
                    AbstractC29211Xn A0045 = AbstractC29211Xn.A00();
                    if (C03330Ft.A0N == null) {
                        synchronized (C03330Ft.class) {
                            if (C03330Ft.A0N == null) {
                                if (C07360Xg.A05 == null) {
                                    synchronized (C07360Xg.class) {
                                        if (C07360Xg.A05 == null) {
                                            C07360Xg.A05 = new C07360Xg(AnonymousClass0AR.A00(), AnonymousClass0DH.A00(), AnonymousClass0EO.A00(), C04510Kq.A00(), C014508d.A00());
                                        }
                                    }
                                }
                                C07360Xg r63 = C07360Xg.A05;
                                if (AnonymousClass0XF.A04 == null) {
                                    synchronized (AnonymousClass0XF.class) {
                                        if (AnonymousClass0XF.A04 == null) {
                                            AnonymousClass0XF.A04 = new AnonymousClass0XF(r9, AnonymousClass0AR.A00(), AnonymousClass0IZ.A01());
                                        }
                                    }
                                }
                                AnonymousClass0XF r64 = AnonymousClass0XF.A04;
                                C02430Bz A0046 = C02430Bz.A00();
                                if (C07320Xb.A0J == null) {
                                    synchronized (C07320Xb.class) {
                                        if (C07320Xb.A0J == null) {
                                            AnonymousClass00S A0047 = AnonymousClass00S.A00();
                                            C002701k A0048 = C002701k.A00();
                                            AnonymousClass02M A0049 = AnonymousClass02M.A00();
                                            AnonymousClass009 A0050 = AnonymousClass009.A00();
                                            AnonymousClass00T A0051 = C002101e.A00();
                                            AnonymousClass0AR A0052 = AnonymousClass0AR.A00();
                                            C000300f A0053 = C000300f.A00();
                                            AnonymousClass09G A0054 = AnonymousClass09G.A00();
                                            AnonymousClass01A A0055 = AnonymousClass01A.A00();
                                            AnonymousClass0EW r77 = AnonymousClass0EW.A01;
                                            if (C07330Xc.A02 == null) {
                                                synchronized (C07330Xc.class) {
                                                    if (C07330Xc.A02 == null) {
                                                        C03170Fb A0056 = C03170Fb.A00();
                                                        AnonymousClass0AR A0057 = AnonymousClass0AR.A00();
                                                        AbstractC29211Xn.A00();
                                                        C07330Xc.A02 = new C07330Xc(A0056, A0057);
                                                    }
                                                }
                                            }
                                            C07320Xb.A0J = new C07320Xb(r9, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055, r77, C07330Xc.A02, AnonymousClass08B.A00, C04090Iz.A01, C07340Xd.A00(), AnonymousClass0ET.A00(), C02090Ap.A00(), AnonymousClass0XP.A01(), AnonymousClass03O.A00());
                                        }
                                    }
                                }
                                C07320Xb r66 = C07320Xb.A0J;
                                if (C07470Xu.A07 == null) {
                                    synchronized (C07470Xu.class) {
                                        if (C07470Xu.A07 == null) {
                                            C07470Xu.A07 = new C07470Xu(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass0AR.A00(), AnonymousClass0EO.A00(), AnonymousClass0EQ.A00(), C015808q.A00(), AnonymousClass091.A00());
                                        }
                                    }
                                }
                                C07470Xu r67 = C07470Xu.A07;
                                if (C07480Xv.A03 == null) {
                                    synchronized (C07480Xv.class) {
                                        if (C07480Xv.A03 == null) {
                                            C07480Xv.A03 = new C07480Xv(AnonymousClass0AR.A00(), AnonymousClass0DH.A00(), AnonymousClass0KJ.A00());
                                        }
                                    }
                                }
                                C07480Xv r68 = C07480Xv.A03;
                                if (C07490Xw.A03 == null) {
                                    synchronized (C07490Xw.class) {
                                        if (C07490Xw.A03 == null) {
                                            C07490Xw.A03 = new C07490Xw(AnonymousClass0AR.A00(), C02750Dh.A00(), C28991Wn.A00());
                                        }
                                    }
                                }
                                C07490Xw r69 = C07490Xw.A03;
                                AnonymousClass09M A0058 = AnonymousClass09M.A00();
                                if (C07390Xl.A0D == null) {
                                    synchronized (C07390Xl.class) {
                                        if (C07390Xl.A0D == null) {
                                            C07390Xl.A0D = new C07390Xl(AnonymousClass00S.A00(), C002101e.A00(), AnonymousClass0AR.A00(), AnonymousClass09G.A00(), C01970Ad.A00(), AnonymousClass01K.A00(), C02010Ah.A00(), AnonymousClass01R.A01(), C02040Ak.A00(), C04550Ku.A00(), AnonymousClass0GR.A00(), C07400Xm.A00());
                                        }
                                    }
                                }
                                C07390Xl r71 = C07390Xl.A0D;
                                if (C07420Xo.A0I == null) {
                                    synchronized (C07420Xo.class) {
                                        if (C07420Xo.A0I == null) {
                                            AnonymousClass00S A0059 = AnonymousClass00S.A00();
                                            AnonymousClass02M A0060 = AnonymousClass02M.A00();
                                            AnonymousClass009 A0061 = AnonymousClass009.A00();
                                            AnonymousClass00T A0062 = C002101e.A00();
                                            AnonymousClass00Y A0063 = AnonymousClass00Y.A00();
                                            AnonymousClass0AR A0064 = AnonymousClass0AR.A00();
                                            AnonymousClass09H A014 = AnonymousClass09H.A01();
                                            AnonymousClass08B r80 = AnonymousClass08B.A00;
                                            AnonymousClass01K A0065 = AnonymousClass01K.A00();
                                            C07430Xq r82 = C07430Xq.A00;
                                            if (AnonymousClass3P8.A00 == null) {
                                                synchronized (AnonymousClass3P8.class) {
                                                    if (AnonymousClass3P8.A00 == null) {
                                                        AnonymousClass3P8.A00 = new AnonymousClass3P8();
                                                    }
                                                }
                                            }
                                            C07420Xo.A0I = new C07420Xo(A0059, A0060, A0061, A0062, A0063, A0064, A014, r80, A0065, r82, AnonymousClass3P8.A00, AnonymousClass0HN.A00(), C04520Kr.A00(), AnonymousClass0HL.A00(), AnonymousClass01P.A00(), AnonymousClass00D.A00(), C017109d.A00(), C017009c.A00());
                                        }
                                    }
                                }
                                C07420Xo r72 = C07420Xo.A0I;
                                if (AnonymousClass0XI.A09 == null) {
                                    synchronized (AnonymousClass0XI.class) {
                                        if (AnonymousClass0XI.A09 == null) {
                                            AnonymousClass0XI.A09 = new AnonymousClass0XI(AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass0AR.A00(), AnonymousClass01J.A00(), AnonymousClass09H.A01(), C001400w.A02, C03250Fl.A00(), C001000o.A00(), AnonymousClass01S.A00());
                                        }
                                    }
                                }
                                AnonymousClass0XI r73 = AnonymousClass0XI.A09;
                                if (C07500Xx.A01 == null) {
                                    synchronized (C07500Xx.class) {
                                        if (C07500Xx.A01 == null) {
                                            C07500Xx.A01 = new C07500Xx(AnonymousClass0HE.A00());
                                        }
                                    }
                                }
                                C07500Xx r74 = C07500Xx.A01;
                                if (C07450Xs.A0C == null) {
                                    synchronized (C07450Xs.class) {
                                        if (C07450Xs.A0C == null) {
                                            C07450Xs.A0C = new C07450Xs(AnonymousClass02M.A00(), C03490Gl.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass0AR.A00(), AnonymousClass0GG.A00(), C04510Kq.A00(), AnonymousClass0EV.A00(), AnonymousClass00D.A00(), AnonymousClass0I8.A01(), AnonymousClass0I4.A00(), C02430Bz.A00());
                                        }
                                    }
                                }
                                C07450Xs r75 = C07450Xs.A0C;
                                AnonymousClass0XD A0066 = AnonymousClass0XD.A00();
                                if (C07460Xt.A0L == null) {
                                    synchronized (C07460Xt.class) {
                                        if (C07460Xt.A0L == null) {
                                            C07460Xt.A0L = new C07460Xt(AnonymousClass02M.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass0AR.A00(), AnonymousClass0DH.A00(), AnonymousClass09H.A01(), AnonymousClass01A.A00(), AnonymousClass0EW.A01, r37, AnonymousClass0I5.A00(), AnonymousClass08B.A00, AnonymousClass0AT.A03, AnonymousClass09A.A02, AnonymousClass08C.A00(), AnonymousClass0HN.A00(), C03120Ew.A00(), C03290Fp.A00(), AnonymousClass0EV.A00(), AnonymousClass0ES.A00(), AnonymousClass0I9.A00(), AnonymousClass0IB.A00());
                                        }
                                    }
                                }
                                C07460Xt r772 = C07460Xt.A0L;
                                if (AnonymousClass0XE.A02 == null) {
                                    synchronized (AnonymousClass0XE.class) {
                                        if (AnonymousClass0XE.A02 == null) {
                                            AnonymousClass0XE.A02 = new AnonymousClass0XE(C002101e.A00(), AnonymousClass03U.A00());
                                        }
                                    }
                                }
                                AnonymousClass0XE r78 = AnonymousClass0XE.A02;
                                if (AnonymousClass0XH.A0A == null) {
                                    synchronized (AnonymousClass0XH.class) {
                                        if (AnonymousClass0XH.A0A == null) {
                                            AnonymousClass0XH.A0A = new AnonymousClass0XH(AnonymousClass009.A00(), AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass0AR.A00(), AnonymousClass01A.A00(), AnonymousClass01K.A00(), AnonymousClass0AP.A00(), AnonymousClass08C.A00(), AnonymousClass0EY.A00(), AnonymousClass01R.A01());
                                        }
                                    }
                                }
                                C03330Ft.A0N = new C03330Ft(r63, r64, A0046, r66, r67, r68, r69, A0058, r71, r72, r73, r74, r75, A0066, r772, r78, AnonymousClass0XH.A0A, new C02180Ay(C57712kk.A00, null), new C02180Ay(C57752ko.A00, null), new C02180Ay(C57732km.A00, null), new C02180Ay(C57782kr.A00, null), new C02180Ay(C57792ks.A00, null));
                            }
                        }
                    }
                    C03330Ft r62 = C03330Ft.A0N;
                    if (AnonymousClass2VK.A05 == null) {
                        synchronized (AnonymousClass2VK.class) {
                            if (AnonymousClass2VK.A05 == null) {
                                AnonymousClass2VK.A05 = new AnonymousClass2VK(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass00Y.A00(), C28991Wn.A00());
                            }
                        }
                    }
                    A1b = new C03160Fa(r9, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, r25, A0017, A0018, A0019, A012, A0020, r31, A0021, A0022, A0023, A0024, A013, r37, A0025, A0026, A0027, A0028, A0029, A0030, r44, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, r59, r60, A0045, r62, AnonymousClass2VK.A05, C03340Fu.A00(), AnonymousClass03C.A00(), C017009c.A00(), AnonymousClass09L.A00(), C014708f.A00(), AnonymousClass0C2.A00(), AnonymousClass09M.A00(), C03350Fv.A00(), AnonymousClass0EU.A03);
                }
            }
        }
        return A1b;
    }

    public void A01() {
        Log.d("xmpp/handler/start");
        Message obtain = Message.obtain(null, 0, 0, 0);
        obtain.getData().putBoolean("should_register", true);
        this.A11.sendMessage(obtain);
    }

    public void A02() {
        synchronized (this.A0H) {
            Log.i("xmpp/handler/logout-timer/reset");
            if (A0I()) {
                A06();
            }
        }
    }

    public final void A03() {
        Application application = this.A0f.A00;
        synchronized (this.A0H) {
            Log.i("xmpp/handler/logout-timer/cancel");
            PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent("com.whatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.whatsapp"), 536870912);
            if (broadcast != null) {
                AlarmManager A022 = this.A0c.A02();
                if (A022 != null) {
                    A022.cancel(broadcast);
                } else {
                    Log.w("MessageHandler/cancelLogoutTimer AlarmManager is null");
                }
                broadcast.cancel();
            }
        }
    }

    public final void A04() {
        synchronized (this.A1T) {
            C03380Fy r2 = this.A0x;
            boolean z = false;
            if (!A0H()) {
                z = true;
            }
            r2.A00(z);
        }
    }

    public final void A05() {
        if (!this.A1X) {
            Log.i("xmpp/handler/start");
            this.A1X = true;
            AnonymousClass0G8 r12 = new AnonymousClass0G8(this.A10, this.A0e, this.A0n, this.A0m, this.A0O, this.A0Q, this.A0X, this.A0f, this.A0U, this.A0W, this.A0q, this.A1R, this.A1S, this.A0V, this.A0K, this.A0L, this.A1O, this.A1H, this.A1D, this.A1Q, this.A15, this.A0a, this, this.A0c, this.A0i, this.A0u, this.A1G, this.A1B, this.A1C, this.A0j, AnonymousClass0EO.A00(), this.A0R, this.A0T, this.A13, this.A1J, this.A1N, this.A0p, this.A0l, this.A0r, this.A0M, this.A18, this.A0k, this.A0b, this.A1E, this.A0h, this.A1F, this.A0N, this.A1M, this.A17, this.A19, this.A1A, this.A0Z, AnonymousClass01S.A00(), this.A1I, this.A16);
            this.A09 = r12;
            r12.start();
        }
    }

    public final void A06() {
        Application application = this.A0f.A00;
        synchronized (this.A0H) {
            Log.i("xmpp/handler/logout-timer/start");
            AlarmManager A022 = this.A0c.A02();
            if (A022 != null) {
                PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent("com.whatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.whatsapp"), 134217728);
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A022.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + 600000, broadcast);
                } else if (i >= 19) {
                    A022.setExact(2, SystemClock.elapsedRealtime() + 600000, broadcast);
                } else {
                    A022.set(2, SystemClock.elapsedRealtime() + 600000, broadcast);
                }
            } else {
                Log.w("MessageHandler/startLogoutTimer AlarmManager is null");
            }
        }
    }

    public void A07(int i) {
        Log.d("message-handler/actionReconnect forced");
        Message obtain = Message.obtain(null, 0, 2, 0);
        obtain.getData().putBoolean("force", true);
        obtain.getData().putInt("connect_reason", i);
        this.A11.sendMessage(obtain);
    }

    public final void A08(int i, boolean z) {
        AnonymousClass02N r0;
        boolean containsKey;
        Application application = this.A0f.A00;
        synchronized (this.A1T) {
            this.A0v.A00(false);
            if (!this.A0D && Build.VERSION.SDK_INT < 29) {
                this.A0D = this.A12.isConnected();
                Log.i("xmpp/handler/handleConnected setting isNetworkUp to true");
            }
            this.A00 = i;
            AnonymousClass0KY r9 = this.A06;
            AnonymousClass00E.A01();
            r9.A0t.A03();
            AnonymousClass09K r4 = r9.A0I;
            r4.A03 = false;
            r4.A02 = true;
            r4.A05 = z;
            AnonymousClass00E.A01();
            synchronized (r4) {
                for (C41391ux r02 : r4.A04) {
                    r02.A00();
                }
            }
            C04220Jn r1 = r9.A04;
            r1.A00 = false;
            r9.A02.A02 = false;
            r1.A01 = false;
            AnonymousClass09J r5 = r9.A0d;
            Map map = r5.A01;
            synchronized (map) {
                map.clear();
            }
            C04540Kt r12 = r9.A0A;
            synchronized (r12) {
                r12.A06.clear();
            }
            C03250Fl r3 = r9.A07;
            synchronized (r3) {
                r3.A02 = false;
                r3.A00 = 0;
                r3.A06(0);
            }
            r9.A03();
            AnonymousClass0CT r03 = r9.A0p;
            r03.A02 = true;
            r03.A06();
            AnonymousClass00T r32 = r9.A0u;
            r32.ANF(new RunnableEBaseShape1S0100000_I0_1(r9, 20));
            r32.ANF(new RunnableEBaseShape1S0100000_I0_1(r9, 24));
            C014508d r11 = r9.A0V;
            if (r11.A00) {
                C04420Kh r14 = r9.A0b;
                RunnableEBaseShape1S0100000_I0_1 runnableEBaseShape1S0100000_I0_1 = new RunnableEBaseShape1S0100000_I0_1(r9, 25);
                C04340Jz r13 = r14.A0E;
                synchronized (r13) {
                    r13.A03.clear();
                }
                ArrayList arrayList = new ArrayList();
                synchronized (r14.A0G) {
                    for (Map.Entry entry : r14.A0H.entrySet()) {
                        AnonymousClass0EL r122 = r14.A0C;
                        Object value = entry.getValue();
                        synchronized (r122) {
                            containsKey = r122.A01.containsKey(value);
                        }
                        if (containsKey) {
                            arrayList.addAll(Collections.unmodifiableList(((C40531tQ) entry.getKey()).A01));
                        }
                    }
                }
                C60592pm r123 = new C60592pm(r14, arrayList);
                r14.A0F.ANF(r123);
                ((C41191ud) r123).A01.A03(new C56442id(r14, arrayList, runnableEBaseShape1S0100000_I0_1), r14.A0I);
            }
            AnonymousClass09H r132 = r9.A0e;
            AnonymousClass09I r04 = r132.A06;
            if (r04 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = r04.A00;
                synchronized (linkedHashMap2) {
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        if (((Integer) ((Pair) entry2.getValue()).second).intValue() < 3) {
                            linkedHashMap.put(entry2.getKey(), ((Pair) entry2.getValue()).first);
                        } else {
                            it.remove();
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("unacked-messages/getUnackedMessages: ");
                    sb.append(linkedHashMap.size());
                    Log.i(sb.toString());
                }
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    r132.A0A((Message) entry3.getValue(), (String) entry3.getKey(), true);
                }
                AnonymousClass0I5 r124 = r9.A0B;
                if (r124 != null) {
                    Set set = r124.A05;
                    HashSet hashSet = new HashSet(set);
                    set.clear();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        r124.A06((AnonymousClass02N) it2.next());
                    }
                    List<AnonymousClass1WH> list = r5.A00;
                    synchronized (list) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("in-flight-messages/for-each/send-pending-requests: ");
                        sb2.append(list.size());
                        Log.i(sb2.toString());
                        for (AnonymousClass1WH r05 : list) {
                            String str = r05.A01;
                            Message message = r05.A00;
                            if (r05.A02) {
                                r132.A0A(message, str, true);
                            } else {
                                r132.A0A(message, str, false);
                            }
                        }
                        list.clear();
                    }
                    AnonymousClass0Fk r10 = r9.A09;
                    boolean z2 = false;
                    if (r10.A00 == 3) {
                        z2 = true;
                    }
                    if (!z2) {
                        AnonymousClass1LF r15 = (AnonymousClass1LF) Conversation.A4n.get();
                        if (r15.A02 && (r0 = (AnonymousClass02N) r15.A00().A0z.A02(AnonymousClass02N.class)) != null) {
                            r124.A06(r0);
                        }
                    }
                    boolean z3 = r4.A01;
                    boolean z4 = false;
                    if (r10.A00 == 3) {
                        z4 = true;
                    }
                    if (z3 == z4) {
                        if (!z4) {
                            AnonymousClass0JR r06 = r9.A0C;
                            r06.A00 = true;
                            r06.A01();
                        } else {
                            AnonymousClass0JR r07 = r9.A0C;
                            r07.A00 = false;
                            r07.A02();
                        }
                    }
                    AnonymousClass00D r102 = r9.A0Q;
                    if (r102.A00.getBoolean("client_version_upgraded", false)) {
                        r11.A05();
                        if (r11.A01) {
                            r32.ANF(new RunnableEBaseShape1S0100000_I0_1(r9, 21));
                            r32.ANF(new RunnableEBaseShape1S0100000_I0_1(r9, 22));
                        }
                        r32.ANF(new RunnableEBaseShape1S0100000_I0_1(r9, 23));
                        AnonymousClass0DH r16 = r9.A0K;
                        if (r16.A0L()) {
                            r16.A0N.ANF(new RunnableEBaseShape2S0100000_I0_2(r16.A0E, 23));
                        }
                        AnonymousClass008.A0j(r102, "client_version_upgraded");
                    }
                    C03170Fb r103 = r9.A0F;
                    synchronized (r103) {
                        SharedPreferences sharedPreferences = r103.A02.A00;
                        int i2 = sharedPreferences.getInt("tos_v2_current_stage_id", 0);
                        if (i2 != 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("tos_v2_stage_start_ack");
                            sb3.append(i2);
                            if (!sharedPreferences.getBoolean(sb3.toString(), false) && r103.A03.A0C(Message.obtain(null, 0, 99, i2))) {
                                AnonymousClass008.A0v("tosupdate/send/stage ", i2);
                            }
                        }
                        if (sharedPreferences.getLong("tos_v2_accepted_time", 0) != 0 && !sharedPreferences.getBoolean("tos_v2_accepted_ack", false)) {
                            r103.A03();
                        }
                    }
                    r9.A0c.A02(true);
                    AnonymousClass00Y r52 = r9.A0Y;
                    StringBuilder sb4 = new StringBuilder("wamruntime/send/force=");
                    sb4.append(false);
                    Log.d(sb4.toString());
                    RunnableEBaseShape0S0110000_I0 runnableEBaseShape0S0110000_I0 = new RunnableEBaseShape0S0110000_I0(r52, false, 1);
                    AnonymousClass03J r33 = r52.A0F;
                    r33.A01.execute(runnableEBaseShape0S0110000_I0);
                    if (r52.A0K) {
                        int A022 = r52.A02(false);
                        if (A022 > 0) {
                            r33.A02.A02(new RunnableEBaseShape0S0111000_I0(r52, A022, false, 1), (long) (A022 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                        } else {
                            r33.A02.execute(new RunnableEBaseShape0S0110000_I0(r52, false, 2));
                        }
                    }
                    MessageService.A00(application);
                    if (A0H()) {
                        A06();
                    }
                    this.A1P.A02();
                    A04();
                    AnonymousClass0G3 r53 = this.A0t;
                    AnonymousClass0GA r42 = this.A0A;
                    r53.A04 = A0H();
                    r53.A08.post(new RunnableEBaseShape3S0200000_I0_2(r53, r42, 23));
                    this.A0g.A04(null, 10, "MessageHandler1");
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public void A09(boolean z) {
        AnonymousClass008.A1H("xmpp/service/stop/unregister:", z);
        this.A0Y.A06 = false;
        Message obtain = Message.obtain(null, 0, 1, 0);
        obtain.getData().putBoolean("should_unregister", z);
        this.A11.sendMessage(obtain);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r1 == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(boolean r12) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03160Fa.A0A(boolean):void");
    }

    public final void A0B(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A03;
        if (j <= 0 || elapsedRealtime >= j) {
            Application application = this.A0f.A00;
            if (this.A0F) {
                this.A1P.A03(this.A02);
                this.A0F = false;
            }
            AnonymousClass0CZ r0 = this.A1P;
            long A012 = r0.A01();
            this.A02 = r0.A00();
            long j2 = A012 * 10000;
            if (j2 == 0) {
                Log.i("xmpp/handler/schedule-reconnect/immediate");
                A07(0);
                return;
            }
            Random random = this.A1U;
            long nextLong = ((random.nextLong() & Long.MAX_VALUE) % j2) + (j2 / 2);
            if (z) {
                long j3 = A1Z;
                if (nextLong > j3) {
                    nextLong = ((long) (random.nextInt(60) - 30)) + j3;
                    Log.i("xmpp/handler/schedule-reconnect/backoff clamped to ~15mins");
                }
            }
            StringBuilder sb = new StringBuilder("xmpp/handler/schedule-reconnect/backoff:");
            sb.append(nextLong);
            Log.i(sb.toString());
            Intent intent = new Intent("com.whatsapp.MessageHandler.RECONNECT_ACTION").setPackage("com.whatsapp");
            intent.putExtra("connect_reason", 3);
            PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, intent, 0);
            AlarmManager A022 = this.A0c.A02();
            if (A022 != null) {
                long j4 = elapsedRealtime + nextLong;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A022.setExactAndAllowWhileIdle(2, j4, broadcast);
                } else if (i >= 19) {
                    A022.setExact(2, j4, broadcast);
                } else {
                    A022.set(2, j4, broadcast);
                }
                this.A03 = j4;
                return;
            }
            Log.w("MessageHandler/scheduleReconnect AlarmManager is null");
            this.A03 = 0;
            return;
        }
        Log.i("xmpp/handler/schedule-reconnect/already-pending");
    }

    public void A0C(boolean z, boolean z2) {
        Application application = this.A0f.A00;
        AlarmManager A022 = this.A0c.A02();
        if (A022 != null) {
            Intent intent = new Intent("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION").setPackage("com.whatsapp");
            if (!z) {
                PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, intent, 536870912);
                if (broadcast != null) {
                    Log.i("connectivity retry alarm canceled");
                    A022.cancel(broadcast);
                    broadcast.cancel();
                }
            } else if (!z2) {
                PendingIntent broadcast2 = PendingIntent.getBroadcast(application, 0, intent, 134217728);
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A022.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + 60000, broadcast2);
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + 60000;
                    if (i >= 19) {
                        A022.setExact(2, elapsedRealtime, broadcast2);
                    } else {
                        A022.set(2, elapsedRealtime, broadcast2);
                    }
                }
                Log.i("connectivity retry alarm set for 60000ms from now");
                return;
            }
        } else {
            Log.w("MessageHandler/onCaptivePortalDetectionAndWaitDone AlarmManager is null");
        }
        A1a.set(z);
        A1Y.countDown();
    }

    public final void A0D(boolean z, boolean z2, boolean z3) {
        A0F(z, z2, z3, false, false, null, null, 0);
    }

    public void A0E(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        A0G(z, z2, z3, z4, false, null, null, false, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 >= 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r0 != false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, java.lang.String r16, java.lang.String r17, int r18) {
        /*
        // Method dump skipped, instructions count: 445
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03160Fa.A0F(boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, int):void");
    }

    public void A0G(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, int i) {
        StringBuilder sb = new StringBuilder("message-handler/actionReconnect force:");
        sb.append(z);
        sb.append(" reason:");
        sb.append(i);
        Log.d(sb.toString());
        Message obtain = Message.obtain(null, 0, 2, 0);
        obtain.getData().putBoolean("force", z);
        obtain.getData().putBoolean("force_no_ongoing_backoff", z2);
        obtain.getData().putBoolean("reset", z3);
        obtain.getData().putBoolean("check_connection", z4);
        obtain.getData().putBoolean("notify_on_failure", z5);
        obtain.getData().putString("ip_address", str);
        obtain.getData().putString("cl_sess", str2);
        obtain.getData().putBoolean("fgservice", z6);
        obtain.getData().putInt("connect_reason", i);
        this.A11.sendMessage(obtain);
    }

    public boolean A0H() {
        SharedPreferences sharedPreferences = this.A0h.A00;
        return !this.A0V.A0D(AbstractC000400g.A0z) && sharedPreferences.contains("c2dm_reg_id") && sharedPreferences.getInt("logins_with_messages", 0) < 3;
    }

    public final boolean A0I() {
        boolean z;
        synchronized (this.A0H) {
            z = false;
            if (PendingIntent.getBroadcast(this.A0f.A00, 0, new Intent("com.whatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.whatsapp"), 536870912) != null) {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("xmpp/handler/logout-timer/has=");
            sb.append(z);
            Log.i(sb.toString());
        }
        return z;
    }
}
