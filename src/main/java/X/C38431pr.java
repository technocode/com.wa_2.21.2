package X;

import android.content.Intent;
import com.whatsapp.BlockingUserInteractionActivity;

/* renamed from: X.1pr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38431pr implements AnonymousClass0SG {
    public final /* synthetic */ BlockingUserInteractionActivity A00;

    public /* synthetic */ C38431pr(BlockingUserInteractionActivity blockingUserInteractionActivity) {
        this.A00 = blockingUserInteractionActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        BlockingUserInteractionActivity blockingUserInteractionActivity = this.A00;
        if (Boolean.FALSE.equals(obj)) {
            blockingUserInteractionActivity.finish();
            blockingUserInteractionActivity.startActivity((Intent) blockingUserInteractionActivity.getIntent().getParcelableExtra("original_intent"));
            blockingUserInteractionActivity.overridePendingTransition(0, 0);
        }
    }
}
