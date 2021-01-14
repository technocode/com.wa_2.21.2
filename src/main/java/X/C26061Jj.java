package X;

import android.widget.PopupWindow;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1Jj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C26061Jj implements PopupWindow.OnDismissListener {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public /* synthetic */ C26061Jj(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public final void onDismiss() {
        this.A00.A05.setImageResource(R.drawable.ic_emoji_solid);
    }
}
