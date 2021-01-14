package X;

import android.content.DialogInterface;

/* renamed from: X.3AT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AT implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C011106q A00;
    public final /* synthetic */ AnonymousClass3AU A01;

    public /* synthetic */ AnonymousClass3AT(AnonymousClass3AU r1, C011106q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AnonymousClass3AU.A00(this.A00).onBackPressed();
    }
}
