package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC61472tE;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass0GP;
import X.AnonymousClass0GT;
import X.AnonymousClass0S2;
import X.AnonymousClass1PY;
import X.AnonymousClass208;
import X.AnonymousClass20F;
import X.AnonymousClass27v;
import X.AnonymousClass2C0;
import X.AnonymousClass3EN;
import X.C002301g;
import X.C018809u;
import X.C01970Ad;
import X.C01980Ae;
import X.C02660Cy;
import X.C03340Fu;
import X.C07400Xm;
import X.C28051Sr;
import X.C43751yt;
import X.C60922sD;
import X.C60982sJ;
import X.C61072sS;
import X.C61082sT;
import X.C61772ti;
import X.C62302uZ;
import X.C62982vf;
import X.C62992vg;
import X.C63812x3;
import X.C63842x6;
import X.C664234e;
import X.C664334g;
import X.C68393Da;
import X.C68473Di;
import X.C68683Ed;
import X.C69293Gm;
import X.C74463ay;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndiaUpiBankAccountPickerActivity extends AnonymousClass1PY implements AnonymousClass0GT, AbstractC61472tE {
    public View A00;
    public ListView A01;
    public C43751yt A02;
    public C74463ay A03;
    public C61082sT A04;
    public AnonymousClass3EN A05;
    public C664334g A06;
    public String A07;
    public ArrayList A08;
    public List A09;
    public final AnonymousClass02M A0A = AnonymousClass02M.A00();
    public final AnonymousClass20F A0B = new AnonymousClass20F();
    public final C02660Cy A0C = C02660Cy.A00();
    public final C60922sD A0D = C60922sD.A00();
    public final C68393Da A0E = C68393Da.A00();
    public final C07400Xm A0F = C07400Xm.A00();
    public final AnonymousClass0GP A0G = AnonymousClass0GP.A00();
    public final C01970Ad A0H = C01970Ad.A00();
    public final C68683Ed A0I = C68683Ed.A00();
    public final C61772ti A0J = C61772ti.A00();
    public final C018809u A0K = C018809u.A00("IndiaUpiBankAccountPickerActivity", "onboarding", "IN");
    public final C63812x3 A0L = new C63812x3(((AbstractActivityC34761jB) this).A0I);
    public final C63842x6 A0M = C63842x6.A00();

    public final void A0d(int i) {
        C018809u r2 = this.A0K;
        StringBuilder sb = new StringBuilder("showSuccessAndFinish: resId ");
        sb.append(i);
        r2.A07(null, sb.toString(), null);
        A0a();
        if (i == 0) {
            i = R.string.payments_setup_error;
            if ("upi-register-vpa".equalsIgnoreCase(this.A04.A03)) {
                i = R.string.payments_error_vpa_handle;
            }
        }
        if (((AnonymousClass1PY) this).A09) {
            A0Z();
            Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
            intent.putExtra("error", i);
            A0c(intent);
            A0I(intent, false);
            finish();
            return;
        }
        APo(i);
    }

    public final void A0e(C43751yt r4) {
        C018809u r2 = this.A0K;
        StringBuilder A0S = AnonymousClass008.A0S("showSuccessAndFinish: ");
        A0S.append(this.A04.toString());
        r2.A07(null, A0S.toString(), null);
        A0a();
        if (((AnonymousClass1PY) this).A09) {
            A0Z();
            finish();
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A0c(intent);
            A0I(intent, false);
            return;
        }
        this.A02 = r4;
        APo(R.string.payments_add_bank_success);
    }

    public void A0f(C43751yt r8, C61072sS r9) {
        String str;
        C018809u r3 = this.A0K;
        StringBuilder sb = new StringBuilder("onRegisterVpa registered: ");
        sb.append(r8);
        r3.A03(sb.toString());
        C68683Ed r2 = this.A0I;
        AnonymousClass208 A012 = r2.A01(5);
        C68393Da r1 = this.A0E;
        if (!TextUtils.isEmpty(r1.A04())) {
            r2.A04(r1.A04());
        }
        if (r9 != null) {
            A012.A05 = String.valueOf(r9.code);
            A012.A06 = r9.text;
        }
        int i = 1;
        if (r9 != null) {
            i = 2;
        }
        A012.A01 = Integer.valueOf(i);
        C74463ay r0 = this.A03;
        if (r0 != null) {
            str = r0.A09;
        } else {
            str = "";
        }
        A012.A04 = str;
        ((AnonymousClass1PY) this).A0A.A0B(A012, null, false);
        StringBuilder sb2 = new StringBuilder("logRegisterVpa: ");
        sb2.append(A012);
        r3.A03(sb2.toString());
        if (r8 != null) {
            C07400Xm r5 = this.A0F;
            String string = r5.A03.A01().getString("payments_inviter_jids", "");
            if (!TextUtils.isEmpty(string)) {
                C018809u r22 = r5.A05;
                StringBuilder sb3 = new StringBuilder("sending setup notif to inviters: ");
                sb3.append(string);
                r22.A07(null, sb3.toString(), null);
                String[] split = string.split(";");
                int length = split.length;
                if (length > 0) {
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2)) {
                            r5.A03(UserJid.getNullable(str2));
                        }
                    }
                }
            }
            A0e(r8);
        } else if (r9 == null || r9.code != 11472) {
            A0d(C69293Gm.A00(0, this.A04));
        } else {
            ((AbstractActivityC34761jB) this).A0J.A01(2, this);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r4) {
        C018809u r2 = this.A0K;
        StringBuilder sb = new StringBuilder("getPaymentMethods. paymentNetworkError: ");
        sb.append(r4);
        r2.A07(null, sb.toString(), null);
        A0d(C69293Gm.A00(r4.code, this.A04));
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r4) {
        C018809u r2 = this.A0K;
        StringBuilder sb = new StringBuilder("getPaymentMethods. paymentNetworkError: ");
        sb.append(r4);
        r2.A07(null, sb.toString(), null);
        if (!C69293Gm.A02(this, "upi-register-vpa", r4.code, true)) {
            A0d(C69293Gm.A00(r4.code, this.A04));
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r5) {
        C018809u r3 = this.A0K;
        StringBuilder A0S = AnonymousClass008.A0S("getPaymentMethods. onResponseSuccess: ");
        A0S.append(r5.A02);
        r3.A07(null, A0S.toString(), null);
        List list = ((C68473Di) r5).A00;
        if (list == null || list.isEmpty()) {
            A0d(C69293Gm.A00(0, this.A04));
            return;
        }
        C01980Ae r1 = ((AbstractActivityC34761jB) this).A0I;
        r1.A05(r1.A01("add_bank"));
        A0e(null);
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        this.A0K.A07(null, "onBackPressed", null);
        ArrayList<? extends Parcelable> arrayList = this.A0D.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A0c(intent);
            startActivity(intent);
        }
        finish();
        AnonymousClass20F r1 = this.A0B;
        r1.A00 = Boolean.TRUE;
        ((AnonymousClass1PY) this).A0A.A07(r1);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        long j;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        getWindow().addFlags(8192);
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            this.A08 = getIntent().getExtras().getParcelableArrayList("extra_accounts_list");
            this.A07 = getIntent().getExtras().getString("extra_selected_account_bank_logo");
            C60922sD r12 = this.A0D;
            C61082sT r1 = r12.A04;
            this.A04 = r1;
            r1.A01("upi-bank-account-picker");
            AnonymousClass02M r7 = this.A0A;
            C63842x6 r8 = this.A0M;
            C01970Ad r9 = this.A0H;
            AnonymousClass04j r10 = ((ActivityC004702f) this).A0H;
            C01980Ae r11 = ((AbstractActivityC34761jB) this).A0I;
            C03340Fu r13 = ((AbstractActivityC34761jB) this).A0J;
            AnonymousClass0GP r14 = this.A0G;
            C68393Da r15 = this.A0E;
            this.A05 = new AnonymousClass3EN(this, r7, r8, r9, r10, r11, r12, r13, r14, r15, this);
            File file = new File(getCacheDir(), "BankLogos");
            if (!file.mkdirs() && !file.isDirectory()) {
                this.A0K.A07(null, "BankAccountPickerUI/create unable to create bank logos cache directory", null);
            }
            C664234e r2 = new C664234e(r7, this.A0C, file);
            r2.A01 = (int) (C002301g.A0K.A00 * 40.0f);
            this.A06 = r2.A00();
            AnonymousClass20F r3 = this.A0B;
            r3.A03 = this.A0J.A02;
            setContentView(R.layout.india_upi_bank_account_picker);
            this.A09 = new ArrayList();
            ArrayList arrayList = this.A08;
            if (arrayList != null) {
                j = (long) arrayList.size();
            } else {
                j = 0;
            }
            r3.A02 = Long.valueOf(j);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C74463ay r16 = (C74463ay) it.next();
                this.A09.add(new C62982vf(r16.A06, C28051Sr.A14(((AnonymousClass27v) r16).A06), ((AnonymousClass27v) r16).A05));
            }
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A0A(true);
                A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.payments_bank_account_picker_activity_title));
            }
            if (this.A09 != null) {
                this.A01 = (ListView) findViewById(R.id.bank_account_picker_list);
                C62992vg r17 = new C62992vg(this, this);
                this.A01.setAdapter((ListAdapter) r17);
                r17.A00 = this.A09;
                r17.notifyDataSetChanged();
                this.A01.setOnItemClickListener(new C62302uZ(this));
            }
            AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
            ((TextView) findViewById(R.id.footer_processed_by_psp)).setText(r4.A0D(R.string.payments_processed_by_psp, r4.A06(r15.A02())));
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A05.A01 = null;
        this.A0H.A05(this);
        this.A06.A01.A01(false);
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0K.A07(null, "action bar home", null);
        ArrayList<? extends Parcelable> arrayList = this.A0D.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A0c(intent);
            startActivity(intent);
        }
        finish();
        return true;
    }
}
