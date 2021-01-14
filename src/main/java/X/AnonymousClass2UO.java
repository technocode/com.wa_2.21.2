package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.2UO  reason: invalid class name */
public abstract class AnonymousClass2UO implements View.OnTouchListener {
    public final Matrix A00 = new Matrix();
    public final AnonymousClass1MC A01;
    public final PhotoView A02;
    public final AnonymousClass0M3 A03;

    public AnonymousClass2UO(AnonymousClass1MC r2, AnonymousClass0M3 r3, PhotoView photoView) {
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = photoView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            PhotoView photoView = this.A02;
            Bitmap photo = photoView.getPhoto();
            if (photo != null) {
                Matrix imageMatrix = photoView.getImageMatrix();
                Matrix matrix = this.A00;
                imageMatrix.invert(matrix);
                float[] fArr = {motionEvent.getRawX() - ((float) photoView.getLeft()), motionEvent.getRawY() - ((float) photoView.getTop())};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A002 = AnonymousClass1MC.A00(this.A03, fArr, fArr2);
                if (A002 != null) {
                    if (this instanceof C57602kZ) {
                        C57602kZ r2 = (C57602kZ) this;
                        MediaViewFragment.A05(r2.A00, A002, r2.A01);
                        return true;
                    } else if (!(this instanceof C57592kY)) {
                        C57572kW r22 = (C57572kW) this;
                        MediaViewFragment.A05(r22.A00, A002, r22.A01);
                        return true;
                    } else {
                        C57592kY r23 = (C57592kY) this;
                        MediaViewFragment.A05(r23.A00, A002, r23.A01);
                        return true;
                    }
                }
            }
            if (this instanceof C57602kZ) {
                C57602kZ r4 = (C57602kZ) this;
                if (motionEvent.getActionMasked() == 1) {
                    ExoPlaybackControlView exoPlaybackControlView = r4.A02;
                    if (exoPlaybackControlView.A07()) {
                        exoPlaybackControlView.A00();
                        return true;
                    }
                    exoPlaybackControlView.A01();
                    exoPlaybackControlView.A06(3000);
                    return true;
                }
            } else if (!(this instanceof C57592kY)) {
                C57572kW r42 = (C57572kW) this;
                if (motionEvent.getActionMasked() == 1) {
                    MediaViewFragment mediaViewFragment = r42.A00;
                    if (((MediaViewBaseFragment) mediaViewFragment).A0G) {
                        mediaViewFragment.A10(false, true);
                    } else {
                        mediaViewFragment.A10(true, true);
                        return true;
                    }
                }
            } else {
                C57592kY r43 = (C57592kY) this;
                if (motionEvent.getActionMasked() == 1) {
                    ExoPlaybackControlView exoPlaybackControlView2 = r43.A02;
                    if (exoPlaybackControlView2.A07()) {
                        exoPlaybackControlView2.A00();
                        return true;
                    }
                    exoPlaybackControlView2.A01();
                    exoPlaybackControlView2.A06(3000);
                    return true;
                }
            }
        }
        return true;
    }
}
