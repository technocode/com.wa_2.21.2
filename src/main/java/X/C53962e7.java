package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.gallerypicker.VideoPreviewFragment;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.2e7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53962e7 implements AnonymousClass2PK {
    public final /* synthetic */ VideoPreviewFragment A00;
    public final /* synthetic */ VideoSurfaceView A01;

    public /* synthetic */ C53962e7(VideoPreviewFragment videoPreviewFragment, VideoSurfaceView videoSurfaceView) {
        this.A00 = videoPreviewFragment;
        this.A01 = videoSurfaceView;
    }

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void A2A() {
    }

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    @Override // X.AnonymousClass2PK
    public final void AKg(Bitmap bitmap, boolean z) {
        VideoPreviewFragment videoPreviewFragment = this.A00;
        VideoSurfaceView videoSurfaceView = this.A01;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        AnonymousClass008.A0y("videoview/setVideoDimensions: ", width, "x", height);
        videoSurfaceView.A08 = width;
        videoSurfaceView.A07 = height;
        videoSurfaceView.setBackgroundDrawable(new BitmapDrawable(videoPreviewFragment.A02(), bitmap));
    }
}
