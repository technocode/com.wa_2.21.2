package com.whatsapp;

import X.ActivityC004602e;
import X.C002001d;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemStatusActivity extends ActivityC004602e {
    public int A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final List A07 = Arrays.asList("broadcast", "registration", "sync", "status");

    public /* synthetic */ void lambda$onCreate$1469$SystemStatusActivity(View view) {
        startActivity(C002001d.A0R(this, this.A01, this.A02, Integer.valueOf(this.A00), null, null, getIntent().getBundleExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle")));
        finish();
    }

    public /* synthetic */ void lambda$onCreate$1470$SystemStatusActivity(View view) {
        finish();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x020d  */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 1024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }
}
