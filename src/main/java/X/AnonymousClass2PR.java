package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.2PR  reason: invalid class name */
public class AnonymousClass2PR implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public AnonymousClass2PR(float f, float f2, float f3, float f4) {
        StringBuilder sb = new StringBuilder("ReducedAreaOnTouchListener/ignored_ratio -- left: ");
        sb.append(f);
        sb.append(", right: ");
        sb.append(f3);
        sb.append(", top: ");
        sb.append(f2);
        sb.append(", bottom: ");
        sb.append(f4);
        Log.i(sb.toString());
        if (f < 0.0f || f > 1.0f || f3 < 0.0f || f3 > 1.0f || f2 < 0.0f || f2 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
            throw new RuntimeException("invalid input parameters");
        }
        this.A01 = f;
        this.A02 = f3;
        this.A03 = f2;
        this.A00 = f4;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
            StringBuilder sb = new StringBuilder("ReducedAreaOnTouchListener/onTouch ");
            sb.append(motionEvent);
            sb.append(", view width:");
            sb.append(width);
            sb.append(", view height:");
            sb.append(height);
            sb.append(", pointer count: ");
            sb.append(motionEvent.getPointerCount());
            Log.i(sb.toString());
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float f = (float) width;
        if (motionEvent.getX() >= this.A01 * f) {
            float f2 = (float) height;
            if (motionEvent.getY() >= this.A03 * f2 && motionEvent.getX() <= (1.0f - this.A02) * f && motionEvent.getY() <= (1.0f - this.A00) * f2) {
                return false;
            }
        }
        Log.i("ReducedAreaOnTouchListener/ignore this touch event");
        return true;
    }
}
