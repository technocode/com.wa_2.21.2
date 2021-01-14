package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.whatsapp.data.ConversationDeleteService;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.01K  reason: invalid class name */
public class AnonymousClass01K {
    public static volatile AnonymousClass01K A1R;
    public AnonymousClass0DF A00;
    public final AnonymousClass09F A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass088 A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass01I A05;
    public final AnonymousClass0AH A06;
    public final AnonymousClass09T A07;
    public final AnonymousClass09G A08;
    public final AnonymousClass0B3 A09;
    public final C000300f A0A;
    public final AnonymousClass01J A0B;
    public final AnonymousClass01A A0C;
    public final AnonymousClass03P A0D;
    public final AnonymousClass00S A0E;
    public final AnonymousClass00G A0F;
    public final AnonymousClass00D A0G;
    public final AnonymousClass09A A0H;
    public final C019209y A0I;
    public final AnonymousClass09V A0J;
    public final C017609i A0K;
    public final AnonymousClass0A4 A0L;
    public final C014408c A0M;
    public final C006903j A0N;
    public final AnonymousClass0A8 A0O;
    public final AnonymousClass0A9 A0P;
    public final C015508n A0Q;
    public final C02100Aq A0R;
    public final C019309z A0S;
    public final AnonymousClass0A3 A0T;
    public final AnonymousClass0A2 A0U;
    public final AnonymousClass0A0 A0V;
    public final C02120As A0W;
    public final AnonymousClass0AM A0X;
    public final C017309f A0Y;
    public final C018509r A0Z;
    public final AnonymousClass01T A0a;
    public final AnonymousClass0AB A0b;
    public final C015308l A0c;
    public final AnonymousClass0B6 A0d;
    public final C02070An A0e;
    public final C018209o A0f;
    public final AnonymousClass09Q A0g;
    public final AnonymousClass09Z A0h;
    public final C017709j A0i;
    public final C017909l A0j;
    public final C017809k A0k;
    public final AnonymousClass0B2 A0l;
    public final AnonymousClass0AC A0m;
    public final C014608e A0n;
    public final AnonymousClass094 A0o;
    public final C014508d A0p;
    public final C018409q A0q;
    public final C017409g A0r;
    public final AnonymousClass0A7 A0s;
    public final C016809a A0t;
    public final C02090Ap A0u;
    public final AnonymousClass0B0 A0v;
    public final AnonymousClass0A1 A0w;
    public final C018109n A0x;
    public final C015408m A0y;
    public final C017509h A0z;
    public final AnonymousClass01N A10;
    public final C019009w A11;
    public final AnonymousClass095 A12;
    public final AnonymousClass096 A13;
    public final AnonymousClass0B1 A14;
    public final C02110Ar A15;
    public final AnonymousClass098 A16;
    public final C015708p A17;
    public final AnonymousClass0B5 A18;
    public final AnonymousClass09E A19;
    public final AnonymousClass09S A1A;
    public final C018309p A1B;
    public final AnonymousClass09X A1C;
    public final AnonymousClass09Y A1D;
    public final C016909b A1E;
    public final C019109x A1F;
    public final C018709t A1G;
    public final C015808q A1H;
    public final C28991Wn A1I;
    public final AnonymousClass0BA A1J;
    public final C02130At A1K;
    public final C01970Ad A1L;
    public final AnonymousClass0AL A1M;
    public final AnonymousClass01R A1N;
    public final C002401h A1O;
    public final AnonymousClass1YK A1P;
    public final Map A1Q;

    public AnonymousClass01K(AnonymousClass00G r4, AnonymousClass00S r5, AnonymousClass02M r6, C015308l r7, C014408c r8, AnonymousClass009 r9, AnonymousClass01I r10, C006903j r11, AnonymousClass088 r12, AnonymousClass095 r13, C002401h r14, C000300f r15, AnonymousClass098 r16, AnonymousClass09E r17, AnonymousClass09F r18, C018709t r19, AnonymousClass09G r20, AnonymousClass01J r21, AnonymousClass01A r22, AnonymousClass0A9 r23, AnonymousClass0AB r24, AnonymousClass0AH r25, AnonymousClass03P r26, AnonymousClass0AL r27, AnonymousClass0AM r28, C01970Ad r29, AnonymousClass0A4 r30, C02070An r31, AnonymousClass09Q r32, AnonymousClass0AC r33, AnonymousClass09T r34, AnonymousClass09X r35, C015808q r36, C016809a r37, C015408m r38, C015708p r39, C016909b r40, AnonymousClass09A r41, AnonymousClass09V r42, C017309f r43, C014608e r44, C017409g r45, C017509h r46, C02090Ap r47, AnonymousClass01N r48, AnonymousClass09S r49, C017609i r50, C015508n r51, C02100Aq r52, C28991Wn r53, C017809k r54, C014508d r55, C018109n r56, C019009w r57, C02110Ar r58, AnonymousClass00D r59, C017709j r60, C02120As r61, C018209o r62, AnonymousClass096 r63, AnonymousClass01R r64, C018309p r65, C019109x r66, C019209y r67, AnonymousClass0A8 r68, C019309z r69, AnonymousClass0A0 r70, AnonymousClass09Z r71, C02130At r72, AnonymousClass0B0 r73, AnonymousClass0B1 r74, AnonymousClass09Y r75, C018409q r76, C018509r r77, AnonymousClass01T r78, AnonymousClass0A1 r79, AnonymousClass0A2 r80, AnonymousClass0B2 r81, AnonymousClass0B3 r82, AnonymousClass0A3 r83, AnonymousClass094 r84, AnonymousClass0B5 r85, AnonymousClass0B6 r86, AnonymousClass0BA r87, AnonymousClass0A7 r88, AnonymousClass1YK r89) {
        this.A0F = r4;
        this.A0E = r5;
        this.A04 = r6;
        this.A0c = r7;
        this.A0M = r8;
        this.A02 = r9;
        this.A05 = r10;
        this.A0N = r11;
        this.A03 = r12;
        this.A12 = r13;
        this.A1O = r14;
        this.A0A = r15;
        this.A16 = r16;
        this.A19 = r17;
        this.A01 = r18;
        this.A1G = r19;
        this.A08 = r20;
        this.A0B = r21;
        this.A0C = r22;
        this.A0P = r23;
        this.A0b = r24;
        this.A06 = r25;
        this.A0D = r26;
        this.A1M = r27;
        this.A0X = r28;
        this.A1L = r29;
        this.A0L = r30;
        this.A0e = r31;
        this.A0g = r32;
        this.A0m = r33;
        this.A07 = r34;
        this.A1C = r35;
        this.A1H = r36;
        this.A0t = r37;
        this.A0y = r38;
        this.A17 = r39;
        this.A1E = r40;
        this.A0H = r41;
        this.A0J = r42;
        this.A0Y = r43;
        this.A0n = r44;
        this.A0r = r45;
        this.A0z = r46;
        this.A0u = r47;
        this.A10 = r48;
        this.A1A = r49;
        this.A0K = r50;
        this.A0Q = r51;
        this.A0R = r52;
        this.A1I = r53;
        this.A0k = r54;
        this.A0x = r56;
        this.A11 = r57;
        this.A15 = r58;
        this.A0G = r59;
        this.A0i = r60;
        this.A0p = r55;
        this.A0W = r61;
        this.A0f = r62;
        this.A13 = r63;
        this.A1N = r64;
        this.A1B = r65;
        this.A1F = r66;
        this.A0I = r67;
        this.A0O = r68;
        this.A0S = r69;
        this.A0V = r70;
        this.A0h = r71;
        this.A1K = r72;
        this.A0v = r73;
        this.A14 = r74;
        this.A1D = r75;
        this.A0q = r76;
        this.A0Z = r77;
        this.A0a = r78;
        this.A0w = r79;
        this.A0U = r80;
        this.A0l = r81;
        this.A09 = r82;
        this.A0T = r83;
        this.A0o = r84;
        this.A18 = r85;
        this.A0d = r86;
        this.A1J = r87;
        this.A0s = r88;
        this.A1P = r89;
        this.A0j = r54.A01;
        this.A1Q = r54.A02;
        r28.A0K(new AnonymousClass0BU());
    }

    public static AnonymousClass01K A00() {
        if (A1R == null) {
            synchronized (AnonymousClass01K.class) {
                if (A1R == null) {
                    AnonymousClass00G r4 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    C015308l A004 = C015308l.A00();
                    C014408c A005 = C014408c.A00();
                    AnonymousClass009 A006 = AnonymousClass009.A00();
                    AnonymousClass01I A007 = AnonymousClass01I.A00();
                    C006903j A008 = C006903j.A00();
                    AnonymousClass088 A009 = AnonymousClass088.A00();
                    AnonymousClass095 A0010 = AnonymousClass095.A00();
                    C002401h A0011 = C002401h.A00();
                    C000300f A0012 = C000300f.A00();
                    AnonymousClass098 A0013 = AnonymousClass098.A00();
                    AnonymousClass09E A0014 = AnonymousClass09E.A00();
                    AnonymousClass09F A0015 = AnonymousClass09F.A00();
                    C018709t A012 = C018709t.A01();
                    AnonymousClass09G A0016 = AnonymousClass09G.A00();
                    AnonymousClass01J A0017 = AnonymousClass01J.A00();
                    AnonymousClass01A A0018 = AnonymousClass01A.A00();
                    AnonymousClass0A9 A0019 = AnonymousClass0A9.A00();
                    AnonymousClass0AB A0020 = AnonymousClass0AB.A00();
                    AnonymousClass0AH A032 = AnonymousClass0AH.A03();
                    AnonymousClass03P A0021 = AnonymousClass03P.A00();
                    AnonymousClass0AL A013 = AnonymousClass0AL.A01();
                    AnonymousClass0AM A0022 = AnonymousClass0AM.A00();
                    C01970Ad A0023 = C01970Ad.A00();
                    AnonymousClass0A4 A0024 = AnonymousClass0A4.A00();
                    C02070An A0025 = C02070An.A00();
                    AnonymousClass09Q A0026 = AnonymousClass09Q.A00();
                    AnonymousClass0AC r33 = AnonymousClass0AC.A00;
                    AnonymousClass09T A0027 = AnonymousClass09T.A00();
                    AnonymousClass09X A0028 = AnonymousClass09X.A00();
                    C015808q A0029 = C015808q.A00();
                    C016809a A0030 = C016809a.A00();
                    C015408m A0031 = C015408m.A00();
                    C015708p A0032 = C015708p.A00();
                    C016909b A0033 = C016909b.A00();
                    AnonymousClass09A r41 = AnonymousClass09A.A02;
                    AnonymousClass09V A0034 = AnonymousClass09V.A00();
                    C017309f A0035 = C017309f.A00();
                    C014608e r44 = C014608e.A01;
                    C017409g A0036 = C017409g.A00();
                    C017509h A0037 = C017509h.A00();
                    C02090Ap A0038 = C02090Ap.A00();
                    AnonymousClass01N A0039 = AnonymousClass01N.A00();
                    AnonymousClass09S A0040 = AnonymousClass09S.A00();
                    C017609i A0041 = C017609i.A00();
                    C015508n A0042 = C015508n.A00();
                    C02100Aq A0043 = C02100Aq.A00();
                    C28991Wn A0044 = C28991Wn.A00();
                    C017809k A0045 = C017809k.A00();
                    C014508d A0046 = C014508d.A00();
                    C018109n A0047 = C018109n.A00();
                    C019009w A0048 = C019009w.A00();
                    C02110Ar A0049 = C02110Ar.A00();
                    AnonymousClass00D A0050 = AnonymousClass00D.A00();
                    C017709j A0051 = C017709j.A00();
                    C02120As A0052 = C02120As.A00();
                    C018209o A0053 = C018209o.A00();
                    AnonymousClass096 A0054 = AnonymousClass096.A00();
                    AnonymousClass01R A014 = AnonymousClass01R.A01();
                    C018309p A0055 = C018309p.A00();
                    C019109x A0056 = C019109x.A00();
                    C019209y A0057 = C019209y.A00();
                    AnonymousClass0A8 r68 = AnonymousClass0A8.A00;
                    C019309z A015 = C019309z.A01();
                    AnonymousClass0A0 A0058 = AnonymousClass0A0.A00();
                    AnonymousClass09Z A016 = AnonymousClass09Z.A01();
                    C02130At A0059 = C02130At.A00();
                    AnonymousClass0B0 A0060 = AnonymousClass0B0.A00();
                    AnonymousClass0B1 A0061 = AnonymousClass0B1.A00();
                    AnonymousClass09Y A0062 = AnonymousClass09Y.A00();
                    C018409q A0063 = C018409q.A00();
                    C018509r A0064 = C018509r.A00();
                    AnonymousClass01T A0065 = AnonymousClass01T.A00();
                    AnonymousClass0A1 A0066 = AnonymousClass0A1.A00();
                    AnonymousClass0A2 A0067 = AnonymousClass0A2.A00();
                    AnonymousClass0B2 A0068 = AnonymousClass0B2.A00();
                    AnonymousClass0B3 A0069 = AnonymousClass0B3.A00();
                    AnonymousClass0A3 A0070 = AnonymousClass0A3.A00();
                    AnonymousClass094 A0071 = AnonymousClass094.A00();
                    if (AnonymousClass0B5.A0B == null) {
                        synchronized (AnonymousClass0B5.class) {
                            if (AnonymousClass0B5.A0B == null) {
                                AnonymousClass0B5.A0B = new AnonymousClass0B5(AnonymousClass00S.A00(), AnonymousClass01I.A00(), AnonymousClass09E.A00(), AnonymousClass01A.A00(), C001400w.A02, C001000o.A00(), AnonymousClass01L.A00(), AnonymousClass01P.A00(), C014508d.A00(), C015208k.A00(), AnonymousClass090.A00());
                            }
                        }
                    }
                    AnonymousClass0B5 r85 = AnonymousClass0B5.A0B;
                    AnonymousClass0B6 A0072 = AnonymousClass0B6.A00();
                    AnonymousClass0BA A0073 = AnonymousClass0BA.A00();
                    AnonymousClass0A7 A0074 = AnonymousClass0A7.A00();
                    if (AnonymousClass1YK.A06 == null) {
                        synchronized (AnonymousClass1YK.class) {
                            if (AnonymousClass1YK.A06 == null) {
                                AnonymousClass1YK.A06 = new AnonymousClass1YK(AnonymousClass00S.A00(), C000300f.A00(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01P.A00(), AnonymousClass01R.A01());
                            }
                        }
                    }
                    A1R = new AnonymousClass01K(r4, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A012, A0016, A0017, A0018, A0019, A0020, A032, A0021, A013, A0022, A0023, A0024, A0025, A0026, r33, A0027, A0028, A0029, A0030, A0031, A0032, A0033, r41, A0034, A0035, r44, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A014, A0055, A0056, A0057, r68, A015, A0058, A016, A0059, A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, r85, A0072, A0073, A0074, AnonymousClass1YK.A06);
                }
            }
        }
        return A1R;
    }

    public static boolean A01(File file) {
        File[] listFiles = file.listFiles();
        boolean z = false;
        if (listFiles != null) {
            boolean z2 = false;
            for (File file2 : listFiles) {
                if (file2.getName().equals(".nomedia")) {
                    z2 = true;
                } else if (file2.isDirectory()) {
                    z2 = A01(file2);
                } else {
                    file2.getPath();
                    C006803i.A0m(file2);
                }
            }
            z = z2;
        }
        file.getPath();
        if (!z) {
            C006803i.A0m(file);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        if (r1 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ae, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.AbstractC007503q r15) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A02(X.03q):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0225, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0229, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x052e, code lost:
        if (r0 == false) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0589, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x058d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0222, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(X.AbstractC007503q r35, int r36, boolean r37) {
        /*
        // Method dump skipped, instructions count: 1444
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A03(X.03q, int, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A04(long r6, long r8, long r10) {
        /*
            r5 = this;
            r2 = 5000(0x1388, float:7.006E-42)
            r0 = 4
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 0
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0 = 1
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r0 = 2
            r4[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0 = 3
            r4[r0] = r1
            X.08d r0 = r5.A0p
            X.0OQ r3 = r0.A03()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = X.AbstractC05370Og.A1D     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL"
            android.database.Cursor r0 = r2.A07(r1, r4, r0)     // Catch:{ all -> 0x0035 }
            r3.close()
            return r0
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A04(long, long, long):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0113, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0117, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.AnonymousClass1VY.A0Y(r21) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28511Up A05(X.AnonymousClass02N r21, long r22, int r24, long r25) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A05(X.02N, long, int, long):X.1Up");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (X.AnonymousClass1VY.A0Y(r18) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28511Up A06(X.AnonymousClass02N r18, long r19, int r21, long r22) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A06(X.02N, long, int, long):X.1Up");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1204:0x173e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1206:?, code lost:
        r33.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1207:0x1742, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c9, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02cc, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02cf, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d1, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r7.A05 < r65.A0E.A05()) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04d0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d4, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04d7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        r38.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04db, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x082d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r51.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0831, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0834, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        r50.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0838, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010f, code lost:
        if (((((long) r66.A02) * 1000) + r2.A0E) >= r7) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0acd, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0ad1, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0ad4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0ad8, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0afa, code lost:
        if (r5.A05(r1) == null) goto L_0x0afc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0bed, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0bf1, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0bf4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0bf8, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0c64, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0c68, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0c6b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0c6f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0d0b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0d0f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0d12, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0d16, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0dcb, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0dcf, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0dd2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0dd6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0e14, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0e18, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0e1b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0e1f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0ec1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0ec5, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0ec8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x0ecc, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x0f70, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x0f74, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x0f77, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:747:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x0f7b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01aa, code lost:
        if (r37 != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x0ff4, code lost:
        if (r3.A01 == 0) goto L_0x0ff6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:0x104e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:?, code lost:
        r37.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x1052, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x1055, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x1059, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:0x10fe, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:0x1102, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:835:0x1105, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:837:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:838:0x1109, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:865:0x11ac, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x11b0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:0x11b3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:875:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:876:0x11b7, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:910:0x1251, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:912:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:913:0x1255, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:918:0x1258, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:920:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:921:0x125c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:927:0x1260, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:929:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:930:0x1264, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:935:0x1267, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:937:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:938:0x126b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:957:0x12ac, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:958:0x12af, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:959:0x12b5, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:963:0x12bd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x12c0, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:965:0x12c3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:971:0x12fd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:972:0x12ff, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:973:0x1300, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("msgstore/end transaction ");
        r3.append(r67);
        com.whatsapp.util.Log.e(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:974:0x1318, code lost:
        if ((r4 instanceof android.database.sqlite.SQLiteConstraintException) != false) goto L_0x132e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:979:0x132d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0210, code lost:
        if (r2 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:980:0x132e, code lost:
        if (r67 != 0) goto L_0x1330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:981:0x1330, code lost:
        r5 = r65.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:982:0x1336, code lost:
        if (r5.A0O() != false) goto L_0x1338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:983:0x1338, code lost:
        r4 = r65.A0y;
        r4.A03("fts_ready", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:985:?, code lost:
        r0 = A07(r66, 0);
        r5.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:986:0x1347, code lost:
        r33.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:987:0x134a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:988:0x134b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:989:0x134c, code lost:
        r4.A03("fts_ready", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:990:0x1352, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:991:0x1353, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:131:0x0295, B:158:0x02f7] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:1040:0x141f  */
    /* JADX WARNING: Removed duplicated region for block: B:1064:0x14b3  */
    /* JADX WARNING: Removed duplicated region for block: B:1070:0x14e2  */
    /* JADX WARNING: Removed duplicated region for block: B:1134:0x1634  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x08a1  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x08d9  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x08e0  */
    /* JADX WARNING: Removed duplicated region for block: B:957:0x12ac A[ExcHandler: all (th java.lang.Throwable), Splitter:B:131:0x0295] */
    /* JADX WARNING: Removed duplicated region for block: B:958:0x12af A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:131:0x0295] */
    /* JADX WARNING: Removed duplicated region for block: B:972:0x12ff A[ExcHandler: SQLiteException (r4v24 'e' android.database.sqlite.SQLiteException A[CUSTOM_DECLARE]), Splitter:B:967:0x12c8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C28521Uq A07(X.AbstractC007503q r66, int r67) {
        /*
        // Method dump skipped, instructions count: 5972
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A07(X.03q, int):X.1Uq");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f4, code lost:
        if (r8 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1VC A08(X.AnonymousClass1VC r14) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A08(X.1VC):X.1VC");
    }

    public AbstractC007503q A09(AnonymousClass0MH r5) {
        if (r5 == null || r5.A08 == null || TextUtils.isEmpty(r5.A0H)) {
            return null;
        }
        return this.A0J.A05(new C007303n(r5.A08, r5.A0M, r5.A0H));
    }

    public Collection A0A(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC007503q A052 = this.A0J.A05((C007303n) it.next());
            if (A052 != null) {
                arrayList.add(A052);
            }
        }
        return arrayList;
    }

    public final void A0B() {
        File A092 = this.A03.A09();
        A01(A092);
        Uri contentUri = MediaStore.Files.getContentUri("external");
        ContentResolver A062 = this.A0D.A06();
        if (A062 == null) {
            Log.w("msgstore/delete-all-media cr=null");
            return;
        }
        try {
            A062.delete(contentUri, "_data LIKE ?||'%'", new String[]{A092.getAbsolutePath()});
        } catch (IllegalArgumentException | SecurityException | UnsupportedOperationException e) {
            Log.e("msgstore/delete-all-media", e);
        }
    }

    public void A0C(AnonymousClass02N r9) {
        int A012;
        C006903j r6 = this.A0N;
        C08560bL A052 = r6.A05(r9);
        if (A052 != null) {
            long A072 = this.A12.A07(r9);
            int nextInt = new Random().nextInt(999999) + 1;
            C08560bL A053 = r6.A05(r9);
            if (A053 != null) {
                synchronized (A053) {
                    A052.A0I();
                    A052.A07 = nextInt;
                    if (A072 != 1) {
                        AbstractC007503q A013 = this.A0J.A01(A072);
                        A052.A0O = A013;
                        if (A013 != null) {
                            if (!AnonymousClass0FI.A0U(A013)) {
                                A052.A0I = A072;
                            } else {
                                A052.A0O = null;
                            }
                            A052.A0G = A072;
                            A052.A0H = A072;
                            A052.A0F = A072;
                            A052.A0N = null;
                        }
                    }
                }
                C014408c r3 = this.A0M;
                if (!r3.A0G()) {
                    A012 = r3.A02(A052.A0F(null), A052.A0T);
                } else {
                    ContentValues A0G2 = A052.A0G(null);
                    AnonymousClass02N r2 = A052.A0T;
                    A012 = r3.A01(A0G2, r2);
                    if (A012 > 0) {
                        r3.A02(A052.A0F(null), r2);
                    } else {
                        A012 = 0;
                    }
                }
                AnonymousClass008.A0v("msgstore/updateChatListTable/updated:", A012);
                return;
            }
            throw null;
        }
    }

    public synchronized void A0D(AnonymousClass02N r6, UserJid userJid) {
        GroupJid groupJid;
        C01970Ad r0 = this.A1L;
        r0.A04();
        C018609s r1 = r0.A05;
        if (!AnonymousClass1VY.A0Y(r6)) {
            groupJid = null;
        } else if (r6 instanceof GroupJid) {
            groupJid = (GroupJid) r6;
        } else {
            groupJid = null;
        }
        Iterator it = ((ArrayList) r1.A0V(groupJid, userJid)).iterator();
        while (it.hasNext()) {
            AbstractC007503q A052 = this.A0J.A05((C007303n) it.next());
            if (!(A052 == null || A052.A0F == null)) {
                A052.A0F.A01 = 13;
                A052.A0F.A05 = this.A0E.A05();
                this.A0b.A01(A052, 16);
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x01e1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [X.01K] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0hZ] */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.0hZ] */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.0hg] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.03q] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.AnonymousClass02N r19, X.AnonymousClass1YN r20) {
        /*
        // Method dump skipped, instructions count: 508
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0E(X.02N, X.1YN):void");
    }

    public void A0F(AnonymousClass02N r5, boolean z) {
        AnonymousClass008.A12("msgstore/deletemsgs/service/jid ", r5);
        Handler handler = this.A0b.A01;
        Message.obtain(handler, 1, r5.getRawString()).sendToTarget();
        C28551Ut A052 = this.A0R.A05(r5, true, z);
        if (A052 != null) {
            Message.obtain(handler, 2, r5.getRawString()).sendToTarget();
            ConversationDeleteService.A00(this.A0F.A00, "action_delete", A052);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r5 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ba, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
        if (r0 != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        if (r0.A01 != 1) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass02N r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0G(X.02N, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0166, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0171, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C007303n r25, int r26, long r27) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0H(X.03n, int, long):void");
    }

    public void A0I(C007303n r4, AnonymousClass0MH r5) {
        StringBuilder A0S2 = AnonymousClass008.A0S("msgstore/updateMessagePaymentTransaction/PAY transactionStatus:");
        A0S2.append(r5.A01);
        A0S2.append(" for key:");
        A0S2.append(r4);
        Log.i(A0S2.toString());
        this.A0H.A01(new RunnableEBaseShape0S0300000_I0_0(this, r4, r5, 28), 28);
    }

    public void A0J(AbstractC007503q r3) {
        int i = -1;
        if (r3.A0v) {
            i = 22;
        }
        A0P(r3, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01fa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0280, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0284, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0310, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0314, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0421, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0425, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x055d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0561, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x06b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x06bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x06be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
        r23.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x06c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x06d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x06d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x06db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x06df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0180, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0184, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0187, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(X.AbstractC007503q r27) {
        /*
        // Method dump skipped, instructions count: 1760
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0K(X.03q):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0232, code lost:
        if (r9.A09(r29.A07()) == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0245, code lost:
        if (r1.contains(r0) == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x024b, code lost:
        if (r6 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x029b, code lost:
        if (X.AnonymousClass0FI.A0Y(r29) != false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03ae, code lost:
        if (r0 == false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x045f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0463, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0466, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x046a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.AbstractC007503q r29) {
        /*
        // Method dump skipped, instructions count: 1186
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0L(X.03q):void");
    }

    public void A0M(AbstractC007503q r6) {
        if (r6.A0p < 0) {
            StringBuilder A0S2 = AnonymousClass008.A0S("CoreMessageStore/updateMessageAsync/message must have row_id set; key=");
            A0S2.append(r6.A0n);
            AnonymousClass00E.A08(false, A0S2.toString());
        }
        A0Q(r6, -1);
    }

    public void A0N(AbstractC007503q r4) {
        AbstractC007503q A092 = r4.A09();
        boolean z = true;
        boolean z2 = false;
        if (A092 != null) {
            z2 = true;
        }
        AnonymousClass00E.A07(z2);
        int i = A092.A09;
        if (i != 2) {
            z = false;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("coremessagestore/updatemessagequote/quoted message type: ");
        A0S2.append(i);
        AnonymousClass00E.A0A(z, A0S2.toString());
        this.A0H.A01(new RunnableEBaseShape2S0200000_I0_1(this, r4, 25), 21);
    }

    public synchronized void A0O(AbstractC007503q r14) {
        AnonymousClass0MH r0 = r14.A0F;
        if (r0 != null && !TextUtils.isEmpty(r0.A0I)) {
            C01970Ad r02 = this.A1L;
            r02.A04();
            C018609s r6 = r02.A05;
            AnonymousClass0MH A0M2 = r6.A0M(r14.A0F.A0I, null);
            if (A0M2 != null) {
                AbstractC007503q A092 = A09(A0M2);
                if (r14.A0F.A0G()) {
                    int i = A0M2.A01;
                    C05900Qy r1 = r14.A0F.A06;
                    if (i != 18) {
                        C05900Qy r03 = A0M2.A06;
                        if (r03 != null && r03.equals(r1)) {
                            if (A092 != null) {
                                if (r14.A0F.A0L()) {
                                    A0M2.A01 = 17;
                                    A0M2.A05 = this.A0E.A05();
                                    A092.A0F = A0M2;
                                }
                                C007303n r7 = A092.A0n;
                                AnonymousClass0MH r8 = A092.A0F;
                                if (r8 == null) {
                                    throw null;
                                } else if (r6.A0d(r7, r8, i, 0, 0)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("msgStore/markPaymentRequestMessageFulfilled request message id: ");
                                    sb.append(A0M2.A0H);
                                    Log.i(C018809u.A01("CoreMessageStore", sb.toString()));
                                    this.A0b.A01(A092, 16);
                                }
                            } else {
                                if (r14.A0F.A0L()) {
                                    A0M2.A01 = 17;
                                    A0M2.A05 = this.A0E.A05();
                                }
                                if (r6.A0c(A0M2)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                                    sb2.append(A0M2.A0H);
                                    Log.i(C018809u.A01("CoreMessageStore", sb2.toString()));
                                    AnonymousClass0BA r3 = this.A1J;
                                    r3.A0A.ANF(new RunnableEBaseShape3S0200000_I0_2(r3, A0M2, 27));
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (A092 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                    sb3.append(A0M2.A0H);
                    sb3.append(" status: ");
                    sb3.append(r14.A0F.A01);
                    Log.i(C018809u.A01("CoreMessageStore", sb3.toString()));
                    this.A0b.A01(A092, 16);
                }
                this.A0X.A0N(A092, null);
            }
        }
    }

    public void A0P(AbstractC007503q r4, int i) {
        this.A0H.A01(new RunnableEBaseShape0S0201000_I0(this, i, r4, 10), 26);
    }

    public void A0Q(AbstractC007503q r4, int i) {
        StringBuilder A0S2 = AnonymousClass008.A0S("msgstore/update/jid ");
        C007303n r1 = r4.A0n;
        A0S2.append(r1.A00);
        A0S2.append(" ");
        A0S2.append(r1.A01);
        A0S2.append(" updateType:");
        A0S2.append(i);
        Log.d(A0S2.toString());
        this.A0H.A01(new RunnableEBaseShape0S0201000_I0(this, i, r4, 9), 22);
    }

    public final void A0R(AbstractC007503q r8, int i) {
        if (C003701u.A0D()) {
            this.A0m.A04(r8, i);
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass02M r0 = this.A04;
        r0.A02.post(new RunnableEBaseShape0S0301000_I0(this, r8, i, countDownLatch, 0));
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(e);
        }
    }

    public final void A0S(AbstractC007503q r3, AbstractC007503q r4) {
        this.A0k.A03(r4.A0n);
        A0X(Collections.singleton(r4), 2);
        if (r3.A0I != null) {
            this.A08.A02(AnonymousClass0ZG.A07(this.A1M, r3));
        }
        this.A08.A02(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(X.AbstractC007503q r13, java.lang.String r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0T(X.03q, java.lang.String, boolean):void");
    }

    public void A0U(AnonymousClass0M3 r5, boolean z) {
        File file;
        AnonymousClass0M4 r0 = r5.A02;
        if (r0 != null && (file = r0.A0F) != null) {
            byte b = r5.A0m;
            if ((b == 2 && ((AbstractC007503q) r5).A04 == 1) || b == 20) {
                z = true;
            }
            this.A09.A05(file, b, z, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x016e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0172, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0175, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0179, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x017c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0180, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(X.C04600Kz r12) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0V(X.0Kz):void");
    }

    public void A0W(Collection collection, int i) {
        StringBuilder A0S2 = AnonymousClass008.A0S("msgstore/deletemessages ");
        A0S2.append(collection.size());
        Log.i(A0S2.toString());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0k.A03(((AbstractC007503q) it.next()).A0n);
        }
        this.A0H.A01(new RunnableEBaseShape0S0201000_I0(this, i, collection, 12), 20);
    }

    public void A0X(Collection collection, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        boolean z = false;
        if ((i & 10) == 10) {
            z = true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC007503q r2 = (AbstractC007503q) it.next();
            int A032 = A03(r2, i, false);
            AnonymousClass02N r4 = r2.A0n.A00;
            hashMap.put(r4, Integer.valueOf(A032));
            if (z) {
                Long l = r2.A0R;
                if (l != null) {
                    long longValue = l.longValue();
                    Number number = (Number) hashMap2.get(r4);
                    if (number != null) {
                        longValue = Math.max(number.longValue(), longValue);
                    }
                    hashMap2.put(r4, Long.valueOf(longValue));
                } else {
                    throw null;
                }
            }
        }
        this.A0b.A01.post(new AnonymousClass1UW(this, i, collection, hashMap, z, hashMap2));
    }

    public final void A0Y(List list) {
        AnonymousClass0MH r2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC007503q A052 = this.A0J.A05((C007303n) it.next());
            if (!(A052 == null || (r2 = A052.A0F) == null)) {
                r2.A01 = 0;
                r2.A05 = this.A0E.A05();
                this.A0b.A01(A052, 16);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0301, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0304, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0308, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x031b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x031f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0332, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x039b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x039f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019c, code lost:
        if (r1 > r17) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0285, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0289, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Z(X.C28551Ut r36, X.AbstractC43591yd r37) {
        /*
        // Method dump skipped, instructions count: 1008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0Z(X.1Ut, X.1yd):boolean");
    }

    public boolean A0a(AnonymousClass02N r9, Long l) {
        int i;
        int i2;
        String str;
        if (AnonymousClass1VY.A0a(r9)) {
            return false;
        }
        AnonymousClass0B0 r0 = this.A0v;
        AnonymousClass01R r5 = r0.A05;
        long A052 = r0.A00.A05();
        AnonymousClass0A6 r02 = r5.A04;
        C12150hd r4 = (C12150hd) AnonymousClass01R.A00(AnonymousClass0FI.A07(r02.A01, r02.A00, r9, true), A052, 19);
        UserJid of = UserJid.of(r9);
        if (r5.A01.A0D(AbstractC000400g.A0Z) && of != null) {
            AnonymousClass01B r52 = r5.A03.A02;
            AnonymousClass0J9 A0C2 = r52.A0C(of);
            if (A0C2 == null) {
                i2 = 0;
            } else {
                AnonymousClass0J9 A0C3 = r52.A0C(of);
                int i3 = 0;
                if (A0C3 != null) {
                    i = A0C3.A01;
                    i3 = A0C3.A00;
                } else {
                    i = 0;
                }
                int A002 = AnonymousClass1YA.A00(i, i3);
                i2 = 4;
                if (A002 != 2) {
                    if (A002 == 3) {
                        i2 = 5;
                        if (A0C2.A03 == 3) {
                            i2 = 2;
                        }
                    } else if (A002 != 4) {
                        i2 = 0;
                    } else {
                        i2 = 6;
                        if (A0C2.A03 == 3) {
                            i2 = 3;
                        }
                    }
                } else if (A0C2.A03 == 3) {
                    i2 = 1;
                }
            }
            r4.A00 = i2;
            if (i2 != 0) {
                AnonymousClass0J9 A0C4 = r52.A0C(of);
                if (A0C4 != null) {
                    str = A0C4.A08;
                } else {
                    str = null;
                }
                r4.A01 = str;
            }
        }
        r4.A0U = l;
        AnonymousClass02M r2 = this.A04;
        r2.A02.post(new RunnableEBaseShape2S0200000_I0_1(this, r4, 24));
        StringBuilder sb = new StringBuilder("added plaintext disabled message; jid=");
        sb.append(r9);
        Log.i(sb.toString());
        return A0f(r4, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0b(X.AnonymousClass02N r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0b(X.02N, boolean):boolean");
    }

    public boolean A0c(C007303n r3) {
        AnonymousClass09V r1 = this.A0J;
        AbstractC007503q A052 = r1.A05(r3);
        return A052 == null || r1.A07(A052);
    }

    public boolean A0d(AbstractC007503q r3) {
        int i = -1;
        if (r3.A0v) {
            i = 22;
        }
        return A0e(r3, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        if (r10 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(X.AbstractC007503q r21, int r22) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0e(X.03q, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (((((long) r20.A02) * 1000) + r9.A0E) >= r17) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f(X.AbstractC007503q r20, int r21) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0f(X.03q, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ae, code lost:
        if (r0 == null) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d6, code lost:
        if (r19 != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (X.AnonymousClass1VY.A0b(r1) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r31 == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x02f2, code lost:
        if (r0 <= r14) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0359, code lost:
        if (r6 < r30.A0p) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x03ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x03af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x03b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03b6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x03b7, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0156, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x015a, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:284:0x03c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:294:0x03d1 */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0426  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0g(X.AbstractC007503q r30, int r31) {
        /*
        // Method dump skipped, instructions count: 1064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01K.A0g(X.03q, int):boolean");
    }

    public final boolean A0h(AbstractC007503q r9, long j) {
        long j2;
        int i;
        AnonymousClass0A3 r3 = this.A0T;
        AnonymousClass02Z r6 = null;
        if (r3 != null) {
            C007303n r4 = r9.A0n;
            if (r4.A02) {
                r6 = AnonymousClass02Z.A00;
            }
            if (r9.A0m == 36) {
                j2 = r9.A0D;
                i = ((C12190hh) r9).A00;
            } else {
                j2 = r9.A0E;
                i = r9.A02;
            }
            AnonymousClass01R r32 = r3.A04;
            UserJid of = UserJid.of(r4.A00);
            if (of != null) {
                AnonymousClass0A6 r0 = r32.A04;
                C12240hm r02 = (C12240hm) AnonymousClass01R.A00(AnonymousClass0FI.A07(r0.A01, r0.A00, of, true), j2, 59);
                r02.A00 = i;
                r02.A0Y(r6);
                return A0k(r02, j);
            }
            throw null;
        }
        throw null;
    }

    public final boolean A0i(AbstractC007503q r4, AnonymousClass0MH r5) {
        AnonymousClass01I r0 = this.A05;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid == null) {
            return false;
        }
        if (AnonymousClass1VY.A0Y(r4.A0n.A00) && !userJid.equals(r5.A0A) && !userJid.equals(r5.A09)) {
            return false;
        }
        if (r4 instanceof AnonymousClass0ZK) {
            r5.A01 = 15;
            return true;
        } else if (r4 instanceof AnonymousClass0ZM) {
            r5.A01 = 18;
            return true;
        } else {
            throw new IllegalStateException(C018809u.A01("CoreMessageStore", "Handled message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled"));
        }
    }

    public final boolean A0j(AbstractC007503q r9, AbstractC007503q r10) {
        C08560bL A052;
        r9.A0Z(r10);
        AnonymousClass0MH r0 = r9.A0F;
        if (r0 != null && r0.A0K()) {
            r9.A0F.A0F(true);
        }
        if (!A0g(r9, 5)) {
            return false;
        }
        AnonymousClass0AB r02 = this.A0b;
        r02.A01(r9, 5);
        C007303n r4 = r9.A0n;
        AnonymousClass02N r7 = r4.A00;
        r02.A02.post(new RunnableEBaseShape2S0200000_I0_1(this, r7, 27));
        if (r4.A02 || ((((A052 = this.A0N.A05(r7)) == null || A052.A0G < r9.A0p) && r9.A08 != 13) || !this.A07.A01(r7))) {
            if (r9.A0I != null) {
                this.A08.A02(AnonymousClass0ZG.A07(this.A1M, r9));
            }
            this.A08.A02(r9);
            return true;
        }
        if (r9.A0I != null) {
            this.A08.A04(AnonymousClass0ZG.A07(this.A1M, r9), true);
        }
        this.A08.A04(r9, true);
        return true;
    }

    public boolean A0k(C12240hm r4, long j) {
        r4.A0Q = Long.valueOf(j);
        A0R(r4, -1);
        StringBuilder sb = new StringBuilder("added ephemeral setting message; jid=");
        sb.append(r4.A0n.A00);
        Log.i(sb.toString());
        return A0f(r4, -1);
    }
}
