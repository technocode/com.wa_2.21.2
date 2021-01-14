package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.emoji.search.EmojiSearchContainer;

/* renamed from: X.2nn  reason: invalid class name and case insensitive filesystem */
public class C59512nn extends C53452dI {
    public final /* synthetic */ EmojiSearchContainer A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59512nn(EmojiSearchContainer emojiSearchContainer, Activity activity, C02590Cr r10, AnonymousClass01X r11, AbstractC48682Nh r12, AnonymousClass022 r13, int i) {
        super(activity, r10, r11, r12, r13, i);
        this.A00 = emojiSearchContainer;
    }

    @Override // X.AnonymousClass2Q8
    public void AJi(AnonymousClass2Q9 r5) {
        if (r5.equals(((C53452dI) this).A00)) {
            ((AbstractC16300pa) this).A01.A00();
        }
        EmojiSearchContainer emojiSearchContainer = this.A00;
        int i = 8;
        emojiSearchContainer.A01.setVisibility(8);
        View view = emojiSearchContainer.A02;
        if (emojiSearchContainer.A08.A05() == 0) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
