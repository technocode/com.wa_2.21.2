package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.StatusesFragment;

/* renamed from: X.0cQ  reason: invalid class name and case insensitive filesystem */
public class C09180cQ implements AbstractC07200Wh {
    public final /* synthetic */ StatusesFragment A00;

    public C09180cQ(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        StatusesFragment statusesFragment = this.A00;
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
        StatusesFragment.A00(statusesFragment, i, i2, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        StatusesFragment.A00(this.A00, R.string.alert, R.string.permission_storage_need_access, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        StatusesFragment statusesFragment = this.A00;
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
        StatusesFragment.A00(statusesFragment, i, i2, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        StatusesFragment.A00(this.A00, R.string.alert, R.string.permission_storage_need_access, new Object[0]);
    }
}
