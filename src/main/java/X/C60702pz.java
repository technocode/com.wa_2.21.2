package X;

import android.content.Context;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import java.util.List;

/* renamed from: X.2pz  reason: invalid class name and case insensitive filesystem */
public class C60702pz extends C60362pJ {
    public final DynamicButtonsLayout A00 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A01 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));

    public C60702pz(Context context, AnonymousClass0MI r3) {
        super(context, r3);
        A0n();
    }

    @Override // X.AbstractC51572Zg, X.C60362pJ
    public void A0K() {
        A0n();
        super.A0K();
    }

    @Override // X.AbstractC51572Zg, X.C60362pJ
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0n();
        }
    }

    public final void A0n() {
        this.A01.A00(this);
        AnonymousClass0MI fMessage = getFMessage();
        if (fMessage.A0A().A00 != null) {
            List list = fMessage.A0A().A00.A02;
            if (list == null || list.size() <= 0) {
                this.A00.setVisibility(8);
                return;
            }
            DynamicButtonsLayout dynamicButtonsLayout = this.A00;
            dynamicButtonsLayout.A01(this.A0g, list);
            dynamicButtonsLayout.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass2I2, X.C60362pJ
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_buttons_image_left;
    }

    @Override // X.AnonymousClass2I2, X.C60362pJ
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_buttons_image_left;
    }

    @Override // X.AnonymousClass2I2, X.C60362pJ
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_buttons_image_right;
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DynamicButtonsLayout dynamicButtonsLayout = this.A00;
        dynamicButtonsLayout.layout(((AnonymousClass2I2) this).A0C.getLeft(), ((AnonymousClass2I2) this).A0C.getBottom(), ((AnonymousClass2I2) this).A0C.getRight(), ((AnonymousClass2I2) this).A0C.getBottom() + dynamicButtonsLayout.getMeasuredHeight());
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        setMeasuredDimension(getMeasuredWidth(), this.A00.A00(((AnonymousClass2I2) this).A0C.getMeasuredWidth()) + measuredHeight);
    }
}
