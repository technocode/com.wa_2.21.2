package com.whatsapp.inappsupport.ui;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass09H;
import X.AnonymousClass0J8;
import X.AnonymousClass0JB;
import X.AnonymousClass0JW;
import X.AnonymousClass0M9;
import X.C002101e;
import X.C004302a;
import X.C03190Fd;
import X.C04090Iz;
import X.C10300eP;
import X.C10310eQ;
import X.C26401Ks;
import X.C39481rb;
import X.C44221zh;
import X.C48802Nt;
import X.C49482Qq;
import X.C49502Qs;
import X.C55172g7;
import X.C55182g8;
import X.C55192g9;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

public class ContactUsActivity extends ActivityC004602e implements AnonymousClass0J8 {
    public EditText A00;
    public TextView A01;
    public AppCompatCheckBox A02;
    public C48802Nt A03;
    public C10310eQ A04;
    public AnonymousClass0JB A05 = new C55172g7(this);
    public AnonymousClass0JB A06 = new C55182g8(this);
    public C10300eP A07;
    public C55192g9 A08 = new C55192g9(this);
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final C26401Ks A0D = C26401Ks.A00();
    public final C04090Iz A0E = C04090Iz.A01;
    public final AnonymousClass02M A0F = AnonymousClass02M.A00();
    public final AnonymousClass00C A0G = AnonymousClass00C.A00();
    public final AnonymousClass01X A0H = AnonymousClass01X.A00();
    public final AnonymousClass0M9 A0I = AnonymousClass0M9.A01();
    public final AnonymousClass00Y A0J = AnonymousClass00Y.A00();
    public final AnonymousClass09H A0K = AnonymousClass09H.A01();
    public final C03190Fd A0L = C03190Fd.A00();
    public final AnonymousClass00T A0M = C002101e.A00();

    public static void A04(ContactUsActivity contactUsActivity, C49502Qs r14, int i) {
        if (contactUsActivity != null) {
            int i2 = r14.A00;
            if (i2 != 0) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList.add(new C49482Qq((String) r14.A04.get(i3), (String) r14.A06.get(i3), null, false, (String) r14.A03.get(i3), (String) r14.A07.get(i3), null));
                }
                int i4 = 2;
                if (i == 2) {
                    i4 = 1;
                }
                Intent intent = new Intent(contactUsActivity, SupportTopicsActivity.class);
                intent.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
                intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 2);
                intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", i4);
                intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", i);
                intent.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info", r14.A01);
                contactUsActivity.startActivityForResult(intent, 11);
            } else if (i == 2) {
                contactUsActivity.A0V(null);
            } else {
                contactUsActivity.A0W(null);
            }
        } else {
            throw null;
        }
    }

    public final void A0T(int i) {
        AnonymousClass0JB r11;
        int length = AnonymousClass008.A0B(this.A00).getBytes().length;
        if (this.A0C || length >= 10) {
            this.A01.setVisibility(8);
            this.A00.setBackgroundDrawable(C004302a.A03(this, R.drawable.describe_problem_edittext_state_list));
            AnonymousClass00T r1 = this.A0M;
            if (i == 1) {
                r11 = this.A05;
            } else {
                r11 = this.A06;
            }
            C10300eP r0 = this.A07;
            if (r0 != null && ((AnonymousClass0JW) r0).A00.getStatus() == AsyncTask.Status.RUNNING) {
                ((AnonymousClass0JW) this.A07).A00.cancel(false);
            }
            C10300eP r3 = new C10300eP(this, this.A0L, this.A0I, this.A0H, this.A0E, this.A0G, super.A0J, r11, this.A0A, this.A0B, null, AnonymousClass008.A0B(this.A00), new Uri[0]);
            this.A07 = r3;
            r1.ANC(r3, new Void[0]);
            return;
        }
        this.A00.setBackgroundDrawable(C004302a.A03(this, R.drawable.describe_problem_edittext_bg_error));
        if (length == 0) {
            this.A01.setText(getString(R.string.describe_problem_description));
        } else {
            this.A01.setText(getString(R.string.describe_problem_description_further));
        }
        this.A01.setVisibility(0);
    }

    public final void A0U(int i, String str) {
        C44221zh r2 = new C44221zh();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = str;
        r2.A02 = this.A0H.A04();
        this.A0J.A09(r2, 1);
        AnonymousClass00Y.A01(r2, "");
    }

    public final void A0V(String str) {
        String A0B2 = AnonymousClass008.A0B(this.A00);
        A0U(3, A0B2);
        C26401Ks r4 = this.A0D;
        String str2 = this.A0A;
        String str3 = this.A09;
        String str4 = this.A0B;
        Uri[] uriArr = new Uri[0];
        boolean isChecked = this.A02.isChecked();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 0; i++) {
            Uri uri = uriArr[i];
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        r4.A01(this, str2, A0B2, str3, str4, arrayList, null, str, isChecked);
    }

    public final void A0W(String str) {
        String str2 = str;
        AnonymousClass00T r1 = this.A0M;
        C55192g9 r12 = this.A08;
        C10310eQ r0 = this.A04;
        if (r0 != null && ((AnonymousClass0JW) r0).A00.getStatus() == AsyncTask.Status.RUNNING) {
            ((AnonymousClass0JW) this.A04).A00.cancel(false);
        }
        AnonymousClass02M r5 = this.A0F;
        AnonymousClass09H r6 = this.A0K;
        C04090Iz r7 = this.A0E;
        String A0B2 = AnonymousClass008.A0B(this.A00);
        if (!this.A02.isChecked()) {
            str2 = null;
        }
        C10310eQ r3 = new C10310eQ(this, r5, r6, r7, A0B2, str2, getString(R.string.support_ticket_sending), this.A02.isChecked(), r12);
        this.A04 = r3;
        r1.ANC(r3, new Void[0]);
    }

    @Override // X.AnonymousClass0J8
    public void AJM(boolean z) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$1378$ContactUsActivity(View view) {
        onBackPressed();
    }

    public /* synthetic */ void lambda$onCreate$1379$ContactUsActivity(View view) {
        A0T(1);
    }

    public /* synthetic */ void lambda$onCreate$1380$ContactUsActivity(View view) {
        AppCompatCheckBox appCompatCheckBox = this.A02;
        appCompatCheckBox.setChecked(!appCompatCheckBox.isChecked());
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            String str = null;
            if (intent != null) {
                if (intent.getIntExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", 1) == 2) {
                    A0V(null);
                    return;
                }
                str = intent.getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info");
            }
            A0W(str);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        A0U(1, null);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03.A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x014d  */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.ui.ContactUsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.contact_us_email)).setShowAsAction(0);
        return true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C39481rb r0 = this.A0D.A00;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(false);
        }
        C10300eP r02 = this.A07;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(false);
        }
        C10310eQ r03 = this.A04;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(false);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            A0U(1, null);
            finish();
            return true;
        } else if (itemId != R.id.menuitem_contact_us_email) {
            return false;
        } else {
            A0T(2);
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A00.clearFocus();
    }
}
