package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC005102k;
import X.AbstractC05890Qx;
import X.AbstractC43781yw;
import X.AbstractC460627w;
import X.AbstractC60972sI;
import X.AbstractC63522wY;
import X.AbstractC63672wp;
import X.AbstractC63682wq;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00G;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass082;
import X.AnonymousClass0AQ;
import X.AnonymousClass0GP;
import X.AnonymousClass0M5;
import X.AnonymousClass0RK;
import X.AnonymousClass0S2;
import X.AnonymousClass0SK;
import X.AnonymousClass1VK;
import X.AnonymousClass1VM;
import X.AnonymousClass1VY;
import X.AnonymousClass1X5;
import X.AnonymousClass2C0;
import X.AnonymousClass2DC;
import X.AnonymousClass3DQ;
import X.AnonymousClass3F3;
import X.AnonymousClass3FT;
import X.AnonymousClass3FV;
import X.AnonymousClass3FW;
import X.AnonymousClass3FX;
import X.AnonymousClass3GP;
import X.AnonymousClass3GX;
import X.AnonymousClass3GY;
import X.AnonymousClass3GZ;
import X.AnonymousClass3IL;
import X.AnonymousClass3IN;
import X.AnonymousClass3IS;
import X.AnonymousClass3Y3;
import X.C014308b;
import X.C01970Ad;
import X.C02010Ah;
import X.C02040Ak;
import X.C05490Ot;
import X.C05900Qy;
import X.C28051Sr;
import X.C41191ud;
import X.C60842s5;
import X.C60862s7;
import X.C61072sS;
import X.C61762th;
import X.C61902tv;
import X.C61942tz;
import X.C62942vb;
import X.C62952vc;
import X.C63692wr;
import X.C63702ws;
import X.C63712wt;
import X.C63722wu;
import X.C63742ww;
import X.C63842x6;
import X.C68433De;
import X.C69193Gc;
import X.DialogInterface$OnClickListenerC62162uL;
import X.DialogInterface$OnDismissListenerC62152uK;
import X.RunnableC62172uM;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.HashMap;
import java.util.List;

public class BrazilPaymentActivity extends AbstractActivityC34761jB implements AbstractC63682wq, AbstractC63672wp, AbstractC63522wY {
    public Context A00;
    public C41191ud A01;
    public AnonymousClass3DQ A02;
    public ConfirmPaymentFragment A03;
    public PaymentView A04;
    public final C014308b A05 = C014308b.A00();
    public final AnonymousClass00G A06 = AnonymousClass00G.A01;
    public final AnonymousClass0AQ A07 = AnonymousClass0AQ.A00();
    public final C60842s5 A08 = C60842s5.A00();
    public final C60862s7 A09 = C60862s7.A00();
    public final AbstractC60972sI A0A = new AnonymousClass3GX(this);
    public final C68433De A0B = C68433De.A00;
    public final AnonymousClass0GP A0C = AnonymousClass0GP.A00();
    public final C02010Ah A0D = C02010Ah.A00();
    public final C02040Ak A0E = C02040Ak.A00();
    public final C61762th A0F = C61762th.A00();
    public final C61902tv A0G = C61902tv.A00();
    public final C61942tz A0H = C61942tz.A00();
    public final C62942vb A0I = C62942vb.A00();
    public final C62952vc A0J = C62952vc.A00();
    public final C62952vc A0K = C62952vc.A00();
    public final C63842x6 A0L = C63842x6.A00();

    @Override // X.AbstractC63682wq
    public Activity A4g() {
        return this;
    }

    @Override // X.AbstractC63682wq
    public String A8A() {
        return null;
    }

    @Override // X.AbstractC63682wq
    public boolean ABY() {
        return false;
    }

    @Override // X.AbstractC63672wp
    public void AIM() {
    }

    @Override // X.AbstractC63672wp
    public void AJy() {
    }

    public static final String A04(boolean z, AnonymousClass1VM r2) {
        AbstractC43781yw r0;
        if (!z || r2 == null || r2.A04() != 6 || (r0 = r2.A06) == null) {
            return null;
        }
        return ((AbstractC460627w) r0).A03 == 1 ? "debit" : "credit";
    }

    public static void A05(BrazilPaymentActivity brazilPaymentActivity, BottomSheetDialogFragment bottomSheetDialogFragment) {
        if (brazilPaymentActivity != null) {
            AlertDialog create = new AlertDialog.Builder(brazilPaymentActivity).setMessage(brazilPaymentActivity.A00.getString(R.string.notification_payment_step_up_required_message)).setPositiveButton(brazilPaymentActivity.A00.getString(R.string.btn_continue), new DialogInterface$OnClickListenerC62162uL(brazilPaymentActivity, bottomSheetDialogFragment)).create();
            create.setOnDismissListener(new DialogInterface$OnDismissListenerC62152uK(bottomSheetDialogFragment));
            create.show();
            return;
        }
        throw null;
    }

    public static void A06(BrazilPaymentActivity brazilPaymentActivity, AnonymousClass1VM r5, C05900Qy r6, String str, boolean z) {
        if (brazilPaymentActivity != null) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
            pinBottomSheetDialogFragment.A07 = new AnonymousClass3F3();
            pinBottomSheetDialogFragment.A08 = new C69193Gc(brazilPaymentActivity, pinBottomSheetDialogFragment, r6, r5, str, z);
            brazilPaymentActivity.APm(pinBottomSheetDialogFragment);
            return;
        }
        throw null;
    }

    public static void A07(BrazilPaymentActivity brazilPaymentActivity, C61072sS r2) {
        AnonymousClass1X5 A002;
        if (brazilPaymentActivity != null) {
            AnonymousClass0M5 r0 = r2.stepUpNode;
            if (r0 != null && (A002 = AnonymousClass1X5.A00(r0)) != null) {
                AnonymousClass008.A0q(brazilPaymentActivity.A0D, "payment_step_up_info", A002.A01().toString());
                return;
            }
            return;
        }
        throw null;
    }

    public static void A08(BrazilPaymentActivity brazilPaymentActivity, String str, C05900Qy r11, AnonymousClass1VM r12, String str2, boolean z) {
        C05490Ot A0T = brazilPaymentActivity.A0T(brazilPaymentActivity.A0P, ((AbstractActivityC34761jB) brazilPaymentActivity).A0H, brazilPaymentActivity.A04.getPaymentNote(), brazilPaymentActivity.A04.getMentionedJids());
        AnonymousClass3Y3 r9 = new AnonymousClass3Y3();
        r9.A01 = str;
        r9.A03 = A0T.A0n.A01;
        r9.A02 = brazilPaymentActivity.A0L.A02();
        brazilPaymentActivity.A0Q.ANF(new RunnableC62172uM(brazilPaymentActivity, A0T, r11, AnonymousClass1VK.A01("BRL"), r12, r9, str2, z));
        brazilPaymentActivity.A0U();
    }

    public static boolean A09(BrazilPaymentActivity brazilPaymentActivity, AnonymousClass1VM r4, int i) {
        if (brazilPaymentActivity != null) {
            AbstractC460627w r1 = (AbstractC460627w) r4.A06;
            if (r1 == null || !C28051Sr.A1s(r4) || i != 1) {
                return false;
            }
            String str = r1.A0N;
            if (str == null || !(!"DISABLED".equals(str))) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final AddPaymentMethodBottomSheet A0X(String str) {
        String string;
        if (this.A0E.A05()) {
            string = this.A00.getString(R.string.send_payment_add_method_bottom_sheet_desc);
        } else {
            string = this.A00.getString(R.string.accept_payment_add_debit_bottom_sheet_desc);
        }
        return A0Y(str, false, null, string, null, false);
    }

    public final AddPaymentMethodBottomSheet A0Y(String str, boolean z, String str2, String str3, String str4, boolean z2) {
        Intent intent = new Intent(this, BrazilPayBloksActivity.class);
        intent.putExtra("screen_name", str);
        AnonymousClass2DC.A05(intent, "get_started");
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("verification_needed", "0");
            if (z2) {
                hashMap.put("add_debit_only", "1");
            }
            intent.putExtra("screen_params", hashMap);
        }
        AnonymousClass3GP r2 = new AnonymousClass3GP(intent, str2, str3, str4);
        AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
        addPaymentMethodBottomSheet.A0N(new Bundle());
        addPaymentMethodBottomSheet.A00 = r2;
        return addPaymentMethodBottomSheet;
    }

    public final void A0Z(AnonymousClass1VM r8, C05900Qy r9) {
        AnonymousClass0RK r2;
        int i;
        AbstractC05890Qx A012 = AnonymousClass1VK.A01("BRL");
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        if (((AbstractActivityC34761jB) this).A03 != null) {
            C01970Ad r0 = ((AbstractActivityC34761jB) this).A0M;
            r0.A04();
            r2 = r0.A06.A05(((AbstractActivityC34761jB) this).A03);
        } else {
            r2 = null;
        }
        UserJid userJid = ((AbstractActivityC34761jB) this).A03;
        if (userJid != null) {
            String A5e = A012.A5e();
            if (r2 == null || r2.A02 == null || !r2.A04) {
                i = 1;
            } else {
                i = r2.A00;
            }
            ConfirmPaymentFragment confirmPaymentFragment = new ConfirmPaymentFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_payment_method", r8);
            bundle.putString("arg_jid", userJid.getRawString());
            bundle.putString("arg_currency", A5e);
            bundle.putString("arg_amount", r9.toString());
            bundle.putInt("arg_payment_type", i);
            confirmPaymentFragment.A0N(bundle);
            paymentBottomSheet.A01 = confirmPaymentFragment;
            confirmPaymentFragment.A0F = new AnonymousClass3GY(this, paymentBottomSheet, r9, confirmPaymentFragment);
            confirmPaymentFragment.A0G = new AnonymousClass3GZ(this, confirmPaymentFragment);
            this.A03 = confirmPaymentFragment;
            APm(paymentBottomSheet);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC63682wq
    public boolean ABP() {
        return TextUtils.isEmpty(((AbstractActivityC34761jB) this).A08);
    }

    @Override // X.AbstractC63672wp
    public void AIL() {
        AnonymousClass02N r0 = ((AbstractActivityC34761jB) this).A02;
        if (r0 == null) {
            throw null;
        } else if (AnonymousClass1VY.A0Y(r0) && ((AbstractActivityC34761jB) this).A00 == 0) {
            A0W();
        }
    }

    @Override // X.AbstractC63672wp
    public void AJQ(String str, C05900Qy r12) {
        String A022 = this.A0J.A02(true);
        if (A022 == null) {
            C41191ud r0 = this.A01;
            r0.A01.A03(new AnonymousClass3FW(this, r12), null);
            return;
        }
        this.A0E.A01();
        AddPaymentMethodBottomSheet A0Y = A0Y(A022, true, this.A00.getString(R.string.add_debit_card_title), this.A00.getString(R.string.add_debit_card_education), this.A00.getString(R.string.add_debit_card_button), true);
        A0Y.A01 = new RunnableEBaseShape8S0200000_I1_3(this, r12, 40);
        APm(A0Y);
    }

    @Override // X.AbstractC63672wp
    public void AJx(String str, C05900Qy r6) {
        String A022 = this.A0J.A02(true);
        if (A022 == null) {
            this.A01.A02();
            C41191ud A002 = ((AbstractActivityC34761jB) this).A0M.A01().A00();
            this.A01 = A002;
            A002.A01.A03(new AnonymousClass3FV(this, r6), ((ActivityC004702f) this).A0F.A06);
            return;
        }
        AddPaymentMethodBottomSheet A0X = A0X(A022);
        A0X.A01 = new RunnableEBaseShape2S0300000_I1(this, A0X, r6, 31);
        APm(A0X);
    }

    @Override // X.AbstractC63522wY
    public Object AMC() {
        AbstractC05890Qx A012 = AnonymousClass1VK.A01("BRL");
        AnonymousClass02N r9 = ((AbstractActivityC34761jB) this).A02;
        String str = ((AbstractActivityC34761jB) this).A05;
        String str2 = ((AbstractActivityC34761jB) this).A09;
        int i = 2;
        if (((AbstractActivityC34761jB) this).A0B) {
            i = 0;
        }
        C63722wu r14 = new C63722wu(i);
        List list = ((AbstractActivityC34761jB) this).A0A;
        AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
        return new C63742ww(r9, false, str, str2, this, r14, new C63712wt(list, NumberEntryKeyboard.A00(r7)), this, new C63692wr(((AbstractActivityC34761jB) this).A08, ((AbstractActivityC34761jB) this).A06, true, ((AbstractActivityC34761jB) this).A07, true, true, new C63702ws(A012), new AnonymousClass3IS(A012, r7, A012.A7G(), A012.A7X())), new AnonymousClass3IN(this, new AnonymousClass3IL()), AnonymousClass3FT.A00);
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.A01.A02();
        C41191ud A002 = ((AbstractActivityC34761jB) this).A0M.A01().A00();
        this.A01 = A002;
        if (i2 == -1) {
            A002.A01.A03(new AnonymousClass3FX(this, intent), ((ActivityC004702f) this).A0F.A06);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (!this.A04.A04()) {
            AnonymousClass02N r0 = ((AbstractActivityC34761jB) this).A02;
            if (r0 == null) {
                throw null;
            } else if (!AnonymousClass1VY.A0Y(r0) || ((AbstractActivityC34761jB) this).A00 != 0) {
                finish();
            } else {
                ((AbstractActivityC34761jB) this).A03 = null;
                A0W();
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = new AnonymousClass3DQ(((AnonymousClass2C0) this).A01, this.A0E);
        this.A00 = this.A06.A00;
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            Context context = this.A00;
            boolean z = ((AbstractActivityC34761jB) this).A0B;
            int i = R.string.new_payment;
            if (z) {
                i = R.string.payments_send_money;
            }
            A092.A08(context.getString(i));
            A092.A0A(true);
            if (!((AbstractActivityC34761jB) this).A0B) {
                A092.A02(0.0f);
            }
        }
        setContentView(R.layout.send_payment_screen);
        PaymentView paymentView = (PaymentView) findViewById(R.id.payment_view);
        this.A04 = paymentView;
        if (paymentView != null) {
            paymentView.A0M = this;
            A75().A00(new AnonymousClass0SK() {
                /* class com.whatsapp.payments.ui.widget.$$Lambda$cfXOxw_xiRBPGdEVyDTISt7ZSk */

                @Override // X.AnonymousClass0SK
                public final void AKQ(AbstractC005102k r2, AnonymousClass082 r3) {
                    PaymentView.this.A02(r3);
                }
            });
            this.A01 = ((AbstractActivityC34761jB) this).A0M.A01().A00();
            this.A0B.A01(this.A0A);
            if (((AbstractActivityC34761jB) this).A03 == null) {
                AnonymousClass02N r1 = ((AbstractActivityC34761jB) this).A02;
                if (r1 == null) {
                    throw null;
                } else if (AnonymousClass1VY.A0Y(r1)) {
                    A0W();
                    return;
                } else {
                    ((AbstractActivityC34761jB) this).A03 = UserJid.of(r1);
                }
            }
            A0V();
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0B.A00(this.A0A);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AnonymousClass02N r0 = ((AbstractActivityC34761jB) this).A02;
        if (r0 == null) {
            throw null;
        } else if (!AnonymousClass1VY.A0Y(r0) || ((AbstractActivityC34761jB) this).A00 != 0) {
            finish();
            return true;
        } else {
            ((AbstractActivityC34761jB) this).A03 = null;
            A0W();
            return true;
        }
    }
}
