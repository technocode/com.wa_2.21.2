package X;

import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2oI  reason: invalid class name and case insensitive filesystem */
public class C59792oI extends AbstractC08510bF {
    public AnonymousClass037 A00;
    public AnonymousClass0LW A01;
    public AnonymousClass0QC A02;
    public final C015008i A03 = new C015008i();
    public final /* synthetic */ MediaPreviewActivity A04;

    public C59792oI(MediaPreviewActivity mediaPreviewActivity, AnonymousClass0LW r3) {
        this.A04 = mediaPreviewActivity;
        this.A01 = r3;
    }

    public final int A0G(int i) {
        MediaPreviewActivity mediaPreviewActivity = this.A04;
        return !((AnonymousClass2C0) mediaPreviewActivity).A01.A0M() ? (mediaPreviewActivity.A0T.size() - i) - 1 : i;
    }
}
