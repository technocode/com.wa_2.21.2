package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1jB  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractActivityC34761jB extends ActivityC004602e {
    public int A00;
    public long A01;
    public AnonymousClass02N A02;
    public UserJid A03;
    public C10140e7 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public final AnonymousClass01I A0C = AnonymousClass01I.A00();
    public final C42931xW A0D = C42931xW.A00();
    public final AnonymousClass0HN A0E = AnonymousClass0HN.A00();
    public final AnonymousClass00S A0F = AnonymousClass00S.A00();
    public final AnonymousClass0AQ A0G = AnonymousClass0AQ.A00();
    public final AnonymousClass01K A0H = AnonymousClass01K.A00();
    public final C01980Ae A0I = C01980Ae.A00();
    public final C03340Fu A0J = C03340Fu.A00();
    public final C02020Ai A0K = C02020Ai.A00();
    public final C02040Ak A0L = C02040Ak.A00();
    public final C01970Ad A0M = C01970Ad.A00();
    public final C61202sf A0N = C61202sf.A00();
    public final C09100cI A0O = C09100cI.A01;
    public final AnonymousClass0AL A0P = AnonymousClass0AL.A01();
    public final AnonymousClass00T A0Q = C002101e.A00();

    public C05490Ot A0T(AnonymousClass0AL r13, AnonymousClass01K r14, String str, List list) {
        AbstractC007503q r11;
        UserJid userJid;
        AnonymousClass02N r5 = this.A02;
        if (r5 != null) {
            long j = this.A01;
            if (j != 0) {
                r11 = r14.A0J.A01(j);
            } else {
                r11 = null;
            }
            C05490Ot A042 = r13.A04(r5, str, 0, null, list, r11);
            if (AnonymousClass1VY.A0Y(this.A02) && (userJid = this.A03) != null) {
                A042.A0Y(userJid);
            }
            return A042;
        }
        throw null;
    }

    public void A0U() {
        AnonymousClass02N r1 = this.A02;
        if (r1 != null) {
            Intent A042 = Conversation.A04(this, this.A0G.A02(r1));
            A042.putExtra("show_keyboard", false);
            A042.putExtra("start_t", SystemClock.uptimeMillis());
            C09100cI.A02.ABx(703934026);
            A0I(A042, false);
        }
        finish();
    }

    public void A0V() {
        if (!(this instanceof AnonymousClass1PY)) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            AnonymousClass0AQ r1 = brazilPaymentActivity.A07;
            UserJid userJid = ((AbstractActivityC34761jB) brazilPaymentActivity).A03;
            if (userJid != null) {
                C007003k A022 = r1.A02(userJid);
                C01970Ad r7 = ((AbstractActivityC34761jB) brazilPaymentActivity).A0M;
                r7.A04();
                C018709t r2 = r7.A06;
                AnonymousClass0RK A052 = r2.A05(((AbstractActivityC34761jB) brazilPaymentActivity).A03);
                if (A052 == null || A052.A02 == null) {
                    brazilPaymentActivity.A0Q.ANF(new RunnableEBaseShape11S0100000_I1_6(brazilPaymentActivity, 20));
                }
                PaymentView paymentView = brazilPaymentActivity.A04;
                String A082 = brazilPaymentActivity.A05.A08(A022, false);
                paymentView.A0T = A082;
                paymentView.A09.setText(A082);
                paymentView.A0J.A02(A022, paymentView.A0I);
                if (((ActivityC004702f) brazilPaymentActivity).A0G.A06(AbstractC000400g.A3j) == 1 && brazilPaymentActivity.A0E.A05()) {
                    UserJid userJid2 = ((AbstractActivityC34761jB) brazilPaymentActivity).A03;
                    if (((AbstractActivityC34761jB) brazilPaymentActivity).A0L.A03()) {
                        r7.A04();
                        AnonymousClass0RK A053 = r2.A05(userJid2);
                        if (A053 != null && A053.A01 < ((AbstractActivityC34761jB) brazilPaymentActivity).A0F.A05()) {
                            C10140e7 r0 = ((AbstractActivityC34761jB) brazilPaymentActivity).A04;
                            if (r0 != null) {
                                ((AnonymousClass0JW) r0).A00.cancel(true);
                            }
                            C10140e7 r22 = new C10140e7(r7, ((AbstractActivityC34761jB) brazilPaymentActivity).A0E, userJid2);
                            ((AbstractActivityC34761jB) brazilPaymentActivity).A04 = r22;
                            brazilPaymentActivity.A0Q.ANC(r22, new Void[0]);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public void A0W() {
        Intent intent = new Intent(this, PaymentGroupParticipantPickerActivity.class);
        AnonymousClass02N r0 = this.A02;
        if (r0 != null) {
            intent.putExtra("extra_jid", r0.getRawString());
            startActivityForResult(intent, 1001);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A03 = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
            A0V();
        } else if (i2 == 0 && this.A03 == null) {
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AnonymousClass1X1 r1;
        AbstractC07650Yy A8I;
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.A00 = getIntent().getIntExtra("extra_conversation_message_type", 0);
            this.A02 = AnonymousClass02N.A01(getIntent().getStringExtra("extra_jid"));
            this.A03 = UserJid.getNullable(getIntent().getStringExtra("extra_receiver_jid"));
            this.A01 = getIntent().getLongExtra("extra_quoted_msg_row_id", 0);
            this.A06 = getIntent().getStringExtra("extra_payment_preset_amount");
            this.A09 = getIntent().getStringExtra("extra_transaction_id");
            this.A07 = getIntent().getStringExtra("extra_payment_preset_min_amount");
            this.A08 = getIntent().getStringExtra("extra_request_message_key");
            this.A0B = getIntent().getBooleanExtra("extra_is_pay_money_only", true);
            this.A05 = getIntent().getStringExtra("extra_payment_note");
            this.A0A = AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("extra_mentioned_jids"));
        }
        C02020Ai r3 = this.A0K;
        String str = null;
        if (r3.A02() != null) {
            r1 = this.A0M.A02(r3.A02().A02);
        } else {
            r1 = null;
        }
        AbstractC05890Qx A012 = r3.A01();
        if (A012 != null) {
            str = A012.A5e();
        }
        if (r1 != null && (A8I = r1.A8I(str)) != null && A8I.APZ()) {
            C42931xW r32 = this.A0D;
            Log.d("Bloks: BloksPayloadUtil: shouldConnectIgServer = false");
            if (!r32.A02() || !r32.A06()) {
                r32.A05("payment_view", true, null);
            }
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C10140e7 r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A04 = null;
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass0LW A042 = A04();
        List<AnonymousClass037> A043 = A042.A0Q.A04();
        if (A043.size() > 0) {
            AnonymousClass0QB r2 = new AnonymousClass0QB(A042);
            for (AnonymousClass037 r0 : A043) {
                if (r0 != null) {
                    r2.A03(r0);
                }
            }
            r2.A01();
        }
        super.onSaveInstanceState(bundle);
    }
}
