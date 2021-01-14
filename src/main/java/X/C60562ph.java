package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

/* renamed from: X.2ph  reason: invalid class name and case insensitive filesystem */
public class C60562ph extends WaImageView {
    public int A00;
    public int A01;
    public Bitmap A02;
    public BitmapShader A03;
    public Matrix A04 = new Matrix();
    public Paint A05 = new Paint(1);
    public Paint A06 = new Paint(1);
    public Paint A07 = new Paint(1);
    public Paint A08 = new Paint(1);
    public RectF A09 = new RectF();
    public RectF A0A = new RectF();
    public final float A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final ImageView.ScaleType A0G = ImageView.ScaleType.CENTER;
    public final AnonymousClass01X A0H = AnonymousClass01X.A00();

    public C60562ph(Context context) {
        super(context);
        this.A05.setColor(C004302a.A00(context, R.color.settings_contact_us_screenshot_bg));
        this.A06.setColor(C004302a.A00(context, R.color.settings_contact_us_screenshot_border));
        this.A07.setColor(C004302a.A00(context, R.color.settings_contact_us_screenshot_circle));
        this.A0F = getResources().getDimensionPixelSize(R.dimen.settings_contact_us_screenshot_size);
        this.A0D = getResources().getDimensionPixelSize(R.dimen.settings_contact_us_screenshot_corner_radius);
        this.A0C = getResources().getDimensionPixelSize(R.dimen.settings_contact_us_screenshot_circle_size);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.settings_contact_us_screenshot_border_width);
        this.A0E = dimensionPixelSize;
        float f = (float) this.A0D;
        float f2 = (float) this.A0F;
        this.A0B = ((f2 - (((float) dimensionPixelSize) * 2.0f)) / f2) * f;
        A02();
    }

    public final void A02() {
        super.setScaleType(this.A0G);
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(R.drawable.ic_action_add);
        drawable.setColorFilter(resources.getColor(R.color.settings_contact_us_screenshot_plus), PorterDuff.Mode.SRC_IN);
        super.setImageDrawable(drawable);
        super.setContentDescription(this.A0H.A06(R.string.describe_problem_add_screenshot));
    }

    @Override // com.whatsapp.WaImageView
    public void onDraw(Canvas canvas) {
        if (this.A02 == null) {
            RectF rectF = this.A09;
            float f = (float) this.A0D;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            canvas.drawCircle((float) (getMeasuredWidth() >> 1), (float) (getMeasuredHeight() >> 1), (float) (this.A0C >> 1), this.A07);
            super.onDraw(canvas);
            return;
        }
        RectF rectF2 = this.A09;
        float f2 = (float) this.A0D;
        canvas.drawRoundRect(rectF2, f2, f2, this.A06);
        RectF rectF3 = this.A0A;
        float f3 = this.A0B;
        canvas.drawRoundRect(rectF3, f3, f3, this.A08);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RectF rectF = this.A09;
        int i3 = this.A0F;
        float f = (float) i3;
        rectF.set(0.0f, 0.0f, f, f);
        RectF rectF2 = this.A0A;
        int i4 = this.A0E;
        float f2 = (float) i4;
        float f3 = (float) (i3 - i4);
        rectF2.set(f2, f2, f3, f3);
        setMeasuredDimension(i3, i3);
    }

    public void setScreenshot(Bitmap bitmap) {
        float width;
        float height;
        super.setImageBitmap(bitmap);
        this.A02 = bitmap;
        if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap2 = this.A02;
            if (bitmap2 == null) {
                A02();
                invalidate();
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A03 = new BitmapShader(bitmap2, tileMode, tileMode);
            this.A08.setAntiAlias(true);
            this.A08.setShader(this.A03);
            this.A00 = this.A02.getHeight();
            this.A01 = this.A02.getWidth();
            this.A04.set(null);
            float f = 0.0f;
            if (this.A0A.height() * ((float) this.A01) > this.A0A.width() * ((float) this.A00)) {
                width = this.A0A.height() / ((float) this.A00);
                f = (this.A0A.width() - (((float) this.A01) * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = this.A0A.width() / ((float) this.A01);
                height = (this.A0A.height() - (((float) this.A00) * width)) * 0.5f;
            }
            this.A04.setScale(width, width);
            Matrix matrix = this.A04;
            RectF rectF = this.A0A;
            matrix.postTranslate(((float) ((int) (f + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
            this.A03.setLocalMatrix(this.A04);
            invalidate();
        }
    }
}
