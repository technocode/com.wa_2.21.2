package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2kD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57382kD implements AnonymousClass37L {
    public final /* synthetic */ View A00;
    public final /* synthetic */ MediaViewFragment A01;
    public final /* synthetic */ PhotoView A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C57382kD(MediaViewFragment mediaViewFragment, View view, PhotoView photoView, boolean z) {
        this.A01 = mediaViewFragment;
        this.A00 = view;
        this.A02 = photoView;
        this.A03 = z;
    }

    @Override // X.AnonymousClass37L
    public final void AIY(boolean z, int i) {
        MediaViewFragment mediaViewFragment = this.A01;
        View view = this.A00;
        PhotoView photoView = this.A02;
        boolean z2 = this.A03;
        if (mediaViewFragment.A0A() != null) {
            if (i != 3 || !z) {
                mediaViewFragment.A0B().getWindow().clearFlags(128);
            } else {
                mediaViewFragment.A0B().getWindow().addFlags(128);
                view.setVisibility(8);
                photoView.setVisibility(8);
                photoView.setAlpha(0.0f);
                if (z && !((MediaViewBaseFragment) mediaViewFragment).A0G && MediaViewBaseFragment.A0H && (mediaViewFragment.A0B().getWindow().getDecorView().getSystemUiVisibility() & 2) == 0) {
                    mediaViewFragment.A0B().getWindow().getDecorView().setSystemUiVisibility(mediaViewFragment.A0B().getWindow().getDecorView().getSystemUiVisibility() | 2);
                    return;
                }
                return;
            }
        }
        if (i != 3) {
            if (i == 1 && !z2) {
                photoView.setVisibility(0);
                photoView.setAlpha(1.0f);
                return;
            }
            return;
        }
        view.setVisibility(8);
        photoView.setVisibility(8);
        photoView.setAlpha(0.0f);
        if (z) {
        }
    }
}
