package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

public class Remove extends ActivityC004902h {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.A00.A06(R.string.title_remove));
        Intent intent = new Intent();
        intent.putExtra("is_removed", true);
        setResult(-1, intent);
        finish();
    }
}
