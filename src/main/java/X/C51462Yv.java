package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.2Yv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51462Yv implements AnonymousClass35j {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ AnonymousClass2Z6 A01;

    public /* synthetic */ C51462Yv(AnonymousClass2Z6 r1, Intent intent) {
        this.A01 = r1;
        this.A00 = intent;
    }

    @Override // X.AnonymousClass35j
    public final void AG2(File file) {
        AnonymousClass2Z6 r4 = this.A01;
        Intent intent = this.A00;
        try {
            C04350Ka r5 = r4.A0C;
            AnonymousClass02N r2 = r4.A0N;
            AnonymousClass1XO r9 = AnonymousClass1XO.A05;
            boolean booleanExtra = intent.getBooleanExtra("has_preview", true);
            AbstractC03650Hc r0 = r4.A0F;
            r5.A07(false, Collections.singletonList(r2), file, r9, booleanExtra, null, r0.A8c(), r4.A0W);
            r0.A28();
        } catch (IOException e) {
            r4.A06.A06(R.string.share_failed, 0);
            Log.e(e);
        }
    }
}
