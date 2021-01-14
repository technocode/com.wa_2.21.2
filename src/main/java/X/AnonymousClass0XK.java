package X;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0XK  reason: invalid class name */
public class AnonymousClass0XK implements AnonymousClass0C0 {
    public static volatile AnonymousClass0XK A1N;
    public final AnonymousClass0GG A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass0CD A03;
    public final AnonymousClass01I A04;
    public final C03490Gl A05;
    public final AnonymousClass0XY A06;
    public final AnonymousClass0I5 A07;
    public final AnonymousClass0JR A08;
    public final AnonymousClass0ES A09;
    public final AnonymousClass0EY A0A;
    public final AnonymousClass09G A0B;
    public final C04350Ka A0C;
    public final C000300f A0D;
    public final C04360Kb A0E;
    public final AnonymousClass01J A0F;
    public final AnonymousClass08D A0G;
    public final AnonymousClass01A A0H;
    public final AnonymousClass08C A0I;
    public final C04410Kg A0J;
    public final AnonymousClass04j A0K;
    public final AnonymousClass00S A0L;
    public final AnonymousClass00G A0M;
    public final AnonymousClass00D A0N;
    public final AnonymousClass01X A0O;
    public final AnonymousClass0FS A0P;
    public final AnonymousClass0EH A0Q;
    public final AnonymousClass0DG A0R;
    public final C006903j A0S;
    public final AnonymousClass0AQ A0T;
    public final AnonymousClass0A8 A0U;
    public final AnonymousClass01Q A0V;
    public final AnonymousClass0A9 A0W;
    public final AnonymousClass01K A0X;
    public final C02320Bn A0Y;
    public final AnonymousClass0AM A0Z;
    public final C02930Ea A0a;
    public final AnonymousClass01T A0b;
    public final AnonymousClass0AN A0c;
    public final AnonymousClass0AP A0d;
    public final AnonymousClass0DF A0e;
    public final C02330Bo A0f;
    public final AnonymousClass098 A0g;
    public final AnonymousClass0CG A0h;
    public final C03120Ew A0i;
    public final AnonymousClass09E A0j;
    public final AnonymousClass01P A0k;
    public final AnonymousClass0CF A0l;
    public final C002701k A0m;
    public final AnonymousClass0AS A0n;
    public final AnonymousClass0EO A0o;
    public final AnonymousClass0CB A0p;
    public final AnonymousClass01S A0q;
    public final AnonymousClass0XZ A0r;
    public final AnonymousClass0EJ A0s;
    public final C04420Kh A0t;
    public final AnonymousClass0H3 A0u;
    public final AnonymousClass0JN A0v;
    public final AnonymousClass09H A0w;
    public final AnonymousClass0FZ A0x;
    public final AnonymousClass0AR A0y;
    public final AnonymousClass0IA A0z;
    public final AnonymousClass0K0 A10;
    public final C02760Di A11;
    public final C02800Dm A12;
    public final C02360Br A13;
    public final AnonymousClass0FE A14;
    public final AnonymousClass0XO A15;
    public final AnonymousClass01R A16;
    public final AnonymousClass30E A17;
    public final AnonymousClass0BB A18;
    public final AnonymousClass31y A19;
    public final AnonymousClass322 A1A;
    public final AnonymousClass0XM A1B;
    public final C04230Jo A1C;
    public final C03570Gt A1D;
    public final C03580Gu A1E;
    public final AnonymousClass0HE A1F;
    public final AnonymousClass00T A1G;
    public final AnonymousClass0Z0 A1H;
    public final AnonymousClass0Fh A1I;
    public final C02400Bv A1J;
    public final AnonymousClass0C4 A1K;
    public final SecureRandom A1L = new SecureRandom();
    public final Map A1M = new ConcurrentHashMap();

    public AnonymousClass0XK(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass08D r4, C002701k r5, AnonymousClass02M r6, C03490Gl r7, AnonymousClass009 r8, AnonymousClass01I r9, C04350Ka r10, AnonymousClass00T r11, C006903j r12, C02400Bv r13, AnonymousClass0C4 r14, AnonymousClass0DG r15, AnonymousClass0AR r16, C000300f r17, AnonymousClass098 r18, AnonymousClass09E r19, C04360Kb r20, AnonymousClass09G r21, AnonymousClass01J r22, AnonymousClass0AN r23, AnonymousClass09H r24, AnonymousClass0XM r25, AnonymousClass0Fh r26, AnonymousClass01A r27, AnonymousClass0A9 r28, C02330Bo r29, C02360Br r30, AnonymousClass01X r31, C04230Jo r32, AnonymousClass0CB r33, AnonymousClass0AM r34, AnonymousClass0EJ r35, AnonymousClass0I5 r36, AnonymousClass30E r37, C03580Gu r38, AnonymousClass0CF r39, C02760Di r40, AnonymousClass0GG r41, AnonymousClass0AS r42, AnonymousClass01K r43, C02320Bn r44, AnonymousClass0EO r45, AnonymousClass0AP r46, AnonymousClass0XO r47, AnonymousClass31y r48, AnonymousClass0FS r49, AnonymousClass0BB r50, AnonymousClass0CD r51, AnonymousClass0JN r52, C03570Gt r53, AnonymousClass0HE r54, C02800Dm r55, AnonymousClass08C r56, AnonymousClass0DF r57, AnonymousClass0FZ r58, AnonymousClass322 r59, C03120Ew r60, AnonymousClass0FE r61, AnonymousClass04j r62, AnonymousClass0JR r63, AnonymousClass0ES r64, AnonymousClass0EY r65, AnonymousClass0CG r66, AnonymousClass01P r67, AnonymousClass0Z0 r68, AnonymousClass00D r69, AnonymousClass01Q r70, AnonymousClass01R r71, AnonymousClass0A8 r72, AnonymousClass0IA r73, AnonymousClass0K0 r74, AnonymousClass01S r75, C04410Kg r76, C04420Kh r77, AnonymousClass0H3 r78, AnonymousClass0EH r79, AnonymousClass01T r80, AnonymousClass0XY r81, C02930Ea r82, AnonymousClass0AQ r83, AnonymousClass0XZ r84) {
        this.A0M = r2;
        this.A0L = r3;
        this.A0G = r4;
        this.A0m = r5;
        this.A02 = r6;
        this.A05 = r7;
        this.A01 = r8;
        this.A04 = r9;
        this.A0C = r10;
        this.A1G = r11;
        this.A0S = r12;
        this.A1J = r13;
        this.A1K = r14;
        this.A0R = r15;
        this.A0y = r16;
        this.A0D = r17;
        this.A0g = r18;
        this.A0j = r19;
        this.A0E = r20;
        this.A0B = r21;
        this.A0F = r22;
        this.A0c = r23;
        this.A0w = r24;
        this.A1B = r25;
        this.A1I = r26;
        this.A0H = r27;
        this.A0W = r28;
        this.A0f = r29;
        this.A13 = r30;
        this.A0O = r31;
        this.A1C = r32;
        this.A0p = r33;
        this.A0Z = r34;
        this.A0s = r35;
        this.A07 = r36;
        this.A17 = r37;
        this.A1E = r38;
        this.A0l = r39;
        this.A11 = r40;
        this.A00 = r41;
        this.A0n = r42;
        this.A0X = r43;
        this.A0Y = r44;
        this.A0o = r45;
        this.A0d = r46;
        this.A15 = r47;
        this.A19 = r48;
        this.A0P = r49;
        this.A18 = r50;
        this.A03 = r51;
        this.A0v = r52;
        this.A1D = r53;
        this.A1F = r54;
        this.A12 = r55;
        this.A0I = r56;
        this.A0e = r57;
        this.A0x = r58;
        this.A1A = r59;
        this.A0i = r60;
        this.A14 = r61;
        this.A0K = r62;
        this.A08 = r63;
        this.A09 = r64;
        this.A0A = r65;
        this.A0h = r66;
        this.A0k = r67;
        this.A1H = r68;
        this.A0N = r69;
        this.A0V = r70;
        this.A16 = r71;
        this.A0U = r72;
        this.A0z = r73;
        this.A10 = r74;
        this.A0q = r75;
        this.A0J = r76;
        this.A0t = r77;
        this.A0u = r78;
        this.A0Q = r79;
        this.A0b = r80;
        this.A06 = r81;
        this.A0a = r82;
        this.A0T = r83;
        this.A0r = r84;
    }

    public static int A00(long j, boolean z) {
        return (z || System.currentTimeMillis() < j + 86400000) ? 20 : 1;
    }

    public static int A01(String str, Jid jid, int i, VoipStanzaChildNode voipStanzaChildNode) {
        int nativeHandleWebClientMessage = Voip.nativeHandleWebClientMessage(str, jid.getRawString(), i, voipStanzaChildNode);
        if (nativeHandleWebClientMessage == 0 || nativeHandleWebClientMessage == 70020) {
            return 200;
        }
        if (nativeHandleWebClientMessage == 670001) {
            return 423;
        }
        AnonymousClass008.A0v("app/xmpp/recv/native_handle_web_message failed with code:", nativeHandleWebClientMessage);
        return 409;
    }

    public final int A02(String str, Jid jid, int i) {
        C29131Xe r1;
        boolean z = true;
        if (!(i == 1 || i == 2 || i == 6 || i == 7)) {
            z = false;
        }
        AnonymousClass00E.A08(z, "invalid web client action in handleAcceptAndReject");
        AnonymousClass04g r6 = Voip.A01;
        Pair A002 = r6.A00(str);
        if (A002 != null && (r1 = (C29131Xe) A002.second) != null) {
            C70073Jq r3 = r1.A01;
            DeviceJid deviceJid = (DeviceJid) ((AnonymousClass1XB) r3).A00;
            if (deviceJid != null) {
                int A012 = A01(str, deviceJid.userJid, i, ((AnonymousClass1XB) r3).A01);
                if (!TextUtils.equals(Voip.getCurrentCallId(), str) && (i == 2 || i == 7)) {
                    AnonymousClass0FS r5 = this.A0P;
                    String A1n = C002001d.A1n(str);
                    DeviceJid deviceJid2 = (DeviceJid) ((AnonymousClass1XB) r1.A01).A00;
                    if (deviceJid2 != null) {
                        AnonymousClass0QM A042 = r5.A04(new C09260ca(deviceJid2.userJid, false, A1n, r1.A00));
                        if (A042 != null) {
                            A042.A06(2);
                            r5.A08(A042);
                        }
                    } else {
                        throw null;
                    }
                }
                r6.A01(str);
                return A012;
            }
            throw null;
        } else if (i != 6 && i != 7) {
            return A01(str, jid, i, null);
        } else {
            StringBuilder sb = new StringBuilder("app/xmpp/recv/call_web_query no cached offer in accept/reject pending, callId:");
            sb.append(str);
            sb.append(", type:");
            sb.append(i);
            Log.w(sb.toString());
            return 410;
        }
    }

    public final C64392y7 A03(AnonymousClass02N r5, int i) {
        int i2;
        String str;
        C64392y7 r2 = new C64392y7(false);
        r2.A00 = i;
        C006903j r3 = this.A0S;
        r2.A08 = r3.A04(r5);
        C08560bL r0 = (C08560bL) r3.A0A().get(r5);
        if (r0 == null) {
            i2 = 0;
        } else {
            i2 = r0.A07;
        }
        r2.A03 = i2;
        r2.A0A = r5;
        r2.A01 = r3.A01(r5);
        C007003k A022 = this.A0T.A02(r5);
        if (TextUtils.isEmpty(A022.A0F)) {
            str = null;
        } else {
            str = A022.A0F;
        }
        r2.A0G = str;
        r2.A07 = this.A18.A03(r5);
        return r2;
    }

    public final void A04(Jid jid, String str) {
        AnonymousClass008.A16("web/web-action-success id=", str);
        AnonymousClass0C4 r2 = this.A1K;
        r2.A0E(str, 200);
        this.A13.A0E(str, 200);
        this.A0B.A09(str, jid, "web");
        r2.A08();
        r2.A09();
    }

    public final void A05(Jid jid, String str, int i) {
        StringBuilder sb = new StringBuilder("web/web-action-fail id=");
        sb.append(str);
        sb.append(" code=");
        sb.append(i);
        Log.d(sb.toString());
        AnonymousClass0C4 r2 = this.A1K;
        r2.A0E(str, i);
        this.A13.A0E(str, i);
        this.A0B.A09(str, jid, "web");
        r2.A08();
        r2.A09();
    }

    public void A06(AnonymousClass3LL r6) {
        Message obtain = Message.obtain(null, 0, r6);
        AnonymousClass0Z0 r3 = this.A1H;
        r3.A00.obtainMessage(1, new AnonymousClass0Yz("start_web_relay", null, obtain)).sendToTarget();
    }

    public final void A07(String str, AnonymousClass02N r11, int i) {
        long j = (long) i;
        if (!this.A11.A04(str, r11, j, false)) {
            Application application = this.A0M.A00;
            Log.d("LocationSharingService/start-location-reporting");
            C004302a.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE").putExtra("id", str).putExtra("chatJid", r11.getRawString()).putExtra("duration", j));
        }
    }

    public final void A08(String str, String str2, String str3, File file, AnonymousClass1XO r27, boolean z) {
        StringBuilder sb = new StringBuilder("RecvWebMessageListener/uploadMedia/queryId: ");
        sb.append(str);
        sb.append(",upload file: ");
        sb.append(file);
        Log.d(sb.toString());
        byte[] bArr = new byte[32];
        this.A1L.nextBytes(bArr);
        AnonymousClass2TE A012 = AnonymousClass2TE.A01(new C50132Tn(true, false), 0, r27, Uri.fromFile(file), null, false, false, new C49882So(bArr, this.A0L.A05()), true);
        AnonymousClass0EJ r1 = this.A0s;
        C56862jJ A052 = r1.A05(A012, false);
        A052.A0S = "mms";
        A052.A09.A03(new C38921qf(this, A052, str2, bArr, str3, str, z, file), null);
        r1.A0E(A052, null);
    }

    public final boolean A09(String str, Jid jid, C04080Iy r5) {
        if (!r5.A03()) {
            return false;
        }
        AnonymousClass008.A17("app/xmpp/recv/webquery/canceled: ", str);
        this.A0B.A09(str, jid, "web");
        this.A1K.A0E(str, 499);
        this.A13.A0E(str, 499);
        this.A1M.remove(str);
        return true;
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 89, 118, 119, 146, 147, 162, 171, 173, 207};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0657, code lost:
        if (r7.A02(r7.A01((X.AnonymousClass0M3) r9)) == null) goto L_0x0659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0d56, code lost:
        if (r7 != 0) goto L_0x0d39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0d58, code lost:
        r27.A0J.A01(r5, false);
        A04(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0d60, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x13ef, code lost:
        if (r13 == 0) goto L_0x155b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x1410, code lost:
        if ((r4.A03(r5) / 1000) == r12.A03) goto L_0x155b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x1439, code lost:
        if (r27.A0h.A06(r4, false) != false) goto L_0x155b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x1443, code lost:
        if (r27.A0h.A05(r5) == false) goto L_0x1375;
     */
    @Override // X.AnonymousClass0C0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AAE(int r28, android.os.Message r29) {
        /*
        // Method dump skipped, instructions count: 6546
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XK.AAE(int, android.os.Message):boolean");
    }
}
