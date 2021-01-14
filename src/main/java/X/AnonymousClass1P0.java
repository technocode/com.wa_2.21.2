package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.1P0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1P0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DeleteAccountFeedback.ChangeNumberMessageDialogFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass1P0(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment, int i, String str) {
        this.A01 = changeNumberMessageDialogFragment;
        this.A00 = i;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = this.A01;
        int i2 = this.A00;
        String str = this.A02;
        Intent intent = new Intent(changeNumberMessageDialogFragment.A0A(), DeleteAccountConfirmation.class);
        intent.putExtra("deleteReason", i2);
        intent.putExtra("additionalComments", str);
        changeNumberMessageDialogFragment.A0h(intent);
    }
}
