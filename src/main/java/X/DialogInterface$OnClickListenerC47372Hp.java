package X;

import android.content.DialogInterface;
import android.graphics.Bitmap;

/* renamed from: X.2Hp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47372Hp implements DialogInterface.OnClickListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass2DW A01;
    public final /* synthetic */ AnonymousClass1Z4 A02;

    public /* synthetic */ DialogInterface$OnClickListenerC47372Hp(AnonymousClass2DW r1, AnonymousClass1Z4 r2, Bitmap bitmap) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = bitmap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass2DW r4 = this.A01;
        if (((ActivityC004602e) r4).A04.A06(r4, AnonymousClass36B.A00(r4, this.A02, this.A00, false), 41)) {
            r4.A05.A02(false, 6);
        }
    }
}
