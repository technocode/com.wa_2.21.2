package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;

/* renamed from: X.2Ng  reason: invalid class name and case insensitive filesystem */
public class C48672Ng {
    public AbstractC03770Ho A00;
    public AbstractC03790Hq A01;
    public final C53392d8 A02;
    public final EmojiSearchContainer A03;

    public C48672Ng(EmojiSearchContainer emojiSearchContainer, C53392d8 r11, Activity activity, C02590Cr r13, C03930Ii r14, AnonymousClass01X r15, AnonymousClass022 r16) {
        this.A03 = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        this.A02 = r11;
        r11.A09 = new AnonymousClass2dD(this, r11, emojiSearchContainer, activity, r13, r14, r15, r16);
    }

    public void A00(boolean z) {
        if (!(this instanceof C54402er)) {
            EmojiSearchContainer emojiSearchContainer = this.A03;
            if (emojiSearchContainer.getVisibility() == 0) {
                emojiSearchContainer.setVisibility(8);
                if (1 != 0) {
                    emojiSearchContainer.A04.A00();
                    emojiSearchContainer.A09 = null;
                }
            }
            this.A02.A0A = null;
            return;
        }
        C54402er r4 = (C54402er) this;
        GifSearchContainer gifSearchContainer = r4.A06;
        if (gifSearchContainer.getVisibility() == 0) {
            gifSearchContainer.setVisibility(8);
            AbstractC49282Pv r1 = gifSearchContainer.A0C;
            if (r1 != null) {
                C28051Sr.A1a(gifSearchContainer.A09, r1);
            }
            gifSearchContainer.A0C = null;
        } else {
            EmojiSearchContainer emojiSearchContainer2 = ((C48672Ng) r4).A03;
            if (emojiSearchContainer2.getVisibility() == 0) {
                emojiSearchContainer2.setVisibility(8);
                if (1 != 0) {
                    emojiSearchContainer2.A04.A00();
                    emojiSearchContainer2.A09 = null;
                }
            }
        }
        ((C48672Ng) r4).A02.A0A = null;
        if (z) {
            C28051Sr.A1a(r4.A04, r4.A07);
        }
    }

    public boolean A01() {
        if (!(this instanceof C54402er)) {
            return this.A03.getVisibility() == 0;
        }
        C54402er r1 = (C54402er) this;
        return r1.A06.getVisibility() == 0 || ((C48672Ng) r1).A03.getVisibility() == 0;
    }

    public boolean A02() {
        if (!A01()) {
            return false;
        }
        A00(true);
        this.A03.post(new RunnableEBaseShape9S0100000_I1_4(this, 32));
        return true;
    }
}
