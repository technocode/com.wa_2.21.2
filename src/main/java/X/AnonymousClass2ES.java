package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ES  reason: invalid class name */
public class AnonymousClass2ES extends View {
    public boolean A00;
    public final Paint A01;

    public AnonymousClass2ES(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.A01 = paint;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.shutter_stroke_size));
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setColor(-1);
    }

    public void onDraw(Canvas canvas) {
        if (this.A00) {
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.A01);
        }
    }
}
