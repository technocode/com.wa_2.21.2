package com.whatsapp.registration;

import X.AbstractC011406u;
import X.AbstractC658731w;
import X.AbstractC658931z;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03B;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass0FE;
import X.AnonymousClass0FV;
import X.AnonymousClass0FW;
import X.AnonymousClass0HE;
import X.AnonymousClass0HI;
import X.AnonymousClass0HM;
import X.AnonymousClass0HP;
import X.AnonymousClass0I2;
import X.AnonymousClass0JC;
import X.AnonymousClass0JD;
import X.AnonymousClass0KQ;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass170;
import X.AnonymousClass2OC;
import X.AnonymousClass309;
import X.AnonymousClass30L;
import X.AnonymousClass325;
import X.AnonymousClass36D;
import X.C001801b;
import X.C002001d;
import X.C002101e;
import X.C007603r;
import X.C008805h;
import X.C014708f;
import X.C02660Cy;
import X.C03160Fa;
import X.C05710Pt;
import X.C05720Pu;
import X.C09930dl;
import X.C34571ik;
import X.C34581il;
import X.C35601kc;
import X.C456325q;
import X.C74853be;
import X.DialogInterface$OnCancelListenerC65042zD;
import X.DialogInterface$OnCancelListenerC65062zF;
import X.DialogInterface$OnClickListenerC65012zA;
import X.DialogInterface$OnClickListenerC65022zB;
import X.DialogInterface$OnClickListenerC65032zC;
import X.DialogInterface$OnClickListenerC65052zE;
import X.DialogInterface$OnClickListenerC65072zG;
import X.DialogInterface$OnClickListenerC65082zH;
import X.DialogInterface$OnClickListenerC65092zI;
import android.app.Activity;
import android.app.Dialog;
import android.app.backup.BackupManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.InsufficientStorageSpaceActivity;
import com.whatsapp.Main;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EULA extends ActivityC004602e {
    public int A00 = 0;
    public View A01 = null;
    public ViewTreeObserver.OnGlobalLayoutListener A02 = new AnonymousClass309(this);
    public AnonymousClass30L A03;
    public AnonymousClass0JD A04;
    public final AnonymousClass03B A05 = AnonymousClass03B.A00();
    public final AnonymousClass0HI A06 = AnonymousClass0HI.A00();
    public final AnonymousClass00C A07 = AnonymousClass00C.A00();
    public final AnonymousClass04j A08 = AnonymousClass04j.A00();
    public final AnonymousClass03P A09 = AnonymousClass03P.A00();
    public final AnonymousClass03S A0A = AnonymousClass03S.A00();
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final AnonymousClass0M9 A0C = AnonymousClass0M9.A01();
    public final AnonymousClass2OC A0D = AnonymousClass2OC.A00();
    public final AnonymousClass0KQ A0E = AnonymousClass0KQ.A00();
    public final C02660Cy A0F = C02660Cy.A00();
    public final C03160Fa A0G = C03160Fa.A00();
    public final AnonymousClass0FE A0H = AnonymousClass0FE.A00();
    public final AnonymousClass0HM A0I = AnonymousClass0HM.A00();
    public final C014708f A0J = C014708f.A00();
    public final AnonymousClass0HP A0K = AnonymousClass0HP.A00();
    public final AnonymousClass0FV A0L = AnonymousClass0FV.A00();
    public final AnonymousClass0FW A0M = AnonymousClass0FW.A00();
    public final AbstractC658731w A0N = AbstractC658731w.A00();
    public final AbstractC658931z A0O = AbstractC658931z.A00();
    public final AnonymousClass325 A0P = AnonymousClass325.A00();
    public final AnonymousClass0HE A0Q = AnonymousClass0HE.A00();
    public final AnonymousClass0JC A0R = AnonymousClass0JC.A00();
    public final AnonymousClass00T A0S = C002101e.A00();

    public static Intent A04(Activity activity) {
        return new Intent(activity, EULA.class).setFlags(268468224);
    }

    public void A0T() {
        if (AnonymousClass0I2.A00(this).exists()) {
            AnonymousClass008.A0m(super.A0J, "backup_token_source", "google_backup");
        } else if (Build.VERSION.SDK_INT >= 26 && C002001d.A3F(this)) {
            C34571ik r2 = new C34571ik((Activity) this);
            C001801b.A1Q("com.whatsapp");
            AbstractC011406u A012 = r2.A01(new C456325q(new C35601kc()));
            try {
                C008805h.A0Y(A012, 10, TimeUnit.SECONDS);
                if (A012.A04()) {
                    Log.i("eula/create/success retrieving data from account transfer");
                    byte[] bArr = (byte[]) A012.A03();
                    if (bArr == null || bArr.length == 0) {
                        Log.i("eula/create/encoded backup token is not present");
                        return;
                    }
                    synchronized (AnonymousClass0I2.A00) {
                        try {
                            C007603r.A06(bArr, AnonymousClass0I2.A00(this));
                        } catch (IOException e) {
                            Log.e("BackupTokenUtils/setEncodedBackupToken/unable to write to file", e);
                        }
                    }
                    new BackupManager(this).dataChanged();
                    AnonymousClass008.A0m(super.A0J, "backup_token_source", "device_to_device_transfer");
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                if (!(e2 instanceof ExecutionException) || !(e2.getCause() instanceof C34581il) || ((AnonymousClass170) e2.getCause()).mStatus.A01 != 20501) {
                    Log.e("eula/create/exception during retrieving data from account transfer", e2);
                } else {
                    Log.i("eula/create/no data found from account transfer");
                }
            }
        }
    }

    public final void A0U(SpannableString spannableString, URLSpan uRLSpan, String str) {
        int spanStart = spannableString.getSpanStart(uRLSpan);
        int spanEnd = spannableString.getSpanEnd(uRLSpan);
        int spanFlags = spannableString.getSpanFlags(uRLSpan);
        spannableString.removeSpan(uRLSpan);
        spannableString.setSpan(new C74853be(this, this, ((ActivityC004702f) this).A0F, this.A09, ((ActivityC004602e) this).A04, uRLSpan.getURL(), str), spanStart, spanEnd, spanFlags);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void lambda$onCreate$2403$EULA(android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.lambda$onCreate$2403$EULA(android.view.View):void");
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0M.A02();
        ((ActivityC004602e) this).A03 = false;
        AnonymousClass00T r12 = this.A0S;
        this.A03 = new AnonymousClass30L(r12, this.A0C, this.A0B, this.A0D, this.A0F);
        setContentView(R.layout.eula);
        View findViewById = findViewById(R.id.eula_layout);
        AnonymousClass00D r6 = super.A0J;
        r6.A0K();
        if (this.A07.A03() < 10000000) {
            startActivity(new Intent(this, InsufficientStorageSpaceActivity.class).setFlags(268435456).putExtra("allowSkipKey", false).putExtra("spaceNeededInBytes", 10000000L));
        }
        if (this.A0J.A01() != 0) {
            Log.e("eula/create/wrong-state bounce to main");
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        r12.ANC(new C09930dl(this), new Void[0]);
        SpannableString spannableString = new SpannableString(Html.fromHtml(getString(R.string.eula_terms_of_service, getString(R.string.eula_agree))));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                if ("privacy-policy".equals(url)) {
                    A0U(spannableString, uRLSpan, "https://www.whatsapp.com/legal/#privacy-policy");
                } else if ("terms-and-privacy-policy".equals(url)) {
                    A0U(spannableString, uRLSpan, "https://www.whatsapp.com/legal/#terms-of-service");
                }
            }
        }
        View findViewById2 = findViewById(R.id.eula_view);
        if (findViewById2 != null) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById2;
            textEmojiLabel.A07 = new C05710Pt();
            textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
            textEmojiLabel.setText(spannableString);
            textEmojiLabel.setHighlightColor(0);
            textEmojiLabel.getTextSize();
            View findViewById3 = findViewById(R.id.eula_accept);
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 24));
                if (getIntent().getBooleanExtra("show_registration_first_dlg", false)) {
                    C002001d.A2O(this, 1);
                }
                this.A0I.A0C(0);
                if (this.A05.A04()) {
                    Log.w("eula/clock-wrong");
                    C002001d.A3J(this, this.A0G, this.A0H);
                }
                r6.A0c(false);
                this.A01 = findViewById(R.id.eula_logo);
                if (findViewById != null) {
                    findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
                }
                this.A06.A03();
                if (!r6.A00.getBoolean("is_eula_loaded_once", false)) {
                    r12.ANF(new RunnableEBaseShape12S0100000_I1_7(this, 24));
                    AnonymousClass008.A0n(r6, "is_eula_loaded_once", true);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        String str;
        Set set;
        if (i == 1) {
            AnonymousClass0MB r2 = new AnonymousClass0MB(this);
            r2.A01(R.string.register_first);
            r2.A04(R.string.ok, new DialogInterface$OnClickListenerC65052zE(this));
            return r2.A00();
        } else if (i != 2) {
            switch (i) {
                case 5:
                    AnonymousClass0JD r0 = this.A04;
                    if (r0 == null || (set = r0.A00) == null || set.isEmpty()) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (AnonymousClass36D r1 : this.A04.A00) {
                            sb.append('\t');
                            sb.append(r1.A00);
                            sb.append('\n');
                        }
                        sb.setLength(sb.length() - 1);
                        str = sb.toString();
                    }
                    AnonymousClass0MB r22 = new AnonymousClass0MB(this);
                    String string = getString(R.string.task_killer_info_modern, str);
                    AnonymousClass0MC r12 = r22.A01;
                    r12.A0E = string;
                    r12.A02 = new DialogInterface$OnCancelListenerC65042zD(this);
                    return r22.A00();
                case 6:
                    this.A00 = 1;
                    AnonymousClass0MB r23 = new AnonymousClass0MB(this);
                    r23.A02(R.string.alert);
                    r23.A01(R.string.task_killer_detected);
                    r23.A01.A0J = false;
                    r23.A04(R.string.dialog_button_more_info, new DialogInterface$OnClickListenerC65032zC(this));
                    r23.A03(R.string.ok, new DialogInterface$OnClickListenerC65082zH(this));
                    return r23.A00();
                case 7:
                    AnonymousClass0MB r3 = new AnonymousClass0MB(this);
                    String string2 = getString(R.string.custom_rom_info_app_name, getString(R.string.localized_app_name));
                    AnonymousClass0MC r13 = r3.A01;
                    r13.A0E = string2;
                    r13.A02 = new DialogInterface$OnCancelListenerC65062zF(this);
                    return r3.A00();
                case 8:
                    this.A00 = 2;
                    AnonymousClass0MB r24 = new AnonymousClass0MB(this);
                    r24.A02(R.string.alert);
                    r24.A01(R.string.custom_rom_detected);
                    r24.A01.A0J = false;
                    r24.A04(R.string.dialog_button_more_info, new DialogInterface$OnClickListenerC65092zI(this));
                    r24.A03(R.string.ok, new DialogInterface$OnClickListenerC65022zB(this));
                    return r24.A00();
                case 9:
                    AnonymousClass0MB r25 = new AnonymousClass0MB(this);
                    r25.A02(R.string.alert);
                    r25.A01(R.string.clock_wrong);
                    r25.A04(R.string.ok, new DialogInterface$OnClickListenerC65072zG(this));
                    return r25.A00();
                default:
                    return super.onCreateDialog(i);
            }
        } else {
            AnonymousClass0MB r26 = new AnonymousClass0MB(this);
            r26.A02(R.string.alert);
            r26.A01(R.string.registration_cellular_network_required);
            r26.A04(R.string.ok, new DialogInterface$OnClickListenerC65012zA(this));
            return r26.A00();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A03.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            AnonymousClass0HP r2 = this.A0K;
            r2.A02("eula");
            this.A03.A01(this, r2, "eula");
            return true;
        } else if (itemId != 1) {
            return false;
        } else {
            new File(getFilesDir(), "rc2").delete();
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        int i = this.A00;
        if (i == 1) {
            C002001d.A2O(this, 6);
        } else if (i == 2) {
            C002001d.A2O(this, 8);
        }
    }
}
