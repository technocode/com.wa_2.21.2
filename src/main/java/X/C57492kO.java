package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2kO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57492kO implements AnonymousClass37L {
    public final /* synthetic */ PhotoView A00;

    public /* synthetic */ C57492kO(PhotoView photoView) {
        this.A00 = photoView;
    }

    @Override // X.AnonymousClass37L
    public final void AIY(boolean z, int i) {
        PhotoView photoView = this.A00;
        if (i == 3) {
            photoView.setVisibility(8);
            photoView.setAlpha(0.0f);
        } else if (i == 1) {
            photoView.setVisibility(0);
            photoView.setAlpha(1.0f);
        }
    }
}
