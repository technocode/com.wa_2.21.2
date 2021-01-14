package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.picker.search.PickerSearchDialogFragment;

/* renamed from: X.2xJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnKeyListenerC63972xJ implements DialogInterface.OnKeyListener {
    public final /* synthetic */ PickerSearchDialogFragment A00;

    public /* synthetic */ DialogInterface$OnKeyListenerC63972xJ(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A00 = pickerSearchDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A00;
        if (i != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
            return false;
        }
        pickerSearchDialogFragment.A0x();
        return true;
    }
}
