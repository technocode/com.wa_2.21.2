package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.whatsapp.crop.CropImage;

/* renamed from: X.2K6  reason: invalid class name */
public class AnonymousClass2K6 extends TouchDelegate {
    public final /* synthetic */ CropImage A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2K6(CropImage cropImage, Rect rect, View view) {
        super(rect, view);
        this.A00 = cropImage;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        CropImage cropImage = this.A00;
        float f = 0.0f;
        if (x < ((float) cropImage.A0G.getLeft())) {
            x = 0.0f;
        } else if (x > ((float) cropImage.A0G.getRight())) {
            x = (float) cropImage.A0G.getWidth();
        }
        float y = motionEvent.getY();
        if (y >= ((float) cropImage.A0G.getTop())) {
            if (y > ((float) cropImage.A0G.getBottom())) {
                f = (float) cropImage.A0G.getHeight();
            } else {
                f = y;
            }
        }
        motionEvent.setLocation(x, f);
        cropImage.A0G.dispatchTouchEvent(motionEvent);
        return true;
    }
}
