package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.2n6  reason: invalid class name and case insensitive filesystem */
public class C59122n6 extends AbstractC51572Zg {
    public AnonymousClass0D9 A00 = new C51652Zo(this);
    public final View A01 = findViewById(R.id.action_text);
    public final View A02 = findViewById(R.id.button_div);
    public final View A03 = findViewById(R.id.expired_invitation_container);
    public final View A04 = findViewById(R.id.view_contacts_btn);
    public final ImageView A05 = ((ImageView) findViewById(R.id.avatar));
    public final TextEmojiLabel A06 = ((TextEmojiLabel) findViewById(R.id.group_invite_caption));
    public final TextEmojiLabel A07 = ((TextEmojiLabel) findViewById(R.id.group_name));
    public final TextAndDateLayout A08 = ((TextAndDateLayout) findViewById(R.id.text_and_date));
    public final C02580Cq A09 = C02580Cq.A01();

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return 0;
    }

    public C59122n6(Context context, AnonymousClass0ZF r3) {
        super(context, r3);
        A0j();
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r4.A06 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j() {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59122n6.A0j():void");
    }

    @Override // X.AnonymousClass2I2
    public AnonymousClass0ZF getFMessage() {
        return (AnonymousClass0ZF) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_group_invite_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_group_invite_right;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0ZF);
        super.setFMessage(r2);
    }
}
