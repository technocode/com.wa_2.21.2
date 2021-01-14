package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2I8  reason: invalid class name */
public class AnonymousClass2I8 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AbstractC51572Zg A00;

    public AnonymousClass2I8(AbstractC51572Zg r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        AbstractC51572Zg r2 = this.A00;
        r2.A08.getViewTreeObserver().removeOnPreDrawListener(this);
        AbstractC43421yL rowsContainer = r2.getRowsContainer();
        if (rowsContainer == null) {
            return true;
        }
        rowsContainer.animateStar(r2.A08);
        return true;
    }
}
