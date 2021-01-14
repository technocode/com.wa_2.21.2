package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import java.util.List;

/* renamed from: X.2py  reason: invalid class name and case insensitive filesystem */
public class C60692py extends C60352pI {
    public final TemplateQuickReplyButtonsLayout A00 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A01 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public C60692py(Context context, AnonymousClass2CE r3) {
        super(context, r3);
        A0s();
    }

    @Override // X.AbstractC51572Zg, X.C60352pI
    public void A0K() {
        A0s();
        super.A0K();
    }

    @Override // X.AbstractC51572Zg, X.C60352pI
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0s();
        }
    }

    public final void A0s() {
        List list;
        this.A01.A00(this);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
        if (templateQuickReplyButtonsLayout != null) {
            AnonymousClass2ZN r1 = this.A0h;
            if (C002001d.A0O(getContext()) instanceof Conversation) {
                list = ((AnonymousClass0Z8) getFMessage()).A9K().A02;
            } else {
                list = null;
            }
            templateQuickReplyButtonsLayout.A01(r1, list);
        }
    }

    @Override // X.AnonymousClass2I2, X.C60352pI
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_template_title_gif_left;
    }

    @Override // X.AnonymousClass2I2, X.C60352pI
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_template_title_gif_left;
    }

    @Override // X.AnonymousClass2I2, X.C60352pI
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_template_title_gif_right;
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
        if (templateQuickReplyButtonsLayout != null) {
            templateQuickReplyButtonsLayout.layout(((AnonymousClass2I2) this).A0C.getLeft(), ((AnonymousClass2I2) this).A0C.getBottom(), ((AnonymousClass2I2) this).A0C.getRight(), ((AnonymousClass2I2) this).A0C.getBottom() + templateQuickReplyButtonsLayout.getMeasuredHeight());
        }
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A00;
        if (templateQuickReplyButtonsLayout != null) {
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(getMeasuredWidth(), templateQuickReplyButtonsLayout.A00(((AnonymousClass2I2) this).A0C.getMeasuredWidth()) + measuredHeight);
        }
    }
}
