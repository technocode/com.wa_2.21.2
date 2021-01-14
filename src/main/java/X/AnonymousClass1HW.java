package X;

import android.content.DialogInterface;
import com.whatsapp.BlockConfirmationDialogFragment;

/* renamed from: X.1HW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HW implements DialogInterface.OnClickListener {
    public final /* synthetic */ BlockConfirmationDialogFragment A00;
    public final /* synthetic */ ActivityC004702f A01;
    public final /* synthetic */ C007003k A02;

    public /* synthetic */ AnonymousClass1HW(BlockConfirmationDialogFragment blockConfirmationDialogFragment, ActivityC004702f r2, C007003k r3) {
        this.A00 = blockConfirmationDialogFragment;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A00;
        ActivityC004702f r4 = this.A01;
        C007003k r3 = this.A02;
        if (blockConfirmationDialogFragment.A07.A03(r4)) {
            blockConfirmationDialogFragment.A02.A0A(null);
            AbstractC03740Hl r0 = blockConfirmationDialogFragment.A00;
            if (r0 != null) {
                r0.AMo();
            }
            blockConfirmationDialogFragment.A09.ANF(new RunnableEBaseShape2S0300000_I1(blockConfirmationDialogFragment, r4, r3, 12));
        }
    }
}
