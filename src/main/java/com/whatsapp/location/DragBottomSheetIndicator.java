package com.whatsapp.location;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class DragBottomSheetIndicator extends View {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final Paint A06 = new Paint(1);
    public final Paint A07 = new Paint(1);
    public final Path A08 = new Path();

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06.setStyle(Paint.Style.STROKE);
        this.A06.setStrokeCap(Paint.Cap.SQUARE);
        this.A06.setStrokeWidth(context.getResources().getDisplayMetrics().density * 2.0f);
        this.A06.setColor(-1);
        this.A07.setStyle(Paint.Style.STROKE);
        this.A07.setStrokeCap(Paint.Cap.ROUND);
        this.A07.setStrokeJoin(Paint.Join.ROUND);
        this.A07.setStrokeWidth(context.getResources().getDisplayMetrics().density * 4.0f);
        this.A07.setColor(855638016);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        if (r7.A04 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        if (r4 >= 0.0f) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (r7.A04 != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        r4 = (float) (((double) r4) * 0.25d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        if (r4 > 0.0f) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.DragBottomSheetIndicator.onDraw(android.graphics.Canvas):void");
    }

    public void setExpanded(boolean z) {
        this.A04 = z;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        invalidate();
    }

    public void setOffset(float f) {
        this.A03 = this.A02;
        this.A01 = this.A00;
        this.A02 = SystemClock.elapsedRealtime();
        this.A00 = f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A05 = z;
        if (z) {
            invalidate();
        }
    }
}
