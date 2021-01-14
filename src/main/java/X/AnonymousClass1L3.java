package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import com.whatsapp.Conversation;

/* renamed from: X.1L3  reason: invalid class name */
public class AnonymousClass1L3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ Conversation A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass1L3(Conversation conversation, ViewGroup viewGroup, boolean z, View view, int i) {
        this.A03 = conversation;
        this.A02 = viewGroup;
        this.A04 = z;
        this.A01 = view;
        this.A00 = i;
    }

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A02;
        viewGroup.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setDuration(250);
        if (this.A04) {
            this.A03.A0Y.startAnimation(translateAnimation);
        }
        Conversation conversation = this.A03;
        if (viewGroup == conversation.A0P && conversation.A0O.getVisibility() == 0) {
            conversation.A0O.startAnimation(translateAnimation);
        }
        if (conversation.A0k.A0C) {
            conversation.A0R.startAnimation(translateAnimation);
        }
        this.A01.startAnimation(translateAnimation);
        Drawable background = conversation.A0F.getBackground();
        if (!(background instanceof AnonymousClass2NM)) {
            conversation.A11(new AnonymousClass2NM(background));
        }
        AnonymousClass2NM r0 = (AnonymousClass2NM) conversation.A0F.getBackground();
        r0.A00 = height;
        r0.invalidateSelf();
        AnonymousClass1L2 r2 = new AnonymousClass1L2(this, height, background);
        r2.setStartTime(-1);
        r2.setDuration(250);
        r2.setAnimationListener(new C39631rq(this));
        conversation.A0F.startAnimation(r2);
    }
}
