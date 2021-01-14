package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.3HU  reason: invalid class name */
public class AnonymousClass3HU implements AbstractC61982u3 {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ AbstractC63192w0 A01;

    public AnonymousClass3HU(AbstractC63192w0 r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = r1;
        this.A00 = pinBottomSheetDialogFragment;
    }

    @Override // X.AbstractC61982u3
    public void AES(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A10();
        AbstractC63192w0 r3 = this.A01;
        ActivityC004602e r6 = r3.A04;
        AnonymousClass02M r7 = r3.A02;
        AnonymousClass04j r8 = r3.A05;
        C03340Fu r9 = r3.A0C;
        AnonymousClass0GP r10 = r3.A0A;
        C61762th r11 = r3.A0E;
        C61572tO r5 = new C61572tO(r6, r7, r8, r9, r10, r11, "PIN");
        C68653Ea A02 = r11.A02("FB", "PIN", true);
        if (A02 != null) {
            C61952u0 r52 = new C61952u0(A02);
            r3.A0D.A01(r52, str, new AnonymousClass3HX(r3, r52, new C61962u1(r3.A06, r9), pinBottomSheetDialogFragment));
            return;
        }
        r5.A00("FB", new AnonymousClass3HT(this, str));
    }

    @Override // X.AbstractC61982u3
    public void AGJ(View view) {
        String str;
        AbstractC63192w0 r1 = this.A01;
        ActivityC004602e r3 = r1.A04;
        if (r1 instanceof AnonymousClass3HQ) {
            Intent intent = new Intent(r3, BrazilPayBloksActivity.class);
            if (r1.A08.A0B("add_card")) {
                str = "brpay_p_reset_pin_from_card";
            } else {
                str = "brpay_p_pin_change_create";
            }
            intent.putExtra("screen_name", str);
            r3.startActivity(intent);
        }
    }
}
