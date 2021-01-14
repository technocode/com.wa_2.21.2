package X;

import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2kM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57472kM implements AbstractC669736q {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C72403Ss A01;

    public /* synthetic */ C57472kM(MediaViewFragment mediaViewFragment, C72403Ss r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    @Override // X.AbstractC669736q
    public final void ALl(int i) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (this.A01.A0G && mediaViewFragment.A0A() != null) {
            boolean z = false;
            if ((mediaViewFragment.A0B().getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) {
                z = true;
            }
            if (i == 0) {
                if (!z) {
                    mediaViewFragment.A10(true, true);
                }
            } else if (i == 4 && z) {
                mediaViewFragment.A10(false, true);
            }
        }
    }
}
