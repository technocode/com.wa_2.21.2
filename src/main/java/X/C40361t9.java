package X;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.ImageButton;
import com.whatsapp.Conversation;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1t9  reason: invalid class name and case insensitive filesystem */
public class C40361t9 extends C07860Zy {
    public final /* synthetic */ MessageReplyActivity A00;
    public final /* synthetic */ C007003k A01;

    public C40361t9(MessageReplyActivity messageReplyActivity, C007003k r2) {
        this.A00 = messageReplyActivity;
        this.A01 = r2;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        MessageReplyActivity messageReplyActivity;
        String obj = editable.toString();
        if (!TextUtils.isEmpty(obj)) {
            messageReplyActivity = this.A00;
            messageReplyActivity.A0T.A0D((AnonymousClass02N) this.A01.A02(AnonymousClass02N.class), 0);
        } else {
            messageReplyActivity = this.A00;
            messageReplyActivity.A0T.A0B((AnonymousClass02N) this.A01.A02(AnonymousClass02N.class));
        }
        C002001d.A2U(messageReplyActivity, messageReplyActivity.A0h, messageReplyActivity.A0c, messageReplyActivity.A10, editable, messageReplyActivity.A08.getPaint(), 1.3f);
        boolean z = false;
        if (TextUtils.getTrimmedLength(obj) > 0) {
            z = true;
        }
        messageReplyActivity.A05.setEnabled(z);
        if (messageReplyActivity.A06.getVisibility() == 8 && !z) {
            messageReplyActivity.A06.startAnimation(C27131Oe.A00(true));
            messageReplyActivity.A06.setVisibility(0);
            ImageButton imageButton = messageReplyActivity.A04;
            AnonymousClass01X r2 = ((AnonymousClass2C0) messageReplyActivity).A01;
            imageButton.startAnimation(Conversation.A09(r2.A0M(), true, false));
            messageReplyActivity.A03.startAnimation(Conversation.A08(r2.A0M(), true));
            messageReplyActivity.A03.setVisibility(0);
            messageReplyActivity.A05.startAnimation(C27131Oe.A00(false));
            messageReplyActivity.A05.setVisibility(8);
        } else if (messageReplyActivity.A06.getVisibility() == 0 && z) {
            messageReplyActivity.A06.startAnimation(C27131Oe.A00(false));
            messageReplyActivity.A06.setVisibility(8);
            ImageButton imageButton2 = messageReplyActivity.A04;
            AnonymousClass01X r22 = ((AnonymousClass2C0) messageReplyActivity).A01;
            imageButton2.startAnimation(Conversation.A09(r22.A0M(), false, false));
            messageReplyActivity.A03.startAnimation(Conversation.A08(r22.A0M(), false));
            messageReplyActivity.A03.setVisibility(8);
            messageReplyActivity.A05.startAnimation(C27131Oe.A00(true));
            messageReplyActivity.A05.setVisibility(0);
        }
    }
}
