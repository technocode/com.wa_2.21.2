package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.UnblockDialogFragment;

/* renamed from: X.1Jo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC26111Jo implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UnblockDialogFragment A01;

    public /* synthetic */ DialogInterface$OnClickListenerC26111Jo(UnblockDialogFragment unblockDialogFragment, Activity activity) {
        this.A01 = unblockDialogFragment;
        this.A00 = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UnblockDialogFragment unblockDialogFragment = this.A01;
        Activity activity = this.A00;
        if (unblockDialogFragment.A01) {
            activity.finish();
        }
    }
}
