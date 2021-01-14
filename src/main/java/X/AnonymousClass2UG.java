package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.Collections;

/* renamed from: X.2UG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2UG implements View.OnLongClickListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ AnonymousClass2UG(MediaViewFragment mediaViewFragment, AnonymousClass0M3 r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public final boolean onLongClick(View view) {
        MediaViewFragment mediaViewFragment = this.A00;
        AbstractC51922aG.A00(Collections.singleton(this.A01), mediaViewFragment.A0B(), mediaViewFragment.A0a, mediaViewFragment.A0d, mediaViewFragment.A0c, mediaViewFragment.A0l, mediaViewFragment.A0v, mediaViewFragment.A0q, mediaViewFragment.A0o, mediaViewFragment.A19);
        return true;
    }
}
