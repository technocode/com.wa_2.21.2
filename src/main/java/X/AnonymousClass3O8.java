package X;

import com.whatsapp.search.views.itemviews.AudioPlayerMetadataView;

/* renamed from: X.3O8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3O8 implements AbstractC656230q {
    public final /* synthetic */ AnonymousClass3OK A00;

    public /* synthetic */ AnonymousClass3O8(AnonymousClass3OK r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC656230q
    public final void AKP(int i) {
        String A1Y;
        AnonymousClass3OK r4 = this.A00;
        if (i == 0) {
            r4.A01.A01.setVisibility(8);
            r4.A01();
        } else if (i == 1) {
            r4.A00.setDescription(C002001d.A1Y(r4.A07, ((AnonymousClass0M3) ((AnonymousClass312) r4).A00).A01));
            C28051Sr.A08(((AnonymousClass312) r4).A05, r4.A01.A01, ((AnonymousClass312) r4).A00);
        } else if (i == 2 || i == 3) {
            r4.A01.A01.setVisibility(8);
            AudioPlayerMetadataView audioPlayerMetadataView = r4.A00;
            AnonymousClass0MP r1 = ((AnonymousClass312) r4).A00;
            AnonymousClass01X r2 = r4.A07;
            int i2 = ((AnonymousClass0M3) r1).A00;
            if (i2 != 0) {
                A1Y = C002001d.A1W(r2, (long) i2);
            } else {
                A1Y = C002001d.A1Y(r2, ((AnonymousClass0M3) r1).A01);
            }
            audioPlayerMetadataView.setDescription(A1Y);
        }
    }
}
