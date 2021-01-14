package X;

import android.view.ViewTreeObserver;
import com.whatsapp.registration.ChangeNumber;

/* renamed from: X.304  reason: invalid class name */
public class AnonymousClass304 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumber A00;

    public AnonymousClass304(ChangeNumber changeNumber) {
        this.A00 = changeNumber;
    }

    public boolean onPreDraw() {
        ChangeNumber changeNumber = this.A00;
        changeNumber.A05.getViewTreeObserver().removeOnPreDrawListener(this);
        if (changeNumber.A05.canScrollVertically(1)) {
            changeNumber.A04.setElevation((float) changeNumber.A00);
            return false;
        }
        changeNumber.A04.setElevation(0.0f);
        return false;
    }
}
