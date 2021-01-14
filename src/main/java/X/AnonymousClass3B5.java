package X;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.search.verification.client.R;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.3B5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3B5 implements View.OnTouchListener {
    public final /* synthetic */ GetCredential A00;

    public /* synthetic */ AnonymousClass3B5(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GetCredential getCredential = this.A00;
        view.performClick();
        if (view.getId() != R.id.transaction_details_scroller || motionEvent.getAction() != 1 || getCredential.A02.getVisibility() != 0) {
            return false;
        }
        getCredential.A0D(false);
        return true;
    }
}
