package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.BlockConfirmationDialogFragment;

/* renamed from: X.1rR  reason: invalid class name and case insensitive filesystem */
public class C39401rR implements AbstractC47272Hd {
    public final /* synthetic */ BlockConfirmationDialogFragment A00;
    public final /* synthetic */ ActivityC004702f A01;

    public C39401rR(BlockConfirmationDialogFragment blockConfirmationDialogFragment, ActivityC004702f r2) {
        this.A00 = blockConfirmationDialogFragment;
        this.A01 = r2;
    }

    @Override // X.AbstractC47272Hd
    public void AGe(C007003k r7) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A00;
        ActivityC004702f r4 = this.A01;
        String A06 = blockConfirmationDialogFragment.A08.A06(R.string.report_and_leave_confirmation);
        AnonymousClass02M r2 = blockConfirmationDialogFragment.A02;
        r2.A02.post(new RunnableEBaseShape1S1100000_I1(blockConfirmationDialogFragment, A06, 4));
        r4.finish();
    }

    @Override // X.AbstractC47272Hd
    public void ALb(C007003k r8) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A00;
        ActivityC004702f r5 = this.A01;
        String A0D = blockConfirmationDialogFragment.A08.A0D(R.string.report_and_block_confirmation, blockConfirmationDialogFragment.A06.A08(r8, false));
        AnonymousClass02M r2 = blockConfirmationDialogFragment.A02;
        r2.A02.post(new RunnableEBaseShape1S1100000_I1(blockConfirmationDialogFragment, A0D, 4));
        r5.finish();
    }
}
