package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.2E4  reason: invalid class name */
public class AnonymousClass2E4 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public final ScaleGestureDetector A01;
    public final C14890n3 A02;
    public final AnonymousClass2WX A03;

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public AnonymousClass2E4(Context context, AnonymousClass2WX r3) {
        this.A02 = new C14890n3(context, this);
        this.A01 = new ScaleGestureDetector(context, this);
        this.A03 = r3;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        AnonymousClass2WX r0 = this.A03;
        motionEvent.getX();
        motionEvent.getY();
        r0.A00.A0N.ACO();
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = this.A00 * scaleFactor * scaleFactor;
        this.A00 = f;
        if (f < 1.0f) {
            this.A00 = 1.0f;
            f = 1.0f;
        }
        StringBuilder A0S = AnonymousClass008.A0S("cameraview/on-scale ");
        A0S.append(f);
        Log.d(A0S.toString());
        AnonymousClass2WX r0 = this.A03;
        float f2 = this.A00;
        AnonymousClass0YW r4 = r0.A00;
        float maxScale = r4.A0S.getMaxScale();
        if (maxScale >= 1.0f) {
            if (f2 > maxScale) {
                f2 = maxScale;
            }
            int APS = r4.A0N.APS(Math.round(((f2 - 1.0f) * ((float) r4.A0N.getMaxZoom())) / (maxScale - 1.0f)));
            if (!r4.A0N.ABT()) {
                AnonymousClass2ET r5 = r4.A0S;
                r5.A00 = f2;
                r5.A01 = r5.A05.A0D(R.string.camera_zoom_value, Float.valueOf(((float) APS) / 100.0f));
                r5.invalidate();
            }
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        StringBuilder A0S = AnonymousClass008.A0S("cameraview/on-scale-begin ");
        A0S.append(this.A00);
        Log.d(A0S.toString());
        AnonymousClass2WX r0 = this.A03;
        float f = this.A00;
        AnonymousClass0YW r3 = r0.A00;
        if (!r3.A0N.ABT()) {
            AnonymousClass2ET r1 = r3.A0S;
            r1.setVisibility(0);
            r1.A00 = f;
            r1.invalidate();
            r1.removeCallbacks(r1.A06);
        } else {
            r3.A0S.setVisibility(4);
        }
        if (!r3.A1O.isEmpty()) {
            return true;
        }
        r3.A0N(false);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        StringBuilder A0S = AnonymousClass008.A0S("cameraview/on-scale-end ");
        A0S.append(this.A00);
        Log.d(A0S.toString());
        AnonymousClass2ET r3 = this.A03.A00.A0S;
        r3.invalidate();
        r3.postDelayed(r3.A06, 300);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        AnonymousClass2WX r0 = this.A03;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AnonymousClass0YW r1 = r0.A00;
        r1.A0N.A4K(x, y);
        r1.A0N.A2j();
        if (!r1.A1O.isEmpty()) {
            return true;
        }
        r1.A0N(false);
        return true;
    }
}
