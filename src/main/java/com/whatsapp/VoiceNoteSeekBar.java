package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass1Of;
import X.C004302a;
import X.C07990aH;
import X.C14890n3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.google.android.search.verification.client.R;

public class VoiceNoteSeekBar extends AppCompatSeekBar {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 20;
    public int A05 = 10;
    public SeekBar.OnSeekBarChangeListener A06;
    public C14890n3 A07;
    public boolean A08;
    public final Paint A09 = new Paint(1);
    public final RectF A0A = new RectF();
    public final AnonymousClass01X A0B;

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = !isInEditMode() ? AnonymousClass01X.A00() : null;
        this.A03 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A02 = C004302a.A00(context, R.color.voice_note_seekbar_progress);
        this.A01 = C004302a.A00(context, R.color.voice_note_seekbar_background);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A2Y);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, 20);
            this.A05 = obtainStyledAttributes.getDimensionPixelSize(3, 10);
            this.A02 = obtainStyledAttributes.getInteger(1, this.A02);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            obtainStyledAttributes.recycle();
        }
        this.A07 = new C14890n3(context, new AnonymousClass1Of(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r1 > (r6 - r4)) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r1 = ((float) r0) / ((float) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r1 < r5) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r6 = r7.getWidth()
            int r5 = r7.getPaddingLeft()
            int r4 = r7.getPaddingRight()
            int r3 = r6 - r5
            int r3 = r3 - r4
            float r0 = r8.getX()
            int r1 = (int) r0
            X.01X r0 = r7.A0B
            X.0Nz r0 = r0.A02()
            boolean r0 = r0.A06
            r2 = 0
            if (r0 == 0) goto L_0x003e
            int r6 = r6 - r4
            if (r1 > r6) goto L_0x004a
            int r0 = r3 - r1
            int r0 = r0 + r5
            if (r1 >= r5) goto L_0x0046
        L_0x0027:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0029:
            int r0 = r7.getMax()
            float r0 = (float) r0
            float r1 = r1 * r0
            float r1 = r1 + r2
            int r3 = (int) r1
            r7.setProgress(r3)
            android.widget.SeekBar$OnSeekBarChangeListener r2 = r7.A06
            if (r2 == 0) goto L_0x003d
            r1 = 0
            r0 = 1
            r2.onProgressChanged(r1, r3, r0)
        L_0x003d:
            return
        L_0x003e:
            if (r1 < r5) goto L_0x004a
            int r6 = r6 - r4
            int r0 = r1 - r5
            if (r1 <= r6) goto L_0x0046
            goto L_0x0027
        L_0x0046:
            float r1 = (float) r0
            float r0 = (float) r3
            float r1 = r1 / r0
            goto L_0x0029
        L_0x004a:
            r1 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceNoteSeekBar.A00(android.view.MotionEvent):void");
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar
    public synchronized void onDraw(Canvas canvas) {
        int i;
        float f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i2 = (width - paddingLeft) - paddingRight;
        if (isPressed()) {
            i = (this.A04 * 3) / 4;
        } else {
            i = this.A04 / 2;
        }
        int max = getMax();
        if (max > 0) {
            f = ((float) getProgress()) / ((float) max);
        } else {
            f = 0.0f;
        }
        int i3 = ((int) (f * ((float) (i2 - (i << 1))))) + i;
        int i4 = (isInEditMode() || this.A0B.A0M()) ? i3 + paddingLeft : (width - i3) - paddingRight;
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        Paint paint = this.A09;
        paint.setColor(this.A01);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.A0A;
        rectF.set(0.0f, (float) (paddingTop - (this.A05 / 2)), (float) getWidth(), (float) ((this.A05 / 2) + paddingTop));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A02);
        if (isInEditMode() || this.A0B.A0M()) {
            float f2 = (float) paddingLeft;
            int i5 = this.A05 / 2;
            rectF.set(f2, (float) (paddingTop - i5), (float) i4, (float) (i5 + paddingTop));
        } else {
            int i6 = this.A05 / 2;
            rectF.set((float) i4, (float) (paddingTop - i6), (float) (width - paddingRight), (float) (i6 + paddingTop));
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        canvas.drawCircle((float) i4, (float) paddingTop, (float) i, paint);
    }

    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(SeekBar.resolveSizeAndState(this.A04 << 1, i, 0), SeekBar.resolveSizeAndState(this.A04 << 1, i2, 0));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        C14890n3 r0 = this.A07;
        if (r0 != null) {
            r0.A00.AL5(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                    this.A00 = motionEvent.getX();
                    return true;
                }
            }
            setPressed(true);
            invalidate();
            this.A08 = true;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A06;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(null);
            }
            A00(motionEvent);
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (action == 1) {
            if (this.A08) {
                A00(motionEvent);
                this.A08 = false;
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.A06;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStopTrackingTouch(null);
                }
                setPressed(false);
            } else {
                this.A08 = true;
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener3 = this.A06;
                if (onSeekBarChangeListener3 != null) {
                    onSeekBarChangeListener3.onStartTrackingTouch(null);
                }
                A00(motionEvent);
                this.A08 = false;
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener4 = this.A06;
                if (onSeekBarChangeListener4 != null) {
                    onSeekBarChangeListener4.onStopTrackingTouch(null);
                }
            }
            invalidate();
            return true;
        } else if (action != 2) {
            if (action == 3) {
                if (this.A08) {
                    this.A08 = false;
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener5 = this.A06;
                    if (onSeekBarChangeListener5 != null) {
                        onSeekBarChangeListener5.onStopTrackingTouch(null);
                    }
                    setPressed(false);
                }
                invalidate();
            }
        } else if (this.A08) {
            A00(motionEvent);
            return true;
        } else if (Math.abs(motionEvent.getX() - this.A00) > ((float) this.A03)) {
            setPressed(true);
            invalidate();
            this.A08 = true;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener6 = this.A06;
            if (onSeekBarChangeListener6 != null) {
                onSeekBarChangeListener6.onStartTrackingTouch(null);
            }
            A00(motionEvent);
            ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        }
        return true;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A06 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setProgressColor(int i) {
        this.A02 = i;
        invalidate();
    }
}
