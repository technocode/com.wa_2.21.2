package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2q7  reason: invalid class name and case insensitive filesystem */
public class C60752q7 extends C60512pb {
    public Drawable A00;
    public C54192eV A01;
    public AnonymousClass2PG A02;
    public final Matrix A03 = new Matrix();
    public final Paint A04;
    public final /* synthetic */ MediaPreviewActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60752q7(MediaPreviewActivity mediaPreviewActivity, Context context) {
        super(context);
        this.A05 = mediaPreviewActivity;
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setColor(-16725026);
        this.A04.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_selection_border));
        this.A04.setStyle(Paint.Style.STROKE);
        this.A04.setAntiAlias(true);
        setOnTouchListener(mediaPreviewActivity.A0g);
    }

    @Override // X.C59592ny
    public Uri getUri() {
        return this.A02.A0F;
    }

    @Override // X.C59592ny
    public void onDraw(Canvas canvas) {
        MediaPreviewActivity mediaPreviewActivity = this.A05;
        if (mediaPreviewActivity.A0L.A06 != this && !mediaPreviewActivity.A1H.contains(this.A02)) {
            canvas.save();
            if (this.A02.A00() != 0) {
                int A002 = this.A02.A00();
                Matrix matrix = this.A03;
                matrix.setRotate((float) A002, (float) (getWidth() >> 1), (float) (getHeight() >> 1));
                canvas.concat(matrix);
            }
            super.onDraw(canvas);
            canvas.restore();
            Drawable drawable = this.A00;
            if (drawable != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight() >> 2;
                this.A00.setBounds(intrinsicHeight, (getHeight() - this.A00.getIntrinsicHeight()) - intrinsicHeight, this.A00.getIntrinsicWidth() + intrinsicHeight, getHeight() - intrinsicHeight);
                this.A00.draw(canvas);
            }
            if (isPressed() || isSelected()) {
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.A04);
            }
        }
    }

    @Override // X.C59592ny
    public void onMeasure(int i, int i2) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
