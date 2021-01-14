package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.2GJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2GJ implements DialogInterface.OnKeyListener {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public /* synthetic */ AnonymousClass2GJ(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A00;
        if (i != 4 || !sharedTextPreviewDialogFragment.A05.isShowing()) {
            return false;
        }
        sharedTextPreviewDialogFragment.A05.dismiss();
        return true;
    }
}
