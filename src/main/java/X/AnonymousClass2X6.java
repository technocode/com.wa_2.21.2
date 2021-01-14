package X;

import com.whatsapp.ui.media.MediaCard;
import java.lang.ref.WeakReference;

/* renamed from: X.2X6  reason: invalid class name */
public class AnonymousClass2X6 extends AnonymousClass0JW {
    public final C04080Iy A00 = new C04080Iy();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final C47892Kc A02 = C47892Kc.A00();
    public final C02070An A03 = C02070An.A00();
    public final AnonymousClass0BV A04 = AnonymousClass0BV.A00();
    public final AnonymousClass02N A05;
    public final WeakReference A06;

    public AnonymousClass2X6(MediaCard mediaCard, AnonymousClass02N r3) {
        this.A06 = new WeakReference(mediaCard);
        this.A05 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        MediaCard mediaCard = (MediaCard) this.A06.get();
        if (mediaCard != null) {
            mediaCard.setMediaInfo(this.A01.A0G().format(obj));
        }
    }
}
