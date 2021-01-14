package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Wv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C50972Wv implements AbstractC665534u {
    public final /* synthetic */ ChatInfoActivity A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public /* synthetic */ C50972Wv(ChatInfoActivity chatInfoActivity, AnonymousClass0M3 r2) {
        this.A00 = chatInfoActivity;
        this.A01 = r2;
    }

    @Override // X.AbstractC665534u
    public final void AEF(C665334s r15, View view) {
        ChatInfoActivity chatInfoActivity = this.A00;
        AnonymousClass0M3 r6 = this.A01;
        chatInfoActivity.A03 = r6;
        if (r6.A0m == 23) {
            AnonymousClass0Z9 r62 = (AnonymousClass0Z9) r6;
            UserJid userJid = r62.A01;
            if (userJid == null) {
                ((ActivityC004702f) chatInfoActivity).A0F.A0C(chatInfoActivity.A0A.A06(R.string.catalog_something_went_wrong_error), 0);
                return;
            }
            C27831Rq r3 = chatInfoActivity.A07;
            r3.A01(3);
            r3.A02(18, 33, r62.A04, userJid);
            ProductDetailActivity.A05(r62, view, false, view.getContext(), chatInfoActivity.A08, chatInfoActivity.A0G, chatInfoActivity.A05.A09(userJid), 5);
        } else if (RequestPermissionActivity.A0H(chatInfoActivity, chatInfoActivity.A09)) {
            chatInfoActivity.viewMedia(view);
        }
    }
}
