package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2nI  reason: invalid class name and case insensitive filesystem */
public final class C59232nI extends AbstractC51572Zg {
    public final TextEmojiLabel A00;
    public final CharSequence A01;

    public C59232nI(Context context, AnonymousClass0ZJ r8) {
        super(context, r8);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.message_text);
        this.A00 = textEmojiLabel;
        AnonymousClass01X r4 = this.A0n;
        textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(r4.A02().A06 ? 0 : R.drawable.message_got_receipt_revoked, 0, r4.A02().A06 ? R.drawable.message_got_receipt_revoked : 0, 0);
        String A06 = r4.A06(r8.A0n.A02 ? R.string.revoked_msg_outgoing : R.string.revoked_msg_incoming);
        StringBuilder sb = new StringBuilder();
        String str = AnonymousClass020.A01;
        sb.append(str);
        sb.append(A06);
        sb.append(str);
        String obj = sb.toString();
        this.A01 = obj;
        TextEmojiLabel textEmojiLabel2 = this.A00;
        textEmojiLabel2.setText(obj);
        AnonymousClass008.A0d(textEmojiLabel2);
        textEmojiLabel2.setAutoLinkMask(0);
        textEmojiLabel2.setLinksClickable(false);
        textEmojiLabel2.setFocusable(false);
        textEmojiLabel2.setClickable(false);
        textEmojiLabel2.setLongClickable(false);
    }

    @Override // X.AbstractC51572Zg
    public int A0F(int i) {
        if (!getFMessage().A0n.A02) {
            return 0;
        }
        return R.drawable.message_unsent;
    }

    @Override // X.AbstractC51572Zg
    public int A0G(int i) {
        if (!getFMessage().A0n.A02) {
            return 0;
        }
        return R.color.msgStatusTint;
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            TextEmojiLabel textEmojiLabel = this.A00;
            textEmojiLabel.setText(this.A01);
            AnonymousClass008.A0d(textEmojiLabel);
            textEmojiLabel.setAutoLinkMask(0);
            textEmojiLabel.setLinksClickable(false);
            textEmojiLabel.setFocusable(false);
            textEmojiLabel.setClickable(false);
            textEmojiLabel.setLongClickable(false);
        }
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_revoked_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_revoked_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_revoked_right;
    }
}
