package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: X.0TM  reason: invalid class name */
public class AnonymousClass0TM extends ContentFrameLayout {
    public final /* synthetic */ AnonymousClass0MW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0TM(AnonymousClass0MW r2, Context context) {
        super(context, null);
        this.A00 = r2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A00.A0U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                AnonymousClass0MW r1 = this.A00;
                r1.A0S(r1.A0K(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(AnonymousClass05p.A01(getContext(), i));
    }
}
