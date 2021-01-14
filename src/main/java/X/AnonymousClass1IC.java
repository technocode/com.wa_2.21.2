package X;

import android.content.DialogInterface;
import com.whatsapp.FirstStatusConfirmationDialogFragment;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;

/* renamed from: X.1IC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IC implements DialogInterface.OnClickListener {
    public final /* synthetic */ FirstStatusConfirmationDialogFragment A00;

    public /* synthetic */ AnonymousClass1IC(FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment) {
        this.A00 = firstStatusConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment = this.A00;
        AnonymousClass09E r1 = firstStatusConfirmationDialogFragment.A03;
        if (!r1.A0H()) {
            r1.A0D(0, null);
            AnonymousClass01J r0 = firstStatusConfirmationDialogFragment.A01;
            r0.A00.A01(new SendStatusPrivacyListJob(0, null, null));
        }
        ActivityC004902h A0A = firstStatusConfirmationDialogFragment.A0A();
        if (A0A instanceof AbstractC26651Lv) {
            ((AbstractC26651Lv) A0A).AKT();
        }
        firstStatusConfirmationDialogFragment.A0w(false, false);
    }
}
