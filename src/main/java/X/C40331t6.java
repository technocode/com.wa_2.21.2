package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1t6  reason: invalid class name and case insensitive filesystem */
public class C40331t6 implements AbstractC07200Wh {
    public final /* synthetic */ MessageReplyActivity A00;

    public C40331t6(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        MessageReplyActivity messageReplyActivity = this.A00;
        boolean A01 = AnonymousClass00C.A01();
        int i = R.string.record_need_sd_card_title_shared_storage;
        if (A01) {
            i = R.string.record_need_sd_card_title;
        }
        boolean A012 = AnonymousClass00C.A01();
        int i2 = R.string.record_need_sd_card_message_shared_storage;
        if (A012) {
            i2 = R.string.record_need_sd_card_message;
        }
        messageReplyActivity.APq(i, i2, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        this.A00.APq(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        MessageReplyActivity messageReplyActivity = this.A00;
        boolean A01 = AnonymousClass00C.A01();
        int i = R.string.record_need_sd_card_title_shared_storage;
        if (A01) {
            i = R.string.record_need_sd_card_title;
        }
        boolean A012 = AnonymousClass00C.A01();
        int i2 = R.string.record_need_sd_card_message_shared_storage;
        if (A012) {
            i2 = R.string.record_need_sd_card_message;
        }
        messageReplyActivity.APq(i, i2, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        this.A00.APq(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
    }
}
