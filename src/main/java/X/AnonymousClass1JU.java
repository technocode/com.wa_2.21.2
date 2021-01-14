package X;

import android.content.DialogInterface;
import com.whatsapp.SingleSelectionDialogFragment;

/* renamed from: X.1JU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JU implements DialogInterface.OnClickListener {
    public final /* synthetic */ SingleSelectionDialogFragment A00;

    public /* synthetic */ AnonymousClass1JU(SingleSelectionDialogFragment singleSelectionDialogFragment) {
        this.A00 = singleSelectionDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = this.A00;
        singleSelectionDialogFragment.A02 = i;
        if (!singleSelectionDialogFragment.A04) {
            ActivityC004902h A0A = singleSelectionDialogFragment.A0A();
            if (A0A instanceof AnonymousClass0SB) {
                ((AnonymousClass0SB) A0A).AKB(singleSelectionDialogFragment.A01, i);
            }
            singleSelectionDialogFragment.A0w(false, false);
        }
    }
}
