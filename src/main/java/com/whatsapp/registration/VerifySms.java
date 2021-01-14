package com.whatsapp.registration;

import X.AbstractC000900m;
import X.AbstractC03820Hw;
import X.AbstractC03830Hx;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass03B;
import X.AnonymousClass03C;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass094;
import X.AnonymousClass0CO;
import X.AnonymousClass0GZ;
import X.AnonymousClass0HM;
import X.AnonymousClass0HP;
import X.AnonymousClass0JE;
import X.AnonymousClass0JI;
import X.AnonymousClass0KP;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass18B;
import X.AnonymousClass2C0;
import X.AnonymousClass2Nx;
import X.AnonymousClass2O2;
import X.AnonymousClass2O3;
import X.AnonymousClass2O6;
import X.AnonymousClass2O7;
import X.AnonymousClass2OC;
import X.AnonymousClass302;
import X.AnonymousClass30B;
import X.AnonymousClass30C;
import X.AnonymousClass30F;
import X.AnonymousClass30L;
import X.AnonymousClass30Q;
import X.AnonymousClass30V;
import X.AnonymousClass30W;
import X.AnonymousClass324;
import X.AnonymousClass325;
import X.AnonymousClass3MY;
import X.C002001d;
import X.C002101e;
import X.C003301q;
import X.C014708f;
import X.C02660Cy;
import X.C03160Fa;
import X.C03200Fe;
import X.C03270Fn;
import X.C09910dj;
import X.C09920dk;
import X.C12440i6;
import X.C70823Mn;
import X.C70833Mo;
import X.DialogC40171sk;
import X.DialogInterface$OnClickListenerC65292zc;
import X.DialogInterface$OnClickListenerC65302zd;
import X.DialogInterface$OnClickListenerC65312ze;
import X.DialogInterface$OnClickListenerC65322zf;
import X.DialogInterface$OnClickListenerC65332zg;
import X.DialogInterface$OnClickListenerC65342zh;
import X.DialogInterface$OnClickListenerC65352zi;
import X.DialogInterface$OnClickListenerC65362zj;
import X.DialogInterface$OnClickListenerC65372zk;
import X.DialogInterface$OnClickListenerC65382zl;
import X.DialogInterface$OnClickListenerC65392zm;
import X.DialogInterface$OnClickListenerC65402zn;
import X.DialogInterface$OnClickListenerC65412zo;
import X.DialogInterface$OnClickListenerC65422zp;
import X.DialogInterface$OnClickListenerC65432zq;
import X.DialogInterface$OnClickListenerC65442zr;
import X.DialogInterface$OnClickListenerC65452zs;
import X.DialogInterface$OnClickListenerC65462zt;
import X.DialogInterface$OnClickListenerC65472zu;
import X.DialogInterface$OnDismissListenerC65482zv;
import android.app.Application;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.Main;
import com.whatsapp.Me;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class VerifySms extends ActivityC004602e implements AbstractC03820Hw, AbstractC03830Hx {
    public static int A0u = 6;
    public static int A0v = 6;
    public static int A0w;
    public int A00;
    public int A01 = -2;
    public long A02 = 0;
    public CountDownTimer A03;
    public View A04;
    public View A05;
    public View A06;
    public ImageButton A07;
    public ProgressBar A08;
    public TextView A09;
    public CodeInputField A0A;
    public TextEmojiLabel A0B;
    public AnonymousClass302 A0C;
    public AnonymousClass302 A0D;
    public AnonymousClass30C A0E;
    public AnonymousClass30F A0F;
    public AnonymousClass30L A0G;
    public AnonymousClass30Q A0H;
    public AnonymousClass30W A0I;
    public C70833Mo A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final C12440i6 A0U = C12440i6.A00();
    public final AnonymousClass0CO A0V = AnonymousClass0CO.A00();
    public final AnonymousClass03B A0W = AnonymousClass03B.A00();
    public final AnonymousClass0GZ A0X = AnonymousClass0GZ.A00();
    public final AbstractC000900m A0Y = new AnonymousClass3MY(this);
    public final C003301q A0Z = C003301q.A02;
    public final AnonymousClass04j A0a = AnonymousClass04j.A00();
    public final AnonymousClass03P A0b = AnonymousClass03P.A00();
    public final C03270Fn A0c = C03270Fn.A00();
    public final AnonymousClass00S A0d = AnonymousClass00S.A00();
    public final AnonymousClass00G A0e = AnonymousClass00G.A01;
    public final AnonymousClass03C A0f = AnonymousClass03C.A00();
    public final AnonymousClass03S A0g = AnonymousClass03S.A00();
    public final AnonymousClass0M9 A0h = AnonymousClass0M9.A01();
    public final AnonymousClass2OC A0i = AnonymousClass2OC.A00();
    public final C02660Cy A0j = C02660Cy.A00();
    public final AnonymousClass022 A0k = AnonymousClass022.A00();
    public final AnonymousClass0JI A0l = AnonymousClass0JI.A00();
    public final C03200Fe A0m = C03200Fe.A00();
    public final AnonymousClass0KP A0n = AnonymousClass0KP.A00();
    public final AnonymousClass0HM A0o = AnonymousClass0HM.A00();
    public final C014708f A0p = C014708f.A00();
    public final AnonymousClass0HP A0q = AnonymousClass0HP.A00();
    public final AnonymousClass324 A0r = AnonymousClass324.A00();
    public final AnonymousClass325 A0s = AnonymousClass325.A00();
    public final AnonymousClass00T A0t = C002101e.A00();

    public static void A05(String str, String str2, NumberFormatException numberFormatException) {
        StringBuilder sb = new StringBuilder();
        sb.append("verifyvoice/request/");
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString(), numberFormatException);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
    }

    public static final String A04(Intent intent) {
        Uri data;
        if ("whatsapp".equals(intent.getScheme())) {
            Uri data2 = intent.getData();
            if (data2 == null || !"r".equals(data2.getHost())) {
                return null;
            }
            String queryParameter = data2.getQueryParameter("c");
            AnonymousClass008.A18("verifysms/codefromverificationlink/code/", queryParameter);
            return queryParameter;
        } else if ((!"http".equals(intent.getScheme()) && !"https".equals(intent.getScheme())) || (data = intent.getData()) == null || !"v.whatsapp.com".equals(data.getHost())) {
            return null;
        } else {
            String path = data.getPath();
            String substring = path.substring(path.lastIndexOf("/") + 1);
            AnonymousClass008.A18("verifysms/codefromverificationlink/code/", substring);
            return substring;
        }
    }

    public final long A0T() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.sms_request_failed_retry_time", -1);
        System.currentTimeMillis();
        return j;
    }

    public final C09920dk A0U(boolean z, C70823Mn r14) {
        return new C09920dk(z, this.A0L, this.A0M, "voice", null, this.A0e, r14, this.A0b, this, super.A0J, this.A0n);
    }

    public final String A0V() {
        SharedPreferences preferences = getPreferences(0);
        String string = preferences.getString("com.whatsapp.registration.VerifySms.sms_cc", null);
        String string2 = preferences.getString("com.whatsapp.registration.VerifySms.sms_phone_number", null);
        if (!this.A0L.equals(string) || !this.A0M.equals(string2)) {
            return null;
        }
        return preferences.getString("com.whatsapp.registration.VerifySms.sms_code", null);
    }

    public final String A0W() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", -1);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = -1;
        if (j != -1) {
            j2 = j - currentTimeMillis;
        }
        AnonymousClass008.A10("verifysms/voice-retry-time/diff/", j2);
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        if (i > 0) {
            return r5.A0D(R.string.register_server_sms_next_method_with_wait_time, r5.A06(R.string.verify_voice_call_button), C002001d.A1a(r5, j2));
        }
        return r5.A0D(R.string.register_server_sms_next_method, r5.A06(R.string.verify_voice_call_button));
    }

    public final String A0X() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", -1);
        long j2 = -1;
        if (j != -1) {
            j2 = j - System.currentTimeMillis();
        }
        AnonymousClass008.A10("verifysms/voice-retry-time/diff/", j2);
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        if (i > 0) {
            return r5.A0D(R.string.register_server_sms_too_many_tries_try_voice_with_wait_time, r5.A06(R.string.verify_voice_call_button), C002001d.A1a(r5, j2));
        }
        return r5.A0D(R.string.register_server_sms_too_many_tries_try_voice, r5.A06(R.string.verify_voice_call_button));
    }

    public final String A0Y() {
        long A0T2 = A0T();
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (A0T2 != -1) {
            j = A0T2 - currentTimeMillis;
        }
        AnonymousClass008.A10("verifysms/sms-retry-time/diff/", j);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        if (i > 0) {
            return r5.A0D(R.string.register_server_voice_next_method_with_wait_time, r5.A06(R.string.verify_resend_sms_button), C002001d.A1a(r5, j));
        }
        return r5.A0D(R.string.register_server_voice_next_method, r5.A06(R.string.verify_resend_sms_button));
    }

    public final String A0Z() {
        long A0T2 = A0T();
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (A0T2 != -1) {
            j = A0T2 - currentTimeMillis;
        }
        AnonymousClass008.A10("verifysms/sms-retry-time/diff/", j);
        int i = (A0T2 > currentTimeMillis ? 1 : (A0T2 == currentTimeMillis ? 0 : -1));
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        if (i > 0) {
            return r5.A0D(R.string.register_server_voice_too_many_tries_try_sms_with_wait_time, r5.A06(R.string.verify_resend_sms_button), C002001d.A1a(r5, j));
        }
        return r5.A0D(R.string.register_server_voice_too_many_tries_try_sms, r5.A06(R.string.verify_resend_sms_button));
    }

    public final void A0a() {
        int type;
        this.A0c.A01();
        NetworkInfo A042 = this.A0a.A04();
        StringBuilder sb = new StringBuilder("verifysms/network/active ");
        sb.append(A042);
        Log.i(sb.toString());
        if (A042 == null) {
            type = -1;
        } else {
            type = A042.getType();
        }
        int i = this.A01;
        if (type != i) {
            StringBuilder A0S2 = AnonymousClass008.A0S("verifysms/network/switch old=");
            A0S2.append(i);
            A0S2.append(" new=");
            A0S2.append(type);
            Log.i(A0S2.toString());
            this.A01 = type;
            if (type != -1 && this.A0I.hasMessages(1)) {
                Log.i("verifysms/network/switch/has-retry-pending");
                this.A0I.removeMessages(1);
                this.A00 = 0;
                String A0V2 = A0V();
                if (A0V2 != null) {
                    this.A0I.sendMessage(this.A0I.obtainMessage(1, A0V2));
                    return;
                }
                Log.e("verifysms/network/switch/no-saved-code");
            }
        }
    }

    public final void A0b() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.code_verification_retry_time");
        if (!edit.commit()) {
            Log.e("verifysms/clear-code-verification-retry-time/error");
        }
    }

    public final void A0c() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.sms_code");
        edit.remove("com.whatsapp.registration.VerifySms.sms_cc");
        edit.remove("com.whatsapp.registration.VerifySms.sms_phone_number");
        if (!edit.commit()) {
            Log.w("verifysms/savedcode/clear/commit failed");
        }
    }

    public final void A0d() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.sms_request_failed_retry_time");
        if (!edit.commit()) {
            Log.e("verifysms/clear-sms-retry-time/error");
        }
    }

    public final void A0e() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.remove("com.whatsapp.registration.VerifySms.call_countdown_end_time");
        if (!edit.commit()) {
            Log.e("verifysms/clear-voice-retry-time/error");
        }
    }

    public final void A0f() {
        AnonymousClass01X r0 = ((AnonymousClass2C0) this).A01;
        try {
            startActivity(new Intent("android.intent.action.VIEW", AnonymousClass0M9.A00().appendPath("link").appendPath("verification.php").appendQueryParameter("platform", "android").appendQueryParameter("lc", r0.A03()).appendQueryParameter("lg", r0.A04()).build()));
        } catch (ActivityNotFoundException unused) {
            ((ActivityC004702f) this).A0F.A06(R.string.activity_not_found, 0);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x00b5 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: X.0i6 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.1FB] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0106 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g() {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifySms.A0g():void");
    }

    public final void A0h() {
        if (this.A0E.A02 || C002001d.A3D(this)) {
            AnonymousClass0JE.A0E(this, ((AnonymousClass2C0) this).A01, this.A0f, -1);
        }
    }

    public final void A0i() {
        AnonymousClass30C r5 = this.A0E;
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        r5.A03(r4.A0D(R.string.register_check_connectivity, r4.A06(R.string.connectivity_self_help_instructions)));
    }

    public final void A0j() {
        Intent intent;
        A0w = 0;
        A0k();
        this.A0I.removeMessages(1);
        if (!this.A0N) {
            this.A0o.A0C(1);
            intent = new Intent(this, RegisterPhone.class);
            intent.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        } else {
            AnonymousClass0HM r3 = this.A0o;
            r3.A0C(3);
            Log.i("verifysms/returntoregphone/changenumber/setregverified");
            if (r3 != null) {
                Log.i("registrationmanager/revert-to-old");
                AnonymousClass01I r2 = r3.A08;
                Me A012 = r2.A01();
                r2.A04();
                if (!r2.A07(A012, "me")) {
                    finish();
                } else {
                    r2.A04();
                    r2.A05(A012);
                    AnonymousClass008.A0n(r3.A0N, "new_jid", false);
                    r2.A03();
                    r3.A05.A01();
                    AnonymousClass094 r1 = r3.A0R;
                    if (r1.A01.A08(false)) {
                        Log.i("registrationmanager/revert/msgstoredb/healthy");
                        r3.A0P.A04(false);
                        r1.A01();
                        r3.A0Z.A01();
                        r3.A0H.A04();
                    } else {
                        C03160Fa r32 = r3.A0Z;
                        if (r32 != null) {
                            Message obtain = Message.obtain(null, 0, 0, 0);
                            obtain.getData().putBoolean("should_register", false);
                            r32.A11.sendMessage(obtain);
                        } else {
                            throw null;
                        }
                    }
                }
                intent = new Intent(this, ChangeNumber.class);
            } else {
                throw null;
            }
        }
        A0e();
        A0d();
        A0b();
        startActivity(intent);
        finish();
    }

    public final void A0k() {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.whatsapp.registration.VerifySms.verification_state", A0w);
        if (!edit.commit()) {
            Log.w("verifysms/savestate/commit failed");
        }
    }

    public final void A0l() {
        long A0T2 = A0T();
        long currentTimeMillis = System.currentTimeMillis();
        long j = -1;
        if (A0T2 != -1) {
            j = A0T2 - currentTimeMillis;
        }
        if (A0T2 > currentTimeMillis) {
            this.A0o.A0D(j);
        }
    }

    public final void A0m() {
        if (this.A0E.A02 || C002001d.A3D(this)) {
            AnonymousClass0JE.A0E(this, ((AnonymousClass2C0) this).A01, this.A0f, -1);
        }
    }

    public final void A0n() {
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A03 = null;
            A0b();
            this.A08.setProgress(100);
            this.A09.setText(((AnonymousClass2C0) this).A01.A0D(R.string.verify_description_bottom, Integer.valueOf(A0u)));
            this.A0O = false;
            this.A0A.setEnabled(true);
        }
    }

    public final void A0o() {
        if (this.A0T) {
            if (this.A0S) {
                unregisterReceiver(this.A0H);
                this.A0S = false;
            }
        } else if (this.A0Q) {
            unregisterReceiver(this.A0F);
            this.A0Q = false;
        }
    }

    public final void A0p() {
        long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", -1);
        if (j != -1) {
            long currentTimeMillis = j - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                this.A0C.A01(currentTimeMillis, true);
            } else {
                A0e();
            }
        }
    }

    public final void A0q() {
        if (A0w == 12) {
            this.A05.setVisibility(8);
            this.A04.setVisibility(8);
            this.A06.setVisibility(8);
            return;
        }
        this.A05.setVisibility(0);
        A0p();
    }

    public final void A0r() {
        TextEmojiLabel textEmojiLabel = this.A0B;
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        textEmojiLabel.setText(r2.A06(R.string.register_user_is_banned_top));
        this.A09.setText(r2.A06(R.string.register_user_is_banned_bottom));
        this.A04.setVisibility(8);
        this.A06.setVisibility(8);
        this.A05.setVisibility(8);
        C002001d.A2O(this, 124);
    }

    public final void A0s(int i) {
        AnonymousClass008.A0t("verifynumber/notify/dialog ", i);
        if (this.A0E.A02 || C002001d.A3D(this)) {
            AnonymousClass0JE.A0E(this, ((AnonymousClass2C0) this).A01, this.A0f, i);
        } else {
            C002001d.A2O(this, i);
        }
    }

    public final void A0t(long j) {
        StringBuilder sb = new StringBuilder("verifysms/save-sms-retry-time/");
        sb.append(j);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putLong("com.whatsapp.registration.VerifySms.sms_request_failed_retry_time", j);
        if (!edit.commit()) {
            Log.e("verifysms/save-sms-retry-time/error");
        }
    }

    public final void A0u(long j) {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putLong("com.whatsapp.registration.VerifySms.call_countdown_end_time", j);
        if (!edit.commit()) {
            Log.e("verifysms/save-voice-retry-time/error");
        }
    }

    public final void A0v(long j) {
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A03 = null;
        }
        if (j < 1000) {
            A0b();
            return;
        }
        this.A0O = true;
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putLong("com.whatsapp.registration.VerifySms.code_verification_retry_time", System.currentTimeMillis() + j);
        if (!edit.commit()) {
            Log.e("verifysms/save-code-verification-retry-time/error");
        }
        this.A0A.setEnabled(false);
        this.A08.setProgress(0);
        this.A09.setText(((AnonymousClass2C0) this).A01.A06(R.string.verify_description_bottom_code_input_disable));
        this.A03 = new AnonymousClass30V(this, j, j).start();
    }

    public void A0w(String str) {
        int length;
        int i;
        if (str != null && (length = str.length()) == (i = A0v)) {
            if (length == i) {
                for (int i2 = 0; i2 < length; i2++) {
                    if (Character.isDigit(str.charAt(i2))) {
                    }
                }
                AnonymousClass00T r1 = this.A0t;
                String str2 = this.A0L;
                String str3 = this.A0M;
                if (str3 != null) {
                    r1.ANC(new C09910dj(str2, str3, "voice", AnonymousClass2Nx.TYPED, this, super.A0J, this.A0n, this.A0J), str);
                    return;
                }
                throw null;
            }
            C002001d.A2O(this, 33);
        }
    }

    public final void A0x(String str) {
        if (this.A0O) {
            Log.i("verifysms/verificationlink/voice/code-entry-blocked-retry-later");
            A0y(str);
            return;
        }
        AnonymousClass008.A1L(AnonymousClass008.A0S("verifysms/verificationlink/voice/state "), A0w);
        this.A0A.setText(str);
    }

    public final void A0y(String str) {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("com.whatsapp.registration.VerifySms.sms_code", str);
        edit.putString("com.whatsapp.registration.VerifySms.sms_cc", this.A0L);
        edit.putString("com.whatsapp.registration.VerifySms.sms_phone_number", this.A0M);
        if (!edit.commit()) {
            Log.w("verifysms/savedcode/save/commit failed");
        }
    }

    public final void A0z(String str) {
        double random = Math.random();
        int i = this.A00;
        this.A00 = i + 1;
        int pow = (int) ((Math.pow(2.0d, (double) i) - 1.0d) * 4000.0d * random);
        AnonymousClass008.A0v("verifysms/verifysms/schedule-retry/", pow);
        this.A0I.sendMessageDelayed(this.A0I.obtainMessage(1, str), (long) pow);
    }

    public final void A10(String str, AnonymousClass2O2 r5) {
        StringBuilder sb = new StringBuilder("verify/request/");
        sb.append(str);
        sb.append("/code/ok");
        Log.i(sb.toString());
        AnonymousClass008.A0n(super.A0J, "new_jid", r5.A0G);
        A1C(this.A0L, this.A0M, r5.A08);
    }

    public final void A11(String str, AnonymousClass2O2 r6) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/2fa");
        Log.i(sb.toString());
        A1B(r6.A0F, r6.A0E, r6.A04);
    }

    public final void A12(String str, AnonymousClass2O2 r15) {
        long A022;
        long A023;
        if (str.equals("sms")) {
            String str2 = r15.A0C;
            if (str2 == null) {
                str2 = r15.A0B;
            }
            A022 = AnonymousClass0JE.A02(str2, -1) * 1000;
            A023 = AnonymousClass0JE.A02(r15.A0D, -1);
        } else if (str.equals("voice") || str.equals("flash")) {
            A022 = AnonymousClass0JE.A02(r15.A0C, -1) * 1000;
            String str3 = r15.A0D;
            if (str3 == null) {
                str3 = r15.A0B;
            }
            A023 = AnonymousClass0JE.A02(str3, -1);
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0K("Invalid method: ", str));
        }
        long j = A023 * 1000;
        if (A022 > 0) {
            this.A04.setVisibility(0);
            this.A0D.A01(A022, true);
            A0t(System.currentTimeMillis() + A022);
        } else {
            int i = (A022 > 0 ? 1 : (A022 == 0 ? 0 : -1));
            View view = this.A04;
            if (i < 0) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
                this.A0D.A02(true);
                A0d();
            }
        }
        if (j > 0) {
            this.A06.setVisibility(0);
            this.A0C.A01(j, true);
            A0u(System.currentTimeMillis() + j);
            return;
        }
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        View view2 = this.A06;
        if (i2 < 0) {
            view2.setVisibility(8);
            return;
        }
        view2.setVisibility(0);
        this.A0C.A02(true);
        A0e();
    }

    public final void A13(String str, AnonymousClass2O2 r5, String str2) {
        AnonymousClass008.A1T(AnonymousClass008.A0a("verify", str, "/request/", str, "/bad-parameter/"), r5.A0A);
        if (((ActivityC004702f) this).A0F != null) {
            AnonymousClass0JE.A0H(super.A0J, str2);
            if ("number".equals(r5.A0A)) {
                this.A0E.A01(38);
                return;
            }
            this.A0E.A01(27);
            if (str.equals("sms")) {
                A0h();
                return;
            }
            return;
        }
        throw null;
    }

    public final void A14(String str, AnonymousClass2O2 r4, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/next-method");
        Log.w(sb.toString());
        AnonymousClass0JE.A0H(super.A0J, str2);
        A12(str, r4);
        this.A0E.A01(40);
        A0l();
    }

    public final void A15(String str, AnonymousClass2O2 r12, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/provider-unroutable");
        Log.e(sb.toString());
        AnonymousClass0JE.A0H(super.A0J, str2);
        String str3 = r12.A0B;
        if (str3 == null) {
            this.A0E.A02(i);
            return;
        }
        try {
            long parseLong = Long.parseLong(str3) * 1000;
            this.A0o.A0D(parseLong);
            AnonymousClass30C r8 = this.A0E;
            AnonymousClass01X r9 = ((AnonymousClass2C0) this).A01;
            r8.A03(String.format(r9.A0I(), r9.A06(i2), C002001d.A1a(r9, parseLong)));
            A0u(System.currentTimeMillis() + parseLong);
            this.A0C.A01(parseLong, true);
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verify");
            sb2.append(str);
            sb2.append("/request/");
            sb2.append(str);
            sb2.append("/unroutable/time-not-int");
            Log.w(sb2.toString(), e);
            this.A0E.A02(i);
        }
    }

    public final void A16(String str, AnonymousClass2O2 r13, String str2, int i, int i2, String str3) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/no-routes");
        Log.w(sb.toString());
        AnonymousClass0JE.A0H(super.A0J, str2);
        String str4 = r13.A0B;
        if (str4 == null) {
            this.A0E.A02(i);
            this.A0q.A03(str3);
            return;
        }
        try {
            long parseLong = Long.parseLong(str4) * 1000;
            this.A0o.A0D(parseLong);
            AnonymousClass30C r9 = this.A0E;
            AnonymousClass01X r10 = ((AnonymousClass2C0) this).A01;
            r9.A03(String.format(r10.A0I(), r10.A06(i2), C002001d.A1a(r10, parseLong)));
            A0u(System.currentTimeMillis() + parseLong);
            this.A0C.A01(parseLong, true);
            this.A0q.A03(str3);
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("verify");
            sb2.append(str);
            sb2.append("/request/");
            sb2.append(str);
            sb2.append("/no-routes/time-not-int");
            Log.w(sb2.toString(), e);
            this.A0E.A02(i);
        }
    }

    public final void A17(String str, AnonymousClass2O3 r4, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        if (r4 == AnonymousClass2O3.ERROR_BAD_TOKEN) {
            str3 = "/bad-token";
        } else {
            str3 = "/invalid-skey";
        }
        AnonymousClass008.A1T(sb, str3);
        AnonymousClass0JE.A0H(super.A0J, str2);
        this.A0E.A01(43);
    }

    public final void A18(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/blocked");
        Log.e(sb.toString());
        A0w = 12;
        A0k();
        AnonymousClass0JE.A0H(super.A0J, str2);
        A0r();
    }

    public final void A19(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/missing-parameter");
        Log.e(sb.toString());
        if (((ActivityC004702f) this).A0F != null) {
            AnonymousClass0JE.A0H(super.A0J, str2);
            this.A0E.A01(28);
            return;
        }
        throw null;
    }

    public final void A1A(String str, String str2) {
        StringBuilder sb = new StringBuilder("verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        sb.append("/unspecified");
        Log.w(sb.toString());
        AnonymousClass0JE.A0H(super.A0J, str2);
        this.A0E.A01(109);
    }

    public final void A1B(String str, String str2, long j) {
        this.A0o.A0C(7);
        super.A0J.A0a(str, str2, j, -1, -1, this.A0d.A05());
        Intent intent = new Intent(this, VerifyTwoFactorAuth.class);
        intent.putExtra("changenumber", this.A0N);
        A0I(intent, false);
        finish();
    }

    public final void A1C(String str, String str2, String str3) {
        AnonymousClass0HM r3 = this.A0o;
        r3.A0E(str, str2, str3);
        A0w = 0;
        A0k();
        r3.A06();
        if (!this.A0N) {
            r3.A05().A00();
        } else if (!r3.A0F()) {
            Log.d("verifysms/verified/error-saving");
            finish();
            return;
        }
        Log.d("verifysms/verified/retry-clear");
        this.A0I.removeMessages(1);
        A0c();
        if (this.A0E.A02) {
            AnonymousClass0JE.A0F(this, r3, this.A0f, this.A0N);
        } else if (this.A0N) {
            startActivity(new Intent(this, Main.class));
        } else {
            r3.A0C(2);
            startActivity(new Intent(this, RegisterName.class));
        }
        super.A0J.A00.edit().remove("flash_call_eligible").remove("is_first_flash_call_request").apply();
        this.A0l.A01();
        this.A0m.A01(false);
        finish();
    }

    public final void A1D(boolean z) {
        String str;
        AnonymousClass03P r11 = this.A0b;
        TelephonyManager A0F2 = r11.A0F();
        if (A0F2 != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("verifysms/verify-number/network ");
            A0S2.append(A0F2.getNetworkOperator());
            Log.d(A0S2.toString());
            StringBuilder sb = new StringBuilder("verifysms/verify-number/network/name ");
            sb.append(A0F2.getNetworkOperatorName());
            Log.d(sb.toString());
            StringBuilder sb2 = new StringBuilder("verifysms/verify-number/sim ");
            sb2.append(A0F2.getSimOperator());
            sb2.append(" name=");
            sb2.append(A0F2.getSimOperatorName());
            Log.d(sb2.toString());
            AnonymousClass008.A1K(new StringBuilder("verifysms/verify-number/verification_state "), A0w);
        } else {
            Log.d("verifysms/verify-number tm=null");
        }
        Log.i("verifysms/request-sms");
        AnonymousClass00D r13 = super.A0J;
        AnonymousClass008.A0m(r13, "registration_code", null);
        C70823Mn r10 = new C70823Mn(r13.A08());
        if (r13.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
            r10.A02 = true;
        }
        AnonymousClass00T r1 = this.A0t;
        String str2 = this.A0L;
        String str3 = this.A0M;
        AnonymousClass03S r3 = this.A0g;
        if (this.A0T) {
            str = "2";
        } else {
            str = r3.A02("android.permission.RECEIVE_SMS") == 0 ? "1" : "0";
        }
        r1.ANC(new C09920dk(z, str2, str3, "sms", str, this.A0e, r10, r11, this, r13, this.A0n), new String[0]);
    }

    @Override // X.AbstractC03830Hx
    public void AAT(boolean z, String str) {
        if (str.equals("sms")) {
            if (z) {
                C002001d.A2N(this, 39);
            }
        } else if (str.equals("voice") || str.equals("flash")) {
            C002001d.A2N(this, 25);
        }
    }

    @Override // X.AbstractC03820Hw
    public void AAU() {
        C002001d.A2N(this, 24);
    }

    @Override // X.AbstractC03830Hx
    public void AEK(String str, AnonymousClass2O3 r36, AnonymousClass2O2 r37) {
        AnonymousClass2O3 r23 = AnonymousClass2O3.ERROR_MISSING_PARAMETER;
        AnonymousClass2O3 r13 = AnonymousClass2O3.ERROR_BAD_PARAMETER;
        AnonymousClass2O3 r12 = AnonymousClass2O3.ERROR_CONNECTIVITY;
        AnonymousClass2O3 r14 = AnonymousClass2O3.ERROR_TOO_MANY_ALL_METHODS;
        AnonymousClass2O3 r3 = AnonymousClass2O3.ERROR_TOO_MANY;
        AnonymousClass2O3 r15 = AnonymousClass2O3.ERROR_UNSPECIFIED;
        AnonymousClass2O3 r10 = AnonymousClass2O3.ERROR_TEMPORARILY_UNAVAILABLE;
        AnonymousClass2O3 r2 = AnonymousClass2O3.YES;
        AnonymousClass2O3 r5 = AnonymousClass2O3.OK;
        if (str.equals("sms")) {
            AnonymousClass0JE.A00 = "";
            if (r36 == r5) {
                if (r37 != null) {
                    A10("sms", r37);
                } else {
                    throw null;
                }
            } else if (r36 != r2) {
                A0o();
                StringBuilder sb = new StringBuilder("verifysms/error/status=");
                sb.append(r36);
                Log.i(sb.toString());
                if (r36 != r10) {
                    if (r36 == r15) {
                        A1A("sms", "server-send-request-error-unspecified");
                        A0h();
                    } else if (r36 == r3) {
                        if (r37 != null) {
                            Log.w("verifysms/request/sms/too-many-tries");
                            AnonymousClass0JE.A0H(super.A0J, "server-send-request-too-many-tries");
                            A12("sms", r37);
                            AnonymousClass0HP r22 = this.A0q;
                            r22.A03("failTooMany");
                            r22.A02("verify-tma");
                            String str2 = r37.A0B;
                            if (str2 == null) {
                                this.A0E.A01(42);
                                A0l();
                            } else {
                                try {
                                    long parseLong = Long.parseLong(str2) * 1000;
                                    this.A02 = parseLong;
                                    this.A0o.A0D(parseLong);
                                    AnonymousClass30C r102 = this.A0E;
                                    AnonymousClass01X r11 = ((AnonymousClass2C0) this).A01;
                                    r102.A03(r11.A0D(R.string.register_voice_input_error_maximum_with_time, C002001d.A1a(r11, this.A02)));
                                    A0t(System.currentTimeMillis() + this.A02);
                                    this.A0D.A01(this.A02, true);
                                } catch (NumberFormatException e) {
                                    Log.w("verifysms/request/sms/triedtoomanytimesallmethods/time-not-int", e);
                                    this.A0E.A01(42);
                                    A0l();
                                }
                            }
                        } else {
                            throw null;
                        }
                    } else if (r36 == r14) {
                        if (r37 != null) {
                            Log.w("verifysms/request/sms/too-many-tries-all-methods");
                            AnonymousClass0JE.A0H(super.A0J, "server-send-request-too-many-tries-all-methods");
                            AnonymousClass0HP r24 = this.A0q;
                            r24.A03("failTooMany");
                            r24.A02("verify-tma");
                            String str3 = r37.A0B;
                            if (str3 == null) {
                                this.A0E.A01(30);
                            } else {
                                try {
                                    long parseLong2 = Long.parseLong(str3) * 1000;
                                    this.A02 = parseLong2;
                                    this.A0o.A0D(parseLong2);
                                    this.A0R = true;
                                    this.A0E.A01(35);
                                } catch (NumberFormatException e2) {
                                    Log.w("verifysms/request/sms/triedtoomanytimesallmethods/time-not-int", e2);
                                    this.A0E.A01(30);
                                }
                            }
                            A0h();
                        } else {
                            throw null;
                        }
                    } else if (r36 == r12) {
                        AnonymousClass0JE.A0H(super.A0J, "server-send-request-error-connectivity");
                        A0i();
                        A0h();
                    } else if (r36 == r13) {
                        if (r37 != null) {
                            A13("sms", r37, "server-send-request-bad-param");
                        } else {
                            throw null;
                        }
                    } else if (r36 == r23) {
                        A19("sms", "server-send-request-missing-param");
                        A0h();
                    } else if (r36 == AnonymousClass2O3.ERROR_OLD_VERSION) {
                        Log.w("verifysms/request/sms/version-too-old");
                        this.A0W.A01 = true;
                        A0w = 8;
                        A0k();
                        A0s(23);
                    } else if (r36 == AnonymousClass2O3.ERROR_TOO_RECENT) {
                        if (r37 != null) {
                            StringBuilder A0S2 = AnonymousClass008.A0S("verifysms/request/sms/too-recent wait ");
                            A0S2.append(r37.A0B);
                            A0S2.append(" seconds");
                            Log.w(A0S2.toString());
                            AnonymousClass0JE.A0H(super.A0J, "server-send-request-too-recent");
                            String str4 = r37.A0B;
                            if (str4 == null) {
                                this.A0E.A02(R.string.register_try_is_too_recent_unspecified);
                            } else {
                                try {
                                    long parseLong3 = Long.parseLong(str4) * 1000;
                                    this.A0o.A0D(parseLong3);
                                    AnonymousClass30C r103 = this.A0E;
                                    AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
                                    r103.A03(r6.A0D(R.string.register_try_is_too_recent, C002001d.A1a(r6, parseLong3)));
                                } catch (NumberFormatException e3) {
                                    Log.w("verifysms/request/sms/too-recent/time-not-int", e3);
                                    this.A0E.A02(R.string.register_try_is_too_recent_unspecified);
                                }
                            }
                            A0h();
                        } else {
                            throw null;
                        }
                    } else if (r36 == AnonymousClass2O3.ERROR_BLOCKED) {
                        A18("sms", "server-send-request-user-blocked");
                        A0h();
                    } else if (r36 == AnonymousClass2O3.ERROR_NEXT_METHOD) {
                        if (r37 != null) {
                            A14("sms", r37, "server-send-request-next-method");
                        } else {
                            throw null;
                        }
                    } else if (r36 == AnonymousClass2O3.ERROR_TOO_MANY_GUESSES) {
                        if (r37 != null) {
                            Log.w("verifysms/request/sms/too-many-guesses");
                            AnonymousClass0JE.A0H(super.A0J, "server-send-request-too-many-guesses");
                            AnonymousClass0HP r32 = this.A0q;
                            r32.A03("failTooMany");
                            r32.A02("verify-tmg");
                            String str5 = r37.A0B;
                            if (str5 == null) {
                                this.A0E.A01(31);
                            } else {
                                try {
                                    long parseLong4 = Long.parseLong(str5) * 1000;
                                    this.A02 = parseLong4;
                                    this.A0o.A0D(parseLong4);
                                    this.A0R = true;
                                    this.A0E.A01(36);
                                } catch (NumberFormatException e4) {
                                    Log.w("verifysms/request/sms/too-many-guesses/time-not-int", e4);
                                    this.A0E.A01(31);
                                }
                            }
                            A0h();
                        } else {
                            throw null;
                        }
                    } else if (r36 == AnonymousClass2O3.ERROR_PROVIDER_TIMEOUT) {
                        if (r37 != null) {
                            Log.e("verifysms/request/sms/provider-timeout");
                            AnonymousClass0JE.A0H(super.A0J, "server-send-request-provider-timeout");
                            String str6 = r37.A0B;
                            if (str6 == null) {
                                this.A0E.A02(R.string.register_sms_provider_timeout_unspecified);
                            } else {
                                try {
                                    long parseLong5 = Long.parseLong(str6) * 1000;
                                    this.A0o.A0D(parseLong5);
                                    AnonymousClass30C r122 = this.A0E;
                                    AnonymousClass01X r112 = ((AnonymousClass2C0) this).A01;
                                    r122.A03(r112.A0D(R.string.register_sms_provider_timeout, C002001d.A1a(r112, parseLong5)));
                                    A0t(System.currentTimeMillis() + parseLong5);
                                    this.A0D.A01(parseLong5, true);
                                } catch (NumberFormatException e5) {
                                    Log.w("verifysms/request/sms/too-recent/time-not-int", e5);
                                    this.A0E.A02(R.string.register_sms_provider_timeout_unspecified);
                                }
                            }
                            A0h();
                        } else {
                            throw null;
                        }
                    } else if (r36 == AnonymousClass2O3.ERROR_PROVIDER_UNROUTABLE) {
                        if (r37 != null) {
                            A15("sms", r37, "server-send-request-provider-unroutable", R.string.register_sms_provider_unroutable_unspecified, R.string.register_sms_provider_unroutable);
                        } else {
                            throw null;
                        }
                    } else if (r36 == AnonymousClass2O3.ERROR_NO_ROUTES) {
                        if (r37 != null) {
                            A16("sms", r37, "server-send-request-no-routes", R.string.register_sms_provider_unroutable_unspecified, R.string.register_sms_provider_unroutable, "noRouteSms");
                        } else {
                            throw null;
                        }
                    } else if (r36 == AnonymousClass2O3.ERROR_BAD_TOKEN || r36 == AnonymousClass2O3.ERROR_INVALID_SKEY_SIGNATURE) {
                        A17("sms", r36, "server-send-request-bad-token");
                    } else if (r36 == AnonymousClass2O3.SECURITY_CODE) {
                        if (r37 != null) {
                            A11("sms", r37);
                        } else {
                            throw null;
                        }
                    }
                    if (r37 == null) {
                        Log.w("verifysms/onSmsCodeRequestResponse/response is null");
                        this.A0D.A01(300000, true);
                        this.A0C.A01(300000, true);
                        return;
                    }
                } else if (r37 != null) {
                    Log.w("verifysms/request/sms/temp-unavail");
                    AnonymousClass0JE.A0H(super.A0J, "server-send-request-temp-unavailable");
                    String str7 = r37.A0B;
                    if (str7 == null) {
                        this.A0E.A02(R.string.register_temporarily_unavailable);
                    } else {
                        try {
                            long parseLong6 = Long.parseLong(str7) * 1000;
                            this.A0o.A0D(parseLong6);
                            AnonymousClass30C r7 = this.A0E;
                            AnonymousClass01X r62 = ((AnonymousClass2C0) this).A01;
                            r7.A03(r62.A0D(R.string.register_temporarily_unavailable_with_time, C002001d.A1a(r62, parseLong6)));
                        } catch (NumberFormatException e6) {
                            Log.w("verifysms/request/sms/temporarily-unavailable/unable-to-parse-retryAfter", e6);
                            this.A0E.A02(R.string.register_temporarily_unavailable);
                        }
                    }
                    A0h();
                } else {
                    throw null;
                }
            } else if (r37 != null) {
                Log.i("verifysms/request/sms/requested");
                int i = r37.A01;
                if (i != 0) {
                    A0u = i;
                    AnonymousClass008.A0k(super.A0J, "registration_sms_code_length", i);
                }
                if (!TextUtils.isEmpty(r37.A09)) {
                    this.A0o.A0D(Long.parseLong(r37.A09) * 1000);
                }
                A0n();
                AnonymousClass00D r25 = super.A0J;
                r25.A00.edit().putInt("flash_call_eligible", r37.A00).apply();
            } else {
                throw null;
            }
            StringBuilder A0S3 = AnonymousClass008.A0S("verifysms/request/sms/sms_wait=");
            A0S3.append(r37.A0C);
            A0S3.append(";voice_wait=");
            A0S3.append(r37.A0D);
            A0S3.append(";retry_after=");
            A0S3.append(r37.A0B);
            Log.d(A0S3.toString());
            A12("sms", r37);
        } else if (str.equals("voice") || str.equals("flash")) {
            AnonymousClass2O3 r21 = AnonymousClass2O3.ERROR_FLASH_CALL_DISABLED;
            AnonymousClass0JE.A00 = "";
            if (r36 == r5) {
                if (r37 != null) {
                    A10(str, r37);
                } else {
                    throw null;
                }
            } else if (r36 != r2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("verifyvoice/request/");
                sb2.append(str);
                sb2.append("/error/status=");
                sb2.append(r36);
                Log.i(sb2.toString());
                if (r36 == r10) {
                    if (r37 != null) {
                        AnonymousClass008.A1C("verifyvoice/request/", str, "/temp-unavail");
                        AnonymousClass0JE.A0H(super.A0J, "voice-temp-unavail");
                        String str8 = r37.A0B;
                        if (str8 == null) {
                            this.A0E.A02(R.string.register_temporarily_unavailable);
                        } else {
                            try {
                                long parseLong7 = Long.parseLong(str8) * 1000;
                                this.A0o.A0D(parseLong7);
                                AnonymousClass30C r123 = this.A0E;
                                AnonymousClass01X r113 = ((AnonymousClass2C0) this).A01;
                                r123.A03(r113.A0D(R.string.register_temporarily_unavailable_with_time, C002001d.A1a(r113, parseLong7)));
                                A0u(System.currentTimeMillis() + parseLong7);
                                this.A0C.A01(parseLong7, true);
                            } catch (NumberFormatException e7) {
                                A05(str, "/temporarily-unavailable/unable-to-parse-retryAfter", e7);
                                this.A0E.A02(R.string.register_temporarily_unavailable);
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (r36 == r15) {
                    A1A(str, "voice-error");
                } else if (r36 == r3) {
                    if (r37 != null) {
                        AnonymousClass008.A1C("verifyvoice/request/", str, "/too-many-tries");
                        AnonymousClass0JE.A0H(super.A0J, "voice-error-too-many-tries");
                        A12(str, r37);
                        AnonymousClass0HP r26 = this.A0q;
                        r26.A03("failTooMany");
                        r26.A02("verify-tma");
                        String str9 = r37.A0B;
                        if (str9 == null) {
                            this.A0E.A01(29);
                            A0l();
                        } else {
                            try {
                                long parseLong8 = Long.parseLong(str9) * 1000;
                                this.A02 = parseLong8;
                                this.A0o.A0D(parseLong8);
                                AnonymousClass30C r114 = this.A0E;
                                AnonymousClass01X r124 = ((AnonymousClass2C0) this).A01;
                                r114.A03(r124.A0D(R.string.register_voice_input_error_maximum_with_time, C002001d.A1a(r124, this.A02)));
                                A0u(System.currentTimeMillis() + this.A02);
                                this.A0C.A01(this.A02, true);
                            } catch (NumberFormatException e8) {
                                A05(str, "/triedtoomanytimesallmethods/time-not-int", e8);
                                this.A0E.A01(29);
                                A0l();
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (r36 == r14) {
                    if (r37 != null) {
                        AnonymousClass008.A1C("verifyvoice/request/", str, "/too-many-tries-all-methods");
                        AnonymousClass0JE.A0H(super.A0J, "voice-error-too-many-tries-all-methods");
                        AnonymousClass0HP r27 = this.A0q;
                        r27.A03("failTooMany");
                        r27.A02("verify-tma");
                        String str10 = r37.A0B;
                        if (str10 == null) {
                            this.A0E.A01(30);
                        } else {
                            try {
                                long parseLong9 = Long.parseLong(str10) * 1000;
                                this.A02 = parseLong9;
                                this.A0o.A0D(parseLong9);
                                this.A0E.A01(35);
                                A0u(System.currentTimeMillis() + this.A02);
                                this.A0C.A01(this.A02, true);
                            } catch (NumberFormatException e9) {
                                A05(str, "/triedtoomanytimesallmethods/time-not-int", e9);
                                this.A0E.A01(30);
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (r36 == r12) {
                    A0i();
                } else if (r36 == r13) {
                    if (r37 != null) {
                        A13(str, r37, "voice-bad-param");
                    } else {
                        throw null;
                    }
                } else if (r36 == r23) {
                    A19(str, "voice-missing-param");
                } else if (r36 == AnonymousClass2O3.ERROR_OLD_VERSION) {
                    AnonymousClass008.A1C("verifyvoice/request/", str, "/version-too-old");
                    AnonymousClass0JE.A0H(super.A0J, "voice-version-too-old");
                    A0s(23);
                } else if (r36 == AnonymousClass2O3.ERROR_TOO_RECENT) {
                    if (r37 != null) {
                        AnonymousClass008.A1V(AnonymousClass008.A0Z("verifyvoice/request/", str, "/too-recent "), r37.A0B);
                        AnonymousClass0JE.A0H(super.A0J, "voice-too-recent");
                        String str11 = r37.A0B;
                        if (str11 == null) {
                            this.A0E.A02(R.string.register_try_is_too_recent_unspecified);
                        } else {
                            try {
                                long parseLong10 = Long.parseLong(str11) * 1000;
                                this.A0o.A0D(parseLong10);
                                AnonymousClass30C r132 = this.A0E;
                                AnonymousClass01X r125 = ((AnonymousClass2C0) this).A01;
                                r132.A03(r125.A0D(R.string.register_try_is_too_recent, C002001d.A1a(r125, parseLong10)));
                                A0u(System.currentTimeMillis() + parseLong10);
                                this.A0C.A01(parseLong10, true);
                            } catch (NumberFormatException e10) {
                                A05(str, "/too-recent/time-not-int", e10);
                                this.A0E.A02(R.string.register_try_is_too_recent_unspecified);
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (r36 == AnonymousClass2O3.ERROR_BLOCKED) {
                    A18(str, "voice-blocked");
                } else if (r36 == AnonymousClass2O3.ERROR_NEXT_METHOD) {
                    if (r37 != null) {
                        A14(str, r37, "voice-next-method");
                    } else {
                        throw null;
                    }
                } else if (r36 == AnonymousClass2O3.ERROR_TOO_MANY_GUESSES) {
                    if (r37 != null) {
                        AnonymousClass008.A1C("verifyvoice/request/", str, "/too-many-guesses");
                        AnonymousClass0JE.A0H(super.A0J, "voice-too-many-guesses");
                        AnonymousClass0HP r33 = this.A0q;
                        r33.A03("failTooMany");
                        r33.A02("verify-tmg");
                        String str12 = r37.A0B;
                        if (str12 == null) {
                            this.A0E.A01(31);
                        } else {
                            try {
                                long parseLong11 = Long.parseLong(str12) * 1000;
                                this.A02 = parseLong11;
                                this.A0o.A0D(parseLong11);
                                this.A0E.A01(36);
                                A0u(System.currentTimeMillis() + this.A02);
                                this.A0C.A01(this.A02, true);
                            } catch (NumberFormatException e11) {
                                A05(str, "/too-many-guesses/time-not-int", e11);
                                this.A0E.A01(31);
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (r36 == AnonymousClass2O3.ERROR_PROVIDER_TIMEOUT) {
                    if (r37 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("verifyvoice/request/");
                        sb3.append(str);
                        sb3.append("/provider-timeout");
                        Log.e(sb3.toString());
                        AnonymousClass0JE.A0H(super.A0J, "voice-provider-timeout");
                        String str13 = r37.A0B;
                        if (str13 == null) {
                            this.A0E.A02(R.string.register_voice_provider_timeout_unspecified);
                        } else {
                            try {
                                long parseLong12 = Long.parseLong(str13) * 1000;
                                this.A0o.A0D(parseLong12);
                                AnonymousClass30C r133 = this.A0E;
                                AnonymousClass01X r126 = ((AnonymousClass2C0) this).A01;
                                r133.A03(r126.A0D(R.string.register_voice_provider_timeout, C002001d.A1a(r126, parseLong12)));
                                A0u(System.currentTimeMillis() + parseLong12);
                                this.A0C.A01(parseLong12, true);
                            } catch (NumberFormatException e12) {
                                A05(str, "/too-recent/time-not-int", e12);
                                this.A0E.A02(R.string.register_voice_provider_timeout_unspecified);
                            }
                        }
                    } else {
                        throw null;
                    }
                } else if (r36 == AnonymousClass2O3.ERROR_PROVIDER_UNROUTABLE) {
                    if (r37 != null) {
                        A15(str, r37, "voice-provider-unroutable", R.string.register_voice_provider_unroutable_unspecified, R.string.register_voice_provider_unroutable);
                    } else {
                        throw null;
                    }
                } else if (r36 == AnonymousClass2O3.ERROR_NO_ROUTES) {
                    if (r37 != null) {
                        A16(str, r37, "voice-no-routes", R.string.register_voice_provider_unroutable_unspecified, R.string.register_voice_provider_unroutable, "noRouteVoice");
                    } else {
                        throw null;
                    }
                } else if (r36 == AnonymousClass2O3.ERROR_BAD_TOKEN || r36 == AnonymousClass2O3.ERROR_INVALID_SKEY_SIGNATURE) {
                    A17(str, r36, "voice-bad-token");
                } else if (r36 == AnonymousClass2O3.SECURITY_CODE) {
                    if (r37 != null) {
                        A11(str, r37);
                    } else {
                        throw null;
                    }
                } else if (str.equals("flash") && r36 == r21) {
                    Log.e("verifyvoice/request/flash/flash-call-disabled/fallback-to-voice");
                    AnonymousClass00D r34 = super.A0J;
                    C70823Mn r8 = new C70823Mn(r34.A08());
                    if (r34.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
                        r8.A02 = true;
                    }
                    this.A0t.ANC(A0U(false, r8), new String[0]);
                }
            } else if (r37 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("verifyvoice/request/");
                sb4.append(str);
                sb4.append("/requested");
                Log.i(sb4.toString());
                int i2 = r37.A01;
                if (i2 != 0) {
                    A0v = i2;
                    this.A0A.A02 = i2;
                    AnonymousClass008.A0k(super.A0J, "registration_voice_code_length", i2);
                }
                if (!TextUtils.isEmpty(r37.A09)) {
                    this.A0o.A0D(Long.parseLong(r37.A09) * 1000);
                }
                if (str.equals("flash")) {
                    AnonymousClass0JI r142 = this.A0l;
                    String str14 = this.A0L;
                    String str15 = this.A0M;
                    if (str15 != null) {
                        String str16 = r37.A06;
                        if (str16 != null) {
                            C70833Mo r127 = this.A0J;
                            Application application = r142.A03.A00;
                            AnonymousClass30B r104 = r142.A00;
                            if (r104 == null) {
                                r104 = new AnonymousClass30B(r142.A07, r142.A02, r142.A04, r142.A05, r142.A06, str16, str14, str15, r127, this);
                                r142.A00 = r104;
                            }
                            application.registerReceiver(r104, new IntentFilter("android.intent.action.PHONE_STATE"), "com.whatsapp.permission.BROADCAST", null);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                A0n();
            } else {
                throw null;
            }
            A0q();
            if (r37 != null) {
                StringBuilder A0S4 = AnonymousClass008.A0S("verifysms/request/voice/sms_wait=");
                A0S4.append(r37.A0C);
                A0S4.append(";voice_wait=");
                A0S4.append(r37.A0D);
                A0S4.append(";retry_after=");
                A0S4.append(r37.A0B);
                Log.d(A0S4.toString());
                if (!str.equals("flash") || r36 != r21) {
                    A12(str, r37);
                    return;
                }
                return;
            }
            Log.w("verifysms/onSmsCodeRequestResponse/response is null");
            this.A0D.A01(300000, true);
            this.A0C.A01(300000, true);
        }
    }

    @Override // X.AbstractC03820Hw
    public void AEL(String str, AnonymousClass2O7 r23, AnonymousClass2O6 r24) {
        long j;
        AnonymousClass2O7 r20 = AnonymousClass2O7.FAIL_STALE;
        AnonymousClass2O7 r19 = AnonymousClass2O7.FAIL_BLOCKED;
        AnonymousClass2O7 r18 = AnonymousClass2O7.ERROR_UNSPECIFIED;
        AnonymousClass2O7 r15 = AnonymousClass2O7.FAIL_TOO_MANY_GUESSES;
        AnonymousClass2O7 r14 = AnonymousClass2O7.FAIL_MISSING;
        AnonymousClass2O7 r13 = AnonymousClass2O7.SECURITY_CODE;
        AnonymousClass2O7 r12 = AnonymousClass2O7.FAIL_TEMPORARILY_UNAVAILABLE;
        AnonymousClass2O7 r11 = AnonymousClass2O7.FAIL_GUESSED_TOO_FAST;
        AnonymousClass2O7 r9 = AnonymousClass2O7.ERROR_CONNECTIVITY;
        AnonymousClass2O7 r0 = AnonymousClass2O7.FAIL_MISMATCH;
        AnonymousClass2O7 r8 = AnonymousClass2O7.YES;
        if (str.equals("sms")) {
            if (r23 == r8) {
                Log.i("verifysms/verifysms/verified");
                AnonymousClass008.A0n(super.A0J, "new_jid", r24.A07);
                this.A0D.A02(true);
                A0c();
                A1C(this.A0L, this.A0M, r24.A03);
            } else if (r23 == r0) {
                Log.i("verifysms/verifysms/unauthorized");
                AnonymousClass0JE.A0H(super.A0J, "server-send-mismatch");
                A0c();
                A0s(34);
            } else {
                String A0V2 = A0V();
                if (r23 == r9) {
                    Log.w("verifysms/verifysms/connectivity");
                    if (A0V2 == null) {
                        Log.e("verifysms/verifysms/error/connectivity/saved-code-is-null");
                        A0w = 4;
                        A0k();
                        A0s(21);
                        return;
                    }
                    A0z(A0V2);
                } else if (r23 == r11) {
                    Log.e("verifysms/verifysms/guessed-too-fast");
                    AnonymousClass0JE.A0H(super.A0J, "server-send-guessed-too-fast");
                    if (A0V2 == null) {
                        Log.e("verifysms/verifysms/error/too-fast/saved-code-is-null");
                        A0m();
                        return;
                    }
                    A0z(A0V2);
                } else if (r23 == r12) {
                    Log.e("verifysms/verifysms/error-temporarily-unavailable");
                    AnonymousClass0JE.A0H(super.A0J, "server-send-error-temporarily-unavailable");
                    if (A0V2 == null) {
                        Log.e("verifysms/verifysms/error/temp-unavail/saved-code-is-null");
                        A0m();
                        return;
                    }
                    A0z(A0V2);
                } else if (r23 == r13) {
                    Log.i("verifysms/verifysms/2fa");
                    A1B(r24.A06, r24.A05, r24.A00);
                } else {
                    A0c();
                    if (r23 == r14) {
                        Log.e("verifysms/verifysms/missing");
                        AnonymousClass0JE.A0H(super.A0J, "server-send-missing");
                        this.A0A.setText("");
                    } else if (r23 == r15) {
                        Log.e("verifysms/verifysms/too-many-guesses");
                        AnonymousClass0JE.A0H(super.A0J, "server-send-too-many-guesses");
                        AnonymousClass0HP r02 = this.A0q;
                        r02.A03("failTooMany");
                        r02.A02("verify-tmg");
                    } else if (r23 == r18) {
                        Log.e("verifysms/verifysms/error");
                        AnonymousClass0JE.A0H(super.A0J, "server-send-error-unspecified");
                    } else if (r23 == r20) {
                        Log.e("verifysms/verifysms/stale");
                        AnonymousClass0JE.A0H(super.A0J, "server-send-error-stale");
                        this.A0A.setText("");
                    }
                    if (r23 == r19) {
                        Log.e("verifysms/verifysms/blocked");
                        A0w = 12;
                        A0k();
                        AnonymousClass0JE.A0H(super.A0J, "server-send-blocked");
                        A0r();
                        A0h();
                        return;
                    }
                    A0m();
                }
            }
        } else if (str.equals("voice") || str.equals("flash")) {
            if (r23 == r8) {
                Log.i("verifyvoice/verifyvoice/verified");
                AnonymousClass008.A0n(super.A0J, "new_jid", r24.A07);
                if (str == "flash") {
                    this.A0l.A01 = "successful";
                }
                A1C(this.A0L, this.A0M, r24.A03);
            } else if (r23 == r0) {
                Log.i("verifyvoice/verifyvoice/incorrect");
                this.A0A.setText("");
                String str2 = r24.A04;
                if (str2 != null) {
                    try {
                        j = Long.parseLong(str2) * 1000;
                        if (j <= 0) {
                            this.A0E.A02(R.string.register_voice_input_error_message);
                            A0v(j);
                        }
                    } catch (NumberFormatException e) {
                        Log.w("verifyvoice/verifyvoice/retryafter failed to parse", e);
                    }
                    AnonymousClass30C r7 = this.A0E;
                    AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
                    r7.A03(r6.A0D(R.string.register_voice_input_error_message_with_time, C002001d.A1a(r6, j)));
                    A0v(j);
                }
                j = 60000;
                AnonymousClass30C r72 = this.A0E;
                AnonymousClass01X r62 = ((AnonymousClass2C0) this).A01;
                r72.A03(r62.A0D(R.string.register_voice_input_error_message_with_time, C002001d.A1a(r62, j)));
                A0v(j);
            } else if (r23 == r18) {
                Log.e("verifyvoice/verifyvoice/error");
                this.A07.setVisibility(0);
                this.A0E.A01(109);
            } else if (r23 == r14) {
                Log.e("verifyvoice/verifyvoice/error-missing");
                this.A0A.setText("");
                AnonymousClass30C r63 = this.A0E;
                AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
                r63.A03(r5.A0D(R.string.verify_code_need_to_request_code, r5.A06(R.string.verify_resend_sms_button), r5.A06(R.string.verify_voice_call_button)));
            } else if (r23 == r15) {
                Log.e("verifyvoice/verifyvoice/error-too-many-guesses");
                AnonymousClass0HP r03 = this.A0q;
                r03.A03("failTooMany");
                r03.A02("verify-tmg");
                String str3 = r24.A04;
                if (str3 == null) {
                    this.A0E.A01(31);
                } else {
                    try {
                        long parseLong = Long.parseLong(str3) * 1000;
                        this.A02 = parseLong;
                        this.A0o.A0D(parseLong);
                        this.A0E.A01(36);
                        A0v(this.A02);
                    } catch (NumberFormatException e2) {
                        Log.w("verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter", e2);
                        this.A0E.A01(31);
                    }
                }
            } else if (r23 == r11) {
                Log.e("verifyvoice/verifyvoice/error-guessed-too-fast");
                this.A0A.setText("");
                String str4 = r24.A04;
                if (str4 == null) {
                    this.A0E.A03(((AnonymousClass2C0) this).A01.A06(R.string.register_guessed_too_fast));
                } else {
                    try {
                        long parseLong2 = Long.parseLong(str4) * 1000;
                        this.A0o.A0D(parseLong2);
                        AnonymousClass30C r73 = this.A0E;
                        AnonymousClass01X r64 = ((AnonymousClass2C0) this).A01;
                        r73.A03(r64.A0D(R.string.register_guessed_too_fast_with_time, C002001d.A1a(r64, parseLong2)));
                        A0v(parseLong2);
                    } catch (NumberFormatException e3) {
                        Log.w("verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter", e3);
                        this.A0E.A02(R.string.register_guessed_too_fast);
                    }
                }
            } else if (r23 == r9) {
                Log.e("verifyvoice/verifyvoice/error-connectivity");
                this.A07.setVisibility(0);
                AnonymousClass30C r52 = this.A0E;
                AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
                r52.A03(r3.A0D(R.string.register_check_connectivity, r3.A06(R.string.connectivity_self_help_instructions)));
            } else if (r23 == r19) {
                Log.e("verifyvoice/verifyvoice/error-blocked");
                A0w = 12;
                A0r();
            } else if (r23 == r20) {
                Log.w("verifyvoice/verifyvoice/stale");
                this.A0A.setText("");
                this.A0E.A02(R.string.register_stale);
            } else if (r23 == r12) {
                Log.w("verifyvoice/verifyvoice/temporarily-unavailable");
                AnonymousClass0JE.A0H(super.A0J, "voice-temporarily-unavailable");
                String str5 = r24.A04;
                if (str5 == null) {
                    this.A0E.A02(R.string.register_temporarily_unavailable);
                } else {
                    try {
                        long parseLong3 = Long.parseLong(str5) * 1000;
                        this.A0o.A0D(parseLong3);
                        AnonymousClass30C r74 = this.A0E;
                        AnonymousClass01X r65 = ((AnonymousClass2C0) this).A01;
                        r74.A03(r65.A0D(R.string.register_temporarily_unavailable_with_time, C002001d.A1a(r65, parseLong3)));
                        A0v(parseLong3);
                    } catch (NumberFormatException e4) {
                        Log.w("verifyvoice/verifyvoice/unable-to-parse-retryAfter", e4);
                        this.A0E.A02(R.string.register_temporarily_unavailable);
                    }
                }
            } else if (r23 == r13) {
                Log.i("verifyvoice/verifyvoice/2fa");
                A1B(r24.A06, r24.A05, r24.A00);
            }
            A0q();
        }
    }

    @Override // X.AbstractC03820Hw
    public void AJ4() {
        this.A0l.A01 = "failed";
    }

    @Override // X.AbstractC03830Hx
    public void APw(boolean z, String str) {
        if (str.equals("sms")) {
            A0w = 0;
            this.A0D.A00();
            this.A0C.A00();
            Log.d("verifysms/registertextreceiver");
            if (this.A0T) {
                this.A0S = true;
                registerReceiver(this.A0H, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
            } else {
                IntentFilter intentFilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(Integer.MAX_VALUE);
                registerReceiver(this.A0F, intentFilter);
                this.A0Q = true;
            }
            this.A0o.A06();
            if (z) {
                C002001d.A2O(this, 39);
            }
        } else if ((str.equals("voice") || str.equals("flash")) && z) {
            C002001d.A2O(this, 25);
        }
        this.A0l.A01();
    }

    @Override // X.AbstractC03820Hw
    public void APx() {
        C002001d.A2O(this, 24);
    }

    public SharedPreferences getPreferences(int i) {
        return this.A0k.A01(getLocalClassName());
    }

    public void lambda$onCreate$2429$VerifySms(View view) {
        StringBuilder A0S2 = AnonymousClass008.A0S("verifysms/request-call/cc=");
        A0S2.append(this.A0L);
        A0S2.append("/number=");
        AnonymousClass008.A1U(A0S2, this.A0M);
        this.A0l.A01 = "ineligible";
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            AnonymousClass008.A1L(AnonymousClass008.A0S("verifysms/is-flash-call-eligible/api="), i);
        } else {
            TelephonyManager A0F2 = this.A0b.A0F();
            if (A0F2 == null || A0F2.getSimState() != 1) {
                SharedPreferences sharedPreferences = super.A0J.A00;
                boolean z = sharedPreferences.getBoolean("is_first_flash_call_request", true);
                int i2 = sharedPreferences.getInt("flash_call_eligible", 0);
                StringBuilder sb = new StringBuilder("verifysms/is-flash-call-eligible/isFirstFlashCallRequest=");
                sb.append(z);
                sb.append("/flashCallEligible=");
                sb.append(i2);
                Log.i(sb.toString());
                if (z && (i2 == 1 || i2 == 2 || i2 == 3)) {
                    sharedPreferences.edit().putBoolean("is_first_flash_call_request", false).apply();
                    Log.i("verifysms/request-flash");
                    AnonymousClass03S r1 = this.A0g;
                    if (!r1.A05()) {
                        Log.i("verifysms/request-flash/request-permission");
                        RequestPermissionActivity.A0D(this, r1);
                        return;
                    }
                    Log.i("verifysms/request-flash/has-permission");
                    A0g();
                    return;
                }
            } else {
                Log.i("verifysms/is-flash-call-eligible/sim absent");
            }
        }
        Log.i("verifysms/request-voice");
        AnonymousClass00D r2 = super.A0J;
        C70823Mn r3 = new C70823Mn(r2.A08());
        TelephonyManager A0F3 = this.A0b.A0F();
        boolean z2 = false;
        if (A0F3 != null && A0F3.getSimState() == 1) {
            z2 = true;
        }
        r3.A01 = Boolean.valueOf(z2);
        if (r2.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
            r3.A02 = true;
        }
        this.A0t.ANC(A0U(true, r3), new String[0]);
    }

    public /* synthetic */ void lambda$onCreate$2430$VerifySms(View view) {
        Log.i("verifyvoice/retryverify");
        String code = this.A0A.getCode();
        this.A07.setVisibility(4);
        A0w(code);
    }

    public /* synthetic */ void lambda$onCreate$2431$VerifySms(View view) {
        A1D(true);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 700) {
            return;
        }
        if (i2 == -1) {
            Log.i("verifysms/activity-result/permission-accepted/request-flash");
            A0g();
            return;
        }
        Log.i("verifysms/activity-result/permission-declined/request-voice");
        AnonymousClass00D r1 = super.A0J;
        C70823Mn r4 = new C70823Mn(r1.A08());
        if (r1.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
            r4.A02 = true;
        }
        r4.A00 = Boolean.FALSE;
        this.A0t.ANC(A0U(true, r4), new String[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x042e, code lost:
        if (r31.A0g.A02("android.permission.RECEIVE_SMS") == 0) goto L_0x0430;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r32) {
        /*
        // Method dump skipped, instructions count: 1130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.VerifySms.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 21) {
            AnonymousClass0MB r4 = new AnonymousClass0MB(this);
            AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
            r4.A01.A0E = r3.A0D(R.string.register_check_connectivity_code_verififcation, r3.A06(R.string.connectivity_self_help_instructions));
            r4.A07(r3.A06(R.string.ok), new DialogInterface$OnClickListenerC65372zk(this));
            return r4.A00();
        } else if (i == 109) {
            return AnonymousClass0JE.A05(this, this.A0t, this.A0b, ((AnonymousClass2C0) this).A01, this.A0a, this.A0g, this.A0n);
        } else {
            if (i != 500) {
                if (i != 124) {
                    if (i == 125) {
                        return AnonymousClass0JE.A03(this, ((AnonymousClass2C0) this).A01, this.A0L, this.A0M);
                    }
                    switch (i) {
                        case 23:
                            A0w = 0;
                            A0k();
                            this.A0o.A0C(1);
                            DialogC40171sk r1 = new DialogC40171sk(this, ((AnonymousClass2C0) this).A01, this.A0W, ((ActivityC004602e) this).A04, this, this.A0X);
                            r1.setOnCancelListener(new AnonymousClass18B(this));
                            return r1;
                        case 24:
                            ProgressDialog progressDialog = new ProgressDialog(this);
                            progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.register_voice_verifying));
                            progressDialog.setIndeterminate(true);
                            progressDialog.setCancelable(false);
                            return progressDialog;
                        case 25:
                            ProgressDialog progressDialog2 = new ProgressDialog(this);
                            progressDialog2.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.register_voice_request_message));
                            progressDialog2.setIndeterminate(true);
                            progressDialog2.setCancelable(false);
                            return progressDialog2;
                        default:
                            switch (i) {
                                case 27:
                                case 28:
                                    AnonymousClass0MB r32 = new AnonymousClass0MB(this);
                                    AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
                                    String A062 = r2.A06(R.string.register_unrecoverable_error);
                                    AnonymousClass0MC r0 = r32.A01;
                                    r0.A0E = A062;
                                    r0.A0J = false;
                                    r32.A07(r2.A06(R.string.register_contact_support), new DialogInterface$OnClickListenerC65412zo(this, i));
                                    r32.A05(r2.A06(R.string.cancel), new DialogInterface$OnClickListenerC65402zn(this, i));
                                    return r32.A00();
                                case 29:
                                    AnonymousClass0MB r22 = new AnonymousClass0MB(this);
                                    r22.A01.A0E = A0Z();
                                    r22.A07(((AnonymousClass2C0) this).A01.A06(R.string.ok), new DialogInterface$OnClickListenerC65442zr(this, i));
                                    return r22.A00();
                                case 30:
                                    AnonymousClass0MB r33 = new AnonymousClass0MB(this);
                                    AnonymousClass01X r23 = ((AnonymousClass2C0) this).A01;
                                    String A063 = r23.A06(R.string.register_server_voice_too_many_tries);
                                    AnonymousClass0MC r02 = r33.A01;
                                    r02.A0E = A063;
                                    r02.A0J = false;
                                    r33.A07(r23.A06(R.string.register_contact_support), new DialogInterface$OnClickListenerC65392zm(this, i));
                                    r33.A05(r23.A06(R.string.cancel), new DialogInterface$OnClickListenerC65472zu(this, i));
                                    return r33.A00();
                                case 31:
                                    AnonymousClass0MB r34 = new AnonymousClass0MB(this);
                                    AnonymousClass01X r24 = ((AnonymousClass2C0) this).A01;
                                    String A064 = r24.A06(R.string.register_voice_input_error_maximum);
                                    AnonymousClass0MC r03 = r34.A01;
                                    r03.A0E = A064;
                                    r03.A0J = false;
                                    r34.A07(r24.A06(R.string.register_contact_support), new DialogInterface$OnClickListenerC65342zh(this, i));
                                    r34.A05(r24.A06(R.string.cancel), new DialogInterface$OnClickListenerC65362zj(this, i));
                                    return r34.A00();
                                default:
                                    switch (i) {
                                        case 33:
                                            AnonymousClass0MB r8 = new AnonymousClass0MB(this);
                                            AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
                                            int i2 = A0v;
                                            r8.A01.A0E = r7.A0A(R.plurals.register_voice_input_error_length_error, (long) i2, Integer.valueOf(i2));
                                            r8.A07(r7.A06(R.string.ok), new DialogInterface$OnClickListenerC65432zq(this));
                                            return r8.A00();
                                        case 34:
                                            AnonymousClass0MB r35 = new AnonymousClass0MB(this);
                                            AnonymousClass01X r25 = ((AnonymousClass2C0) this).A01;
                                            r35.A01.A0E = r25.A06(R.string.register_verify_again);
                                            r35.A07(r25.A06(R.string.ok), new DialogInterface$OnClickListenerC65452zs(this));
                                            return r35.A00();
                                        case 35:
                                            AnonymousClass0MB r26 = new AnonymousClass0MB(this);
                                            AnonymousClass01X r72 = ((AnonymousClass2C0) this).A01;
                                            String A0D2 = r72.A0D(R.string.register_voice_request_error_maximum_with_time, C002001d.A1a(r72, this.A02));
                                            AnonymousClass0MC r04 = r26.A01;
                                            r04.A0E = A0D2;
                                            r04.A0J = false;
                                            r26.A07(r72.A06(R.string.learn_more), new DialogInterface$OnClickListenerC65302zd(this, i));
                                            r26.A05(r72.A06(R.string.cancel), new DialogInterface$OnClickListenerC65332zg(this, i));
                                            return r26.A00();
                                        case 36:
                                            AnonymousClass0MB r27 = new AnonymousClass0MB(this);
                                            AnonymousClass01X r73 = ((AnonymousClass2C0) this).A01;
                                            String A0D3 = r73.A0D(R.string.register_voice_input_error_maximum_with_time, C002001d.A1a(r73, this.A02));
                                            AnonymousClass0MC r05 = r27.A01;
                                            r05.A0E = A0D3;
                                            r05.A0J = false;
                                            r27.A07(r73.A06(R.string.learn_more), new DialogInterface$OnClickListenerC65462zt(this, i));
                                            r27.A05(r73.A06(R.string.cancel), new DialogInterface$OnClickListenerC65322zf(this, i));
                                            return r27.A00();
                                        default:
                                            switch (i) {
                                                case 38:
                                                    AnonymousClass0MB r36 = new AnonymousClass0MB(this);
                                                    AnonymousClass01X r28 = ((AnonymousClass2C0) this).A01;
                                                    String A065 = r28.A06(R.string.register_bad_number);
                                                    AnonymousClass0MC r06 = r36.A01;
                                                    r06.A0E = A065;
                                                    r06.A0J = false;
                                                    r36.A06(r28.A06(R.string.ok_short), new DialogInterface$OnClickListenerC65382zl(this, i));
                                                    return r36.A00();
                                                case 39:
                                                    ProgressDialog progressDialog3 = new ProgressDialog(this);
                                                    progressDialog3.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.register_sms_request_message));
                                                    progressDialog3.setIndeterminate(true);
                                                    progressDialog3.setCancelable(false);
                                                    return progressDialog3;
                                                case 40:
                                                    AnonymousClass0MB r29 = new AnonymousClass0MB(this);
                                                    r29.A01.A0E = A0W();
                                                    r29.A07(((AnonymousClass2C0) this).A01.A06(R.string.ok), new DialogInterface$OnClickListenerC65352zi(this, i));
                                                    return r29.A00();
                                                case 41:
                                                    AnonymousClass0MB r210 = new AnonymousClass0MB(this);
                                                    r210.A01.A0E = A0Y();
                                                    r210.A07(((AnonymousClass2C0) this).A01.A06(R.string.ok), new DialogInterface$OnClickListenerC65312ze(this, i));
                                                    return r210.A00();
                                                case 42:
                                                    AnonymousClass0MB r211 = new AnonymousClass0MB(this);
                                                    r211.A01.A0E = A0X();
                                                    r211.A07(((AnonymousClass2C0) this).A01.A06(R.string.ok), new DialogInterface$OnClickListenerC65292zc(this, i));
                                                    return r211.A00();
                                                case 43:
                                                    AnonymousClass01X r42 = ((AnonymousClass2C0) this).A01;
                                                    String A066 = r42.A06(R.string.register_should_upgrade_market);
                                                    AnonymousClass0MB r212 = new AnonymousClass0MB(this);
                                                    String A0D4 = r42.A0D(R.string.register_bad_token, A066);
                                                    AnonymousClass0MC r07 = r212.A01;
                                                    r07.A0E = A0D4;
                                                    r07.A0J = false;
                                                    r212.A07(r42.A06(R.string.ok), new DialogInterface$OnClickListenerC65422zp(this));
                                                    return r212.A00();
                                                case 44:
                                                    break;
                                                default:
                                                    return super.onCreateDialog(i);
                                            }
                                    }
                            }
                    }
                }
                return AnonymousClass0JE.A04(this, ((AnonymousClass2C0) this).A01, this.A0L, this.A0M, new RunnableEBaseShape3S0100000_I0_3(this, 49));
            }
            Dialog onCreateDialog = super.onCreateDialog(i);
            if (onCreateDialog != null && this.A0R) {
                onCreateDialog.setCancelable(false);
                onCreateDialog.setOnDismissListener(new DialogInterface$OnDismissListenerC65482zv(this));
            }
            return onCreateDialog;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A06(R.string.registration_help));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        A0o();
        this.A0l.A01();
        CountDownTimer countDownTimer = this.A03;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A03 = null;
        }
        AnonymousClass302 r0 = this.A0C;
        if (r0 != null) {
            r0.A02(true);
        }
        AnonymousClass302 r02 = this.A0D;
        if (r02 != null) {
            r02.A02(true);
        }
        this.A0Z.A00(this.A0Y);
        this.A0G.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        Log.i("verifysms/intent");
        super.onNewIntent(intent);
        String A042 = A04(intent);
        if (A042 == null) {
            int intExtra = intent.getIntExtra("com.whatsapp.verifynumber.dialog", 0);
            if (intExtra == 21) {
                C002001d.A2O(this, 21);
            } else if (intExtra != 23) {
                AnonymousClass008.A0v("verifysms/intent/unknown ", intExtra);
            } else {
                C002001d.A2O(this, 23);
            }
        } else if (this.A0P) {
            A0x(A042);
        } else {
            AnonymousClass008.A18("verifysms/intent/defer-code/", A042);
            this.A0K = A042;
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            AnonymousClass30L r3 = this.A0G;
            AnonymousClass0HP r2 = this.A0q;
            StringBuilder A0S2 = AnonymousClass008.A0S("verify-sms +");
            A0S2.append(this.A0L);
            A0S2.append(this.A0M);
            r3.A01(this, r2, A0S2.toString());
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0o.A0B();
            A0d();
            A0e();
            A0b();
            startActivity(EULA.A04(this));
            finishAffinity();
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        AnonymousClass008.A1L(AnonymousClass008.A0S("verifysms/pause "), A0w);
        super.onPause();
        AnonymousClass30C r1 = this.A0E;
        r1.A02 = true;
        AnonymousClass0JE.A0H(r1.A04, AnonymousClass0JE.A00);
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putInt("com.whatsapp.registration.VerifySms.verification_state", A0w);
        if (!edit.commit()) {
            Log.w("verifysms/pause/commit failed");
        }
        String code = this.A0A.getCode();
        if (!TextUtils.isEmpty(code)) {
            AnonymousClass008.A0m(super.A0J, "registration_code", code);
        }
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        if (i != 29) {
            switch (i) {
                case 40:
                    ((AnonymousClass0MD) dialog).A04(A0W());
                    return;
                case 41:
                    ((AnonymousClass0MD) dialog).A04(A0Y());
                    return;
                case 42:
                    ((AnonymousClass0MD) dialog).A04(A0X());
                    return;
                default:
                    return;
            }
        } else {
            ((AnonymousClass0MD) dialog).A04(A0Z());
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A0E.A00();
        A0w = getPreferences(0).getInt("com.whatsapp.registration.VerifySms.verification_state", 0);
        SharedPreferences sharedPreferences = super.A0J.A00;
        A0u = sharedPreferences.getInt("registration_sms_code_length", 6);
        int i = sharedPreferences.getInt("registration_voice_code_length", 6);
        A0v = i;
        this.A0A.A02 = i;
        if (this.A0L == null || this.A0M == null) {
            Log.w("verifysms/resume/cc or num is missing, bounce to regphone");
            A0j();
            return;
        }
        this.A0o.A0C(4);
        this.A0q.A02("verify-sms");
        AnonymousClass008.A1L(new StringBuilder("verifysms/resume verification_state="), A0w);
        int i2 = A0w;
        if (i2 == 4) {
            C002001d.A2O(this, 21);
        } else if (i2 == 8) {
            C002001d.A2O(this, 23);
        } else if (i2 != 12) {
            long A0T2 = A0T() - System.currentTimeMillis();
            if (A0T2 > 0) {
                this.A0D.A01(A0T2, true);
            } else {
                A0d();
                if (!this.A0P) {
                    A1D(false);
                }
            }
            A0p();
            if (this.A03 == null) {
                long j = getPreferences(0).getLong("com.whatsapp.registration.VerifySms.code_verification_retry_time", -1);
                System.currentTimeMillis();
                A0v(j - System.currentTimeMillis());
            }
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (((float) displayMetrics.heightPixels) / displayMetrics.density >= 500.0f && this.A0A.isEnabled()) {
                this.A0A.requestFocus();
                this.A0A.A01(false);
            }
        } else {
            A0r();
        }
        this.A0f.A04(null, 1, "VerifySms1");
        String str = this.A0K;
        if (str != null) {
            AnonymousClass008.A1U(AnonymousClass008.A0S("verifysms/resume/scheme/code "), str);
            A0x(this.A0K);
            this.A0K = null;
        }
        this.A0P = true;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("use_sms_retriever", this.A0T);
        super.onSaveInstanceState(bundle);
    }
}
