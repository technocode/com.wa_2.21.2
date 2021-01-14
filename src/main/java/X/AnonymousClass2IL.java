package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.2IL  reason: invalid class name */
public class AnonymousClass2IL extends View {
    public final Rect A00 = new Rect();
    public final /* synthetic */ AnonymousClass2IO A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IL(AnonymousClass2IO r2, Context context) {
        super(context);
        this.A01 = r2;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            AnonymousClass2IO r2 = this.A01;
            StickerView stickerView = r2.A08;
            Rect rect = this.A00;
            stickerView.getDrawingRect(rect);
            canvas.drawRect(rect, ((AnonymousClass2I2) r2.A09).A0T.A01);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        StickerView stickerView = this.A01.A08;
        int measuredHeight = stickerView.getMeasuredHeight();
        int measuredWidth = stickerView.getMeasuredWidth();
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(measuredWidth, size);
            } else {
                size = measuredWidth;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, measuredHeight);
            } else {
                size2 = measuredHeight;
            }
        }
        setMeasuredDimension(size, size2);
    }
}
