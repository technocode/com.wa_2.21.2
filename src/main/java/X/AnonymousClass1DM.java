package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: X.1DM  reason: invalid class name */
public class AnonymousClass1DM extends ViewOutlineProvider {
    public final /* synthetic */ Chip A00;

    public AnonymousClass1DM(Chip chip) {
        this.A00 = chip;
    }

    public void getOutline(View view, Outline outline) {
        C36761mp r0 = this.A00.A04;
        if (r0 != null) {
            r0.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
