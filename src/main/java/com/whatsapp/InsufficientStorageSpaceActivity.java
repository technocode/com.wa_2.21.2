package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass00C;
import X.AnonymousClass00Y;
import X.AnonymousClass0TX;
import X.AnonymousClass20P;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C28051Sr;
import X.C48802Nt;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape0S1100000_I0;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.Locale;

public class InsufficientStorageSpaceActivity extends ActivityC004602e {
    public long A00;
    public ScrollView A01;
    public C48802Nt A02;
    public final AnonymousClass00C A03 = AnonymousClass00C.A00();
    public final AnonymousClass00Y A04 = AnonymousClass00Y.A00();

    public /* synthetic */ void lambda$onCreate$1201$InsufficientStorageSpaceActivity(View view) {
        startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
    }

    public void lambda$onCreate$1202$InsufficientStorageSpaceActivity(View view) {
        this.A0J.A0B("insufficient_storage_prompt_timestamp");
        AnonymousClass20P r5 = new AnonymousClass20P();
        Long valueOf = Long.valueOf(this.A00);
        r5.A02 = valueOf;
        r5.A00 = Boolean.TRUE;
        r5.A01 = 2;
        Log.i(String.format(Locale.ENGLISH, "insufficient-storage-activity/skipped space-required: %,d", valueOf));
        this.A04.A09(r5, 1);
        AnonymousClass00Y.A01(r5, "");
        finish();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.A00();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        String string;
        View.OnClickListener viewOnClickEBaseShape0S0100000_I0_0;
        super.onCreate(bundle);
        String A0o = C28051Sr.A0o(6, this.A04);
        setContentView(R.layout.activity_insufficient_storage_space);
        Log.d("InsufficientStorageSpaceActivity/create");
        this.A01 = (ScrollView) findViewById(R.id.insufficient_storage_scroll_view);
        TextView textView = (TextView) AnonymousClass0TX.A0A(this, R.id.btn_storage_settings);
        TextView textView2 = (TextView) AnonymousClass0TX.A0A(this, R.id.insufficient_storage_title_textview);
        TextView textView3 = (TextView) AnonymousClass0TX.A0A(this, R.id.insufficient_storage_description_textview);
        long longExtra = getIntent().getLongExtra("spaceNeededInBytes", -1);
        this.A00 = longExtra;
        long A032 = (longExtra - this.A03.A03()) + SearchActionVerificationClientService.MS_TO_NS;
        if (getIntent() == null || !getIntent().getBooleanExtra("allowSkipKey", false)) {
            z = false;
            i = R.string.insufficient_internal_storage_settings_button;
            i2 = R.string.insufficient_internal_storage_space_title_enhanced;
            string = getResources().getString(R.string.insufficient_internal_storage_space_description_enhanced, C002001d.A1Y(((AnonymousClass2C0) this).A01, A032));
        } else {
            z = true;
            i = R.string.insufficient_internal_storage_settings_button_almost_full_enhanced;
            i2 = R.string.insufficient_internal_storage_space_title_almost_full_enhanced;
            string = getResources().getString(R.string.insufficient_internal_storage_space_description_almost_full_enhanced);
        }
        textView2.setText(i2);
        textView3.setText(string);
        textView.setText(i);
        if (z) {
            viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S1100000_I0(this, A0o, 0);
        } else {
            viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0100000_I0_0(this, 22);
        }
        textView.setOnClickListener(viewOnClickEBaseShape0S0100000_I0_0);
        if (z) {
            View findViewById = findViewById(R.id.btn_skip_storage_settings);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 23));
        }
        C48802Nt r0 = new C48802Nt(this.A01, findViewById(R.id.bottom_button_container), getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
        this.A02 = r0;
        r0.A00();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        long A032 = this.A03.A03();
        boolean z = false;
        Log.i(String.format(Locale.ENGLISH, "insufficient-storage-activity/internal-storage available: %,d required: %,d", Long.valueOf(A032), Long.valueOf(this.A00)));
        if (A032 > this.A00) {
            Log.i("insufficient-storage-activity/space-available/finishing-the-activity");
            long j = this.A00;
            if (j > 0) {
                AnonymousClass20P r1 = new AnonymousClass20P();
                r1.A02 = Long.valueOf(j);
                if (findViewById(R.id.btn_skip_storage_settings).getVisibility() == 0) {
                    z = true;
                }
                r1.A00 = Boolean.valueOf(z);
                r1.A01 = 1;
                this.A04.A09(r1, 1);
                AnonymousClass00Y.A01(r1, "");
            }
            finish();
        }
    }
}
