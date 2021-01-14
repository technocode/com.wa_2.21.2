package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1do  reason: invalid class name and case insensitive filesystem */
public class C31791do implements AbstractC25331Gl {
    public static final C31791do A00 = new C31791do();

    @Override // X.AbstractC25331Gl
    public void A2E(Object obj, AnonymousClass05q r5, AbstractC009906e r6, AbstractC008905s r7) {
        View view = (View) obj;
        AnonymousClass28S r62 = (AnonymousClass28S) r6;
        if (r62.A00 == null) {
            ViewTreeObserver$OnGlobalLayoutListenerC18420tK r2 = new ViewTreeObserver$OnGlobalLayoutListenerC18420tK(view.getRootView());
            r2.A03.add(new C31781dn(r62, r5));
            r62.A00 = r2;
        }
    }

    @Override // X.AbstractC25331Gl
    public void AQk(Object obj, AnonymousClass05q r4, AbstractC009906e r5, AbstractC008905s r6) {
        AnonymousClass28S r52 = (AnonymousClass28S) r5;
        ViewTreeObserver$OnGlobalLayoutListenerC18420tK r1 = r52.A00;
        if (r1 != null) {
            r1.A03.clear();
            ViewTreeObserver viewTreeObserver = r1.A02.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(r1);
            }
            r52.A00 = null;
        }
    }
}
