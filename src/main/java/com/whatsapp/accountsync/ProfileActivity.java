package com.whatsapp.accountsync;

import X.AbstractC07170We;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass03S;
import X.AnonymousClass0GE;
import X.AnonymousClass325;
import X.C002001d;
import X.C002101e;
import X.C014508d;
import X.C11050fd;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

public class ProfileActivity extends AnonymousClass0GE {
    public C11050fd A00 = null;
    public final AnonymousClass01I A01 = AnonymousClass01I.A00();
    public final AnonymousClass03S A02 = AnonymousClass03S.A00();
    public final C014508d A03 = C014508d.A00();
    public final AnonymousClass325 A04 = AnonymousClass325.A00();
    public final AnonymousClass00T A05 = C002101e.A00();
    public final WhatsAppLibLoader A06 = WhatsAppLibLoader.A00();

    public ProfileActivity() {
        super(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W() {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.A0W():void");
    }

    @Override // X.AnonymousClass0GE, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 == -1) {
                A0W();
            } else {
                Log.w("profileactivity/contact access denied");
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0GE, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A06.A04()) {
            Log.i("aborting due to native libraries missing");
            finish();
            return;
        }
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        if (r0.A00 == null || !this.A0P.A02()) {
            ((ActivityC004702f) this).A0F.A06(R.string.finish_registration_first, 1);
            finish();
            return;
        }
        C014508d r02 = this.A03;
        r02.A05();
        if (!r02.A01) {
            AbstractC07170We r03 = ((AnonymousClass0GE) this).A00;
            if (r03.A06.A08(r03.A03)) {
                int A062 = ((AnonymousClass0GE) this).A0E.A06();
                AnonymousClass008.A0v("profileactivity/create/backupfilesfound ", A062);
                if (A062 > 0) {
                    C002001d.A2O(this, 105);
                } else {
                    A0V(false);
                }
            }
        } else {
            A0T();
        }
    }
}
