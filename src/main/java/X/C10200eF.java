package X;

import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.lang.ref.WeakReference;

/* renamed from: X.0eF  reason: invalid class name and case insensitive filesystem */
public class C10200eF extends AnonymousClass0JW {
    public final AnonymousClass0BV A00 = AnonymousClass0BV.A00();
    public final AnonymousClass0MI A01;
    public final C02220Bc A02 = C02220Bc.A00();
    public final C02580Cq A03 = C02580Cq.A01();
    public final WeakReference A04;

    public C10200eF(MediaViewFragment mediaViewFragment, AnonymousClass0MI r3) {
        this.A04 = new WeakReference(mediaViewFragment);
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0;
        MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A04.get();
        if (mediaViewFragment != null && !C002001d.A3D(mediaViewFragment.AMs())) {
            AnonymousClass0MI r2 = this.A01;
            mediaViewFragment.A1C.A08(r2);
            PhotoView A0o = mediaViewFragment.A0o(r2.A0n);
            if (A0o != null && (runnableEBaseShape0S0310000_I0 = mediaViewFragment.A0O) != null) {
                runnableEBaseShape0S0310000_I0.A00(r2, A0o);
            }
        }
    }
}
