package X;

import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2kF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57402kF implements AnonymousClass2US {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C57402kF(MediaViewFragment mediaViewFragment, AnonymousClass0M3 r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass2US
    public final void ALF(boolean z) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass0M3 r3 = this.A01;
        AnonymousClass02M r2 = mediaViewFragment.A0a;
        r2.A02.post(new RunnableEBaseShape1S0210000_I1(mediaViewFragment, r3, z, 7));
    }
}
