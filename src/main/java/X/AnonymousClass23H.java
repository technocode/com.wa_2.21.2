package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: X.23H  reason: invalid class name */
public class AnonymousClass23H extends C30131am {
    public final /* synthetic */ AnonymousClass0TA A00;

    public AnonymousClass23H(AnonymousClass0TA r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        View view2;
        AnonymousClass0TA r3 = this.A00;
        if (r3.A0D && (view2 = r3.A03) != null) {
            view2.setTranslationY(0.0f);
            r3.A08.setTranslationY(0.0f);
        }
        r3.A08.setVisibility(8);
        r3.A08.setTransitioning(false);
        r3.A07 = null;
        AbstractC06100Rs r1 = r3.A05;
        if (r1 != null) {
            r1.AEx(r3.A06);
            r3.A06 = null;
            r3.A05 = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = r3.A0A;
        if (actionBarOverlayLayout != null) {
            AnonymousClass0Q7.A0M(actionBarOverlayLayout);
        }
    }
}
