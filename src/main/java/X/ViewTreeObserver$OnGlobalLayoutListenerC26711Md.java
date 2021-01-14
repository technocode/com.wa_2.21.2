package X;

import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.MessageDetailsActivity;

/* renamed from: X.1Md  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC26711Md implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ MessageDetailsActivity A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC26711Md(MessageDetailsActivity messageDetailsActivity) {
        this.A00 = messageDetailsActivity;
    }

    public void onGlobalLayout() {
        MessageDetailsActivity messageDetailsActivity = this.A00;
        messageDetailsActivity.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        messageDetailsActivity.A02.setSelectionFromTop(1, messageDetailsActivity.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material) * 3);
    }
}
