package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2oA  reason: invalid class name and case insensitive filesystem */
public class C59712oA extends C08490bD {
    public final Paint A00;
    public final /* synthetic */ C54132eP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59712oA(C54132eP r5, Context context) {
        super(context, null);
        this.A01 = r5;
        Paint paint = new Paint(1);
        this.A00 = paint;
        paint.setColor(-16725026);
        this.A00.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_selection_border));
        this.A00.setStyle(Paint.Style.STROKE);
        this.A00.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(1711315404);
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.A00);
        if (this.A01.A0B) {
            canvas.drawColor(1727987712);
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
