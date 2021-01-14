package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2kG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57412kG implements AnonymousClass37J {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass37M A01;

    public /* synthetic */ C57412kG(MediaViewFragment mediaViewFragment, AnonymousClass37M r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass37J
    public final void AFe(String str, boolean z) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass37M r4 = this.A01;
        if (mediaViewFragment.A0A() != null) {
            mediaViewFragment.A0a.A0B(mediaViewFragment.AMs(), mediaViewFragment.A0v.A06(R.string.unable_to_play_gif));
        }
        r4.A08();
    }
}
