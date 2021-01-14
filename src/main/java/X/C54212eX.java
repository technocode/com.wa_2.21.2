package X;

import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewFragment;

/* renamed from: X.2eX  reason: invalid class name and case insensitive filesystem */
public class C54212eX {
    public final /* synthetic */ MediaPreviewFragment A00;

    public C54212eX(MediaPreviewFragment mediaPreviewFragment) {
        this.A00 = mediaPreviewFragment;
    }

    public void A00() {
        if (!(this instanceof C59772oG)) {
            this.A00.A02.A01();
            return;
        }
        ImagePreviewFragment imagePreviewFragment = ((C59772oG) this).A00;
        AnonymousClass2PX r0 = imagePreviewFragment.A00.A04;
        if (r0.A00 <= r0.A03) {
            ((MediaPreviewFragment) imagePreviewFragment).A02.A01();
        }
    }

    public void A01() {
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        ((AnonymousClass2PF) mediaPreviewFragment.A0A()).AFD();
        mediaPreviewFragment.A02.A07(true);
    }

    public void A02() {
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        ((AnonymousClass2PF) mediaPreviewFragment.A0A()).AFE();
        if (!mediaPreviewFragment.A01.A0D.A05()) {
            mediaPreviewFragment.A02.A01();
        }
    }

    public void A03() {
        MediaPreviewFragment mediaPreviewFragment = this.A00;
        AnonymousClass2OT r0 = mediaPreviewFragment.A02;
        boolean A0A = r0.A0A();
        boolean A0B = r0.A0B();
        if (!A0A || !A0B) {
            mediaPreviewFragment.A02.A07(true);
        } else {
            mediaPreviewFragment.A02.A08(false);
        }
        ((AnonymousClass2PF) mediaPreviewFragment.A0A()).AL2(mediaPreviewFragment.A02.A0I);
    }
}
