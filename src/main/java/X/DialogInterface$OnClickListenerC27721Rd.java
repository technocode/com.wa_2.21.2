package X;

import android.content.DialogInterface;
import android.widget.NumberPicker;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.biz.cart.view.fragment.QuantityPickerDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Rd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC27721Rd implements DialogInterface.OnClickListener {
    public final /* synthetic */ NumberPicker A00;
    public final /* synthetic */ QuantityPickerDialogFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ DialogInterface$OnClickListenerC27721Rd(QuantityPickerDialogFragment quantityPickerDialogFragment, NumberPicker numberPicker, String str) {
        this.A01 = quantityPickerDialogFragment;
        this.A00 = numberPicker;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        QuantityPickerDialogFragment quantityPickerDialogFragment = this.A01;
        NumberPicker numberPicker = this.A00;
        String str = this.A02;
        CartFragment cartFragment = quantityPickerDialogFragment.A00;
        int value = numberPicker.getValue();
        C41991vy r0 = cartFragment.A0G;
        if (value == 0) {
            C27701Rb r4 = r0.A0D;
            UserJid userJid = r0.A0J;
            r4.A0B.A04(30, str, userJid, null);
            r4.A0H.ANF(new RunnableEBaseShape1S1200000_I1(r4, userJid, str, 13));
            return;
        }
        C27701Rb r3 = r0.A0D;
        UserJid userJid2 = r0.A0J;
        r3.A0B.A04(29, str, userJid2, new C41791ve(value));
        r3.A0H.ANF(new RunnableEBaseShape1S1201000_I1(r3, userJid2, str, value, 0));
    }
}
