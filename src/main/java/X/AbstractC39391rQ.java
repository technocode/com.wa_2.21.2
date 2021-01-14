package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1rQ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC39391rQ extends CharacterStyle implements AbstractC05700Ps, UpdateAppearance {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;

    public AbstractC39391rQ(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public AbstractC39391rQ(Context context, int i) {
        this.A01 = C004302a.A00(context, i);
        int A002 = C004302a.A00(context, i);
        this.A02 = A002;
        this.A00 = C004402b.A03(A002, 72);
    }

    @Override // X.AbstractC05700Ps
    public void AL3(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A03 > 1000) {
                this.A03 = elapsedRealtime;
                if (this.A04) {
                    onClick(view);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A04 = z;
        view.invalidate();
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.A04) {
            textPaint.setColor(this.A02);
            textPaint.bgColor = this.A00;
            textPaint.setUnderlineText(true);
            return;
        }
        int i = this.A01;
        if (i == 0) {
            textPaint.setColor(textPaint.linkColor);
        } else {
            textPaint.setColor(i);
        }
        textPaint.setUnderlineText(false);
        textPaint.bgColor = 0;
    }
}
