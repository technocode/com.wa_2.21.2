package X;

import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewFragment;

/* renamed from: X.2oH  reason: invalid class name and case insensitive filesystem */
public class C59782oH extends GestureDetector$OnDoubleTapListenerC54222eY {
    public final /* synthetic */ ImagePreviewFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59782oH(ImagePreviewFragment imagePreviewFragment) {
        super(imagePreviewFragment);
        this.A00 = imagePreviewFragment;
    }

    @Override // X.GestureDetector$OnDoubleTapListenerC54222eY
    public void A00() {
        super.A00();
        this.A00.A00.A04.A0W = true;
    }

    @Override // X.GestureDetector$OnDoubleTapListenerC54222eY
    public void A01() {
        super.A01();
        AnonymousClass2PX r2 = this.A00.A00.A04;
        r2.A0W = false;
        r2.A0A.set(r2.A0B);
        r2.A00 = r2.A05;
        r2.A0K.A00(r2.A0A);
    }

    @Override // X.GestureDetector$OnDoubleTapListenerC54222eY
    public void A02() {
        super.A02();
        ImagePreviewFragment imagePreviewFragment = this.A00;
        if (imagePreviewFragment.A0U()) {
            if (imagePreviewFragment.A0A() != null && imagePreviewFragment.A01.getDrawable() == null) {
                ActivityC004902h A0A = imagePreviewFragment.A0A();
                if (A0A != null) {
                    AnonymousClass0TX.A0E(A0A);
                } else {
                    throw null;
                }
            }
            imagePreviewFragment.A01.A06(((MediaPreviewFragment) imagePreviewFragment).A02.A04);
        }
    }
}
