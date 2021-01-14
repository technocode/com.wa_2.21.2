package X;

import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2Je  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC47692Je implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ConversationsFragment A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC47692Je(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onGlobalLayout() {
        ConversationsFragment conversationsFragment = this.A00;
        C36901n6 r0 = conversationsFragment.A0D;
        if (r0 != null) {
            r0.A05.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            ActivityC004902h A0A = conversationsFragment.A0A();
            if (A0A != null) {
                A0A.findViewById(R.id.fab).animate().translationY((float) (-conversationsFragment.A0D.A05.getHeight())).setDuration(250).setInterpolator(new C06930Vg()).start();
                return;
            }
            throw null;
        }
    }
}
