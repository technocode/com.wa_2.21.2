package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.0mI  reason: invalid class name and case insensitive filesystem */
public class SharedElementCallbackC14450mI extends SharedElementCallback {
    public final AbstractC14640md A00;

    public SharedElementCallbackC14450mI(AbstractC14640md r1) {
        this.A00 = r1;
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Bitmap createBitmap;
        AbstractC14640md r12 = this.A00;
        if (r12 != null) {
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
                        if (!(drawable instanceof BitmapDrawable) || min != 1.0f) {
                            int i = (int) (((float) intrinsicWidth) * min);
                            int i2 = (int) (((float) intrinsicHeight) * min);
                            createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i3 = bounds.left;
                            int i4 = bounds.top;
                            int i5 = bounds.right;
                            int i6 = bounds.bottom;
                            drawable.setBounds(0, 0, i, i2);
                            drawable.draw(canvas);
                            drawable.setBounds(i3, i4, i5, i6);
                        } else {
                            createBitmap = ((BitmapDrawable) drawable).getBitmap();
                        }
                        if (createBitmap != null) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("sharedElement:snapshot:bitmap", createBitmap);
                            bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                            if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                                float[] fArr = new float[9];
                                imageView.getImageMatrix().getValues(fArr);
                                bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                            }
                            return bundle;
                        }
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round <= 0 || round2 <= 0) {
                return null;
            }
            float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int i7 = (int) (((float) round) * min2);
            int i8 = (int) (((float) round2) * min2);
            Matrix matrix2 = r12.A00;
            if (matrix2 == null) {
                matrix2 = new Matrix();
                r12.A00 = matrix2;
            }
            matrix2.set(matrix);
            r12.A00.postTranslate(-rectF.left, -rectF.top);
            r12.A00.postScale(min2, min2);
            Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.concat(r12.A00);
            view.draw(canvas2);
            return createBitmap2;
        }
        throw null;
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        ImageView imageView = null;
        if (this.A00 != null) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (bitmap != null) {
                    imageView = new ImageView(context);
                    imageView.setImageBitmap(bitmap);
                    imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                    if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                        float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                        Matrix matrix = new Matrix();
                        matrix.setValues(floatArray);
                        imageView.setImageMatrix(matrix);
                    }
                }
            } else if (parcelable instanceof Bitmap) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageBitmap((Bitmap) parcelable);
                return imageView2;
            }
            return imageView;
        }
        throw null;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(List list, Map map) {
        this.A00.A00(list, map);
    }

    @Override // android.app.SharedElementCallback
    public void onRejectSharedElements(List list) {
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(List list, List list2, List list3) {
        AbstractC14640md r1 = this.A00;
        if (r1 instanceof C51682Zr) {
            ActivityC004802g r12 = ((C51682Zr) r1).A00;
            if (r12 != null) {
                AnonymousClass0TX.A0G(r12, null);
                return;
            }
            throw null;
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(List list, List list2, List list3) {
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        if (this.A00 != null) {
            onSharedElementsReadyListener.onSharedElementsReady();
            return;
        }
        throw null;
    }
}
