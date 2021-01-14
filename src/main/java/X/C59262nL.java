package X;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;

/* renamed from: X.2nL  reason: invalid class name and case insensitive filesystem */
public class C59262nL extends AbstractC51572Zg {
    public final TextEmojiLabel A00 = ((TextEmojiLabel) findViewById(R.id.title_text_message));
    public final TemplateQuickReplyButtonsLayout A01 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A02 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public C59262nL(Context context, AnonymousClass28G r3) {
        super(context, r3);
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0j();
        A0e(false);
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r0.isEmpty() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59262nL.A0j():void");
    }

    public final boolean A0k(AnonymousClass28G r7) {
        String A0D = r7.A0D();
        if (TextUtils.isEmpty(A0D)) {
            return false;
        }
        AnonymousClass0OF r0 = r7.A00;
        String str = r0.A00;
        String str2 = r0.A01;
        float measureText = this.A00.getPaint().measureText(A0D);
        TemplateRowContentLayout templateRowContentLayout = this.A02;
        float measureText2 = templateRowContentLayout.getContentTextView().getPaint().measureText(str);
        float measureText3 = !TextUtils.isEmpty(str2) ? templateRowContentLayout.A01.getPaint().measureText(str2) : 0.0f;
        if (measureText <= measureText2 || measureText <= measureText3) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_template_title_text_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_template_title_text_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_template_title_text_right;
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A01;
        if (templateQuickReplyButtonsLayout != null) {
            templateQuickReplyButtonsLayout.layout(((AnonymousClass2I2) this).A0C.getLeft(), ((AnonymousClass2I2) this).A0C.getBottom(), ((AnonymousClass2I2) this).A0C.getRight(), ((AnonymousClass2I2) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
        }
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A01;
        if (templateQuickReplyButtonsLayout != null) {
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AnonymousClass2I2) this).A0C.getMeasuredWidth()) + measuredHeight);
        }
    }
}
