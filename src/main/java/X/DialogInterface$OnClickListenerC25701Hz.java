package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment;

/* renamed from: X.1Hz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25701Hz implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment A01;

    public /* synthetic */ DialogInterface$OnClickListenerC25701Hz(DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment displayExceptionDialogFactory$DoNotShareCodeDialogFragment, Context context) {
        this.A01 = displayExceptionDialogFactory$DoNotShareCodeDialogFragment;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment displayExceptionDialogFactory$DoNotShareCodeDialogFragment = this.A01;
        displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A00.A05(this.A00, new Intent("android.intent.action.VIEW", displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A02.A03("general", "30035737", null)));
        displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A0w(false, false);
    }
}
