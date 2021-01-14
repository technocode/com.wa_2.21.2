package com.whatsapp.payments.ui;

import X.AbstractC60932sE;
import X.AbstractC61392t6;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass0CO;
import X.AnonymousClass0GP;
import X.AnonymousClass0JW;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass0TX;
import X.AnonymousClass1PY;
import X.AnonymousClass20A;
import X.AnonymousClass20B;
import X.AnonymousClass20H;
import X.AnonymousClass27v;
import X.AnonymousClass2C0;
import X.C018809u;
import X.C02010Ah;
import X.C02020Ai;
import X.C03340Fu;
import X.C60922sD;
import X.C60942sF;
import X.C61072sS;
import X.C61082sT;
import X.C61412t8;
import X.C61772ti;
import X.C63062vn;
import X.C63842x6;
import X.C64412y9;
import X.C68393Da;
import X.C68683Ed;
import X.C69263Gj;
import X.C69273Gk;
import X.C69283Gl;
import X.C69293Gm;
import X.C74463ay;
import X.C74583bA;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class IndiaUpiDeviceBindActivity extends AnonymousClass1PY implements AbstractC61392t6 {
    public static AbstractC60932sE A0W = new C69263Gj();
    public int A00;
    public int A01 = -1;
    public PendingIntent A02;
    public Button A03;
    public TextView A04;
    public TextView A05;
    public AnonymousClass20H A06 = new AnonymousClass20H();
    public C74463ay A07;
    public C60942sF A08;
    public C61082sT A09;
    public C61412t8 A0A;
    public C69273Gk A0B;
    public C69283Gl A0C;
    public C63062vn A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final AnonymousClass0CO A0H = AnonymousClass0CO.A00();
    public final AnonymousClass01I A0I = AnonymousClass01I.A00();
    public final AnonymousClass04j A0J = AnonymousClass04j.A00();
    public final AnonymousClass03S A0K = AnonymousClass03S.A00();
    public final C60922sD A0L = C60922sD.A00();
    public final C68393Da A0M = C68393Da.A00();
    public final AnonymousClass0GP A0N = AnonymousClass0GP.A00();
    public final C02010Ah A0O = C02010Ah.A00();
    public final C03340Fu A0P = C03340Fu.A00();
    public final C02020Ai A0Q = C02020Ai.A00();
    public final C68683Ed A0R = C68683Ed.A00();
    public final C61772ti A0S = C61772ti.A00();
    public final C018809u A0T = C018809u.A00("IndiaUpiDeviceBindActivity", "onboarding", "IN");
    public final C63842x6 A0U = C63842x6.A00();
    public final C64412y9 A0V = C64412y9.A00;

    public final void A0d() {
        AnonymousClass03S r4 = this.A0K;
        if (r4.A02("android.permission.RECEIVE_SMS") != 0 && r4.A02("android.permission.SEND_SMS") == 0) {
            AnonymousClass0TX.A0H(this, new String[]{"android.permission.RECEIVE_SMS"}, 100);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0.getSimState() != 5) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e() {
        /*
            r5 = this;
            X.03P r0 = r5.A0I
            android.telephony.TelephonyManager r0 = r0.A0F()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0012
            int r2 = r0.getSimState()
            r0 = 5
            r1 = 1
            if (r2 == r0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            boolean r0 = X.AnonymousClass04j.A02(r5)
            if (r0 == 0) goto L_0x0020
            r0 = 2131888480(0x7f120960, float:1.9411597E38)
            r5.A0h(r0, r4)
            return
        L_0x0020:
            if (r1 != 0) goto L_0x0029
            r0 = 2131888482(0x7f120962, float:1.94116E38)
            r5.A0h(r0, r4)
            return
        L_0x0029:
            android.widget.TextView r2 = r5.A05
            X.01X r1 = r5.A01
            r0 = 2131888475(0x7f12095b, float:1.9411586E38)
            java.lang.String r0 = r1.A06(r0)
            r2.setText(r0)
            r5.A0b()
            X.3Gl r2 = new X.3Gl
            r2.<init>(r5)
            r5.A0C = r2
            X.00T r1 = r5.A0D
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r1.ANC(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity.A0e():void");
    }

    public final void A0f() {
        AnonymousClass03S r2 = this.A0K;
        boolean z = false;
        if (r2.A02("android.permission.SEND_SMS") == 0) {
            z = true;
        }
        if (!z || !r2.A08()) {
            this.A0G = true;
            RequestPermissionActivity.A0E(this, r2, 153);
            return;
        }
        A0d();
        C69273Gk r22 = new C69273Gk(this);
        this.A0B = r22;
        ((AnonymousClass1PY) this).A0D.ANC(r22, new Void[0]);
    }

    public final void A0g(int i) {
        int A002;
        if (i == 11452) {
            A002 = R.string.payments_device_binding_sms_data_mismatched;
        } else {
            A002 = C69293Gm.A00(i, this.A09);
        }
        C018809u r3 = this.A0T;
        StringBuilder A0S2 = AnonymousClass008.A0S("onDeviceBinding failure. showErrorAndFinish: ");
        A0S2.append(this.A09.A00("upi-bind-device"));
        r3.A07(null, A0S2.toString(), null);
        if (A002 == R.string.payments_bank_generic_error || A002 == R.string.no_internet_message) {
            A0h(A002, false);
        } else {
            A0h(A002, true);
        }
    }

    public final void A0h(int i, boolean z) {
        C018809u r4 = this.A0T;
        StringBuilder sb = new StringBuilder("IndiaUpiDeviceBindActivity showErrorAndFinish: ");
        sb.append(i);
        r4.A07(null, sb.toString(), null);
        A0a();
        if (i == 0) {
            i = R.string.payments_setup_error;
            String str = this.A09.A03;
            if ("upi-bind-device".equalsIgnoreCase(str)) {
                i = R.string.device_binding_failure_reasons_bullet_list_title;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                this.A00 = 1;
                i = R.string.get_accounts_failure_reason;
            }
        }
        if (z) {
            C61082sT r0 = this.A09;
            if (r0 != null) {
                r0.A06.add("done");
                StringBuilder A0S2 = AnonymousClass008.A0S("clearStates: ");
                A0S2.append(this.A09);
                r4.A07(null, A0S2.toString(), null);
            }
            C60922sD r1 = this.A0L;
            if (r1 != null) {
                r1.A04 = new C61082sT();
                Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
                intent.putExtra("error", i);
                intent.putExtra("error_type", this.A00);
                int i2 = this.A00;
                if (i2 >= 1 && i2 <= 5) {
                    intent.putExtra("extra_bank_account", this.A07);
                }
                if (!((AnonymousClass1PY) this).A09) {
                    intent.putExtra("try_again", 1);
                }
                intent.addFlags(335544320);
                A0c(intent);
                A0I(intent, false);
                finish();
                return;
            }
            throw null;
        }
        APo(i);
    }

    public void A0i(C61072sS r30) {
        String A042;
        int i;
        this.A0E = false;
        C68393Da r10 = this.A0M;
        if (!TextUtils.isEmpty(r10.A04())) {
            A042 = r10.A04();
        } else {
            A042 = this.A0L.A04(this.A07);
        }
        C68683Ed r9 = this.A0R;
        r9.A04(A042);
        C61772ti r2 = r9.A03;
        String str = r2.A02;
        if (str == null) {
            str = r2.A02();
        }
        AnonymousClass20B r5 = new AnonymousClass20B();
        r5.A01 = r9.A00;
        r5.A0A = str;
        r5.A03 = Long.valueOf(r2.A01());
        C74463ay r7 = this.A07;
        r5.A07 = r7.A09;
        if (r30 != null) {
            r5.A08 = String.valueOf(r30.code);
            r5.A09 = r30.text;
        }
        int i2 = this.A0A.A00;
        int i3 = i2 - 1;
        if (i2 == 0) {
            i3 = 0;
        }
        r5.A04 = Long.valueOf((long) i3);
        int i4 = i2 - 1;
        if (i2 == 0) {
            i4 = 0;
        }
        long j = 0;
        int i5 = 0;
        while (i5 <= i4) {
            long[] jArr = C61412t8.A0G;
            j += i5 < jArr.length ? jArr[i5] : ((long) i5) * 5;
            i5++;
        }
        r5.A05 = Long.valueOf(j);
        C60922sD r1 = this.A0L;
        r5.A06 = Long.valueOf((long) r1.A02);
        r5.A0B = r1.A03(r7);
        r5.A00 = r1.A05;
        int i6 = 1;
        if (r30 != null) {
            i6 = 2;
        }
        r5.A02 = Integer.valueOf(i6);
        C018809u r3 = this.A0T;
        StringBuilder A0S2 = AnonymousClass008.A0S("PaymentWamEvent devicebind event:");
        A0S2.append(r5.toString());
        r3.A07(null, A0S2.toString(), null);
        ((AnonymousClass1PY) this).A0A.A0B(r5, null, false);
        StringBuilder A0S3 = AnonymousClass008.A0S("IndiaUpiDeviceBindActivity: onDeviceBinding: ");
        boolean z = false;
        if (r30 == null) {
            z = true;
        }
        A0S3.append(z);
        r3.A07(null, A0S3.toString(), null);
        if (r30 == null || (i = r30.code) == 11453) {
            String A043 = r10.A04();
            if (!this.A09.A06.contains("upi-get-challenge") && r10.A0I() == null) {
                this.A09.A02("upi-get-challenge");
                C60942sF r13 = new C60942sF(this, ((ActivityC004702f) this).A0F, this.A0I, ((AnonymousClass1PY) this).A0D, this.A0U, this.A0O, this.A0J, this.A0P, this.A0Q, r9, this.A0N, r10, getApplicationContext(), A0W, this.A09);
                this.A08 = r13;
                r13.A00();
            }
            this.A05.setText(((AnonymousClass2C0) this).A01.A06(R.string.payments_progress_getting_accounts));
            this.A03.setVisibility(8);
            A0b();
            A0j(A043);
        } else if (!C69293Gm.A02(this, "upi-bind-device", i, true)) {
            int i7 = r30.code;
            if (i7 != 476) {
                if (!(i7 == 11452 || i7 == 11477 || i7 == 11544)) {
                    if (i7 != 11469) {
                        if (i7 != 11470) {
                            StringBuilder A0S4 = AnonymousClass008.A0S("onDeviceBinding failure. showErrorAndFinish at error: ");
                            A0S4.append(this.A09.A00("upi-bind-device"));
                            r3.A07(null, A0S4.toString(), null);
                            this.A00 = 2;
                            A0g(r30.code);
                            return;
                        }
                    } else if (this.A09.A06("upi-bind-device")) {
                        this.A0E = true;
                        StringBuilder A0S5 = AnonymousClass008.A0S("onDeviceBinding failure. Retry delayedDeviceVerifIqHandlerMessage at error: ");
                        A0S5.append(this.A09.A00("upi-bind-device"));
                        r3.A07(null, A0S5.toString(), null);
                        this.A04.setText(((AnonymousClass2C0) this).A01.A06(R.string.register_wait_message));
                        this.A0A.A00();
                        return;
                    } else if (this.A09.A00("upi-bind-device") >= 3) {
                        r10.A0C(r1.A04(this.A07));
                        this.A00 = 3;
                        A0g(this.A09.A00);
                        r1.A07();
                        return;
                    } else {
                        return;
                    }
                }
                r10.A0C(r1.A04(this.A07));
                this.A00 = 3;
                A0g(r30.code);
                return;
            }
            r10.A0C(r1.A04(this.A07));
            A0h(R.string.upi_twenty_four_hour_multiple_phone_number_device_bind_error, false);
        }
    }

    public final void A0j(String str) {
        String A042;
        C018809u r4 = this.A0T;
        StringBuilder A0S2 = AnonymousClass008.A0S("getAccountsAfterDeviceBinding: bank picked and calling sendGetBankAccounts for: ");
        C74463ay r1 = this.A07;
        A0S2.append(((AnonymousClass27v) r1).A05);
        A0S2.append(" accountProvider:");
        r4.A07(null, AnonymousClass008.A0P(A0S2, r1.A07, " psp: ", str), null);
        C61412t8 r9 = this.A0A;
        C74463ay r8 = this.A07;
        if (r9 != null) {
            Log.i("PAY: sendGetBankAccounts called");
            C61082sT r14 = r9.A0C;
            r14.A03("upi-get-accounts");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AnonymousClass0OS("action", "upi-get-accounts", null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("device-id", r9.A0F.A02(), null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("bank-ref-id", r8.A07, null, (byte) 0));
            C68393Da r12 = r9.A0A;
            if (!TextUtils.isEmpty(r12.A04())) {
                A042 = r12.A04();
            } else {
                A042 = r9.A09.A04(r8);
            }
            if (!TextUtils.isEmpty(A042)) {
                arrayList.add(new AnonymousClass0OS("code", r8.A09, null, (byte) 0));
                AnonymousClass008.A1F("provider-type", A042, arrayList);
            }
            r9.A0D.A09(false, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74583bA(r9, r9.A08.A00, r9.A06, r9.A07, r9.A0B, r14), 0);
            this.A0R.AQ7();
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r9.size() <= 0) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(java.util.ArrayList r9, X.C61072sS r10) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity.A0k(java.util.ArrayList, X.2sS):void");
    }

    public final void A0l(boolean z) {
        String A042;
        C68393Da r1 = this.A0M;
        if (!TextUtils.isEmpty(r1.A04())) {
            A042 = r1.A04();
        } else {
            A042 = this.A0L.A04(this.A07);
        }
        C68683Ed r2 = this.A0R;
        r2.A04(A042);
        C61772ti r0 = r2.A03;
        String str = r0.A02;
        if (str == null) {
            str = r0.A02();
        }
        AnonymousClass20A r4 = new AnonymousClass20A();
        r4.A01 = r2.A00;
        r4.A03 = str;
        r4.A02 = this.A07.A09;
        r4.A00 = Boolean.valueOf(z);
        C018809u r3 = this.A0T;
        StringBuilder A0S2 = AnonymousClass008.A0S("PaymentWamEvent smsSent event: ");
        A0S2.append(r4.toString());
        r3.A07(null, A0S2.toString(), null);
        ((AnonymousClass1PY) this).A0A.A0B(r4, null, false);
    }

    public /* synthetic */ void lambda$onCreate$78$IndiaUpiDeviceBindActivity(View view) {
        this.A03.setVisibility(8);
        A0b();
        A0f();
        AnonymousClass20H r1 = this.A06;
        r1.A01 = Boolean.TRUE;
        ((AnonymousClass1PY) this).A0A.A07(r1);
    }

    @Override // X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 153) {
            if (i != 154) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                A0d();
                A0e();
            } else {
                APo(R.string.payments_sms_permission_msg);
            }
        } else if (i2 == -1) {
            A0f();
        } else {
            APo(R.string.payments_sms_permission_msg);
        }
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        C018809u r2 = this.A0T;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onBackPressed");
        r2.A07(null, sb.toString(), null);
        ArrayList<? extends Parcelable> arrayList = this.A0L.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A0c(intent);
            startActivity(intent);
        }
        finish();
        AnonymousClass20H r1 = this.A06;
        r1.A00 = Boolean.TRUE;
        ((AnonymousClass1PY) this).A0A.A07(r1);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_sms);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        if (r2 == false) goto L_0x00ca;
     */
    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C61412t8 r2 = this.A0A;
        r2.A02 = null;
        r2.A03.removeCallbacksAndMessages(null);
        r2.A01.quit();
        C63062vn r0 = this.A0D;
        if (r0 != null) {
            unregisterReceiver(r0);
            this.A0D = null;
        }
        PendingIntent pendingIntent = this.A02;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.A02 = null;
        }
        C69273Gk r02 = this.A0B;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(false);
        }
        C69283Gl r03 = this.A0C;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(false);
        }
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C018809u r2 = this.A0T;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" action bar home");
        r2.A07(null, sb.toString(), null);
        ArrayList<? extends Parcelable> arrayList = this.A0L.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A0c(intent);
            startActivity(intent);
        }
        finish();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        if (this.A0F) {
            A0h(R.string.payments_error_sms_backgrounded, true);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        if (this.A0E) {
            this.A0T.A07(null, "IndiaUpiDeviceBindActivity: device binding canceled", null);
            this.A0F = true;
            this.A0A.A02 = null;
            this.A0M.A0C(this.A0L.A04(this.A07));
        }
    }
}
