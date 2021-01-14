package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.1pB  reason: invalid class name */
public final class AnonymousClass1pB implements AbstractC25331Gl {
    @Override // X.AbstractC25331Gl
    public void A2E(Object obj, AnonymousClass05q r4, AbstractC009906e r5, AbstractC008905s r6) {
        View view = (View) obj;
        RunnableEBaseShape1S0400000_I1 runnableEBaseShape1S0400000_I1 = new RunnableEBaseShape1S0400000_I1(view, (AnonymousClass29X) r5, r6, r4);
        view.setTag(R.id.render_lifecycle_extension_runnable, runnableEBaseShape1S0400000_I1);
        view.post(runnableEBaseShape1S0400000_I1);
    }

    @Override // X.AbstractC25331Gl
    public void AQk(Object obj, AnonymousClass05q r3, AbstractC009906e r4, AbstractC008905s r5) {
        View view = (View) obj;
        Runnable runnable = (Runnable) view.getTag(R.id.render_lifecycle_extension_runnable);
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
    }
}
