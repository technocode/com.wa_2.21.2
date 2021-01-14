package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2pr  reason: invalid class name and case insensitive filesystem */
public class C60642pr extends PhotoView {
    public final /* synthetic */ MediaViewFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60642pr(MediaViewFragment mediaViewFragment, Context context) {
        super(context);
        this.A00 = mediaViewFragment;
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public boolean onDoubleTap(MotionEvent motionEvent) {
        MediaViewFragment mediaViewFragment = this.A00;
        boolean z = false;
        if (((PhotoView) this).A00 != this.A04) {
            z = true;
        }
        mediaViewFragment.A10(z, true);
        return super.onDoubleTap(motionEvent);
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A00.A10(false, true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
        MediaViewFragment mediaViewFragment = this.A00;
        boolean z = false;
        if (((PhotoView) this).A00 <= this.A04) {
            z = true;
        }
        mediaViewFragment.A10(z, true);
    }
}
