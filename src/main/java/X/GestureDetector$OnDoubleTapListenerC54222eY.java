package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewFragment;

/* renamed from: X.2eY  reason: invalid class name and case insensitive filesystem */
public class GestureDetector$OnDoubleTapListenerC54222eY implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ MediaPreviewFragment A00;

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetector$OnDoubleTapListenerC54222eY(MediaPreviewFragment mediaPreviewFragment) {
        this.A00 = mediaPreviewFragment;
    }

    public void A00() {
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        AnonymousClass2PF r0 = (AnonymousClass2PF) mediaPreviewFragment.A0A();
        if (r0 != null) {
            r0.AG4();
        }
        mediaPreviewFragment.A01.A04.setEnabled(true);
    }

    public void A01() {
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        AnonymousClass2PF r0 = (AnonymousClass2PF) mediaPreviewFragment.A0A();
        if (r0 != null) {
            r0.AG5();
        }
        mediaPreviewFragment.A01.A04.setEnabled(false);
    }

    public void A02() {
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        AnonymousClass2PF r2 = (AnonymousClass2PF) mediaPreviewFragment.A0A();
        if (r2 != null) {
            r2.AOF(mediaPreviewFragment.A00, mediaPreviewFragment.A02.A02);
        }
    }

    public boolean A03(float f, float f2) {
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        DoodleView doodleView = mediaPreviewFragment.A01.A04;
        int[] iArr = mediaPreviewFragment.A0I;
        doodleView.getLocationOnScreen(iArr);
        float f3 = f - ((float) iArr[0]);
        float f4 = f2 - ((float) iArr[1]);
        if (f3 < 0.0f || f3 > ((float) doodleView.getWidth()) || f4 < 0.0f || f4 > ((float) doodleView.getHeight()) || !mediaPreviewFragment.A01.A06(f3, f4)) {
            return false;
        }
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!(this instanceof C59782oH)) {
            return false;
        }
        ImagePreviewFragment imagePreviewFragment = ((C59782oH) this).A00;
        boolean onDoubleTap = imagePreviewFragment.A00.A04.onDoubleTap(motionEvent);
        if (onDoubleTap) {
            ((MediaPreviewFragment) imagePreviewFragment).A02.A07(true);
        }
        return onDoubleTap;
    }
}
