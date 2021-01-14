package X;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.1PT  reason: invalid class name */
public abstract class AnonymousClass1PT extends AnonymousClass2DC implements AnonymousClass0SB {
    public C60962sH A00;
    public C018809u A01;
    public boolean A02;
    public final AnonymousClass01I A03 = AnonymousClass01I.A00();
    public final C06210Sf A04 = C06210Sf.A00();
    public final C42931xW A05 = C42931xW.A00();
    public final C28061Ss A06 = C28061Ss.A00();
    public final C12420i4 A07 = C12420i4.A00;
    public final AnonymousClass04j A08 = AnonymousClass04j.A00();
    public final AnonymousClass00S A09 = AnonymousClass00S.A00();
    public final AnonymousClass03S A0A = AnonymousClass03S.A00();
    public final AnonymousClass01K A0B = AnonymousClass01K.A00();
    public final AnonymousClass0M9 A0C = AnonymousClass0M9.A01();
    public final AnonymousClass0AR A0D = AnonymousClass0AR.A00();
    public final C01980Ae A0E = C01980Ae.A00();
    public final AnonymousClass0GP A0F;
    public final C02060Am A0G;
    public final C02010Ah A0H = C02010Ah.A00();
    public final C03340Fu A0I = C03340Fu.A00();
    public final C02020Ai A0J = C02020Ai.A00();
    public final AnonymousClass0GQ A0K;
    public final C01970Ad A0L = C01970Ad.A00();
    public final C61202sf A0M = C61202sf.A00();
    public final C61622tT A0N;
    public final C61762th A0O;
    public final C61772ti A0P = C61772ti.A00();
    public final C61902tv A0Q;
    public final C61932ty A0R = C61932ty.A00();
    public final C61942tz A0S = C61942tz.A00();
    public final C63842x6 A0T = C63842x6.A00();
    public final C64412y9 A0U = C64412y9.A00;
    public final AnonymousClass00T A0V = C002101e.A00();

    @Override // X.AnonymousClass0SB
    public void AKB(int i, int i2) {
    }

    public AnonymousClass1PT() {
        C018609s.A04();
        this.A0K = AnonymousClass0GQ.A00();
        if (C61622tT.A08 == null) {
            synchronized (C61622tT.class) {
                if (C61622tT.A08 == null) {
                    C61622tT.A08 = new C61622tT(AnonymousClass00G.A01, AnonymousClass02M.A00(), C61632tU.A00(), AnonymousClass04j.A00(), C03340Fu.A00(), AnonymousClass0GP.A00());
                }
            }
        }
        this.A0N = C61622tT.A08;
        this.A0F = AnonymousClass0GP.A00();
        this.A0Q = C61902tv.A00();
        this.A0O = C61762th.A00();
        this.A0G = C02060Am.A00();
        this.A01 = C018809u.A00("PayBloksActivity", "bloks", "COMMON");
        this.A02 = false;
    }

    public static void A04(Map map, int i, C28021Sn r6) {
        if (map == null) {
            map = new HashMap();
        }
        map.put("error_code", String.valueOf(i));
        if (r6.A00) {
            r6.A03.A00(new RunnableEBaseShape0S1200000_I0(r6, map, "on_failure", 8));
        }
    }

    public final void A0U() {
        if (!(!((ActivityC004702f) this).A0B)) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String string = extras.getString("screen_name");
                AnonymousClass0LW A042 = A04();
                ((AnonymousClass2DC) this).A01 = A4y(string, (HashMap) extras.getSerializable("screen_params"));
                if (A042.A03() == 0) {
                    AnonymousClass0QB r3 = new AnonymousClass0QB(A042);
                    r3.A06(R.id.bloks_fragment_container, ((AnonymousClass2DC) this).A01, null);
                    r3.A08(string);
                    r3.A01();
                    return;
                }
                A0T();
                return;
            }
            throw null;
        }
        this.A02 = true;
    }

    @Override // X.AnonymousClass1TU
    public void A2c() {
        RequestPermissionActivity.A0K(this, this.A0A, 30);
    }

    @Override // X.AnonymousClass1TU
    public BloksDialogFragment A4y(String str, HashMap hashMap) {
        BloksDialogFragment bloksDialogFragment = new BloksDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", str);
        bundle.putSerializable("screen_params", hashMap);
        bundle.putBoolean("hot_reload", false);
        bloksDialogFragment.A0N(bundle);
        return bloksDialogFragment;
    }

    @Override // X.AnonymousClass1TU
    public long A6M() {
        return this.A0P.A01();
    }

    @Override // X.AnonymousClass1TU
    public String A6N() {
        C61772ti r1 = this.A0P;
        String str = r1.A02;
        if (str == null) {
            return r1.A02();
        }
        return str;
    }

    @Override // X.AnonymousClass1TU
    public boolean AA2(int i) {
        if (i != 404 && i != 440 && i != 449) {
            return false;
        }
        C018809u r2 = this.A01;
        StringBuilder sb = new StringBuilder("handleError/error=");
        sb.append(i);
        r2.A07(null, sb.toString(), null);
        this.A0K.A02(true, false);
        AnonymousClass0MB r3 = new AnonymousClass0MB(this);
        AnonymousClass01X r22 = ((AnonymousClass2DC) this).A04;
        String A062 = r22.A06(R.string.payments_generic_error);
        AnonymousClass0MC r0 = r3.A01;
        r0.A0E = A062;
        r0.A0J = false;
        r3.A07(r22.A06(R.string.ok), new DialogInterface$OnClickListenerC62792vM(this));
        r3.A00().show();
        return true;
    }

    @Override // X.AnonymousClass1TU
    public void AM1(String str, Map map, C28021Sn r27) {
        C06470Tj r2;
        BloksDialogFragment bloksDialogFragment;
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            r27.A00("");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2131583866:
                if (str.equals("change_pin")) {
                    c = 3;
                    break;
                }
                break;
            case -1828362259:
                if (str.equals("get_compliance_status")) {
                    c = 4;
                    break;
                }
                break;
            case -1432382994:
                if (str.equals("get_oldest_credential")) {
                    c = 7;
                    break;
                }
                break;
            case -1371677349:
                if (str.equals("remove_completed_step")) {
                    c = 15;
                    break;
                }
                break;
            case -1032682289:
                if (str.equals("verify_pin")) {
                    c = 2;
                    break;
                }
                break;
            case -457979232:
                if (str.equals("set_action_bar_title")) {
                    c = '\n';
                    break;
                }
                break;
            case -214858504:
                if (str.equals("compliance_name_check")) {
                    c = 5;
                    break;
                }
                break;
            case 20864489:
                if (str.equals("reinitialize_payments")) {
                    c = '\r';
                    break;
                }
                break;
            case 205988285:
                if (str.equals("set_completed_step")) {
                    c = '\t';
                    break;
                }
                break;
            case 254954716:
                if (str.equals("compliance_dob_check")) {
                    c = 6;
                    break;
                }
                break;
            case 761629426:
                if (str.equals("remove_credential")) {
                    c = '\b';
                    break;
                }
                break;
            case 927713295:
                if (str.equals("forward_to_payment_screen")) {
                    c = '\f';
                    break;
                }
                break;
            case 1032047561:
                if (str.equals("get_methods")) {
                    c = 14;
                    break;
                }
                break;
            case 1369547730:
                if (str.equals("create_pin")) {
                    c = 0;
                    break;
                }
                break;
            case 1853333482:
                if (str.equals("set_sandbox")) {
                    c = 11;
                    break;
                }
                break;
            case 1877943783:
                if (str.equals("set_navigation_icon")) {
                    c = 16;
                    break;
                }
                break;
            case 1985308587:
                if (str.equals("set_bio")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C61932ty r5 = this.A0R;
                Object obj = map.get("provider");
                if (obj != null) {
                    String str2 = (String) obj;
                    Object obj2 = map.get("pin");
                    if (obj2 != null) {
                        AnonymousClass3GC r22 = new AnonymousClass3GC(this, r27);
                        r5.A02(str2, new C68813Eq(r5, (String) obj2, r22), r22);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 1:
                C61932ty r52 = this.A0R;
                Object obj3 = map.get("provider");
                if (obj3 != null) {
                    String str3 = (String) obj3;
                    Object obj4 = map.get("pin");
                    if (obj4 != null) {
                        AnonymousClass3GD r23 = new AnonymousClass3GD(this, r27);
                        r52.A02(str3, new C68793Eo(r52, (String) obj4, r23), r23);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 2:
                C61932ty r53 = this.A0R;
                Object obj5 = map.get("provider");
                if (obj5 != null) {
                    String str4 = (String) obj5;
                    Object obj6 = map.get("pin");
                    if (obj6 != null) {
                        AnonymousClass3GE r24 = new AnonymousClass3GE(this, r27);
                        r53.A02(str4, new C68823Er(r53, (String) obj6, r24), r24);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 3:
                C61932ty r7 = this.A0R;
                Object obj7 = map.get("provider");
                if (obj7 != null) {
                    String str5 = (String) obj7;
                    Object obj8 = map.get("old_pin");
                    if (obj8 != null) {
                        String str6 = (String) obj8;
                        Object obj9 = map.get("new_pin");
                        if (obj9 != null) {
                            AnonymousClass3GF r25 = new AnonymousClass3GF(this, r27);
                            r7.A02(str5, new C68833Es(r7, str6, (String) obj9, r25), r25);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            case 4:
                C61622tT r8 = this.A0N;
                C69413Gy r72 = new C69413Gy(this, r27);
                r8.A00 = "PENDING";
                C61492tG r9 = new C61492tG(r8.A03.A00, r8.A01, r8.A06, r8.A02, r8.A05, r8.A04);
                r9.A04.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "get-account-eligibility-state", null, (byte) 0)}, null, null), new C73513Xq(r9.A00, r9.A01, r9.A02, r9.A03, new AnonymousClass3EV(r8, r72)), 0);
                return;
            case 5:
                CharSequence charSequence = (CharSequence) map.get("full_name");
                AnonymousClass00E.A03(charSequence);
                String str7 = (String) charSequence;
                String str8 = (String) map.get("compliance_reason");
                AnonymousClass00E.A03(str8);
                C61622tT r10 = this.A0N;
                C69423Gz r82 = new C69423Gz(r27);
                if (r10.A00.equals("UNSUPPORTED")) {
                    r82.A00.A00("on_success");
                    return;
                }
                C61492tG r12 = new C61492tG(r10.A03.A00, r10.A01, r10.A06, r10.A02, r10.A05, r10.A04);
                AnonymousClass3EW r11 = new AnonymousClass3EW(r10, r82);
                AnonymousClass00E.A03(str7);
                r12.A04.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "check-account-eligibility", null, (byte) 0), new AnonymousClass0OS("action-type", str8, null, (byte) 0)}, new AnonymousClass0M5("name", new AnonymousClass0OS[]{new AnonymousClass0OS("full", str7, null, (byte) 0)}, null, null)), new C73523Xr(r12.A00, r12.A01, r12.A02, r12.A03, r11), 0);
                return;
            case 6:
                Object obj10 = map.get("dob");
                if (obj10 != null) {
                    int[] A2B = C28051Sr.A2B((String) obj10);
                    int i = A2B[0];
                    int i2 = A2B[1];
                    int i3 = A2B[2];
                    CharSequence charSequence2 = (CharSequence) map.get("compliance_reason");
                    AnonymousClass00E.A03(charSequence2);
                    String str9 = (String) charSequence2;
                    C61622tT r83 = this.A0N;
                    AnonymousClass3H0 r54 = new AnonymousClass3H0(r27);
                    if (r83.A00.equals("UNSUPPORTED")) {
                        r54.A00.A00("on_success");
                        return;
                    }
                    C61492tG r14 = new C61492tG(r83.A03.A00, r83.A01, r83.A06, r83.A02, r83.A05, r83.A04);
                    r14.A04.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "check-account-eligibility", null, (byte) 0), new AnonymousClass0OS("action-type", str9, null, (byte) 0)}, r14.A05.A01(i3, i2, i)), new C73533Xs(r14, r14.A00, r14.A01, r14.A02, r14.A03, new AnonymousClass3EX(r83, r54, this)), 0);
                    return;
                }
                throw null;
            case 7:
                this.A0V.ANC(new C10060dy(this.A0L, r27), new Void[0]);
                return;
            case '\b':
                AnonymousClass3H1 r92 = new AnonymousClass3H1(this, r27);
                if (C006803i.A02((String) map.get("remaining_cards"), 0) <= 1) {
                    new C61482tF(this, ((ActivityC004702f) this).A0F, this.A0V, this.A0T, this.A0L, this.A0B, this.A0H, this.A08, this.A0I, this.A0K, this.A0F).A00(r92);
                    return;
                } else {
                    this.A0I.A08((String) map.get("credential_id"), r92);
                    return;
                }
            case '\t':
                String str10 = (String) map.get("completed_step");
                if ("1".equals(map.get("is_merchant"))) {
                    C02060Am r1 = this.A0G;
                    r1.A05(r1.A01(str10));
                    return;
                }
                C01980Ae r13 = this.A0E;
                r13.A05(r13.A01(str10));
                return;
            case '\n':
                AnonymousClass0S2 A092 = A09();
                if (A092 != null && (bloksDialogFragment = ((AnonymousClass2DC) this).A01) != null && (bool = bloksDialogFragment.A03) != null && !bool.booleanValue()) {
                    A092.A08((CharSequence) map.get("action_bar_title"));
                    return;
                }
                return;
            case 11:
                this.A0H.A06("1".equals(map.get("is_sandbox")));
                return;
            case '\f':
                Intent intent = new Intent(getApplicationContext(), this.A0L.A03().A8z());
                Intent intent2 = getIntent();
                intent.putExtra("extra_conversation_message_type", intent2.getIntExtra("extra_conversation_message_type", 0));
                intent.putExtra("extra_jid", intent2.getStringExtra("extra_jid"));
                intent.putExtra("extra_receiver_jid", intent2.getStringExtra("extra_receiver_jid"));
                intent.putExtra("extra_quoted_msg_row_id", intent2.getLongExtra("extra_quoted_msg_row_id", 0));
                intent.putExtra("extra_payment_preset_amount", intent2.getStringExtra("extra_payment_preset_amount"));
                intent.putExtra("extra_transaction_id", intent2.getStringExtra("extra_transaction_id"));
                intent.putExtra("extra_payment_preset_min_amount", intent2.getStringExtra("extra_payment_preset_min_amount"));
                intent.putExtra("extra_request_message_key", intent2.getStringExtra("extra_request_message_key"));
                intent.putExtra("extra_is_pay_money_only", intent2.getBooleanExtra("extra_is_pay_money_only", true));
                intent.putExtra("extra_payment_note", intent2.getStringExtra("extra_payment_note"));
                intent.putStringArrayListExtra("extra_mentioned_jids", intent2.getStringArrayListExtra("extra_mentioned_jids"));
                A0I(intent, false);
                finish();
                return;
            case '\r':
                this.A0K.A02("1".equals(map.get("remove_tos")), false);
                return;
            case 14:
                this.A0I.A01(2, new AnonymousClass3H2(this, r27));
                return;
            case 15:
                String str11 = (String) map.get("completed_step");
                if ("1".equals(map.get("is_merchant"))) {
                    C02060Am r15 = this.A0G;
                    r15.A04(r15.A01(str11));
                    return;
                }
                C01980Ae r16 = this.A0E;
                r16.A04(r16.A01(str11));
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                boolean equals = "close".equals(map.get("navigation_icon"));
                AnonymousClass01X r17 = ((AnonymousClass2DC) this).A04;
                if (equals) {
                    r2 = new C06470Tj(r17, C004302a.A03(this, R.drawable.ic_close));
                } else {
                    r2 = new C06470Tj(r17, C004302a.A03(this, R.drawable.ic_back_teal));
                }
                r2.setColorFilter(getResources().getColor(R.color.dark_gray), PorterDuff.Mode.SRC_ATOP);
                ((Toolbar) findViewById(R.id.toolbar)).setNavigationIcon(r2);
                return;
            default:
                return;
        }
    }

    @Override // X.AnonymousClass1TU
    public String AM2(Map map, String str) {
        int length;
        String str2 = (String) map.remove("case");
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        char c = 65535;
        boolean z = false;
        switch (str2.hashCode()) {
            case -2090067461:
                if (str2.equals("hide_toolbar_title_and_logo")) {
                    c = 19;
                    break;
                }
                break;
            case -1486928264:
                if (str2.equals("enable_secure_flag")) {
                    c = 17;
                    break;
                }
                break;
            case -1344002586:
                if (str2.equals("get_phone_last_n_digits")) {
                    c = 16;
                    break;
                }
                break;
            case -1145142119:
                if (str2.equals("exp_date_check")) {
                    c = 1;
                    break;
                }
                break;
            case -1060255204:
                if (str2.equals("get_tos_uri")) {
                    c = 3;
                    break;
                }
                break;
            case -1003060006:
                if (str2.equals("get_faq_uri")) {
                    c = '\f';
                    break;
                }
                break;
            case -975395056:
                if (str2.equals("regex_check")) {
                    c = 0;
                    break;
                }
                break;
            case -919584206:
                if (str2.equals("get_button_info")) {
                    c = 5;
                    break;
                }
                break;
            case -848949171:
                if (str2.equals("is_step_completed")) {
                    c = '\r';
                    break;
                }
                break;
            case -594428356:
                if (str2.equals("can_set_bio")) {
                    c = 2;
                    break;
                }
                break;
            case -314691285:
                if (str2.equals("get_screen_density_bucket")) {
                    c = 18;
                    break;
                }
                break;
            case 1809539:
                if (str2.equals("current_server_time")) {
                    c = 11;
                    break;
                }
                break;
            case 329749850:
                if (str2.equals("get_formatted_date")) {
                    c = '\b';
                    break;
                }
                break;
            case 425265908:
                if (str2.equals("string_upper")) {
                    c = '\t';
                    break;
                }
                break;
            case 540049915:
                if (str2.equals("get_device_id")) {
                    c = '\n';
                    break;
                }
                break;
            case 580608584:
                if (str2.equals("get_card_network")) {
                    c = 6;
                    break;
                }
                break;
            case 674867313:
                if (str2.equals("get_error_string")) {
                    c = 4;
                    break;
                }
                break;
            case 1785060649:
                if (str2.equals("get_pin_retry_ts")) {
                    c = 7;
                    break;
                }
                break;
            case 1976375430:
                if (str2.equals("string_replace")) {
                    c = 15;
                    break;
                }
                break;
            case 1999013019:
                if (str2.equals("get_merchant_fees")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String str3 = (String) map.get("regex");
                if (str3 != null) {
                    try {
                        return !Pattern.compile(str3, 2).matcher(str).find() ? "on_failure" : "on_success";
                    } catch (PatternSyntaxException unused) {
                        return "on_exception";
                    }
                } else {
                    throw null;
                }
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy", Locale.US);
                Calendar instance = Calendar.getInstance();
                instance.set(instance.get(1), instance.get(2), 0, 23, 59, 59);
                try {
                    Date parse = simpleDateFormat.parse(str);
                    if (parse != null && !parse.before(instance.getTime())) {
                        z = true;
                    }
                    return z ? "on_success" : "on_failure";
                } catch (ParseException unused2) {
                }
            case 2:
                C61902tv r1 = this.A0Q;
                return (!r1.A05() || r1.A01() == 1) ? "0" : "1";
            case 3:
                return this.A04.A01(str).toString();
            case 4:
                String str4 = (String) map.get(str);
                return TextUtils.isEmpty(str4) ? (String) map.get("100") : str4;
            case 5:
                String str5 = (String) map.get(str);
                if (!TextUtils.isEmpty(str5)) {
                    return str5;
                }
                return "";
            case 6:
                String replaceAll = str.replaceAll("\\s", "");
                for (Map.Entry entry : map.entrySet()) {
                    if (Pattern.compile((String) entry.getValue()).matcher(replaceAll).find()) {
                        return (String) entry.getKey();
                    }
                }
                return "Unknown";
            case 7:
                return String.valueOf(this.A0S.A01());
            case '\b':
                Object obj = map.get("date");
                if (obj != null) {
                    Date A1B = C28051Sr.A1B((String) obj);
                    if (A1B != null) {
                        return DateFormat.getDateInstance(1).format(A1B);
                    }
                    return "";
                }
                throw null;
            case '\t':
                return str.toUpperCase(Locale.US);
            case '\n':
                return this.A0T.A02();
            case 11:
                return String.valueOf(this.A09.A05());
            case '\f':
                String str6 = (String) map.get("platform");
                if (TextUtils.isEmpty(str6)) {
                    str6 = "payments";
                }
                return this.A0C.A03(str6, (String) map.get("article_id"), null).toString();
            case '\r':
                String str7 = (String) map.get("completed_step");
                boolean equals = "1".equals(map.get("is_merchant"));
                AbstractC01990Af r0 = this.A0E;
                if (equals) {
                    r0 = this.A0G;
                }
                return r0.A0B(str7) ? "1" : "0";
            case 14:
                this.A0J.A01();
                C60962sH r12 = this.A00;
                if (r12 == null) {
                    r12 = new C60962sH();
                    this.A00 = r12;
                }
                C000300f r02 = ((ActivityC004702f) this).A0G;
                if (r12 == null) {
                    throw null;
                } else if (r02 != null) {
                    throw new UnsupportedOperationException();
                } else {
                    throw null;
                }
            case 15:
                if (str == null) {
                    return null;
                }
                String str8 = (String) map.get("string_to_replace");
                String str9 = (String) map.get("string_replacement");
                return (TextUtils.isEmpty(str8) || str9 == null) ? str : str.replaceAll(str8, str9);
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                String str10 = (String) map.get("num_of_digits");
                if (!TextUtils.isEmpty(str10)) {
                    try {
                        int parseInt = Integer.parseInt(str10);
                        AnonymousClass01I r13 = this.A03;
                        C12420i4 r03 = this.A07;
                        r13.A04();
                        AnonymousClass0HR r14 = r13.A01;
                        if (r03 != null) {
                            String A012 = C12420i4.A01((AnonymousClass02N) r14.A02(AnonymousClass02N.class));
                            return (TextUtils.isEmpty(A012) || (length = A012.length()) <= parseInt) ? A012 : A012.substring(length - parseInt);
                        }
                        throw null;
                    } catch (NumberFormatException e) {
                        this.A01.A08("performDataProcessingAction: REQUESTED_CASE_GET_PHONE_LAST_N_DIGITS: illegal num_of_digits", e);
                    }
                }
                return str;
            case 17:
                getWindow().setFlags(8192, 8192);
                return "";
            case 18:
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                return displayMetrics.densityDpi <= 240 ? "hdpi_or_smaller" : "larger_than_hdpi";
            case 19:
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                if (toolbar != null) {
                    toolbar.setLogo((Drawable) null);
                    toolbar.setTitle((CharSequence) null);
                }
                return null;
            default:
                return "";
        }
    }

    @Override // X.AnonymousClass1TU
    public void AMz() {
        C61772ti r2 = this.A0P;
        r2.A02 = null;
        r2.A00 = 0;
    }

    @Override // X.AnonymousClass1TU
    public void AQ3() {
        C61772ti r3 = this.A0P;
        r3.A04.A07(null, "PaymentWamEvent timer reset.", null);
        r3.A00 = r3.A01.A05();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 30) {
            return;
        }
        if (i2 == -1) {
            A0T();
        } else {
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass2DC, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.AnonymousClass2DC, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (this.A02) {
            A0U();
            this.A02 = false;
        }
    }
}
