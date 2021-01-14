package X;

import android.content.DialogInterface;

/* renamed from: X.1TO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1TO implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass0MD A00;
    public final /* synthetic */ C28021Sn A01;

    public /* synthetic */ AnonymousClass1TO(C28021Sn r1, AnonymousClass0MD r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C28021Sn r2 = this.A01;
        AnonymousClass0MD r1 = this.A00;
        r2.A00("on_press_positive");
        r1.dismiss();
    }
}
