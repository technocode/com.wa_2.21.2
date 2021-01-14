package X;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: X.1Si  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC27971Si implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ AnonymousClass00D A01;
    public final /* synthetic */ AnonymousClass35S A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ DialogInterface$OnClickListenerC27971Si(CheckBox checkBox, AnonymousClass35S r2, boolean z, boolean z2, AnonymousClass00D r5) {
        this.A00 = checkBox;
        this.A02 = r2;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = r5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CheckBox checkBox = this.A00;
        AnonymousClass35S r4 = this.A02;
        boolean z = this.A03;
        boolean z2 = this.A04;
        AnonymousClass00D r2 = this.A01;
        boolean isChecked = checkBox.isChecked();
        r4.AIb(isChecked);
        if (z && z2 != isChecked) {
            AnonymousClass008.A0n(r2, "pref_media_delete_per_conversation", isChecked);
        }
    }
}
