package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.2ZV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZV implements AnonymousClass33F {
    public final /* synthetic */ AnonymousClass0M4 A00;
    public final /* synthetic */ AnonymousClass2IK A01;
    public final /* synthetic */ AnonymousClass0ZE A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass2ZV(AnonymousClass2IK r1, AnonymousClass0M4 r2, AnonymousClass0ZE r3, boolean z) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = z;
    }

    @Override // X.AnonymousClass33F
    public final void AKW(boolean z) {
        StickerView stickerView;
        AnonymousClass2IK r4 = this.A01;
        AnonymousClass0M4 r3 = this.A00;
        AnonymousClass0ZE r2 = this.A02;
        boolean z2 = this.A03;
        if (!z) {
            r3.A0X = true;
            r4.A04(r2, z2);
            r4.A00();
            return;
        }
        if (r4.A08 || r4.A0E.A0D(AbstractC000400g.A1k)) {
            stickerView = r4.A0M;
            stickerView.A00 = r4.A01;
            stickerView.A00();
        } else {
            stickerView = r4.A0M;
            if (stickerView.A02) {
                stickerView.A00();
            }
            stickerView.A00 = r4.A00;
        }
        stickerView.setOnClickListener(r4.A09);
    }
}
