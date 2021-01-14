package X;

import android.content.Intent;
import com.whatsapp.BlockingUserInteractionActivity;

/* renamed from: X.0bu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08880bu implements AnonymousClass0SG {
    public final /* synthetic */ ActivityC004602e A00;

    public /* synthetic */ C08880bu(ActivityC004602e r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ActivityC004602e r3 = this.A00;
        Intent intent = r3.getIntent();
        Intent intent2 = new Intent(r3, BlockingUserInteractionActivity.class);
        intent2.putExtra("original_intent", intent);
        intent2.putExtra("blocking_type", 1);
        if (((Number) obj).intValue() == 1) {
            r3.finish();
            r3.startActivity(intent2);
        }
    }
}
