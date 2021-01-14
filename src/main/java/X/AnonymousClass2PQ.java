package X;

import android.view.View;
import com.whatsapp.gallerypicker.VideoPreviewFragment;

/* renamed from: X.2PQ  reason: invalid class name */
public class AnonymousClass2PQ implements View.OnAttachStateChangeListener {
    public final /* synthetic */ VideoPreviewFragment A00;

    public void onViewAttachedToWindow(View view) {
    }

    public AnonymousClass2PQ(VideoPreviewFragment videoPreviewFragment) {
        this.A00 = videoPreviewFragment;
    }

    public void onViewDetachedFromWindow(View view) {
        if (view != null) {
            VideoPreviewFragment videoPreviewFragment = this.A00;
            view.removeCallbacks(videoPreviewFragment.A0Z);
            view.removeOnAttachStateChangeListener(videoPreviewFragment.A0P);
        }
    }
}
