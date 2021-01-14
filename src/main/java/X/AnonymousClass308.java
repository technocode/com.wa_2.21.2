package X;

import android.view.ViewTreeObserver;
import com.whatsapp.registration.ChangeNumberOverview;

/* renamed from: X.308  reason: invalid class name */
public class AnonymousClass308 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberOverview A00;

    public AnonymousClass308(ChangeNumberOverview changeNumberOverview) {
        this.A00 = changeNumberOverview;
    }

    public boolean onPreDraw() {
        ChangeNumberOverview changeNumberOverview = this.A00;
        changeNumberOverview.A02.getViewTreeObserver().removeOnPreDrawListener(this);
        if (changeNumberOverview.A02.canScrollVertically(1)) {
            changeNumberOverview.A01.setElevation((float) changeNumberOverview.A00);
            return false;
        }
        changeNumberOverview.A01.setElevation(0.0f);
        return false;
    }
}
