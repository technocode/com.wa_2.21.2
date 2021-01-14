package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2nD  reason: invalid class name and case insensitive filesystem */
public class C59182nD extends AbstractC51572Zg {
    @Override // X.AnonymousClass2I2
    public int getBubbleAlpha() {
        return 153;
    }

    public C59182nD(Context context, AnonymousClass28F r8) {
        super(context, r8);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        String obj = this.A11.A03("general", "26000255", null).toString();
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(this.A0n.A0D(R.string.decryption_placeholder_message_text, obj)));
        A0T(newSpannable);
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.setText(newSpannable);
        this.A13.A07(r8, 2);
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
