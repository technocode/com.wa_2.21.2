package com.whatsapp;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass08B;
import X.AnonymousClass0AR;
import X.AnonymousClass0BP;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HR;
import X.AnonymousClass0L2;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass0XS;
import X.AnonymousClass0YX;
import X.AnonymousClass1KG;
import X.AnonymousClass1PN;
import X.AnonymousClass2C0;
import X.AnonymousClass2UT;
import X.AnonymousClass325;
import X.C000300f;
import X.C002001d;
import X.C004302a;
import X.C007003k;
import X.C03490Gl;
import X.C09040cC;
import X.C39031qq;
import X.C40461tJ;
import X.C40611tY;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.ContactQrActivity;
import com.whatsapp.settings.SettingsRowIconText;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;

public class Settings extends ActivityC004602e {
    public int A00;
    public ImageView A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public AnonymousClass0YX A04;
    public C007003k A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass1KG A08;
    public final AnonymousClass01I A09 = AnonymousClass01I.A00();
    public final C03490Gl A0A = C03490Gl.A00();
    public final C000300f A0B;
    public final C09040cC A0C;
    public final AnonymousClass1PN A0D;
    public final AnonymousClass0HJ A0E;
    public final AnonymousClass0BP A0F;
    public final AnonymousClass08B A0G;
    public final AnonymousClass0L2 A0H;
    public final AnonymousClass0XS A0I;
    public final AnonymousClass0AR A0J;
    public final AnonymousClass325 A0K;

    public Settings() {
        if (AnonymousClass1KG.A00 == null) {
            synchronized (AnonymousClass1KG.class) {
                if (AnonymousClass1KG.A00 == null) {
                    AnonymousClass1KG.A00 = new AnonymousClass1KG();
                }
            }
        }
        this.A08 = AnonymousClass1KG.A00;
        this.A0K = AnonymousClass325.A00();
        this.A0J = AnonymousClass0AR.A00();
        this.A0B = C000300f.A00();
        this.A0C = C09040cC.A00();
        this.A0H = AnonymousClass0L2.A01();
        this.A0E = AnonymousClass0HJ.A02();
        this.A0D = AnonymousClass1PN.A00();
        this.A0G = AnonymousClass08B.A00;
        this.A0F = new C40611tY(this);
        this.A0I = new C39031qq(this);
    }

    public final void A0T() {
        C007003k r2 = this.A05;
        if (r2 != null) {
            this.A04.A02(r2, this.A01);
            return;
        }
        AnonymousClass0HJ r3 = this.A0E;
        int i = this.A00;
        if (r3 != null) {
            this.A01.setImageBitmap(AnonymousClass0HJ.A01(this, R.drawable.avatar_contact, i, -1.0f));
            return;
        }
        throw null;
    }

    public void lambda$onCreate$1335$Settings(View view) {
        Intent intent = new Intent(this, ContactQrActivity.class);
        intent.putExtra("scan", false);
        startActivity(intent);
    }

    public /* synthetic */ void lambda$onCreate$1336$Settings(View view) {
        this.A0C.A02(this, 11);
    }

    public /* synthetic */ void lambda$onCreate$1338$Settings(View view) {
        startActivity(new Intent(this, SettingsAccount.class));
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (AnonymousClass2UT.A00) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        setTitle(r4.A06(R.string.settings_general));
        setContentView(R.layout.preferences);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A08(r4.A06(R.string.settings_general));
            A092.A0A(true);
        }
        AnonymousClass01I r6 = this.A09;
        r6.A04();
        AnonymousClass0HR r0 = r6.A01;
        this.A05 = r0;
        if (r0 == null) {
            Log.i("settings/create/no-me");
            if (((ActivityC004702f) this).A0F != null) {
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            throw null;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.pref_profile_small_photo_size);
        this.A00 = dimensionPixelSize;
        this.A04 = new AnonymousClass0YX(this.A0H, dimensionPixelSize, -1.0f);
        ImageView imageView = (ImageView) findViewById(R.id.profile_info_photo);
        this.A01 = imageView;
        imageView.setVisibility(0);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.profile_info_name);
        this.A02 = textEmojiLabel;
        textEmojiLabel.setVisibility(0);
        this.A02.A02(r6.A02());
        this.A03 = (TextEmojiLabel) findViewById(R.id.profile_info_status);
        findViewById(R.id.profile_info).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 7));
        A0T();
        this.A0G.A01(this.A0F);
        ImageView imageView2 = (ImageView) findViewById(R.id.profile_info_qr_code);
        C000300f r1 = this.A0B;
        if (r1.A0D(AbstractC000400g.A0N)) {
            imageView2.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 28));
            imageView2.setVisibility(0);
            imageView2.setContentDescription(r4.A06(R.string.settings_qr));
            C002001d.A2m(imageView2, C004302a.A00(this, R.color.settings_icon));
        } else if (r1 != null) {
            imageView2.setVisibility(8);
        } else {
            throw null;
        }
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.settings_help);
        settingsRowIconText.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, SettingsHelp.class, 2));
        settingsRowIconText.setIcon(new C40461tJ(r4, C004302a.A03(this, R.drawable.ic_settings_help)));
        findViewById(R.id.setting_tell_a_friend).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 29));
        View findViewById = findViewById(R.id.business_tools);
        View findViewById2 = findViewById(R.id.business_tools_divider);
        findViewById.setVisibility(8);
        findViewById2.setVisibility(8);
        SettingsRowIconText settingsRowIconText2 = (SettingsRowIconText) findViewById(R.id.settings_chat);
        settingsRowIconText2.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, SettingsChat.class, 2));
        settingsRowIconText2.setSubText(r4.A06(R.string.chat_settings_description_with_theme));
        SettingsRowIconText settingsRowIconText3 = (SettingsRowIconText) AnonymousClass0TX.A0A(this, R.id.settings_data_usage);
        settingsRowIconText3.setText(r4.A06(R.string.settings_storage_and_data_usage_enhanced));
        settingsRowIconText3.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, SettingsDataUsageActivity.class, 2));
        findViewById(R.id.settings_notifications).setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, SettingsNotifications.class, 2));
        findViewById(R.id.settings_account_info).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 30));
        this.A07 = false;
        r4.A0A.add(this.A0I);
        this.A06 = true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        if (this.A06) {
            this.A0G.A00(this.A0F);
            this.A04.A00();
            AnonymousClass01X r0 = ((AnonymousClass2C0) this).A01;
            r0.A0A.remove(this.A0I);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        if (this.A07) {
            this.A07 = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        AnonymousClass01I r2 = this.A09;
        r2.A04();
        this.A05 = r2.A01;
        this.A02.A02(r2.A02());
        this.A03.A02(this.A0A.A01());
    }
}
