package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;

/* renamed from: X.1QX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QX implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ SingleChoiceListDialogFragment A02;

    public /* synthetic */ AnonymousClass1QX(SingleChoiceListDialogFragment singleChoiceListDialogFragment, int i, Bundle bundle) {
        this.A02 = singleChoiceListDialogFragment;
        this.A00 = i;
        this.A01 = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A02;
        singleChoiceListDialogFragment.A00.AKA(this.A00, i, this.A01.getStringArray("items"));
        singleChoiceListDialogFragment.A03.set(true);
        dialogInterface.dismiss();
    }
}
