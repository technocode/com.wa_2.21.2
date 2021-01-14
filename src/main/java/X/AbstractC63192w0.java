package X;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.2w0  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC63192w0 {
    public int A00;
    public AnonymousClass1X5 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass01I A03;
    public final ActivityC004602e A04;
    public final AnonymousClass04j A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass01X A07;
    public final C01980Ae A08;
    public final C04570Kw A09;
    public final AnonymousClass0GP A0A;
    public final C02010Ah A0B;
    public final C03340Fu A0C;
    public final C61202sf A0D;
    public final C61762th A0E;
    public final C61902tv A0F;
    public final C61942tz A0G;
    public final AbstractC63182vz A0H;

    public AbstractC63192w0(AnonymousClass00S r1, AnonymousClass02M r2, AnonymousClass01I r3, C61202sf r4, AnonymousClass01X r5, C02010Ah r6, AnonymousClass04j r7, C01980Ae r8, C61942tz r9, C03340Fu r10, AnonymousClass0GP r11, C61902tv r12, C61762th r13, C04570Kw r14, ActivityC004602e r15) {
        this.A06 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A0D = r4;
        this.A07 = r5;
        this.A0B = r6;
        this.A05 = r7;
        this.A08 = r8;
        this.A0G = r9;
        this.A0C = r10;
        this.A0A = r11;
        this.A0F = r12;
        this.A0E = r13;
        this.A09 = r14;
        this.A04 = r15;
        this.A0H = (AbstractC63182vz) r15;
    }

    public static void A00(AbstractC63192w0 r5) {
        AnonymousClass01X r4 = r5.A07;
        ActivityC004602e r3 = r5.A04;
        String A062 = r4.A06(R.string.payments_generic_error);
        AnonymousClass0MB r2 = new AnonymousClass0MB(r3);
        r2.A01.A0E = A062;
        r2.A07(r4.A06(R.string.ok), null);
        AnonymousClass0MD A002 = r2.A00();
        A002.setOnDismissListener(null);
        A002.show();
    }

    public void A01() {
        this.A0H.ANs(false);
        this.A0B.A01().edit().remove("payment_step_up_info").apply();
        C04570Kw r3 = this.A09;
        r3.A07.ANF(new RunnableEBaseShape3S0100000_I0_3(r3, 36));
    }

    public void A02() {
        AnonymousClass3F5 r2;
        AnonymousClass1X5 r0 = this.A01;
        if (r0 != null && (r2 = r0.A00) != null && r2.A00.equals("WEBVIEW")) {
            if (r2.A02) {
                if (Build.VERSION.SDK_INT >= 23) {
                    C61902tv r4 = this.A0F;
                    if (r4.A05() && r4.A01() == 1) {
                        FingerprintBottomSheet A002 = FingerprintBottomSheet.A00(R.string.payment_bio_bottom_sheet_title, R.string.cancel, R.string.use_payments_pin, R.layout.pay_header);
                        AnonymousClass00S r22 = this.A06;
                        C61892tu r7 = new C61892tu(r22, this.A03, this.A0C, r4);
                        AnonymousClass01X r3 = this.A07;
                        C61942tz r42 = this.A0G;
                        ActivityC004602e r5 = this.A04;
                        A002.A04 = new AnonymousClass3YE(r22, r3, r42, r5, A002, r7, new AnonymousClass3HW(this, A002));
                        r5.APm(A002);
                        return;
                    }
                }
                A03();
                return;
            }
            A04(null, null);
        }
    }

    public final void A03() {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
        pinBottomSheetDialogFragment.A07 = new AnonymousClass3F3();
        pinBottomSheetDialogFragment.A08 = new AnonymousClass3HU(this, pinBottomSheetDialogFragment);
        this.A04.APm(pinBottomSheetDialogFragment);
    }

    public final void A04(AnonymousClass0M5 r21, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        C61582tP r8 = new C61582tP(this.A04, this.A02, this.A05, this.A0C, this.A0A);
        AnonymousClass1X5 r7 = this.A01;
        AnonymousClass3HY r13 = new AnonymousClass3HY(this, pinBottomSheetDialogFragment);
        AnonymousClass0M5 r3 = new AnonymousClass0M5("step_up", new AnonymousClass0OS[]{new AnonymousClass0OS("step_up_id", r7.A02, null, (byte) 0)}, null, null);
        AnonymousClass0M5 r2 = new AnonymousClass0M5("step_up_challenge", new AnonymousClass0OS[]{new AnonymousClass0OS("challenge_id", r7.A00.A01, null, (byte) 0)}, null, null);
        r8.A04.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "get-step-up-webview-url", null, (byte) 0)}, r21 != null ? new AnonymousClass0M5[]{r3, r2, r21} : new AnonymousClass0M5[]{r3, r2}, null), new C73583Xx(r8, r8.A00, r8.A01, r8.A02, r8.A03, r13), 0);
    }

    public void A05(String str) {
        AnonymousClass1X5 A022 = this.A0B.A02();
        this.A01 = A022;
        if (A022 == null || !A022.A03 || !A022.A01.equals(str)) {
            this.A0H.ANs(false);
        } else {
            this.A0H.ANs(true);
        }
    }

    public void A06(String str, String str2, int i) {
        this.A00 = i;
        A05(str2);
        if (!TextUtils.isEmpty(str) && str.equals("STEP_UP")) {
            this.A0B.A01().edit().putBoolean("payment_step_up_update_ack", true).apply();
            C04570Kw r3 = this.A09;
            r3.A07.ANF(new RunnableEBaseShape3S0100000_I0_3(r3, 36));
        }
    }
}
