package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.1PI  reason: invalid class name */
public class AnonymousClass1PI extends ViewOutlineProvider {
    public final /* synthetic */ AnonymousClass1PJ A00;
    public final /* synthetic */ AnonymousClass1PK A01;

    public AnonymousClass1PI(AnonymousClass1PK r1, AnonymousClass1PJ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void getOutline(View view, Outline outline) {
        AnonymousClass1PJ r0 = this.A00;
        outline.setOval(0, 0, r0.A05, r0.A04);
    }
}
