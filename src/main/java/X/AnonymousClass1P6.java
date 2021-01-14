package X;

import android.view.ViewTreeObserver;
import com.whatsapp.account.delete.DeleteAccountConfirmation;

/* renamed from: X.1P6  reason: invalid class name */
public class AnonymousClass1P6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ DeleteAccountConfirmation A00;

    public AnonymousClass1P6(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.A00 = deleteAccountConfirmation;
    }

    public boolean onPreDraw() {
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        deleteAccountConfirmation.A03.getViewTreeObserver().removeOnPreDrawListener(this);
        if (deleteAccountConfirmation.A03.canScrollVertically(1)) {
            deleteAccountConfirmation.A02.setElevation((float) deleteAccountConfirmation.A00);
            return false;
        }
        deleteAccountConfirmation.A02.setElevation(0.0f);
        return false;
    }
}
