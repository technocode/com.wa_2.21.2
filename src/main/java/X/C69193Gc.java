package X;

import android.content.Intent;
import android.view.View;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.3Gc  reason: invalid class name and case insensitive filesystem */
public class C69193Gc implements AbstractC61982u3 {
    public final /* synthetic */ C05900Qy A00;
    public final /* synthetic */ AnonymousClass1VM A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ BrazilPaymentActivity A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C69193Gc(BrazilPaymentActivity brazilPaymentActivity, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C05900Qy r3, AnonymousClass1VM r4, String str, boolean z) {
        this.A03 = brazilPaymentActivity;
        this.A02 = pinBottomSheetDialogFragment;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = str;
        this.A05 = z;
    }

    @Override // X.AbstractC61982u3
    public void AES(String str) {
        String str2;
        this.A02.A10();
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        C05900Qy r1 = this.A00;
        int intValue = r1.A00.scaleByPowerOfTen(3).intValue();
        AbstractC05890Qx r4 = C05880Qw.A00;
        if (brazilPaymentActivity != null) {
            AnonymousClass2bX r10 = new AnonymousClass2bX((long) intValue, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, r4);
            AnonymousClass00S r0 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0F;
            AnonymousClass02M r02 = ((ActivityC004702f) brazilPaymentActivity).A0F;
            AnonymousClass01I r03 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0C;
            AnonymousClass00T r04 = brazilPaymentActivity.A0Q;
            C61202sf r05 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0N;
            C01970Ad r15 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0M;
            C63842x6 r14 = brazilPaymentActivity.A0L;
            AnonymousClass04j r9 = ((ActivityC004702f) brazilPaymentActivity).A0H;
            C61942tz r8 = brazilPaymentActivity.A0H;
            C03340Fu r7 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0J;
            AnonymousClass0GP r6 = brazilPaymentActivity.A0C;
            C61902tv r5 = brazilPaymentActivity.A0G;
            C61762th r42 = brazilPaymentActivity.A0F;
            AnonymousClass1VM r13 = this.A01;
            String str3 = r13.A07;
            UserJid userJid = ((AbstractActivityC34761jB) brazilPaymentActivity).A03;
            if (userJid != null) {
                String obj = r1.toString();
                String str4 = this.A04;
                boolean z = this.A05;
                if (z) {
                    str2 = "p2m";
                } else {
                    str2 = "p2p";
                }
                AnonymousClass3E2 r06 = new AnonymousClass3E2(r0, brazilPaymentActivity, r02, r03, r04, r05, r15, r14, r9, r8, r7, r6, r5, r42, str3, userJid, obj, str4, r10, r10, str2, BrazilPaymentActivity.A04(z, r13));
                C69183Gb r52 = new C69183Gb(this);
                r06.A0K.ANF(new RunnableEBaseShape11S0100000_I1_6(r06, 16));
                C61762th r43 = r06.A0E;
                String str5 = r06.A0P;
                C68653Ea A022 = r43.A02(str5, "PIN", true);
                if (A022 != null) {
                    C61952u0 r3 = new C61952u0(A022);
                    r06.A0C.A01(r3, str, new AnonymousClass3EP(r06, r3, r52));
                    return;
                }
                r06.A0D.A00(str5, new AnonymousClass3EO(r06, str, r52));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC61982u3
    public void AGJ(View view) {
        String str;
        Intent intent = new Intent(view.getContext(), BrazilPayBloksActivity.class);
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        if (((AbstractActivityC34761jB) brazilPaymentActivity).A0I.A0B("add_card")) {
            str = "brpay_p_reset_pin_from_card";
        } else {
            str = "brpay_p_pin_change_create";
        }
        intent.putExtra("screen_name", str);
        brazilPaymentActivity.startActivity(intent);
    }
}
