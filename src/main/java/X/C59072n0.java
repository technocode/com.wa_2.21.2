package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2n0  reason: invalid class name and case insensitive filesystem */
public final class C59072n0 extends AbstractC51572Zg {
    @Override // X.AnonymousClass2I2
    public int getBubbleAlpha() {
        return 153;
    }

    public C59072n0(Context context, AnonymousClass28B r9) {
        super(context, r9);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        String obj = this.A11.A03("general", "26000015", null).toString();
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(this.A0n.A0D(R.string.decryption_placeholder_message_text, obj)));
        A0T(newSpannable);
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.setText(newSpannable);
        AnonymousClass00D r2 = this.A0m;
        AnonymousClass008.A0k(r2, "decryption_failure_views", r2.A00.getInt("decryption_failure_views", 0) + 1);
        this.A13.A07(r9, 2);
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_decryption_failure_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_decryption_failure_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_decryption_failure_right;
    }
}
