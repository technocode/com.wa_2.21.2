package X;

import android.content.Intent;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Mr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70863Mr implements AnonymousClass0SG {
    public final /* synthetic */ RestoreFromConsumerDatabaseActivity A00;

    public /* synthetic */ C70863Mr(RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity) {
        this.A00 = restoreFromConsumerDatabaseActivity;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = this.A00;
        Number number = (Number) obj;
        StringBuilder sb = new StringBuilder("RestoreFromConsumerDatabaseActivity/view-model-state= ");
        sb.append(number);
        Log.i(sb.toString());
        switch (number.intValue()) {
            case 0:
                Log.e("RestoreFromConsumerDatabaseActivity/missing-params bounce to regphone");
                restoreFromConsumerDatabaseActivity.A0W.A0C(1);
                restoreFromConsumerDatabaseActivity.startActivity(new Intent(restoreFromConsumerDatabaseActivity, RegisterPhone.class));
                restoreFromConsumerDatabaseActivity.finish();
                break;
            case 1:
                break;
            case 2:
            case 6:
                GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = restoreFromConsumerDatabaseActivity.A05;
                googleDriveRestoreAnimationView.A01 = 4;
                C27631Qt r0 = googleDriveRestoreAnimationView.A0A;
                if (r0 != null) {
                    r0.cancel();
                }
                restoreFromConsumerDatabaseActivity.setResult(1);
                restoreFromConsumerDatabaseActivity.finish();
                return;
            case 3:
                restoreFromConsumerDatabaseActivity.A03.setText(((AnonymousClass2C0) restoreFromConsumerDatabaseActivity).A01.A06(R.string.migration_failed_to_migrate_generic_reason));
                restoreFromConsumerDatabaseActivity.A0T();
                return;
            case 4:
            case 7:
                WaTextView waTextView = restoreFromConsumerDatabaseActivity.A03;
                AnonymousClass01X r2 = ((AnonymousClass2C0) restoreFromConsumerDatabaseActivity).A01;
                waTextView.setText(r2.A06(R.string.migration_restore_from_backup_text));
                restoreFromConsumerDatabaseActivity.A0T();
                restoreFromConsumerDatabaseActivity.A00.setText(r2.A06(R.string.migration_restore_from_backup_button));
                restoreFromConsumerDatabaseActivity.A00.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(restoreFromConsumerDatabaseActivity, 30));
                return;
            case 5:
                restoreFromConsumerDatabaseActivity.A03.setText(((AnonymousClass2C0) restoreFromConsumerDatabaseActivity).A01.A06(R.string.migration_not_enough_space_on_phone_dialog_title));
                restoreFromConsumerDatabaseActivity.A0T();
                return;
            default:
                return;
        }
        restoreFromConsumerDatabaseActivity.A0U();
        restoreFromConsumerDatabaseActivity.A01.setText(((AnonymousClass2C0) restoreFromConsumerDatabaseActivity).A01.A06(R.string.migration_transferring_chats_and_media));
    }
}
