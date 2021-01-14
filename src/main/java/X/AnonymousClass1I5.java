package X;

import android.content.DialogInterface;
import com.whatsapp.DocumentPickerActivity;

/* renamed from: X.1I5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DocumentPickerActivity.SendDocumentsConfirmationDialogFragment A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass1I5(DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment, boolean z) {
        this.A00 = sendDocumentsConfirmationDialogFragment;
        this.A01 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004902h A0A;
        DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = this.A00;
        if (this.A01 && (A0A = sendDocumentsConfirmationDialogFragment.A0A()) != null) {
            A0A.finish();
        }
    }
}
