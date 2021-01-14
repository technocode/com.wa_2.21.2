package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;

/* renamed from: X.3Mq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70853Mq implements AnonymousClass0SG {
    public final /* synthetic */ RestoreFromConsumerDatabaseActivity A00;

    public /* synthetic */ C70853Mq(RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity) {
        this.A00 = restoreFromConsumerDatabaseActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = this.A00;
        int[] iArr = (int[]) obj;
        int i = iArr[0];
        int i2 = iArr[1];
        if (i2 != 0) {
            restoreFromConsumerDatabaseActivity.A02.setVisibility(0);
            restoreFromConsumerDatabaseActivity.A06.setVisibility(0);
            restoreFromConsumerDatabaseActivity.A06.setProgress((i * 100) / i2);
            restoreFromConsumerDatabaseActivity.A02.setText(restoreFromConsumerDatabaseActivity.getString(R.string.migration_direct_transfer_progress_message, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }
}
