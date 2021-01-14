package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2n5  reason: invalid class name and case insensitive filesystem */
public final class C59112n5 extends AbstractC51572Zg {
    public final AnonymousClass0GZ A00 = AnonymousClass0GZ.A00();

    @Override // X.AnonymousClass2I2
    public int getBubbleAlpha() {
        return 191;
    }

    public C59112n5(Context context, AbstractC007503q r8) {
        super(context, r8);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        String obj = this.A00.A01().toString();
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(this.A0n.A0D(r8.A0n.A02 ? R.string.futureproof_message_text_sent : R.string.futureproof_message_text, obj)));
        A0T(newSpannable);
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.setText(newSpannable);
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_unsupported_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_unsupported_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_unsupported_right;
    }
}
