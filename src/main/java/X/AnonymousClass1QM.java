package X;

import android.content.DialogInterface;

/* renamed from: X.1QM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QM implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnCancelListener A00;

    public /* synthetic */ AnonymousClass1QM(DialogInterface.OnCancelListener onCancelListener) {
        this.A00 = onCancelListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnCancelListener onCancelListener = this.A00;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
