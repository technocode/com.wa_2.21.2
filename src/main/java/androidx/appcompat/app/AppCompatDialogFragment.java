package androidx.appcompat.app;

import X.AnonymousClass0ME;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public void A0t(Dialog dialog, int i) {
        if (dialog instanceof AnonymousClass0ME) {
            AnonymousClass0ME r3 = (AnonymousClass0ME) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            r3.A00().A0H(1);
            return;
        }
        super.A0t(dialog, i);
    }
}
