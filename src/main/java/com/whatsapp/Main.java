package com.whatsapp;

import X.AbstractC07170We;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass010;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass03B;
import X.AnonymousClass0GE;
import X.AnonymousClass0GZ;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1IO;
import X.AnonymousClass1IP;
import X.AnonymousClass2C0;
import X.AnonymousClass323;
import X.C002001d;
import X.C002101e;
import X.C002601j;
import X.C014508d;
import X.C03290Fp;
import X.C40241ss;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.net.URISyntaxException;

public class Main extends AnonymousClass0GE {
    public C40241ss A00;
    public boolean A01;
    public final C03290Fp A02 = C03290Fp.A00();
    public final AnonymousClass03B A03 = AnonymousClass03B.A00();
    public final AnonymousClass0GZ A04 = AnonymousClass0GZ.A00();
    public final C014508d A05 = C014508d.A00();
    public final AnonymousClass010 A06 = AnonymousClass010.A00();
    public final AnonymousClass323 A07 = AnonymousClass323.A00();
    public final AnonymousClass00T A08 = C002101e.A00();
    public final WhatsAppLibLoader A09 = WhatsAppLibLoader.A00();

    public Main() {
        super(false);
    }

    public final void A0W() {
        if (!isFinishing()) {
            Intent intent = getIntent();
            if (!(intent == null || "android.intent.action.MAIN".equals(intent.getAction()) || (intent.getFlags() & 67108864) == 0)) {
                AnonymousClass00D r5 = ((ActivityC004702f) this).A0J;
                if (r5.A00.getInt("shortcut_version", 0) == 0) {
                    Log.i("main/recreate_shortcut");
                    String string = getString(R.string.app_name);
                    Intent intent2 = new Intent();
                    intent2.setClassName("com.whatsapp", "com.whatsapp.Main");
                    intent2.addFlags(268435456);
                    intent2.addFlags(67108864);
                    Intent intent3 = new Intent();
                    try {
                        intent3.putExtra("android.intent.extra.shortcut.INTENT", Intent.parseUri(intent2.toUri(0), 0));
                    } catch (URISyntaxException e) {
                        StringBuilder A0S = AnonymousClass008.A0S("registername/remove-shortcut cannot parse shortcut uri ");
                        A0S.append(e.getMessage());
                        Log.e(A0S.toString(), e);
                    }
                    intent3.putExtra("android.intent.extra.shortcut.NAME", string);
                    intent3.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                    sendBroadcast(intent3);
                    RegisterName.A04(this, getString(R.string.app_name));
                    AnonymousClass008.A0k(r5, "shortcut_version", 1);
                }
            }
            if (this.A01 && !isFinishing()) {
                startActivity(new Intent(this, HomeActivity.class));
                overridePendingTransition(0, 0);
            }
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0GE, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        C002601j.A01("Main/onCreate");
        try {
            AnonymousClass010 r3 = this.A06;
            r3.A06("Main");
            ((ActivityC004602e) this).A03 = false;
            super.onCreate(bundle);
            setTitle(((AnonymousClass2C0) this).A01.A06(R.string.launcher_app_name));
            if (!this.A09.A04()) {
                Log.i("aborting due to native libraries missing");
                startActivity(new Intent(this, CorruptInstallationActivity.class));
                finish();
            } else if (AnonymousClass03B.A01()) {
                Log.w("main/device-not-supported");
                setTheme(2131952176);
                APm(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
                C002601j.A00();
            } else {
                int A012 = this.A0P.A01();
                AnonymousClass01I r0 = ((AnonymousClass0GE) this).A01;
                r0.A04();
                Me me = r0.A00;
                if (me == null && A012 == 0) {
                    if (!isFinishing()) {
                        Intent intent = new Intent(this, EULA.class);
                        if (getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
                            intent.putExtra("show_registration_first_dlg", true);
                        }
                        startActivity(intent);
                        finishAffinity();
                    }
                    C002601j.A00();
                } else if (A012 == 6) {
                    if (!isFinishing()) {
                        startActivity(new Intent(this, DeleteAccountConfirmation.class));
                        finish();
                    }
                    C002601j.A00();
                } else {
                    if (me != null) {
                        C014508d r02 = this.A05;
                        r02.A05();
                        if (!r02.A01) {
                            AbstractC07170We r03 = ((AnonymousClass0GE) this).A00;
                            if (r03.A06.A08(r03.A03)) {
                                int A062 = ((AnonymousClass0GE) this).A0E.A06();
                                StringBuilder sb = new StringBuilder();
                                sb.append("main/create/backupfilesfound ");
                                sb.append(A062);
                                Log.i(sb.toString());
                                if (A062 > 0) {
                                    C002001d.A2O(this, 105);
                                } else {
                                    A0V(false);
                                }
                            }
                            ((ActivityC004602e) this).A03 = true;
                            A0R();
                            r3.A07("Main created");
                            C002601j.A00();
                        }
                    }
                    this.A01 = true;
                    A0T();
                    r3.A07("Main created");
                    C002601j.A00();
                }
            }
        } finally {
            C002601j.A00();
        }
    }

    @Override // X.AnonymousClass0GE, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        setTheme(2131952176);
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        Log.i("main/dialog/upgrade");
        this.A06.A02();
        AnonymousClass0MB r3 = new AnonymousClass0MB(this);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        String A062 = r2.A06(R.string.upgrade_question);
        AnonymousClass0MC r1 = r3.A01;
        r1.A0I = A062;
        r1.A0E = r2.A06(R.string.upgrade_message);
        r1.A0J = false;
        r3.A07(r2.A06(R.string.yes), new AnonymousClass1IP(this));
        r3.A05(r2.A06(R.string.later), new AnonymousClass1IO(this));
        return r3.A00();
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A01 = true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A01 = false;
    }
}
