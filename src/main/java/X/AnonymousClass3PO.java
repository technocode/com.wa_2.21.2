package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.3PO  reason: invalid class name */
public class AnonymousClass3PO implements AbstractC07200Wh {
    public final /* synthetic */ MyStatusesActivity A00;

    public AnonymousClass3PO(MyStatusesActivity myStatusesActivity) {
        this.A00 = myStatusesActivity;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        MyStatusesActivity myStatusesActivity = this.A00;
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
        myStatusesActivity.APq(i, i2, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        this.A00.APq(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        MyStatusesActivity myStatusesActivity = this.A00;
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
        myStatusesActivity.APq(i, i2, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        this.A00.APq(R.string.alert, R.string.permission_storage_need_access, new Object[0]);
    }
}
