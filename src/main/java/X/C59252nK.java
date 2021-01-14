package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import java.util.List;

/* renamed from: X.2nK  reason: invalid class name and case insensitive filesystem */
public class C59252nK extends AbstractC51572Zg {
    public final TextEmojiLabel A00 = ((TextEmojiLabel) findViewById(R.id.title_text_message));
    public final DynamicButtonsLayout A01 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A02 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));

    public C59252nK(Context context, C05490Ot r3) {
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

    public final void A0j() {
        DynamicButtonsRowContentLayout dynamicButtonsRowContentLayout = this.A02;
        dynamicButtonsRowContentLayout.A00(this);
        AbstractC007503q fMessage = getFMessage();
        if (!TextUtils.isEmpty(fMessage.A0D())) {
            String A0D = fMessage.A0D();
            TextEmojiLabel textEmojiLabel = this.A00;
            A0b(A0D, textEmojiLabel, getFMessage(), false);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A00.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = dynamicButtonsRowContentLayout.getLayoutParams();
        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.conversation_row_document_width);
        dynamicButtonsRowContentLayout.setLayoutParams(layoutParams);
        if (fMessage.A0A().A00 != null) {
            List list = fMessage.A0A().A00.A02;
            if (list == null || list.size() <= 0) {
                this.A01.setVisibility(8);
                return;
            }
            DynamicButtonsLayout dynamicButtonsLayout = this.A01;
            dynamicButtonsLayout.A01(this.A0g, list);
            dynamicButtonsLayout.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_button_title_text_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_button_title_text_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_button_title_text_right;
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DynamicButtonsLayout dynamicButtonsLayout = this.A01;
        dynamicButtonsLayout.layout(((AnonymousClass2I2) this).A0C.getLeft(), ((AnonymousClass2I2) this).A0C.getBottom(), ((AnonymousClass2I2) this).A0C.getRight(), ((AnonymousClass2I2) this).A0C.getBottom() + dynamicButtonsLayout.getMeasuredHeight());
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        setMeasuredDimension(getMeasuredWidth(), this.A01.A00(((AnonymousClass2I2) this).A0C.getMeasuredWidth()) + measuredHeight);
    }
}
