package X;

import android.view.ViewTreeObserver;
import com.whatsapp.SelectionCheckView;

/* renamed from: X.32L  reason: invalid class name */
public class AnonymousClass32L implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass32M A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass32L(AnonymousClass32M r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        SelectionCheckView selectionCheckView = this.A00.A08;
        selectionCheckView.getViewTreeObserver().removeOnPreDrawListener(this);
        selectionCheckView.A03(this.A01, true);
        return false;
    }
}
