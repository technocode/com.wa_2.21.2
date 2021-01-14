package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2E3  reason: invalid class name */
public class AnonymousClass2E3 extends View {
    public float A00;
    public RectF A01;
    public Boolean A02;
    public final Paint A03;
    public final Runnable A04 = new RunnableEBaseShape8S0100000_I1_3(this, 3);

    public AnonymousClass2E3(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.A03 = paint;
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.autofocus_stroke_size));
        this.A03.setStyle(Paint.Style.STROKE);
        this.A00 = context.getResources().getDimension(R.dimen.autofocus_box_size);
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        Boolean bool = this.A02;
        if (bool == null) {
            paint = this.A03;
            paint.setColor(-1);
        } else if (bool == Boolean.TRUE) {
            paint = this.A03;
            paint.setColor(-16711936);
        } else {
            paint = this.A03;
            paint.setColor(-65536);
        }
        canvas.drawRect(this.A01, paint);
    }
}
