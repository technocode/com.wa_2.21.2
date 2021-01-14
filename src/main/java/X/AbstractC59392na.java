package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.whatsapp.crop.CropImageView;
import java.util.ArrayList;

/* renamed from: X.2na  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC59392na extends C08490bD {
    public float A00 = 3.0f;
    public float A01;
    public int A02 = -1;
    public int A03 = -1;
    public AnonymousClass2K9 A04;
    public Runnable A05;
    public final Matrix A06 = new Matrix();
    public final Matrix A07 = new Matrix();
    public final Matrix A08 = new Matrix();
    public final Handler A09 = new Handler(Looper.getMainLooper());
    public final AnonymousClass2KA A0A = new AnonymousClass2KA(null);
    public final float[] A0B = new float[9];

    public AbstractC59392na(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r1 < r2) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC59392na.A00():void");
    }

    public void A01(float f, float f2) {
        if (!(this instanceof CropImageView)) {
            this.A08.postTranslate(f, f2);
            return;
        }
        CropImageView cropImageView = (CropImageView) this;
        cropImageView.A08.postTranslate(f, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = cropImageView.A05;
            if (i < arrayList.size()) {
                AnonymousClass2K7 r1 = (AnonymousClass2K7) arrayList.get(i);
                r1.A03.postTranslate(f, f2);
                r1.A04 = r1.A02();
                i++;
            } else {
                return;
            }
        }
    }

    public void A02(float f, float f2, float f3) {
        float f4 = this.A01;
        if (f > f4) {
            f = f4;
        }
        float scale = f / getScale();
        this.A08.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        A00();
    }

    public final void A03(AnonymousClass2KA r10, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float A012 = (float) r10.A01();
        float A002 = (float) r10.A00();
        matrix.reset();
        float f = this.A00;
        float min = Math.min(Math.min(width / A012, f), Math.min(height / A002, f));
        Matrix matrix2 = new Matrix();
        if (r10.A01 != null) {
            matrix2.preTranslate((float) (-(r10.A00.getWidth() >> 1)), (float) (-(r10.A00.getHeight() >> 1)));
            matrix2.postConcat(r10.A01);
            matrix2.postTranslate((float) (r10.A01() >> 1), (float) (r10.A00() >> 1));
        }
        matrix.postConcat(matrix2);
        matrix.postScale(min, min);
        matrix.postTranslate((width - (A012 * min)) / 2.0f, (height - (A002 * min)) / 2.0f);
    }

    public void A04(AnonymousClass2KA r5, boolean z) {
        if (getWidth() <= 0) {
            this.A05 = new RunnableEBaseShape1S0210000_I1(this, r5, z, 4);
            return;
        }
        if (r5.A00 != null) {
            A03(r5, this.A06);
            Bitmap bitmap = r5.A00;
            Matrix matrix = r5.A01;
            super.setImageBitmap(bitmap);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setDither(true);
                drawable.setFilterBitmap(true);
            }
            AnonymousClass2KA r0 = this.A0A;
            r0.A00 = bitmap;
            r0.A01 = matrix;
        } else {
            this.A06.reset();
            super.setImageBitmap(null);
        }
        if (z) {
            this.A08.reset();
        }
        setImageMatrix(getImageViewMatrix());
        AnonymousClass2KA r1 = this.A0A;
        float f = 1.0f;
        if (r1.A00 != null) {
            f = Math.max(1.0f, Math.max(((float) r1.A01()) / ((float) this.A03), ((float) r1.A00()) / ((float) this.A02)) * 4.0f);
        }
        this.A01 = f;
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.A07;
        matrix.set(this.A06);
        matrix.postConcat(this.A08);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.A08;
        float[] fArr = this.A0B;
        matrix.getValues(fArr);
        return fArr[0];
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        A02(1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A03 = i3 - i;
        this.A02 = i4 - i2;
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.A05 = null;
            runnable.run();
        }
        AnonymousClass2KA r1 = this.A0A;
        if (r1.A00 != null) {
            A03(r1, this.A06);
            setImageMatrix(getImageViewMatrix());
        }
    }

    @Override // X.C08490bD
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            A04(new AnonymousClass2KA(bitmap), true);
        }
    }

    public void setMaxProperScale(float f) {
        this.A00 = f;
    }

    public void setRecycler(AnonymousClass2K9 r1) {
        this.A04 = r1;
    }
}
