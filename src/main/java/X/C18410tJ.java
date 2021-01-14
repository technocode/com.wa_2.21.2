package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.0tJ  reason: invalid class name and case insensitive filesystem */
public class C18410tJ extends ImageView {
    public ObjectAnimator A00;
    public boolean A01;

    public C18410tJ(Context context) {
        super(context);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 360.0f).setDuration(850L);
        this.A00 = duration;
        duration.setRepeatMode(1);
        this.A00.setRepeatCount(-1);
        this.A00.setInterpolator(new LinearInterpolator());
        setBackgroundResource(R.drawable.spinner_large);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            this.A00.start();
        }
    }

    public void onDetachedFromWindow() {
        this.A01 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01) {
            this.A00.start();
            this.A01 = false;
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getWindowToken() == null) {
            return;
        }
        if (i != 0 || getVisibility() != 0) {
            this.A00.cancel();
            this.A01 = false;
        } else if (getAnimation() != null) {
        } else {
            if (getMeasuredWidth() != 0) {
                this.A00.start();
            } else {
                this.A01 = true;
            }
        }
    }
}
