package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC000400g;
import X.AbstractC005102k;
import X.AbstractC007503q;
import X.AbstractC05890Qx;
import X.AbstractC43781yw;
import X.AbstractC61372t4;
import X.AbstractC61452tC;
import X.AbstractC61462tD;
import X.AbstractC63522wY;
import X.AbstractC63672wp;
import X.AbstractC63682wq;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass082;
import X.AnonymousClass08B;
import X.AnonymousClass0AD;
import X.AnonymousClass0AL;
import X.AnonymousClass0AQ;
import X.AnonymousClass0BP;
import X.AnonymousClass0FI;
import X.AnonymousClass0GG;
import X.AnonymousClass0GP;
import X.AnonymousClass0JW;
import X.AnonymousClass0LW;
import X.AnonymousClass0M5;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MH;
import X.AnonymousClass0OS;
import X.AnonymousClass0QB;
import X.AnonymousClass0RM;
import X.AnonymousClass0S2;
import X.AnonymousClass0SK;
import X.AnonymousClass1DU;
import X.AnonymousClass1PY;
import X.AnonymousClass1R4;
import X.AnonymousClass1VK;
import X.AnonymousClass1VM;
import X.AnonymousClass1VY;
import X.AnonymousClass1X2;
import X.AnonymousClass3E9;
import X.AnonymousClass3EF;
import X.AnonymousClass3EL;
import X.AnonymousClass3IL;
import X.AnonymousClass3IN;
import X.AnonymousClass3IS;
import X.AnonymousClass3XM;
import X.C002001d;
import X.C007003k;
import X.C014308b;
import X.C018609s;
import X.C018809u;
import X.C02010Ah;
import X.C05490Ot;
import X.C05880Qw;
import X.C05900Qy;
import X.C10090e1;
import X.C10100e2;
import X.C12420i4;
import X.C28051Sr;
import X.C449222e;
import X.C61072sS;
import X.C61082sT;
import X.C61122sX;
import X.C61432tA;
import X.C63692wr;
import X.C63702ws;
import X.C63712wt;
import X.C63722wu;
import X.C63742ww;
import X.C63822x4;
import X.C68393Da;
import X.C68993Fi;
import X.C69023Fl;
import X.C69293Gm;
import X.C69313Go;
import X.C74463ay;
import X.C74553b7;
import X.DialogInterface$OnCancelListenerC62422ul;
import X.DialogInterface$OnCancelListenerC62462up;
import X.DialogInterface$OnCancelListenerC62472uq;
import X.DialogInterface$OnCancelListenerC62502ut;
import X.DialogInterface$OnCancelListenerC62522uv;
import X.DialogInterface$OnClickListenerC62362uf;
import X.DialogInterface$OnClickListenerC62382uh;
import X.DialogInterface$OnClickListenerC62392ui;
import X.DialogInterface$OnClickListenerC62402uj;
import X.DialogInterface$OnClickListenerC62412uk;
import X.DialogInterface$OnClickListenerC62432um;
import X.DialogInterface$OnClickListenerC62442un;
import X.DialogInterface$OnClickListenerC62482ur;
import X.DialogInterface$OnClickListenerC62492us;
import X.DialogInterface$OnClickListenerC62512uu;
import X.DialogInterface$OnClickListenerC62532uw;
import X.DialogInterface$OnClickListenerC62542ux;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IndiaUpiPaymentActivity extends AnonymousClass1DU implements AbstractC61462tD, AbstractC63682wq, AbstractC63672wp, AnonymousClass1R4, AbstractC63522wY, AbstractC61372t4, AbstractC61452tC {
    public C007003k A00;
    public C05900Qy A01;
    public AnonymousClass1VM A02;
    public UserJid A03;
    public AnonymousClass3XM A04;
    public AnonymousClass3E9 A05;
    public AnonymousClass3EF A06;
    public C10100e2 A07;
    public C10090e1 A08;
    public PaymentView A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass0GG A0I = AnonymousClass0GG.A00();
    public final AnonymousClass0BP A0J = new C69313Go(this);
    public final AnonymousClass08B A0K = AnonymousClass08B.A00;
    public final C014308b A0L = C014308b.A00();
    public final AnonymousClass03S A0M = AnonymousClass03S.A00();
    public final AnonymousClass0AQ A0N = AnonymousClass0AQ.A00();
    public final AnonymousClass01K A0O = AnonymousClass01K.A00();
    public final C018609s A0P = C018609s.A04();
    public final AbstractC05890Qx A0Q = AnonymousClass1VK.A01("INR");
    public final C449222e A0R = C449222e.A00();
    public final AnonymousClass0GP A0S = AnonymousClass0GP.A00();
    public final C02010Ah A0T = C02010Ah.A00();
    public final AnonymousClass0AD A0U = AnonymousClass0AD.A00;
    public final C61122sX A0V = C61122sX.A00();
    public final C018809u A0W = C018809u.A00("IndiaUpiPaymentActivity", "payment", "IN");
    public final C63822x4 A0X = C63822x4.A00();
    public final AnonymousClass0AL A0Y = AnonymousClass0AL.A01();

    @Override // X.AbstractC63682wq
    public Activity A4g() {
        return this;
    }

    @Override // X.AnonymousClass1R4
    public void AF8(int i) {
    }

    @Override // X.AbstractActivityC34761jB
    public void A0W() {
        ((AnonymousClass1PY) this).A07 = null;
        ((AnonymousClass1PY) this).A08 = null;
        super.A0W();
    }

    public final int A0m() {
        AnonymousClass1VM r5 = this.A02;
        if (r5 == null) {
            return C28051Sr.A0D(this.A0B);
        }
        List list = this.A0B;
        for (int i = 0; i < list.size(); i++) {
            if (((AnonymousClass1VM) list.get(i)).A07.equals(r5.A07)) {
                return i;
            }
        }
        return 0;
    }

    public final C05490Ot A0n() {
        AbstractC007503q r12;
        AnonymousClass0AL r5 = this.A0Y;
        AnonymousClass02N r6 = ((AbstractActivityC34761jB) this).A02;
        String paymentNote = this.A09.getPaymentNote();
        List mentionedJids = this.A09.getMentionedJids();
        long j = ((AbstractActivityC34761jB) this).A01;
        if (j != 0) {
            r12 = this.A0O.A0J.A01(j);
        } else {
            r12 = null;
        }
        C05490Ot A042 = r5.A04(r6, paymentNote, 0, null, mentionedJids, r12);
        if (AnonymousClass1VY.A0Y(((AbstractActivityC34761jB) this).A02)) {
            A042.A0Y(((AbstractActivityC34761jB) this).A03);
        }
        return A042;
    }

    public final String A0o() {
        if (ABY() && !TextUtils.isEmpty(((AnonymousClass1PY) this).A04)) {
            return ((AnonymousClass1PY) this).A04;
        }
        C007003k r1 = this.A00;
        if (r1 == null) {
            return ((AnonymousClass1PY) this).A07;
        }
        return this.A0L.A06(r1);
    }

    public final String A0p() {
        if (!TextUtils.isEmpty(((AnonymousClass1PY) this).A02)) {
            C018809u r2 = this.A0W;
            StringBuilder A0S2 = AnonymousClass008.A0S("getSeqNum/incomingPayRequestId");
            A0S2.append(((AnonymousClass1PY) this).A02);
            r2.A07(null, A0S2.toString(), null);
            return ((AnonymousClass1PY) this).A02;
        } else if (!TextUtils.isEmpty(((AbstractActivityC34761jB) this).A09)) {
            C018809u r22 = this.A0W;
            StringBuilder A0S3 = AnonymousClass008.A0S("getSeqNum/transactionId");
            A0S3.append(((AbstractActivityC34761jB) this).A09);
            r22.A07(null, A0S3.toString(), null);
            return ((AbstractActivityC34761jB) this).A09;
        } else {
            String A0X2 = A0X(((AnonymousClass1DU) this).A0D.A03());
            C018809u r23 = this.A0W;
            StringBuilder A0S4 = AnonymousClass008.A0S("getSeqNum/seqNum generated:");
            A0S4.append(C28051Sr.A16(A0X2));
            r23.A07(null, A0S4.toString(), null);
            return A0X2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        if (r5 == false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0q() {
        /*
        // Method dump skipped, instructions count: 383
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentActivity.A0q():void");
    }

    public final void A0r() {
        UserJid of;
        AnonymousClass02N r1 = ((AbstractActivityC34761jB) this).A02;
        if (AnonymousClass1VY.A0Y(r1)) {
            of = ((AbstractActivityC34761jB) this).A03;
        } else {
            of = UserJid.of(r1);
        }
        this.A03 = of;
        C007003k r2 = null;
        if (!ABY()) {
            r2 = this.A0N.A02(this.A03);
        }
        this.A00 = r2;
        PaymentView paymentView = this.A09;
        if (paymentView == null) {
            return;
        }
        if (r2 != null) {
            String A082 = this.A0L.A08(r2, false);
            paymentView.A0T = A082;
            paymentView.A09.setText(A082);
            paymentView.A0J.A02(r2, paymentView.A0I);
            return;
        }
        String str = ((AnonymousClass1PY) this).A07;
        String str2 = ((AnonymousClass1PY) this).A04;
        if (!TextUtils.isEmpty(str2)) {
            paymentView.A0T = str2;
            paymentView.A0A.setText(str);
        } else {
            paymentView.A0T = str;
        }
        paymentView.A09.setText(paymentView.A0T);
        paymentView.A0d.A05(paymentView.A0I, R.drawable.avatar_contact);
    }

    public final void A0s() {
        if (!this.A0H) {
            if (((ActivityC004702f) this).A04 == null) {
                setContentView(this.A09);
            }
            A0r();
            String str = this.A0A;
            if (str != null) {
                this.A09.A0U = str;
            }
            List list = this.A0B;
            if (list != null) {
                list.clear();
            }
            if (this.A08 == null) {
                C10090e1 r2 = new C10090e1(this);
                this.A08 = r2;
                ((AnonymousClass1PY) this).A0D.ANC(r2, new Void[0]);
            }
        }
    }

    public final void A0t() {
        if (!ABY() || !TextUtils.isEmpty(((AnonymousClass1PY) this).A04)) {
            A0s();
            return;
        }
        A0G(R.string.payment_vpa_verify_in_progress);
        this.A06.A00(((AnonymousClass1PY) this).A07, null, new C69023Fl(this));
    }

    public final void A0u(int i, Object... objArr) {
        String A082;
        ((ActivityC004702f) this).A0K.A00();
        ((AnonymousClass1DU) this).A08 = false;
        if (i == 0) {
            i = R.string.payments_transfer_not_init;
        } else if (i == R.string.payments_receiver_not_in_region || i == R.string.payments_receiver_disabled_in_country || i == R.string.payments_receiver_app_version_unsupported || i == R.string.payments_receiver_generic_error || i == R.string.payments_receiver_not_in_group) {
            Object[] objArr2 = new Object[1];
            C007003k r1 = this.A00;
            if (r1 == null) {
                A082 = ((AnonymousClass1PY) this).A07;
            } else {
                A082 = this.A0L.A08(r1, false);
            }
            objArr2[0] = A082;
            APq(0, i, objArr2);
            return;
        }
        APq(0, i, objArr);
    }

    public final void A0v(AnonymousClass0MH r9) {
        Intent intent = new Intent(this, IndiaUpiPaymentTransactionDetailsActivity.class);
        AnonymousClass02N r7 = r9.A08;
        boolean z = r9.A0M;
        String str = r9.A0H;
        if (intent.hasExtra("fMessageKeyJid") || intent.hasExtra("fMessageKeyFromMe") || intent.hasExtra("fMessageKeyId")) {
            throw new IllegalArgumentException("Intent already contains key.");
        }
        intent.putExtra("fMessageKeyId", str).putExtra("fMessageKeyFromMe", z).putExtra("fMessageKeyJid", AnonymousClass1VY.A0D(r7));
        intent.putExtra("extra_transaction_id", r9.A0G);
        intent.putExtra("extra_transaction_ref", ((AnonymousClass1PY) this).A06);
        if (this.A0G) {
            intent.setFlags(33554432);
            intent.putExtra("extra_return_after_completion", true);
        }
        A0I(intent, false);
        ((ActivityC004702f) this).A0K.A00();
        A0Z();
        finish();
    }

    public final void A0w(C61072sS r4, boolean z) {
        ((ActivityC004702f) this).A0K.A00();
        if (r4 == null) {
            A0Z();
            ((AnonymousClass1PY) this).A0D.ANF(new RunnableEBaseShape1S0110000_I1(this, z, 12));
        } else if (!C69293Gm.A02(this, "upi-send-to-vpa", r4.code, false)) {
            A0i();
        }
    }

    public final void A0x(boolean z) {
        Intent intent = new Intent(this, IndiaUpiEducationActivity.class);
        intent.putExtra("extra_use_pin_education_type", 2);
        intent.putExtra("extra_bank_account", C28051Sr.A14(this.A02.A0A));
        intent.putExtra("extra_education_type", 1);
        if (!z) {
            intent.addFlags(65536);
        }
        startActivityForResult(intent, 1002);
    }

    public final boolean A0y(AnonymousClass0RM r4) {
        if (!r4.A03 || r4.A04) {
            return false;
        }
        ((ActivityC004702f) this).A0K.A00();
        if (r4.A05) {
            Intent intent = new Intent(this, IndiaUpiInvitePaymentActivity.class);
            intent.putExtra("extra_receiver_jid", AnonymousClass1VY.A0D(this.A03));
            intent.putExtra("extra_receiver", this.A0L.A06(this.A00));
            A0H(intent, 1004);
            return true;
        }
        C002001d.A2O(this, 15);
        return true;
    }

    @Override // X.AbstractC63682wq
    public String A8A() {
        return ((AnonymousClass1PY) this).A07;
    }

    @Override // X.AbstractC63682wq
    public boolean ABP() {
        return ((AbstractActivityC34761jB) this).A07 != null || ((AbstractActivityC34761jB) this).A06 == null;
    }

    @Override // X.AbstractC63682wq
    public boolean ABY() {
        return ((AbstractActivityC34761jB) this).A03 == null && ((AbstractActivityC34761jB) this).A02 == null && !TextUtils.isEmpty(((AnonymousClass1PY) this).A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
        if (r37.A01.A00.compareTo(r40.A00) >= 0) goto L_0x0092;
     */
    @Override // X.AbstractC61462tD
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AE2(boolean r38, boolean r39, X.C05900Qy r40, X.C05900Qy r41, X.AnonymousClass0RM r42, X.AnonymousClass0RM r43, X.C61072sS r44) {
        /*
        // Method dump skipped, instructions count: 1385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentActivity.AE2(boolean, boolean, X.0Qy, X.0Qy, X.0RM, X.0RM, X.2sS):void");
    }

    @Override // X.AbstractC61462tD
    public void AH0(String str, C61072sS r15) {
        Integer num;
        ((AnonymousClass1DU) this).A0I.A03(1, this.A02, r15);
        String str2 = null;
        if (!TextUtils.isEmpty(str)) {
            C018809u r3 = this.A0W;
            StringBuilder A0S2 = AnonymousClass008.A0S("starting sendPaymentToVpa for jid: ");
            A0S2.append(((AbstractActivityC34761jB) this).A02);
            A0S2.append(" vpa: ");
            A0S2.append(C28051Sr.A17(((AnonymousClass1PY) this).A07));
            r3.A07(null, A0S2.toString(), null);
            C74463ay r2 = (C74463ay) this.A02.A06;
            AnonymousClass00E.A04(r2, r3.A02(r3.A02, "onListKeys: Cannot get IndiaUpiMethodData").toString());
            AnonymousClass3XM r8 = new AnonymousClass3XM();
            r8.A0D = A0p();
            r8.A07 = ((AnonymousClass1DU) this).A05;
            C68393Da r1 = ((AnonymousClass1DU) this).A0D;
            r8.A0B = r1.A05();
            r8.A0C = r1.A08();
            r8.A09 = ((AnonymousClass1PY) this).A07;
            r8.A0A = ((AnonymousClass1PY) this).A08;
            r8.A05 = ((AbstractActivityC34761jB) this).A0F.A05();
            r8.A0F = r2.A0A;
            this.A04 = r8;
            ((AnonymousClass1DU) this).A03.A02("upi-get-credential");
            AnonymousClass1VM r0 = this.A02;
            String str3 = r0.A08;
            int i = r2.A04;
            C05900Qy r9 = this.A01;
            String str4 = r0.A0A;
            String A0o = A0o();
            C007003k r02 = this.A00;
            if (r02 != null) {
                str2 = C12420i4.A00(r02);
            }
            A0k(str, str3, i, r8, r9, str4, A0o, str2);
        } else if (r15 != null && !C69293Gm.A02(this, "upi-list-keys", r15.code, false)) {
            if (((AnonymousClass1DU) this).A03.A06("upi-list-keys")) {
                ((AnonymousClass1DU) this).A0D.A0A();
                ((ActivityC004702f) this).A0K.A00();
                A0G(R.string.payments_still_working);
                ((AnonymousClass1DU) this).A04.A00();
                return;
            }
            C018809u r22 = this.A0W;
            StringBuilder A0S3 = AnonymousClass008.A0S("onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0S3.append(num);
            A0S3.append(" failed; ; showErrorAndFinish");
            r22.A07(null, A0S3.toString(), null);
            A0i();
        }
    }

    @Override // X.AbstractC63672wp
    public void AIL() {
        if (AnonymousClass1VY.A0Y(((AbstractActivityC34761jB) this).A02) && ((AbstractActivityC34761jB) this).A00 == 0) {
            A0W();
        }
    }

    @Override // X.AbstractC63672wp
    public void AIM() {
        List list = this.A0C;
        if (list != null && list.size() >= 2) {
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A012 = AnonymousClass008.A01("dialog_id", 18);
            A012.putString("title", ((AnonymousClass1DU) this).A0B.A06(R.string.google_account_picker_title));
            A012.putStringArray("items", (String[]) this.A0C.toArray(new String[0]));
            A012.putInt("selected_item_index", A0m());
            singleChoiceListDialogFragment.A0N(A012);
            if (!C002001d.A3D(this) && !this.A0D) {
                AnonymousClass0LW A042 = A04();
                if (A042 != null) {
                    AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                    r0.A0A(0, singleChoiceListDialogFragment, null, 1);
                    r0.A01();
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.AbstractC63672wp
    public void AJQ(String str, C05900Qy r19) {
        String str2;
        String A0X2;
        if (this.A02 != null) {
            this.A01 = r19;
            if (ABY()) {
                A0G(R.string.register_wait_message);
                AnonymousClass3XM r2 = new AnonymousClass3XM();
                this.A04 = r2;
                r2.A08 = AnonymousClass0FI.A09(((AbstractActivityC34761jB) this).A0F, ((AnonymousClass1DU) this).A0A);
                AnonymousClass3XM r1 = this.A04;
                if (!TextUtils.isEmpty(((AbstractActivityC34761jB) this).A09)) {
                    A0X2 = ((AbstractActivityC34761jB) this).A09;
                } else {
                    A0X2 = A0X(((AnonymousClass1DU) this).A0D.A03());
                }
                r1.A0D = A0X2;
                C74463ay r22 = (C74463ay) this.A02.A06;
                C018809u r4 = this.A0W;
                AnonymousClass00E.A04(r22, r4.A02(r4.A02, "IndiaUpiPaymentActivity onRequestPayment: Cannot get IndiaUpiMethodData").toString());
                this.A04.A0F = r22.A0A;
                AnonymousClass3E9 r5 = this.A05;
                String str3 = ((AnonymousClass1PY) this).A07;
                String str4 = ((AnonymousClass1PY) this).A08;
                C68393Da r0 = ((AnonymousClass1DU) this).A0D;
                String A052 = r0.A05();
                String A082 = r0.A08();
                String str5 = r22.A0A;
                String A5e = this.A0Q.A5e();
                AnonymousClass3XM r02 = this.A04;
                String str6 = r02.A0D;
                String str7 = r02.A08;
                String str8 = this.A02.A07;
                if (r5 != null) {
                    Log.i("PAY: collectFromVpa called");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new AnonymousClass0OS("action", "upi-collect-from-vpa", null, (byte) 0));
                    AnonymousClass008.A1F("sender-vpa", str3, arrayList);
                    if (str4 != null) {
                        AnonymousClass008.A1F("sender-vpa-id", str4, arrayList);
                    }
                    if (A052 != null) {
                        AnonymousClass008.A1F("receiver-vpa", A052, arrayList);
                    } else {
                        Log.e("PAY: IndiaUpiCollectVpaAction collectFromVpa: receiverVpa is null");
                    }
                    if (A082 != null) {
                        AnonymousClass008.A1F("receiver-vpa-id", A082, arrayList);
                    }
                    arrayList.add(new AnonymousClass0OS("upi-bank-info", str5, null, (byte) 0));
                    arrayList.add(new AnonymousClass0OS("device-id", r5.A04.A02(), null, (byte) 0));
                    arrayList.add(new AnonymousClass0OS("amount", str, null, (byte) 0));
                    arrayList.add(new AnonymousClass0OS("currency", A5e, null, (byte) 0));
                    arrayList.add(new AnonymousClass0OS("seq-no", str6, null, (byte) 0));
                    arrayList.add(new AnonymousClass0OS("message-id", str7, null, (byte) 0));
                    AnonymousClass008.A1F("credential-id", str8, arrayList);
                    C61082sT r10 = ((C61432tA) r5).A00;
                    if (r10 != null) {
                        r10.A03("upi-collect-from-vpa");
                    }
                    ((C61432tA) r5).A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74553b7(r5.A00, r5.A01, r5.A02, r5.A03, r10, this), 0);
                    return;
                }
                throw null;
            }
            C05490Ot A0n = A0n();
            C018809u r52 = this.A0W;
            AnonymousClass1X2[] r42 = new AnonymousClass1X2[1];
            UserJid userJid = ((AbstractActivityC34761jB) this).A03;
            if (userJid != null) {
                str2 = userJid.getObfuscatedString();
            } else {
                str2 = "";
            }
            r42[0] = new AnonymousClass1X2("receiver_jid", str2);
            r52.A07(null, "requesting payment ", r42);
            ((AnonymousClass1PY) this).A0D.ANF(new RunnableEBaseShape8S0200000_I1_3(this, A0n, 43));
            ((ActivityC004702f) this).A0K.A00();
            A0Z();
            A0U();
        }
    }

    @Override // X.AbstractC63672wp
    public void AJx(String str, C05900Qy r8) {
        AnonymousClass1VM r0 = this.A02;
        if (r0 != null) {
            this.A01 = r8;
            if (!((C74463ay) r0.A06).A0G) {
                Intent intent = new Intent(this, IndiaUpiResetPinActivity.class);
                intent.putExtra("extra_bank_account", this.A02);
                A0c(intent);
                intent.putExtra("extra_default_action_after_setup", 1);
                startActivityForResult(intent, 1003);
                return;
            }
            String[] split = this.A0T.A01().getString("payments_sent_payment_with_account", "").split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (split[i].equalsIgnoreCase(this.A02.A07)) {
                    this.A0E = true;
                    break;
                } else {
                    i++;
                }
            }
            A0q();
        }
    }

    @Override // X.AbstractC63672wp
    public void AJy() {
        APq(0, R.string.payments_cancel, this.A0L.A06(this.A00));
    }

    @Override // X.AbstractC61462tD
    public void AK1(C61072sS r4) {
        C018809u r2 = this.A0W;
        throw new UnsupportedOperationException(r2.A02(r2.A02, "onSetPin unsupported").toString());
    }

    @Override // X.AnonymousClass1R4
    public void AKA(int i, int i2, String[] strArr) {
        if (i == 18) {
            AnonymousClass1VM r0 = (AnonymousClass1VM) this.A0B.get(i2);
            this.A02 = r0;
            this.A09.setBankLogo(r0.A05());
            this.A09.setPaymentMethodText(C28051Sr.A0y(((AnonymousClass1DU) this).A0H, ((AnonymousClass1DU) this).A0B, this.A02));
            C74463ay r02 = (C74463ay) this.A02.A06;
            if (r02 == null) {
                this.A0W.A07(null, "could not find bank info", null);
                A0i();
            } else if (!r02.A0G) {
                Intent intent = new Intent(this, IndiaUpiResetPinActivity.class);
                intent.putExtra("extra_bank_account", this.A02);
                A0c(intent);
                startActivity(intent);
            }
        }
    }

    @Override // X.AbstractC63522wY
    public Object AMC() {
        C05900Qy A7X;
        C05900Qy A7G;
        AbstractC05890Qx A012 = AnonymousClass1VK.A01("INR");
        if (!TextUtils.isEmpty(((AbstractActivityC34761jB) this).A07)) {
            A7X = new C05900Qy(new BigDecimal(((AbstractActivityC34761jB) this).A07), A012.A5z());
        } else {
            A7X = A012.A7X();
        }
        if (TextUtils.isEmpty(((AbstractActivityC34761jB) this).A07) || TextUtils.isEmpty(((AbstractActivityC34761jB) this).A06)) {
            A7G = A012.A7G();
        } else {
            A7G = new C05900Qy(new BigDecimal(((AbstractActivityC34761jB) this).A06), A012.A5z());
        }
        C05900Qy r4 = new C05900Qy(new BigDecimal(((ActivityC004702f) this).A0G.A06(AbstractC000400g.A3o)), A012.A5z());
        AnonymousClass02N r9 = ((AbstractActivityC34761jB) this).A02;
        String str = ((AbstractActivityC34761jB) this).A05;
        String str2 = ((AbstractActivityC34761jB) this).A09;
        int i = 2;
        if (((AbstractActivityC34761jB) this).A0B) {
            i = 0;
        }
        C63722wu r14 = new C63722wu(i);
        List list = ((AbstractActivityC34761jB) this).A0A;
        AnonymousClass01X r3 = ((AnonymousClass1DU) this).A0B;
        return new C63742ww(r9, true, str, str2, this, r14, new C63712wt(list, NumberEntryKeyboard.A00(r3)), this, new C63692wr(((AbstractActivityC34761jB) this).A08, ((AbstractActivityC34761jB) this).A06, false, ((AbstractActivityC34761jB) this).A07, false, false, new C63702ws(A012), new AnonymousClass3IS(A012, r3, A7G, A7X, r4)), new AnonymousClass3IN(this, new AnonymousClass3IL()), C68993Fi.A00);
    }

    @Override // X.AnonymousClass1DU, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 155) {
            switch (i) {
                case SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS:
                    HashMap hashMap = ((AnonymousClass1DU) this).A0C.A08;
                    if (i2 != -1 || hashMap == null) {
                        this.A0W.A08("REQUEST_TOS_UPDATED but found null credentialBlobs", null);
                        A0Z();
                        finish();
                        return;
                    }
                    ((ActivityC004702f) this).A0K.A00();
                    A0G(R.string.register_wait_message);
                    AnonymousClass3EL r1 = ((AnonymousClass1DU) this).A04;
                    String str = this.A02.A07;
                    UserJid userJid = this.A03;
                    AnonymousClass3XM r0 = this.A04;
                    r1.A01(str, userJid, r0.A0B, r0.A0C, r0.A09, r0.A0A, hashMap, r0.A0D, this.A01.toString(), ((AnonymousClass1DU) this).A06);
                    return;
                case 1001:
                    if (i2 == -1) {
                        ((AbstractActivityC34761jB) this).A03 = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
                        return;
                    } else if (i2 == 0 && ((AbstractActivityC34761jB) this).A03 == null) {
                        A0Z();
                        finish();
                        return;
                    } else {
                        return;
                    }
                case 1002:
                    if (i2 == -1) {
                        C02010Ah r3 = this.A0T;
                        StringBuilder sb = new StringBuilder();
                        sb.append(r3.A01().getString("payments_sent_payment_with_account", ""));
                        sb.append(";");
                        sb.append(this.A02.A07);
                        AnonymousClass008.A0q(r3, "payments_sent_payment_with_account", sb.toString());
                        ((AnonymousClass1DU) this).A04.A00();
                        return;
                    } else if (i2 == 100) {
                        this.A0H = true;
                        Intent intent2 = new Intent(this, IndiaUpiResetPinActivity.class);
                        A0c(intent2);
                        intent2.putExtra("extra_bank_account", this.A02);
                        intent2.putExtra("extra_in_setup", false);
                        startActivityForResult(intent2, 1003);
                        return;
                    } else if (i2 == 0) {
                        ((AnonymousClass1DU) this).A08 = false;
                        return;
                    } else {
                        return;
                    }
                case 1003:
                    if (i2 == -1) {
                        C02010Ah r32 = this.A0T;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(r32.A01().getString("payments_sent_payment_with_account", ""));
                        sb2.append(";");
                        sb2.append(this.A02.A07);
                        AnonymousClass008.A0q(r32, "payments_sent_payment_with_account", sb2.toString());
                        this.A0E = true;
                        A0q();
                        return;
                    } else if (i2 == 0) {
                        ((AnonymousClass1DU) this).A08 = false;
                        if (((AbstractActivityC34761jB) this).A0I.A08() && !this.A0E) {
                            A0x(false);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                case 1004:
                    if (!AnonymousClass1VY.A0Y(((AbstractActivityC34761jB) this).A02)) {
                        A0Z();
                        finish();
                        return;
                    }
                    ((AbstractActivityC34761jB) this).A03 = null;
                    return;
                default:
                    super.onActivityResult(i, i2, intent);
                    return;
            }
        } else if (i2 == -1) {
            A0q();
        }
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        PaymentView paymentView = this.A09;
        if (paymentView != null && paymentView.A04()) {
            return;
        }
        if (!AnonymousClass1VY.A0Y(((AbstractActivityC34761jB) this).A02) || ((AbstractActivityC34761jB) this).A00 != 0) {
            A0Z();
            finish();
            return;
        }
        ((AbstractActivityC34761jB) this).A03 = null;
        A0W();
    }

    @Override // X.AnonymousClass1DU, X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0K.A01(this.A0J);
        this.A0G = getIntent().getBooleanExtra("return-after-pay", false);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            AnonymousClass01X r2 = ((AnonymousClass1DU) this).A0B;
            boolean z = ((AbstractActivityC34761jB) this).A0B;
            int i = R.string.new_payment;
            if (z) {
                i = R.string.payments_send_money;
            }
            A092.A08(r2.A06(i));
            A092.A0A(true);
            if (!((AbstractActivityC34761jB) this).A0B) {
                A092.A02(0.0f);
            }
        }
        PaymentView paymentView = (PaymentView) LayoutInflater.from(this).inflate(R.layout.send_payment_screen, (ViewGroup) null, false);
        this.A09 = paymentView;
        if (paymentView != null) {
            paymentView.A0M = this;
            A75().A00(new AnonymousClass0SK() {
                /* class com.whatsapp.payments.ui.widget.$$Lambda$cfXOxw_xiRBPGdEVyDTISt7ZSk */

                @Override // X.AnonymousClass0SK
                public final void AKQ(AbstractC005102k r2, AnonymousClass082 r3) {
                    PaymentView.this.A02(r3);
                }
            });
            if (ABY()) {
                this.A06 = new AnonymousClass3EF(this, ((ActivityC004702f) this).A0F, ((AnonymousClass1DU) this).A0K, ((ActivityC004702f) this).A0H, ((AnonymousClass1DU) this).A0C, ((AbstractActivityC34761jB) this).A0J, this.A0R, this.A0S);
            }
            this.A05 = new AnonymousClass3E9(this, ((ActivityC004702f) this).A0F, ((AnonymousClass1DU) this).A0K, ((ActivityC004702f) this).A0H, ((AnonymousClass1DU) this).A0C, ((AbstractActivityC34761jB) this).A0J, this.A0S);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass1DU, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 15) {
            AnonymousClass0MB r5 = new AnonymousClass0MB(this);
            AnonymousClass01X r4 = ((AnonymousClass1DU) this).A0B;
            String A0D2 = r4.A0D(R.string.payments_nodal_not_allowed, this.A0L.A06(this.A00));
            AnonymousClass0MC r2 = r5.A01;
            r2.A0E = A0D2;
            r5.A07(r4.A06(R.string.ok), new DialogInterface$OnClickListenerC62362uf(this));
            r2.A0J = false;
            r2.A02 = new DialogInterface$OnCancelListenerC62522uv(this);
            return r5.A00();
        } else if (i == 22) {
            AnonymousClass0MB r42 = new AnonymousClass0MB(this);
            AnonymousClass01X r3 = ((AnonymousClass1DU) this).A0B;
            String A0D3 = r3.A0D(R.string.unblock_payment_id_error_default, r3.A06(R.string.india_upi_payment_id_name));
            AnonymousClass0MC r22 = r42.A01;
            r22.A0E = A0D3;
            r42.A07(r3.A06(R.string.ok), new DialogInterface$OnClickListenerC62392ui(this));
            r22.A0J = false;
            return r42.A00();
        } else if (i != 26) {
            switch (i) {
                case 10:
                    AnonymousClass0MB r43 = new AnonymousClass0MB(this);
                    AnonymousClass01X r52 = ((AnonymousClass1DU) this).A0B;
                    String A062 = r52.A06(R.string.payments_check_pin_invalid_pin_retry);
                    AnonymousClass0MC r32 = r43.A01;
                    r32.A0E = A062;
                    r43.A06(r52.A06(R.string.forgot_upi_pin), new DialogInterface$OnClickListenerC62542ux(this));
                    r43.A05(r52.A06(R.string.cancel), new DialogInterface$OnClickListenerC62382uh(this));
                    r43.A07(r52.A06(R.string.payments_try_again), new DialogInterface$OnClickListenerC62402uj(this));
                    r32.A0J = true;
                    r32.A02 = new DialogInterface$OnCancelListenerC62422ul(this);
                    return r43.A00();
                case 11:
                    AnonymousClass0MB r53 = new AnonymousClass0MB(this);
                    AnonymousClass01X r44 = ((AnonymousClass1DU) this).A0B;
                    String A063 = r44.A06(R.string.payments_pin_max_retries);
                    AnonymousClass0MC r33 = r53.A01;
                    r33.A0E = A063;
                    r53.A07(r44.A06(R.string.forgot_upi_pin), new DialogInterface$OnClickListenerC62442un(this));
                    r53.A05(r44.A06(R.string.cancel), new DialogInterface$OnClickListenerC62482ur(this));
                    r33.A0J = true;
                    r33.A02 = new DialogInterface$OnCancelListenerC62462up(this);
                    return r53.A00();
                case 12:
                    AnonymousClass0MB r54 = new AnonymousClass0MB(this);
                    AnonymousClass01X r45 = ((AnonymousClass1DU) this).A0B;
                    String A064 = r45.A06(R.string.payments_pin_no_pin_set);
                    AnonymousClass0MC r34 = r54.A01;
                    r34.A0E = A064;
                    r54.A07(r45.A06(R.string.yes), new DialogInterface$OnClickListenerC62432um(this));
                    r54.A05(r45.A06(R.string.no), new DialogInterface$OnClickListenerC62412uk(this));
                    r34.A0J = true;
                    r34.A02 = new DialogInterface$OnCancelListenerC62472uq(this);
                    return r54.A00();
                case 13:
                    ((AnonymousClass1DU) this).A0D.A0B();
                    AnonymousClass0MB r55 = new AnonymousClass0MB(this);
                    AnonymousClass01X r46 = ((AnonymousClass1DU) this).A0B;
                    String A065 = r46.A06(R.string.payments_pin_encryption_error);
                    AnonymousClass0MC r35 = r55.A01;
                    r35.A0E = A065;
                    r55.A07(r46.A06(R.string.yes), new DialogInterface$OnClickListenerC62512uu(this));
                    r55.A05(r46.A06(R.string.no), new DialogInterface$OnClickListenerC62532uw(this));
                    r35.A0J = true;
                    r35.A02 = new DialogInterface$OnCancelListenerC62502ut(this);
                    return r55.A00();
                default:
                    return super.onCreateDialog(i);
            }
        } else {
            BigDecimal bigDecimal = new BigDecimal(((ActivityC004702f) this).A0G.A06(AbstractC000400g.A3l));
            AnonymousClass0MB r47 = new AnonymousClass0MB(this);
            AnonymousClass01X r36 = ((AnonymousClass1DU) this).A0B;
            String A0D4 = r36.A0D(R.string.upi_twenty_four_hour_send_limit_error, C05880Qw.A01.A4S(r36, bigDecimal));
            AnonymousClass0MC r23 = r47.A01;
            r23.A0E = A0D4;
            r47.A07(r36.A06(R.string.ok), new DialogInterface$OnClickListenerC62492us(this));
            r23.A0J = false;
            return r47.A00();
        }
    }

    @Override // X.AnonymousClass1DU, X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C10090e1 r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C10100e2 r02 = this.A07;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
        }
        this.A0K.A00(this.A0J);
        C018809u r2 = this.A0W;
        StringBuilder A0S2 = AnonymousClass008.A0S("onDestroy states: ");
        A0S2.append(((AnonymousClass1DU) this).A03);
        r2.A07(null, A0S2.toString(), null);
        this.A0D = true;
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0W.A07(null, "action bar home", null);
        if (!AnonymousClass1VY.A0Y(((AbstractActivityC34761jB) this).A02) || ((AbstractActivityC34761jB) this).A00 != 0) {
            A0Z();
            finish();
            return true;
        }
        ((AbstractActivityC34761jB) this).A03 = null;
        A0W();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        PaymentView paymentView = this.A09;
        if (paymentView != null) {
            paymentView.A02 = paymentView.A0Q.A4g().getCurrentFocus();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A02 = (AnonymousClass1VM) bundle.getParcelable("paymentMethodSavedInst");
        ((AbstractActivityC34761jB) this).A02 = UserJid.getNullable(bundle.getString("extra_jid"));
        ((AbstractActivityC34761jB) this).A03 = UserJid.getNullable(bundle.getString("extra_receiver_jid"));
        ((AnonymousClass1DU) this).A08 = bundle.getBoolean("sending_payment");
        ((AnonymousClass1PY) this).A02 = bundle.getString("extra_incoming_pay_request_id");
        if (this.A02 != null) {
            this.A02.A06 = (AbstractC43781yw) bundle.getParcelable("countryDataSavedInst");
        }
        AnonymousClass3XM r0 = (AnonymousClass3XM) bundle.getParcelable("countryTransDataSavedInst");
        if (r0 != null) {
            this.A04 = r0;
        }
        String string = bundle.getString("sendAmountSavedInst");
        if (string != null) {
            this.A01 = C05900Qy.A00(string, this.A0Q.A5z());
        }
        ((AbstractActivityC34761jB) this).A01 = bundle.getLong("quotedMessageRowIdSavedInst");
        ((AbstractActivityC34761jB) this).A05 = bundle.getString("paymentNoteSavedInst");
        ((AbstractActivityC34761jB) this).A0A = AnonymousClass1VY.A0G(UserJid.class, bundle.getStringArrayList("paymentNoteMentionsSavedInst"));
        ((AnonymousClass1PY) this).A07 = bundle.getString("receiverVpaSavedInst");
        ((AnonymousClass1PY) this).A08 = bundle.getString("receiverVpaIdSavedInst");
        PaymentView paymentView = this.A09;
        if (paymentView != null) {
            paymentView.A0Y = bundle.getString("extra_payment_preset_amount");
        } else {
            this.A0A = bundle.getString("restoredPaymentAmount");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r1.A09() != false) goto L_0x002f;
     */
    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentActivity.onResume():void");
    }

    @Override // X.AnonymousClass1DU, X.AbstractActivityC34761jB, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC43781yw r1;
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_jid", AnonymousClass1VY.A0D(((AbstractActivityC34761jB) this).A02));
        bundle.putString("extra_receiver_jid", AnonymousClass1VY.A0D(((AbstractActivityC34761jB) this).A03));
        bundle.putBoolean("sending_payment", ((AnonymousClass1DU) this).A08);
        bundle.putString("extra_incoming_pay_request_id", ((AnonymousClass1PY) this).A02);
        bundle.putString("extra_request_message_key", ((AbstractActivityC34761jB) this).A08);
        AnonymousClass1VM r12 = this.A02;
        if (r12 != null) {
            bundle.putParcelable("paymentMethodSavedInst", r12);
        }
        AnonymousClass1VM r0 = this.A02;
        if (!(r0 == null || (r1 = r0.A06) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        AnonymousClass3XM r13 = this.A04;
        if (r13 != null) {
            bundle.putParcelable("countryTransDataSavedInst", r13);
        }
        C05900Qy r02 = this.A01;
        if (r02 != null) {
            bundle.putString("sendAmountSavedInst", r02.A00.toString());
        }
        long j = ((AbstractActivityC34761jB) this).A01;
        if (j != 0) {
            bundle.putLong("quotedMessageRowIdSavedInst", j);
        }
        String str = ((AnonymousClass1PY) this).A07;
        if (str != null) {
            bundle.putString("receiverVpaSavedInst", str);
        }
        String str2 = ((AnonymousClass1PY) this).A08;
        if (str2 != null) {
            bundle.putString("receiverVpaIdSavedInst", str2);
        }
        PaymentView paymentView = this.A09;
        if (paymentView != null) {
            String obj = paymentView.A0N.getText().toString();
            paymentView.A0Y = obj;
            paymentView.A0U = obj;
            bundle.putString("extra_payment_preset_amount", obj);
            bundle.putString("paymentNoteSavedInst", this.A09.getPaymentNote());
            bundle.putStringArrayList("paymentNoteMentionsSavedInst", AnonymousClass1VY.A0F(this.A09.getMentionedJids()));
            bundle.putString("restoredPaymentAmount", this.A09.getPaymentAmountString());
        }
    }
}
