package X;

import android.content.DialogInterface;
import com.whatsapp.BlockConfirmationDialogFragment;

/* renamed from: X.1HX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HX implements DialogInterface.OnClickListener {
    public final /* synthetic */ BlockConfirmationDialogFragment A00;
    public final /* synthetic */ ActivityC004702f A01;
    public final /* synthetic */ C007003k A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass1HX(BlockConfirmationDialogFragment blockConfirmationDialogFragment, boolean z, ActivityC004702f r3, C007003k r4, boolean z2) {
        this.A00 = blockConfirmationDialogFragment;
        this.A03 = z;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A00;
        boolean z = this.A03;
        ActivityC004702f r3 = this.A01;
        C007003k r7 = this.A02;
        boolean z2 = this.A04;
        if (z) {
            blockConfirmationDialogFragment.A09.ANC(new C10740f7(r3, blockConfirmationDialogFragment.A04, blockConfirmationDialogFragment.A07, r3, r7, null, null), new Void[0]);
        } else {
            blockConfirmationDialogFragment.A01.A0A(r3, true, null, z2, r7, null);
        }
    }
}
