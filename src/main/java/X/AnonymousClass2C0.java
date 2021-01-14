package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: X.2C0  reason: invalid class name */
public class AnonymousClass2C0 extends ActivityC004802g {
    public final AnonymousClass0LB A00 = AnonymousClass0LB.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // X.ActivityC004802g
    public void attachBaseContext(Context context) {
        super.attachBaseContext(new AnonymousClass0S7(context, this.A01, this.A00));
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        this.A01.A0J();
        super.onConfigurationChanged(configuration);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        this.A01.A0J();
        super.onCreate(bundle);
    }
}
