package X;

import android.app.Activity;
import android.widget.ImageButton;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;

/* renamed from: X.3Z1  reason: invalid class name */
public class AnonymousClass3Z1 extends C53392d8 {
    public final /* synthetic */ EmojiSearchContainer A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Z1(Activity activity, AnonymousClass0Eg r2, C06170Sb r3, C02590Cr r4, C02600Cs r5, C03930Ii r6, AnonymousClass03P r7, AnonymousClass01X r8, C53492dM r9, AnonymousClass00D r10, AnonymousClass022 r11, AnonymousClass1MF r12, ImageButton imageButton, WaEditText waEditText, EmojiSearchContainer emojiSearchContainer) {
        super(activity, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, imageButton, waEditText);
        this.A00 = emojiSearchContainer;
    }

    @Override // X.AnonymousClass1MI
    public void dismiss() {
        super.dismiss();
        EmojiSearchContainer emojiSearchContainer = this.A00;
        if (emojiSearchContainer.getVisibility() == 0) {
            emojiSearchContainer.setVisibility(8);
            if (0 != 0) {
                emojiSearchContainer.A04.A00();
                emojiSearchContainer.A09 = null;
            }
        }
    }
}
