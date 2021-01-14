package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.1M0  reason: invalid class name */
public class AnonymousClass1M0 extends ClickableSpan {
    public final /* synthetic */ DialogC40171sk A00;

    public AnonymousClass1M0(DialogC40171sk r1) {
        this.A00 = r1;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.settings.DATE_SETTINGS");
        DialogC40171sk r0 = this.A00;
        r0.A01.A05(r0.A00, intent);
    }
}
