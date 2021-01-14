package X;

import android.view.ViewTreeObserver;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.1P8  reason: invalid class name */
public class AnonymousClass1P8 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ DeleteAccountFeedback A00;

    public AnonymousClass1P8(DeleteAccountFeedback deleteAccountFeedback) {
        this.A00 = deleteAccountFeedback;
    }

    public boolean onPreDraw() {
        DeleteAccountFeedback deleteAccountFeedback = this.A00;
        deleteAccountFeedback.A04.getViewTreeObserver().removeOnPreDrawListener(this);
        if (deleteAccountFeedback.A04.canScrollVertically(1)) {
            deleteAccountFeedback.A02.setElevation((float) deleteAccountFeedback.A00);
            return false;
        }
        deleteAccountFeedback.A02.setElevation(0.0f);
        return false;
    }
}
