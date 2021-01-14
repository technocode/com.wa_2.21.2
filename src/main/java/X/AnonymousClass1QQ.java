package X;

import android.content.DialogInterface;
import com.whatsapp.backup.google.PromptDialogFragment;

/* renamed from: X.1QQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PromptDialogFragment A01;

    public /* synthetic */ AnonymousClass1QQ(PromptDialogFragment promptDialogFragment, int i) {
        this.A01 = promptDialogFragment;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PromptDialogFragment promptDialogFragment = this.A01;
        promptDialogFragment.A00.AF5(this.A00);
        dialogInterface.dismiss();
    }
}
