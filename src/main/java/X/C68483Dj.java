package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Dj  reason: invalid class name and case insensitive filesystem */
public class C68483Dj implements AbstractC61102sV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0MH A01;
    public final /* synthetic */ AbstractC61092sU A02;
    public final /* synthetic */ C61112sW A03;
    public final /* synthetic */ AbstractC007503q A04;
    public final /* synthetic */ boolean A05;

    public C68483Dj(C61112sW r1, Context context, AnonymousClass0MH r3, AbstractC007503q r4, AbstractC61092sU r5, boolean z) {
        this.A03 = r1;
        this.A00 = context;
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A05 = z;
    }

    @Override // X.AbstractC61102sV
    public void AFq() {
        this.A03.A01(this.A00, this.A01);
    }

    @Override // X.AbstractC61102sV
    public void AKf() {
        Intent intent;
        AbstractC05890Qx A012;
        AbstractC07650Yy A8I;
        C61112sW r3 = this.A03;
        Context context = this.A00;
        AnonymousClass0MH r11 = this.A01;
        AbstractC007503q r5 = this.A04;
        AbstractC61092sU r2 = this.A02;
        boolean z = this.A05;
        UserJid userJid = null;
        if (r3 == null) {
            throw null;
        } else if (z) {
            if (r5 != null) {
                userJid = UserJid.of(r5.A07());
            }
            if (r11.A08 != null) {
                AnonymousClass02M r4 = r3.A00;
                if (r4.A0H()) {
                    r4.A05(0, R.string.register_wait_message);
                    r3.A0D.ANC(new C10150eA(r3.A01, r3.A06, r3.A0C, r3.A0B, r3.A04, r3.A0A, r11, userJid, 15, new RunnableEBaseShape8S0200000_I1_3(r3, r2, 37)), new Void[0]);
                    return;
                }
                return;
            }
            AnonymousClass1X1 A022 = r3.A0B.A02(r11.A0C);
            if (A022 != null && (A8I = A022.A8I(r11.A0E)) != null) {
                r3.A00.A05(0, R.string.register_wait_message);
                AbstractC61042sP A83 = A8I.A83();
                if (A83 != null) {
                    A83.AMS(r11, new AnonymousClass3DF(r3, r11, r2), C02780Dk.A00(context));
                    return;
                }
                throw null;
            }
        } else {
            C68453Dg r22 = r3.A08;
            boolean z2 = !r3.A07.A08();
            if (r22 != null) {
                if (!z2 || r22.A03.A07()) {
                    intent = new Intent(context, r22.A05.A03().A8z());
                } else {
                    intent = new Intent(context, r22.A05.A03().A4f());
                    intent.putExtra("extra_setup_mode", 1);
                }
                if (r11.A08 != null) {
                    intent.putExtra("extra_request_message_key", r11.A0H);
                    intent.putExtra("extra_conversation_message_type", 3);
                    String str = r11.A0G;
                    if (str != null) {
                        intent.putExtra("extra_request_id", str);
                    }
                    AnonymousClass02N r6 = r11.A08;
                    if (AnonymousClass1VY.A0Y(r6)) {
                        intent.putExtra("extra_jid", r6.getRawString());
                        intent.putExtra("extra_receiver_jid", AnonymousClass1VY.A0D(r11.A09));
                    } else {
                        intent.putExtra("extra_jid", AnonymousClass1VY.A0D(r11.A09));
                    }
                }
                if (!TextUtils.isEmpty(r11.A0G)) {
                    intent.putExtra("extra_transaction_id", r11.A0G);
                }
                AbstractC43791yx r0 = r11.A07;
                if (r0 != null) {
                    intent.putExtra("extra_payment_handle", r0.A06());
                    intent.putExtra("extra_incoming_pay_request_id", r11.A07.A05());
                }
                C05900Qy r02 = r11.A06;
                if (!(r02 == null || TextUtils.isEmpty(r02.toString()) || (A012 = r22.A04.A01()) == null)) {
                    intent.putExtra("extra_payment_preset_amount", A012.A4P(r22.A02, r11.A06));
                }
                ((ActivityC004702f) context).A0I(intent, false);
                return;
            }
            throw null;
        }
    }
}
