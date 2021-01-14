package X;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import com.whatsapp.Conversation;

/* renamed from: X.1L5  reason: invalid class name */
public class AnonymousClass1L5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C39641rr A00;

    public AnonymousClass1L5(C39641rr r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        C39641rr r4 = this.A00;
        Conversation conversation = r4.A03;
        conversation.A0F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        Drawable background = conversation.A0F.getBackground();
        if (background instanceof AnonymousClass2NM) {
            conversation.A11(((AnonymousClass2NM) background).A01);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(0);
        r4.A01.startAnimation(translateAnimation);
        if (r4.A02 == conversation.A0P && conversation.A0O.getVisibility() == 0) {
            conversation.A0O.startAnimation(translateAnimation);
        }
        if (conversation.A0k.A0C) {
            conversation.A0R.startAnimation(translateAnimation);
        }
        if (r4.A04) {
            conversation.A0Y.startAnimation(translateAnimation);
        }
        conversation.A08 = 0;
    }
}
