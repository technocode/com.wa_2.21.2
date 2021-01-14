package X;

import android.content.DialogInterface;
import com.whatsapp.backup.google.PromptDialogFragment;

/* renamed from: X.1QP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QP implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PromptDialogFragment A01;

    public /* synthetic */ AnonymousClass1QP(PromptDialogFragment promptDialogFragment, int i) {
        this.A01 = promptDialogFragment;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PromptDialogFragment promptDialogFragment = this.A01;
        promptDialogFragment.A00.AF6(this.A00);
        dialogInterface.dismiss();
    }
}
