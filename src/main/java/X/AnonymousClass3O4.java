package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;

/* renamed from: X.3O4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3O4 implements AbstractC656230q {
    public final /* synthetic */ AnonymousClass3OI A00;

    public /* synthetic */ AnonymousClass3O4(AnonymousClass3OI r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC656230q
    public final void AKP(int i) {
        String A1Y;
        AnonymousClass3OI r4 = this.A00;
        if (i == 0) {
            r4.A01.A01.setVisibility(8);
            r4.A01();
        } else if (i == 1) {
            r4.A00.A00();
            r4.A00.setDuration(C002001d.A1Y(r4.A02, ((AnonymousClass0M3) ((AnonymousClass312) r4).A00).A01));
            C28051Sr.A08(r4.A05, r4.A01.A01, ((AnonymousClass312) r4).A00);
        } else if (i == 2 || i == 3) {
            r4.A01.A01.setVisibility(8);
            r4.A00.A00();
            ConversationRowAudioPreview conversationRowAudioPreview = r4.A00;
            AnonymousClass0MP r1 = ((AnonymousClass312) r4).A00;
            AnonymousClass01X r2 = r4.A02;
            int i2 = ((AnonymousClass0M3) r1).A00;
            if (i2 != 0) {
                A1Y = C002001d.A1W(r2, (long) i2);
            } else {
                A1Y = C002001d.A1Y(r2, ((AnonymousClass0M3) r1).A01);
            }
            conversationRowAudioPreview.setDuration(A1Y);
        }
    }
}
