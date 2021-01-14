package X;

import com.whatsapp.util.Log;

/* renamed from: X.3aa  reason: invalid class name and case insensitive filesystem */
public class C74293aa implements AnonymousClass37K {
    public final C007303n A00;
    public final /* synthetic */ AnonymousClass377 A01;

    public C74293aa(AnonymousClass377 r1, C007303n r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass37K
    public void AKK(AnonymousClass37M r7) {
        C007303n r1 = this.A00;
        AnonymousClass377 r5 = this.A01;
        if (r1 != r5.A09 || r5.A0B == null) {
            Log.d("InlineVideoPlaybackHandler/startInlinePlayback onStart squashed, incorrect rowKey");
            return;
        }
        AnonymousClass374 r12 = r5.A0A;
        AnonymousClass37M r0 = r12.A05;
        if (r0 != null) {
            r12.A0T.setText(C28051Sr.A18(r12.A0Z, r12.A0a, (long) r0.A02()));
        }
        AnonymousClass374 r2 = r5.A0A;
        r2.A0D.setVisibility(8);
        r2.A0E.setVisibility(8);
        r5.A0A.A05();
        r5.A0A.A0P.setVisibility(0);
        r5.A07.requestFocus();
        C670336y r13 = r5.A0X;
        r13.A01 = true;
        r13.A05.A00();
        r13.A04.A01();
        r13.A06.A02();
    }
}
