package com.whatsapp.payments.ui;

import X.AbstractC61332t0;
import X.ActivityC004702f;
import X.AnonymousClass00E;
import X.AnonymousClass00S;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass0FI;
import X.AnonymousClass0HN;
import X.AnonymousClass1PT;
import X.AnonymousClass1VM;
import X.AnonymousClass3E3;
import X.AnonymousClass3E6;
import X.AnonymousClass3FH;
import X.AnonymousClass3GT;
import X.AnonymousClass3GV;
import X.AnonymousClass3H3;
import X.C007603r;
import X.C018709t;
import X.C02040Ak;
import X.C10130e6;
import X.C12420i4;
import X.C28011Sm;
import X.C28021Sn;
import X.C42931xW;
import X.C60842s5;
import X.C60862s7;
import X.C61322sz;
import X.C61572tO;
import X.C61632tU;
import X.C61722td;
import X.C61762th;
import X.C62942vb;
import X.C62952vc;
import X.C68653Ea;
import X.C74723bO;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

public class BrazilPayBloksActivity extends AnonymousClass1PT {
    public C28021Sn A00;
    public AnonymousClass1VM A01;
    public C10130e6 A02;
    public C62952vc A03;
    public String A04;
    public final C28011Sm A05 = C28011Sm.A00();
    public final AnonymousClass01A A06 = AnonymousClass01A.A00();
    public final AnonymousClass0HN A07 = AnonymousClass0HN.A00();
    public final AnonymousClass00S A08 = AnonymousClass00S.A00();
    public final C018709t A09 = C018709t.A01();
    public final C60842s5 A0A = C60842s5.A00();
    public final C60862s7 A0B = C60862s7.A00();
    public final C02040Ak A0C = C02040Ak.A00();
    public final C61632tU A0D = C61632tU.A00();
    public final C61722td A0E;
    public final C62942vb A0F = C62942vb.A00();
    public final AnonymousClass3GT A0G = AnonymousClass3GT.A00();

    public BrazilPayBloksActivity() {
        if (C61722td.A0K == null) {
            synchronized (C61722td.class) {
                if (C61722td.A0K == null) {
                    C61722td.A0K = new C61722td();
                }
            }
        }
        this.A0E = C61722td.A0K;
        this.A03 = C62952vc.A00();
        this.A00 = null;
        this.A04 = null;
        this.A01 = null;
    }

    public final void A0V(Map map, C28021Sn r34, int i) {
        Object obj = map.get("full_name");
        if (obj != null) {
            String str = (String) obj;
            CharSequence charSequence = (CharSequence) map.get("tax_id");
            AnonymousClass00E.A03(charSequence);
            String replaceAll = ((String) charSequence).replaceAll("[^\\d]", "");
            AnonymousClass01I r0 = ((AnonymousClass1PT) this).A03;
            r0.A04();
            UserJid userJid = r0.A03;
            if (userJid != null) {
                String replaceAll2 = C12420i4.A03(userJid.user).replaceAll("[^\\d]", "");
                Object obj2 = map.get("address_street_name");
                if (obj2 != null) {
                    String str2 = (String) obj2;
                    String str3 = (String) map.get("address_houe_number");
                    String str4 = (String) map.get("address_extra_line");
                    String str5 = (String) map.get("address_neighborhood");
                    Object obj3 = map.get("address_city");
                    if (obj3 != null) {
                        String str6 = (String) obj3;
                        Object obj4 = map.get("address_state");
                        if (obj4 != null) {
                            String str7 = (String) obj4;
                            Object obj5 = map.get("address_postal_code");
                            if (obj5 != null) {
                                C61322sz r02 = new C61322sz(this, ((ActivityC004702f) this).A0F, this.A0T, ((AnonymousClass1PT) this).A08, ((AnonymousClass1PT) this).A0I, ((AnonymousClass1PT) this).A0F, ((AnonymousClass1PT) this).A0O, str, replaceAll, replaceAll2, str2, str3, str4, str5, str6, str7, (String) obj5);
                                AnonymousClass3GV r9 = new AnonymousClass3GV(this, r34, i, map);
                                C61762th r10 = r02.A06;
                                C68653Ea A022 = r10.A02("FB", "KYC", true);
                                if (A022 == null || !A022.A05.equalsIgnoreCase("FB")) {
                                    new C61572tO(r02.A01, r02.A02, r02.A03, r02.A05, r02.A04, r10, "KYC").A00("FB", new AnonymousClass3E3(r02, r9));
                                } else {
                                    r02.A00(A022, r9);
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass1TU, X.AnonymousClass1PT
    public boolean AA2(int i) {
        if (i != 442) {
            return super.AA2(i);
        }
        BrazilReTosFragment brazilReTosFragment = new BrazilReTosFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_consumer", true);
        bundle.putBoolean("is_merchant", false);
        brazilReTosFragment.A0N(bundle);
        APm(brazilReTosFragment);
        return true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01a5, code lost:
        if (r36.equals("get_merchant_reg_data") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01b1, code lost:
        if (r36.equals("get_payout_banks") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01be, code lost:
        if (r36.equals("send_kyc_data") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01cb, code lost:
        if (r36.equals("verify_card_otp") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d7, code lost:
        if (r36.equals("add_card") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e3, code lost:
        if (r36.equals("dial_phone_number") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ef, code lost:
        if (r36.equals("link_merchant") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01fb, code lost:
        if (r36.equals("pre_link_merchant") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0207, code lost:
        if (r36.equals("bind_device") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0213, code lost:
        if (r36.equals("refetch_verification_methods") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x021f, code lost:
        if (r36.equals("reset_pin_from_card") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x022c, code lost:
        if (r36.equals("send_taxid") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0238, code lost:
        if (r36.equals("reg_merchant") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0244, code lost:
        if (r36.equals("handle_error_native") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0251, code lost:
        if (r36.equals("update_merchant_account") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x025d, code lost:
        if (r36.equals("get_kyc_status") == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x026a, code lost:
        if (r36.equals("submit_verification_method") == false) goto L_0x0016;
     */
    @Override // X.AnonymousClass1TU, X.AnonymousClass1PT
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AM1(java.lang.String r36, java.util.Map r37, X.C28021Sn r38) {
        /*
        // Method dump skipped, instructions count: 2282
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.AM1(java.lang.String, java.util.Map, X.1Sn):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0257, code lost:
        if (r7.equals("business_address_postcode") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0262, code lost:
        if (r7.equals("bank_code") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x026d, code lost:
        if (r7.equals("bank_account_number") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0279, code lost:
        if (r7.equals("business_address_city") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0285, code lost:
        if (r7.equals("business_address_street_name") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0290, code lost:
        if (r7.equals("business_tax_id") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x029c, code lost:
        if (r7.equals("business_address_street_extra") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r5.equals("get_consumer_next_screen") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a7, code lost:
        if (r7.equals("owner_cpf") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b2, code lost:
        if (r7.equals("owner_dob") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bd, code lost:
        if (r7.equals("owner_email") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c8, code lost:
        if (r7.equals("owner_full_name") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d4, code lost:
        if (r7.equals("bank_account_type") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02df, code lost:
        if (r7.equals("business_name") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02eb, code lost:
        if (r7.equals("bank_branch_number") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02f7, code lost:
        if (r7.equals("business_address_neighborhood") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0303, code lost:
        if (r7.equals("business_address_state") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030f, code lost:
        if (r7.equals("business_address_number") == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r5.equals("smb_business_name") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r5.equals("get_formatted_phone_number") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r5.equals("clear_merchant_reg_data") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r5.equals("get_merchant_next_screen") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r5.equals("open_fb_pay_hub") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r5.equals("store_merchant_reg_data") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r5.equals("is_purchase_enabled") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r5.equals("is_smb_build") == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r5.equals("get_card_method_field_data") == false) goto L_0x001b;
     */
    @Override // X.AnonymousClass1TU, X.AnonymousClass1PT
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String AM2(java.util.Map r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 984
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.AM2(java.util.Map, java.lang.String):java.lang.String");
    }

    @Override // X.AnonymousClass1PT, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        C28021Sn r1;
        C74723bO r0;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && (r1 = this.A00) != null) {
            if (i2 != -1) {
                AnonymousClass1PT.A04(null, -232, r1);
            } else if (intent == null) {
                r1.A00("on_success");
            } else {
                String stringExtra = intent.getStringExtra("STEP_UP_RESPONSE");
                String stringExtra2 = intent.getStringExtra("STEP_UP_AUTH_CODE");
                int hashCode = stringExtra.hashCode();
                if (hashCode != -1086574198) {
                    if (hashCode != 568196142) {
                        if (hashCode == 1185244855 && stringExtra.equals("approved")) {
                            if (!TextUtils.isEmpty(stringExtra2)) {
                                byte[] A0x = AnonymousClass0FI.A0x(this.A08, ((AnonymousClass1PT) this).A03, false);
                                if (A0x != null) {
                                    AnonymousClass3E6 r6 = new AnonymousClass3E6(this, ((ActivityC004702f) this).A0F, this.A09, ((AnonymousClass1PT) this).A0L, ((AnonymousClass1PT) this).A08, ((AnonymousClass1PT) this).A0I, this.A0B, ((AnonymousClass1PT) this).A0F, ((AnonymousClass1PT) this).A0O, stringExtra2, C007603r.A03(A0x), this.A04, new AnonymousClass3FH(this, stringExtra2));
                                    AnonymousClass1VM A082 = ((AbstractC61332t0) r6).A03.A08(r6.A05);
                                    if (A082 == null || (r0 = (C74723bO) A082.A06) == null || !"VISA".equals(r0.A03)) {
                                        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification without encrypted value");
                                        r6.A02(r6.A04);
                                        return;
                                    }
                                    Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification with encrypted value");
                                    r6.A00();
                                    return;
                                }
                                throw null;
                            }
                            this.A00.A00("on_success");
                            return;
                        }
                        return;
                    } else if (!stringExtra.equals("declined")) {
                        return;
                    }
                } else if (!stringExtra.equals("failure")) {
                    return;
                }
                AnonymousClass1PT.A04(null, -232, this.A00);
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1PT, X.AnonymousClass2DC, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.bloks_background_layout).setBackgroundResource(R.drawable.round_rectangle);
        if (getIntent().getIntExtra("extra_setup_mode", 0) != 0) {
            getIntent().putExtra("screen_name", this.A03.A02(true));
        }
        this.A05.A00 = this.A0G.A03;
        Log.d("Bloks: BloksPayloadUtil: shouldConnectIgServer = false");
        C42931xW r2 = ((AnonymousClass1PT) this).A05;
        if (!r2.A02() || !r2.A06()) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.bloks_progress_bar);
            progressBar.setVisibility(0);
            r2.A05("on_demand", false, new AnonymousClass3H3(this, progressBar));
            return;
        }
        ((AnonymousClass1PT) this).A02 = true;
    }
}
