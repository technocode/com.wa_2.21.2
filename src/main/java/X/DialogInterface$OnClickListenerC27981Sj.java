package X;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: X.1Sj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC27981Sj implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ AnonymousClass35T A02;

    public /* synthetic */ DialogInterface$OnClickListenerC27981Sj(AnonymousClass35T r1, CheckBox checkBox, CheckBox checkBox2) {
        this.A02 = r1;
        this.A00 = checkBox;
        this.A01 = checkBox2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A02.AIc(!this.A00.isChecked(), this.A01.isChecked());
    }
}
