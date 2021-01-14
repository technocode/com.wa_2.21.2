package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2UF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2UF implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ C72403Ss A01;

    public /* synthetic */ AnonymousClass2UF(MediaViewFragment mediaViewFragment, C72403Ss r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public final void onSystemUiVisibilityChange(int i) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (!this.A01.A0G) {
            return;
        }
        if ((i & 4) == 0) {
            mediaViewFragment.A10(true, false);
        } else {
            mediaViewFragment.A10(false, false);
        }
    }
}
