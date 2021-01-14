package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.account.delete.DeleteAccountFeedback;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.util.Log;

/* renamed from: X.1Oz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC27301Oz implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeleteAccountFeedback.ChangeNumberMessageDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC27301Oz(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment) {
        this.A00 = changeNumberMessageDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = this.A00;
        Log.i("delete-account-feedback/changenumber");
        changeNumberMessageDialogFragment.A0h(new Intent(changeNumberMessageDialogFragment.A0A(), ChangeNumberOverview.class));
    }
}
