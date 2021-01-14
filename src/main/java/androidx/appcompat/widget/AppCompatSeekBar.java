package androidx.appcompat.widget;

import X.C29601Zo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.search.verification.client.R;

public class AppCompatSeekBar extends SeekBar {
    public final C29601Zo A00;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C29601Zo r0 = new C29601Zo(this);
        this.A00 = r0;
        r0.A01(attributeSet, R.attr.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C29601Zo r1 = this.A00;
        Drawable drawable = r1.A02;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = r1.A05;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A02;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C29601Zo r5 = this.A00;
        if (r5.A02 != null) {
            SeekBar seekBar = r5.A05;
            int max = seekBar.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = r5.A02.getIntrinsicWidth();
                int intrinsicHeight = r5.A02.getIntrinsicHeight();
                int i2 = intrinsicWidth >> 1;
                if (intrinsicWidth < 0) {
                    i2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight >> 1;
                }
                r5.A02.setBounds(-i2, -i, i2, i);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() >> 1));
                for (int i3 = 0; i3 <= max; i3++) {
                    r5.A02.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
