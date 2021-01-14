package X;

import android.content.DialogInterface;

/* renamed from: X.32v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnShowListenerC660932v implements DialogInterface.OnShowListener {
    public final /* synthetic */ AnonymousClass0MD A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ DialogInterface$OnShowListenerC660932v(AnonymousClass0MD r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AnonymousClass0MD r2 = this.A00;
        r2.A02(-1).setContentDescription(this.A01);
    }
}
