package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/* renamed from: X.2ga  reason: invalid class name and case insensitive filesystem */
public final class C55462ga extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Intent A02;

    public C55462ga(Activity activity, Intent intent, int i) {
        this.A01 = activity;
        this.A02 = intent;
        this.A00 = i;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        this.A01.startActivityForResult(this.A02, this.A00);
    }
}
