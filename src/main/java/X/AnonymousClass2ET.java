package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ET  reason: invalid class name */
public class AnonymousClass2ET extends View {
    public float A00;
    public String A01;
    public final Paint A02 = new Paint(1);
    public final RectF A03 = new RectF();
    public final TextPaint A04 = new TextPaint(1);
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final Runnable A06 = new RunnableEBaseShape8S0100000_I1_3(this, 12);

    public AnonymousClass2ET(Context context) {
        super(context);
        this.A02.setStrokeWidth(context.getResources().getDimension(R.dimen.zoom_stroke_size));
        this.A02.setStyle(Paint.Style.STROKE);
        this.A04.setTextSize(context.getResources().getDimension(R.dimen.zoom_text_size));
        this.A04.setColor(-1711276033);
        this.A04.setTextAlign(Paint.Align.CENTER);
        this.A04.setFakeBoldText(true);
    }

    public float getMaxScale() {
        return (((float) Math.min(getWidth() >> 1, getHeight() >> 1)) * 0.9f) / this.A04.measureText("x00.0");
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth() >> 1;
        int height = getHeight() >> 1;
        float min = ((float) Math.min(width, height)) * 0.9f;
        Paint paint = this.A02;
        paint.setColor(-1711276033);
        RectF rectF = this.A03;
        float f = (float) width;
        float f2 = (float) height;
        rectF.set(f - min, f2 - min, f + min, f2 + min);
        canvas.drawOval(rectF, paint);
        String str = this.A01;
        if (str != null) {
            TextPaint textPaint = this.A04;
            canvas.drawText(str, f, f2 - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
        float measureText = this.A04.measureText("x00.0");
        rectF.set(f - measureText, f2 - measureText, f + measureText, f2 + measureText);
        canvas.drawOval(rectF, paint);
        float min2 = Math.min(min, measureText * this.A00);
        paint.setColor(-13388315);
        rectF.set(f - min2, f2 - min2, f + min2, f2 + min2);
        canvas.drawOval(rectF, paint);
    }
}
