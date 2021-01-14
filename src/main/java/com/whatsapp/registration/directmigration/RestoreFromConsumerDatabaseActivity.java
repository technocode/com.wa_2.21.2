package com.whatsapp.registration.directmigration;

import X.ActivityC004602e;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01J;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02J;
import X.AnonymousClass094;
import X.AnonymousClass09E;
import X.AnonymousClass0AR;
import X.AnonymousClass0BB;
import X.AnonymousClass0BD;
import X.AnonymousClass0BE;
import X.AnonymousClass0BZ;
import X.AnonymousClass0DG;
import X.AnonymousClass0EO;
import X.AnonymousClass0EP;
import X.AnonymousClass0FV;
import X.AnonymousClass0FW;
import X.AnonymousClass0FY;
import X.AnonymousClass0FZ;
import X.AnonymousClass0GW;
import X.AnonymousClass0HM;
import X.AnonymousClass0HN;
import X.AnonymousClass0I6;
import X.AnonymousClass0IX;
import X.AnonymousClass0PB;
import X.AnonymousClass2C0;
import X.AnonymousClass321;
import X.AnonymousClass3ZJ;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C014508d;
import X.C016608y;
import X.C02290Bk;
import X.C03160Fa;
import X.C06310Ss;
import X.C06470Tj;
import X.C70853Mq;
import X.C70863Mr;
import X.C70893Mu;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.components.RoundCornerProgressBar;

public class RestoreFromConsumerDatabaseActivity extends ActivityC004602e {
    public WaButton A00;
    public WaTextView A01;
    public WaTextView A02;
    public WaTextView A03;
    public WaTextView A04;
    public GoogleDriveRestoreAnimationView A05;
    public RoundCornerProgressBar A06;
    public C70893Mu A07;
    public final AnonymousClass01I A08 = AnonymousClass01I.A00();
    public final C000300f A09 = C000300f.A00();
    public final AnonymousClass01J A0A = AnonymousClass01J.A00();
    public final AnonymousClass01A A0B = AnonymousClass01A.A00();
    public final AnonymousClass0HN A0C = AnonymousClass0HN.A00();
    public final AnonymousClass00C A0D = AnonymousClass00C.A00();
    public final AnonymousClass0BD A0E = AnonymousClass0BD.A00();
    public final C06310Ss A0F = C06310Ss.A00();
    public final AnonymousClass0DG A0G = AnonymousClass0DG.A00();
    public final AnonymousClass0GW A0H = AnonymousClass0GW.A00();
    public final AnonymousClass0EP A0I = AnonymousClass0EP.A00();
    public final C016608y A0J = C016608y.A01;
    public final AnonymousClass01T A0K = AnonymousClass01T.A00();
    public final C02290Bk A0L = C02290Bk.A02();
    public final AnonymousClass0I6 A0M = AnonymousClass0I6.A00();
    public final AnonymousClass094 A0N = AnonymousClass094.A00();
    public final C014508d A0O = C014508d.A00();
    public final AnonymousClass09E A0P = AnonymousClass09E.A00();
    public final AnonymousClass0IX A0Q = AnonymousClass0IX.A00();
    public final AnonymousClass0PB A0R = AnonymousClass0PB.A00();
    public final AnonymousClass0EO A0S = AnonymousClass0EO.A00();
    public final C03160Fa A0T = C03160Fa.A00();
    public final AnonymousClass0FZ A0U = AnonymousClass0FZ.A00();
    public final AnonymousClass0AR A0V = AnonymousClass0AR.A00();
    public final AnonymousClass0HM A0W = AnonymousClass0HM.A00();
    public final AnonymousClass0FV A0X = AnonymousClass0FV.A00();
    public final AnonymousClass0FW A0Y = AnonymousClass0FW.A00();
    public final AnonymousClass0FY A0Z = AnonymousClass0FY.A00();
    public final AnonymousClass0BE A0a = AnonymousClass0BE.A01();
    public final AnonymousClass0BB A0b = AnonymousClass0BB.A00();
    public final AnonymousClass02J A0c = AnonymousClass02J.A02();
    public final AnonymousClass321 A0d = AnonymousClass321.A00();
    public final AnonymousClass0BZ A0e = AnonymousClass0BZ.A00();
    public final AnonymousClass00T A0f = C002101e.A00();

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
    }

    public final void A0T() {
        this.A05.A02(true);
        this.A04.setText(((AnonymousClass2C0) this).A01.A06(R.string.migration_title_error_title));
        this.A00.setVisibility(0);
        this.A01.setVisibility(8);
    }

    public final void A0U() {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A05;
        if (googleDriveRestoreAnimationView.A01 != 1) {
            googleDriveRestoreAnimationView.A00();
        }
        this.A01.setVisibility(0);
        this.A00.setVisibility(8);
        WaTextView waTextView = this.A04;
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        waTextView.setText(r2.A06(R.string.migration_title));
        this.A03.setText(r2.A06(R.string.migration_restore_from_source_app_do_not_close));
        this.A01.setText(r2.A06(R.string.migration_transferring_chats_and_media));
    }

    public /* synthetic */ void lambda$null$2460$RestoreFromConsumerDatabaseActivity(View view) {
        setResult(2);
        finish();
    }

    public void lambda$onCreate$2459$RestoreFromConsumerDatabaseActivity(View view) {
        this.A07.A02();
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A05;
        googleDriveRestoreAnimationView.A0B = false;
        googleDriveRestoreAnimationView.A0A = null;
        googleDriveRestoreAnimationView.A00();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.restore_from_consumer_layout);
        this.A04 = (WaTextView) findViewById(R.id.restore_from_consumer_title);
        this.A03 = (WaTextView) findViewById(R.id.restore_from_consumer_sub_title);
        this.A01 = (WaTextView) findViewById(R.id.restore_from_consumer_bottom_info);
        this.A00 = (WaButton) findViewById(R.id.restore_from_consumer_action_btn);
        this.A02 = (WaTextView) findViewById(R.id.restore_from_consumer_progress_description);
        this.A06 = (RoundCornerProgressBar) findViewById(R.id.restore_from_consumer_progress_bar);
        this.A05 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_from_consumer_animation_view);
        findViewById(R.id.restore_from_consumer_background_image).setBackgroundDrawable(new C06470Tj(((AnonymousClass2C0) this).A01, C004302a.A03(this, R.drawable.graphic_migration)));
        this.A00.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 31));
        A0U();
        C70893Mu r0 = (C70893Mu) C002001d.A0l(this, new AnonymousClass3ZJ(this)).A00(C70893Mu.class);
        this.A07 = r0;
        r0.A02.A03(this, new C70863Mr(this));
        this.A07.A04.A03(this, new C70853Mq(this));
    }
}
