package com.whatsapp.doodle;

import X.AnonymousClass01X;
import X.AnonymousClass2MK;
import X.AnonymousClass2PX;
import X.AnonymousClass2c2;
import X.C000300f;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

public class ImagePreviewContentLayout extends FrameLayout {
    public Rect A00 = new Rect();
    public RectF A01 = new RectF();
    public DoodleView A02;
    public AnonymousClass2MK A03;
    public AnonymousClass2PX A04;

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C000300f.A00();
        AnonymousClass01X.A00();
        LayoutInflater.from(context).inflate(R.layout.image_preview_content, (ViewGroup) this, true);
        setWillNotDraw(false);
        this.A02 = (DoodleView) findViewById(R.id.doodle_view);
        AnonymousClass2PX r0 = new AnonymousClass2PX(getContext(), this, new AnonymousClass2c2(this));
        this.A04 = r0;
        r0.A0W = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0.A05 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (r0.A05 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        if (r1.A04(r8) != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        if (r1.A05(r8) != null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.doodle.ImagePreviewContentLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onDraw(Canvas canvas) {
        canvas.setMatrix(this.A04.A0A);
        canvas.getClipBounds(this.A00);
        DoodleView doodleView = this.A02;
        doodleView.A0K = this.A00;
        doodleView.A04 = this.A04.A00;
        super.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A01.set(0.0f, 0.0f, (float) ((getWidth() - getPaddingLeft()) - getPaddingRight()), (float) ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        AnonymousClass2PX r2 = this.A04;
        r2.A0D.set(this.A01);
        r2.A01(true);
        AnonymousClass2PX r22 = this.A04;
        r22.A0S = true;
        Matrix matrix = r22.A09;
        if (matrix == null || matrix.equals(r22.A0A)) {
            r22.A01(z);
        }
    }

    public void setDoodleView(DoodleView doodleView) {
        this.A02 = doodleView;
    }

    public void setImagePreviewContentLayoutListener(AnonymousClass2MK r1) {
        this.A03 = r1;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A04.A0H = onClickListener;
    }

    public void setZoomableViewController(AnonymousClass2PX r1) {
        this.A04 = r1;
    }
}
