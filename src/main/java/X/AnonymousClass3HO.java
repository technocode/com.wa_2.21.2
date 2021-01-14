package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.3HO  reason: invalid class name */
public class AnonymousClass3HO implements AbstractC61982u3 {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ AnonymousClass3HP A01;

    public AnonymousClass3HO(AnonymousClass3HP r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = r1;
        this.A00 = pinBottomSheetDialogFragment;
    }

    @Override // X.AbstractC61982u3
    public void AES(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A10();
        AnonymousClass3HP r2 = this.A01;
        if (r2.A03.A01() == 1) {
            C61932ty r22 = r2.A04;
            AnonymousClass3HN r1 = new AnonymousClass3HN(this, pinBottomSheetDialogFragment);
            r22.A02("FB", new C68803Ep(r22, str, r1), r1);
            return;
        }
        C61932ty r23 = r2.A04;
        AnonymousClass3HM r12 = new AnonymousClass3HM(this, pinBottomSheetDialogFragment);
        r23.A02("FB", new C68793Eo(r23, str, r12), r12);
    }

    @Override // X.AbstractC61982u3
    public void AGJ(View view) {
        String str;
        AnonymousClass3HP r1 = this.A01;
        ActivityC004602e r3 = r1.A01;
        AnonymousClass3YK r12 = (AnonymousClass3YK) r1;
        if (r12 != null) {
            Intent intent = new Intent(r3, BrazilPayBloksActivity.class);
            if (r12.A00.A0B("add_card")) {
                str = "brpay_p_reset_pin_from_card";
            } else {
                str = "brpay_p_pin_change_create";
            }
            intent.putExtra("screen_name", str);
            r3.A0I(intent, false);
            return;
        }
        throw null;
    }
}
