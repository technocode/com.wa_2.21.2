package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2kK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57452kK implements AnonymousClass37J {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass0ML A01;
    public final /* synthetic */ C72403Ss A02;

    public /* synthetic */ C57452kK(MediaViewFragment mediaViewFragment, AnonymousClass0ML r2, C72403Ss r3) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass37J
    public final void AFe(String str, boolean z) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass0ML r3 = this.A01;
        C72403Ss r2 = this.A02;
        if (str == null) {
            str = mediaViewFragment.A0v.A06(R.string.unable_to_finish_download);
        }
        if (!z) {
            AnonymousClass0M4 r1 = ((AnonymousClass0M3) r3).A02;
            if (r1 != null) {
                r1.A0Z = false;
                r2.A08();
                ActivityC004902h A0A = mediaViewFragment.A0A();
                if (A0A != null && !A0A.isFinishing()) {
                    AnonymousClass0MB r32 = new AnonymousClass0MB(mediaViewFragment.A01());
                    AnonymousClass0MC r22 = r32.A01;
                    r22.A0E = str;
                    AnonymousClass01X r12 = mediaViewFragment.A0v;
                    r22.A0I = r12.A06(R.string.download_failed);
                    r32.A07(r12.A06(R.string.exit), new AnonymousClass2UD(mediaViewFragment));
                    r32.A00().show();
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
