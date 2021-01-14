package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.29x  reason: invalid class name and case insensitive filesystem */
public class C463929x extends PhotoView {
    public final /* synthetic */ C42381wc A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C463929x(C42381wc r1, Context context) {
        super(context);
        this.A00 = r1;
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public boolean onDoubleTap(MotionEvent motionEvent) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00.A00;
        boolean z = false;
        if (((PhotoView) this).A00 != this.A04) {
            z = true;
        }
        catalogMediaViewFragment.A10(z, true);
        return super.onDoubleTap(motionEvent);
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A00.A00.A10(false, true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00.A00;
        boolean z = false;
        if (((PhotoView) this).A00 <= this.A04) {
            z = true;
        }
        catalogMediaViewFragment.A10(z, true);
    }
}
