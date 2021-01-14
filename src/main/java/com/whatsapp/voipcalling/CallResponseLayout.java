package com.whatsapp.voipcalling;

import X.AbstractC674938u;
import X.AnonymousClass03P;
import X.AnonymousClass0Q7;
import X.AnonymousClass3TZ;
import X.C15260nl;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

public class CallResponseLayout extends FrameLayout {
    public View A00;
    public View A01;
    public ViewConfiguration A02 = ViewConfiguration.get(getContext());
    public C15260nl A03 = new C15260nl(getContext(), this, new AnonymousClass3TZ(this));
    public AbstractC674938u A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass03P A07 = AnonymousClass03P.A00();

    public CallResponseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A03.A0B()) {
            postInvalidateOnAnimation();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return this.A03.A0G(motionEvent);
        }
        this.A03.A02();
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.A03.A08(motionEvent);
        return true;
    }

    public void onVisibilityChanged(View view, int i) {
        int height;
        super.onVisibilityChanged(view, i);
        if (this.A01 != null && i == 0 && (height = (getHeight() - this.A01.getHeight()) - ((int) this.A01.getY())) != 0) {
            AnonymousClass0Q7.A0U(this.A01, height);
        }
    }

    public void setCallResponseSwipeUpHintView(View view) {
        this.A00 = view;
    }

    public void setCallResponseView(View view) {
        this.A01 = view;
    }

    public void setResponseListener(AbstractC674938u r1) {
        this.A04 = r1;
    }

    public void setShowSwipeUpHintByDefault(boolean z) {
        this.A05 = z;
    }

    public void setTouchDownAfterDrag(boolean z) {
        this.A06 = z;
    }
}
