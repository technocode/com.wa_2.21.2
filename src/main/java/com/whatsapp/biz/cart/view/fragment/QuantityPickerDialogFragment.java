package com.whatsapp.biz.cart.view.fragment;

import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass0LW;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.DialogInterface$OnClickListenerC27721Rd;
import X.DialogInterface$OnClickListenerC27731Re;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class QuantityPickerDialogFragment extends WaDialogFragment {
    public CartFragment A00;

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        AnonymousClass0LW A04 = ((ActivityC004902h) context).A04();
        CartFragment cartFragment = (CartFragment) A04.A0Q.A01(CartFragment.class.getName());
        StringBuilder sb = new StringBuilder();
        sb.append(QuantityPickerDialogFragment.class.getName());
        sb.append(" must be invoked from a Fragment that implements the Listener");
        AnonymousClass00E.A04(cartFragment, sb.toString());
        this.A00 = cartFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle A03 = A03();
        int i = A03.getInt("extra_initial_quantity");
        String string = A03.getString("extra_product_id", "");
        AnonymousClass0MB r4 = new AnonymousClass0MB(A0B());
        View inflate = A0B().getLayoutInflater().inflate(R.layout.fragment_dialog_quantity_picker, (ViewGroup) null);
        NumberPicker numberPicker = (NumberPicker) AnonymousClass0Q7.A0D(inflate, R.id.cart_quantity_picker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(99);
        numberPicker.setValue(i);
        String[] strArr = new String[100];
        strArr[0] = A0F(R.string.remove);
        int i2 = 1;
        do {
            strArr[i2] = String.valueOf(i2);
            i2++;
        } while (i2 <= 99);
        numberPicker.setDisplayedValues(strArr);
        r4.A02(R.string.quantity_picker_title);
        AnonymousClass0MC r1 = r4.A01;
        r1.A0C = inflate;
        r1.A01 = 0;
        r4.A04(R.string.done, new DialogInterface$OnClickListenerC27721Rd(this, numberPicker, string));
        r4.A03(R.string.cancel, DialogInterface$OnClickListenerC27731Re.A00);
        return r4.A00();
    }
}
