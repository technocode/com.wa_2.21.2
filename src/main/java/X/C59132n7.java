package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2n7  reason: invalid class name and case insensitive filesystem */
public final class C59132n7 extends AbstractC51572Zg {
    public final TextEmojiLabel A00 = ((TextEmojiLabel) findViewById(R.id.message_text));
    public final String A01;

    @Override // X.AbstractC51572Zg
    public int A0F(int i) {
        return 0;
    }

    @Override // X.AbstractC51572Zg
    public int A0G(int i) {
        return 0;
    }

    @Override // X.AnonymousClass2I2
    public int getBubbleAlpha() {
        return 191;
    }

    public C59132n7(Context context, AnonymousClass28C r6) {
        super(context, r6);
        StringBuilder sb = new StringBuilder();
        String str = AnonymousClass020.A01;
        sb.append(str);
        sb.append(this.A0n.A06(R.string.rejected_hsm_message));
        sb.append(str);
        this.A01 = sb.toString();
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0j();
        }
    }

    public void A0j() {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setText(this.A01);
        textEmojiLabel.setTextColor(C004302a.A00(getContext(), R.color.tombstone_text_color));
        textEmojiLabel.setTypeface(textEmojiLabel.getTypeface(), 2);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_text_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_text_right;
    }
}
