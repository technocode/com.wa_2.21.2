package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.2MM  reason: invalid class name */
public class AnonymousClass2MM {
    public Context A00;
    public View A01;
    public PopupWindow A02;
    public AnonymousClass1MC A03;
    public C02770Dj A04;

    public AnonymousClass2MM(Context context, C02770Dj r5, AnonymousClass1MC r6, ViewGroup viewGroup) {
        this.A02 = new PopupWindow(context);
        this.A00 = context;
        this.A04 = r5;
        this.A03 = r6;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            this.A01 = layoutInflater.inflate(R.layout.tool_tip_view, viewGroup, false);
            return;
        }
        throw null;
    }

    public boolean A00(PhotoView photoView, InteractiveAnnotation interactiveAnnotation, PopupWindow.OnDismissListener onDismissListener) {
        double d;
        Bitmap photo = photoView.getPhoto();
        if (photo == null) {
            return false;
        }
        float height = (float) photo.getHeight();
        float[] fArr = {(float) photo.getWidth(), height};
        if (this.A03 != null) {
            SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
            SerializablePoint serializablePoint = serializablePointArr[0];
            double d2 = serializablePoint.x;
            double d3 = (double) fArr[0];
            double d4 = d2 * d3;
            double d5 = serializablePoint.y;
            double d6 = (double) height;
            double d7 = d5 * d6;
            SerializablePoint serializablePoint2 = serializablePointArr[1];
            double d8 = serializablePoint2.x * d3;
            double d9 = serializablePoint2.y * d6;
            SerializablePoint serializablePoint3 = serializablePointArr[2];
            double d10 = serializablePoint3.x * d3;
            double d11 = serializablePoint3.y * d6;
            SerializablePoint serializablePoint4 = serializablePointArr[3];
            double d12 = serializablePoint4.x * d3;
            double d13 = serializablePoint4.y * d6;
            double d14 = (d4 + d10) / 2.0d;
            double d15 = (d7 + d11) / 2.0d;
            if (d8 <= d14 && d14 <= d10) {
                double d16 = d8 - d10;
                if (d16 != 0.0d) {
                    d = d9 - (((d8 - d14) * (d9 - d11)) / d16);
                } else {
                    d = d15;
                }
            } else if (d10 <= d14 && d14 <= d12) {
                double d17 = d10 - d12;
                if (d17 != 0.0d) {
                    d = d11 - (((d10 - d14) * (d11 - d13)) / d17);
                } else {
                    d = d15;
                }
            } else if (d12 > d14 || d14 > d4) {
                double d18 = d4 - d8;
                if (d18 != 0.0d) {
                    d = d7 - (((d4 - d14) * (d7 - d9)) / d18);
                } else {
                    d = d15;
                }
            } else {
                double d19 = d12 - d4;
                if (d19 != 0.0d) {
                    d = d13 - (((d12 - d14) * (d13 - d7)) / d19);
                } else {
                    d = d15;
                }
            }
            float[] fArr2 = {(float) d14, (float) d};
            photoView.getImageMatrix().mapPoints(fArr2);
            fArr2[0] = fArr2[0] + ((float) photoView.getLeft());
            fArr2[1] = fArr2[1] + ((float) photoView.getTop());
            View rootView = photoView.getRootView();
            int i = (int) fArr2[0];
            int i2 = (int) fArr2[1];
            this.A02.setHeight(-2);
            this.A02.setWidth(-2);
            this.A02.setOutsideTouchable(true);
            this.A02.setTouchable(true);
            this.A02.setFocusable(true);
            this.A02.setBackgroundDrawable(new BitmapDrawable());
            this.A02.setContentView(this.A01);
            this.A01.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            C002301g.A03((TextView) this.A01.findViewById(R.id.tooltip_text));
            this.A01.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, interactiveAnnotation, 27));
            this.A02.setOnDismissListener(onDismissListener);
            this.A02.setAnimationStyle(R.style.location_sticker_popup);
            this.A02.showAtLocation(rootView, 0, i - (this.A01.getMeasuredWidth() / 2), (int) (((float) i2) - (((float) this.A01.getMeasuredHeight()) * 0.82f)));
            return true;
        }
        throw null;
    }
}
