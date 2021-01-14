package X;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.search.verification.client.R;
import com.whatsapp.SpamWarningActivity;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.0KY  reason: invalid class name */
public class AnonymousClass0KY {
    public static volatile AnonymousClass0KY A0w;
    public final C001100q A00;
    public final AnonymousClass009 A01;
    public final C04250Jq A02;
    public final AnonymousClass02M A03;
    public final C04220Jn A04;
    public final AnonymousClass01I A05;
    public final AnonymousClass0AH A06;
    public final C03250Fl A07;
    public final AnonymousClass0JQ A08;
    public final AnonymousClass0Fk A09;
    public final C04540Kt A0A;
    public final AnonymousClass0I5 A0B;
    public final AnonymousClass0JR A0C;
    public final AnonymousClass0L0 A0D;
    public final C000300f A0E;
    public final C03170Fb A0F;
    public final AnonymousClass0KZ A0G;
    public final AnonymousClass01J A0H;
    public final AnonymousClass09K A0I;
    public final C017009c A0J;
    public final AnonymousClass0DH A0K;
    public final AnonymousClass01A A0L;
    public final C03270Fn A0M;
    public final AnonymousClass00S A0N;
    public final AnonymousClass00G A0O;
    public final AnonymousClass03C A0P;
    public final AnonymousClass00D A0Q;
    public final AnonymousClass01X A0R;
    public final AnonymousClass01Q A0S;
    public final AnonymousClass01K A0T;
    public final C04590Ky A0U;
    public final C014508d A0V;
    public final C018609s A0W;
    public final AnonymousClass01P A0X;
    public final AnonymousClass00Y A0Y;
    public final C03280Fo A0Z;
    public final AnonymousClass018 A0a;
    public final C04420Kh A0b;
    public final AnonymousClass0EU A0c;
    public final AnonymousClass09J A0d;
    public final AnonymousClass09H A0e;
    public final C03160Fa A0f;
    public final AnonymousClass0AR A0g;
    public final AnonymousClass0FE A0h;
    public final C01970Ad A0i;
    public final C04550Ku A0j;
    public final C03300Fq A0k;
    public final C04510Kq A0l;
    public final AnonymousClass0AL A0m;
    public final C03200Fe A0n;
    public final AnonymousClass0HM A0o;
    public final AnonymousClass0CT A0p;
    public final AnonymousClass0C5 A0q;
    public final AbstractC29211Xn A0r;
    public final AnonymousClass0AT A0s;
    public final C04600Kz A0t = new C04600Kz(true);
    public final AnonymousClass00T A0u;
    public final AnonymousClass0CQ A0v;

    public AnonymousClass0KY(AnonymousClass00G r58, AnonymousClass00S r59, AnonymousClass02M r60, AnonymousClass009 r61, AnonymousClass01I r62, C03170Fb r63, AnonymousClass00T r64, C03500Gm r65, AnonymousClass00Y r66, AnonymousClass0AR r67, C000300f r68, AnonymousClass0DH r69, AnonymousClass0CQ r70, C001100q r71, C03200Fe r72, AnonymousClass09G r73, AnonymousClass01J r74, C03480Gk r75, AnonymousClass09H r76, AnonymousClass0CT r77, AnonymousClass01A r78, C03160Fa r79, AnonymousClass0AH r80, C001400w r81, AnonymousClass0KZ r82, AnonymousClass01X r83, AnonymousClass0AL r84, C04250Jq r85, AnonymousClass0Fk r86, AnonymousClass0I5 r87, C01970Ad r88, AnonymousClass0BD r89, AnonymousClass0GG r90, AnonymousClass08B r91, AnonymousClass01K r92, AnonymousClass0AT r93, AnonymousClass0C5 r94, AnonymousClass09J r95, AnonymousClass0AC r96, C03250Fl r97, AnonymousClass09K r98, AnonymousClass0CD r99, AnonymousClass01M r100, AnonymousClass0JN r101, AnonymousClass0JQ r102, C001000o r103, C03270Fn r104, C04510Kq r105, AnonymousClass0HN r106, C03280Fo r107, C04520Kr r108, AnonymousClass0Ja r109, C04220Jn r110, AnonymousClass0FE r111, C014508d r112, C03300Fq r113, AnonymousClass0JR r114, AnonymousClass0HM r115, AnonymousClass01P r116, AnonymousClass00D r117, AnonymousClass01Q r118, AnonymousClass0I8 r119, AbstractC29211Xn r120, C04530Ks r121, AnonymousClass0B0 r122, C04540Kt r123, AnonymousClass03C r124, AnonymousClass0IA r125, C017009c r126, C04550Ku r127, C04450Kk r128, AnonymousClass321 r129, AnonymousClass324 r130, C04590Ky r131, AnonymousClass018 r132, C018609s r133, C04420Kh r134, AnonymousClass01T r135, AnonymousClass0AQ r136, AnonymousClass0EU r137) {
        this.A0O = r58;
        this.A0N = r59;
        this.A03 = r60;
        this.A01 = r61;
        this.A05 = r62;
        this.A0F = r63;
        this.A0u = r64;
        this.A0Y = r66;
        this.A0g = r67;
        this.A0E = r68;
        this.A0K = r69;
        this.A0v = r70;
        this.A00 = r71;
        this.A0n = r72;
        this.A0H = r74;
        this.A0e = r76;
        this.A0p = r77;
        this.A0L = r78;
        this.A06 = r80;
        this.A0f = r79;
        this.A0G = r82;
        this.A0R = r83;
        this.A0m = r84;
        this.A02 = r85;
        this.A09 = r86;
        this.A0i = r88;
        this.A0B = r87;
        this.A0T = r92;
        this.A0s = r93;
        this.A0q = r94;
        this.A0d = r95;
        this.A07 = r97;
        this.A0I = r98;
        this.A08 = r102;
        this.A0M = r104;
        this.A0l = r105;
        this.A0Z = r107;
        this.A04 = r110;
        this.A0h = r111;
        this.A0V = r112;
        this.A0k = r113;
        this.A0C = r114;
        this.A0o = r115;
        this.A0X = r116;
        this.A0Q = r117;
        this.A0S = r118;
        this.A0r = r120;
        this.A0A = r123;
        this.A0P = r124;
        this.A0J = r126;
        this.A0U = r131;
        this.A0a = r132;
        this.A0W = r133;
        this.A0b = r134;
        this.A0c = r137;
        this.A0j = r127;
        this.A0D = new AnonymousClass0L0(r58, r60, r61, r62, r64, r65, r67, r68, r73, r75, r78, r79, r81, r83, r84, r88, r87, r89, r90, r92, r91, r96, r99, r100, r101, r103, r106, r108, r109, r116, r119, r120, r121, r122, r125, r128, r126, r129, r130, r135, r136);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        if (android.os.SystemClock.elapsedRealtime() >= r4) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KY.A00():void");
    }

    public void A01() {
        Log.i("message-handler-callback/ready");
        boolean z = this.A0Q.A00.getBoolean("refresh_broadcast_lists", false);
        AnonymousClass008.A1G("app/getshouldrefreshbroadcastlists ", z);
        if (z) {
            this.A0g.A04();
        }
    }

    public final void A02() {
        AbstractC004502c r2 = this.A03.A00;
        if (r2 == null || !C002001d.A3K(r2, this.A0f, this.A0h)) {
            StringBuilder A0S2 = AnonymousClass008.A0S("message-handler-callback/handlerconnected/displaysoftwareexpired/notification ");
            A0S2.append(new Date().toString());
            A0S2.append(" ");
            A0S2.append(System.currentTimeMillis());
            Log.w(A0S2.toString());
            Application application = this.A0O.A00;
            AnonymousClass03C r6 = this.A0P;
            AnonymousClass01X r5 = this.A0R;
            C002001d.A2S(application, r6, r5.A0D(R.string.expiry_notification_title, r5.A06(R.string.localized_app_name)), r5.A0D(R.string.software_expired_get_from_play, r5.A06(R.string.localized_app_name)), 2);
            this.A0h.A03 = true;
        }
    }

    public final void A03() {
        AnonymousClass09K r1 = this.A0I;
        if (r1.A02) {
            if (this.A03 != null) {
                AnonymousClass00D r0 = this.A0Q;
                r0.A0i(false, 0);
                r0.A0h(false);
                return;
            }
            throw null;
        } else if (r1.A03) {
            if (this.A03 != null) {
                SpamWarningActivity.A02.open();
                return;
            }
            throw null;
        } else if (this.A03 != null) {
            SpamWarningActivity.A02.close();
            SharedPreferences sharedPreferences = this.A0Q.A00;
            boolean z = sharedPreferences.getBoolean("spam_banned", false);
            AnonymousClass008.A1G("wa-shared-prefs/getspambanned ", z);
            if (z) {
                Application application = this.A0O.A00;
                Intent intent = new Intent(null, null, application, SpamWarningActivity.class);
                intent.setFlags(268435456);
                long j = -1;
                long j2 = sharedPreferences.getLong("spam_banned_expiry_timestamp", -1);
                AnonymousClass008.A0z("wa-shared-prefs/getspambanned ", j2);
                if (j2 != -1) {
                    j2 = (j2 - System.currentTimeMillis()) / 1000;
                }
                if (j2 > 0) {
                    j = j2;
                }
                intent.putExtra("expiry_in_seconds", (int) j);
                application.startActivity(intent);
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ef, code lost:
        if (r3 != 2) goto L_0x02f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.os.Message r39) {
        /*
        // Method dump skipped, instructions count: 2816
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KY.A04(android.os.Message):void");
    }
}
