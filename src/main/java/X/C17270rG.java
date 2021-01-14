package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.0rG  reason: invalid class name and case insensitive filesystem */
public class C17270rG {
    public static final boolean A00;
    public static final boolean A01;
    public static final boolean A02;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        boolean z2 = false;
        if (i >= 19) {
            z2 = true;
        }
        A00 = z2;
        boolean z3 = false;
        if (i >= 18) {
            z3 = true;
        }
        A01 = z3;
        if (i < 28) {
            z = false;
        }
        A02 = z;
    }

    public static View A00(ViewGroup viewGroup, View view, View view2) {
        boolean z;
        boolean z2;
        ViewGroup viewGroup2;
        int i;
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C17350rO r0 = C17340rN.A04;
        r0.A05(view, matrix);
        r0.A06(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (A00) {
            z = !view.isAttachedToWindow();
            if (viewGroup != null) {
                z2 = viewGroup.isAttachedToWindow();
            }
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = A01;
        Bitmap bitmap = null;
        if (!z3 || !z) {
            viewGroup2 = null;
            i = 0;
        } else {
            if (z2) {
                viewGroup2 = (ViewGroup) view.getParent();
                i = viewGroup2.indexOfChild(view);
                viewGroup.getOverlay().add(view);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
            int round7 = Math.round(((float) round5) * min);
            int round8 = Math.round(((float) round6) * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (A02) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round7, round8);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}
