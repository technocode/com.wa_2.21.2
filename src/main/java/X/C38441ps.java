package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.BlockingUserInteractionActivity;
import com.whatsapp.InsufficientStorageSpaceActivity;

/* renamed from: X.1ps  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38441ps implements AnonymousClass0SG {
    public final /* synthetic */ BlockingUserInteractionActivity A00;

    public /* synthetic */ C38441ps(BlockingUserInteractionActivity blockingUserInteractionActivity) {
        this.A00 = blockingUserInteractionActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        BlockingUserInteractionActivity blockingUserInteractionActivity = this.A00;
        int intValue = ((Number) obj).intValue();
        if (intValue == 5 || intValue == 2 || intValue == 0) {
            blockingUserInteractionActivity.finish();
            blockingUserInteractionActivity.startActivity((Intent) blockingUserInteractionActivity.getIntent().getParcelableExtra("original_intent"));
            blockingUserInteractionActivity.overridePendingTransition(0, 0);
        } else if (intValue == 4) {
            blockingUserInteractionActivity.setContentView(R.layout.activity_forced_migration_failed);
        } else if (intValue == 3) {
            blockingUserInteractionActivity.setContentView(R.layout.activity_forced_migration_failed);
            blockingUserInteractionActivity.startActivity(new Intent(blockingUserInteractionActivity, InsufficientStorageSpaceActivity.class).setFlags(268435456).putExtra("allowSkipKey", false).putExtra("spaceNeededInBytes", 10485760L));
        }
    }
}
