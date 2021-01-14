package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.ActivityC004702f;
import X.AnonymousClass01X;
import X.AnonymousClass0JW;
import X.AnonymousClass0S2;
import X.AnonymousClass0SE;
import X.AnonymousClass0YP;
import X.AnonymousClass1PY;
import X.AnonymousClass20E;
import X.AnonymousClass2C0;
import X.C002301g;
import X.C004302a;
import X.C018809u;
import X.C10120e5;
import X.C60922sD;
import X.C61082sT;
import X.C61772ti;
import X.C62312ua;
import X.C63012vi;
import X.C63022vj;
import X.C664234e;
import X.C664334g;
import X.C68683Ed;
import X.C69253Gi;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.util.ArrayList;

public final class IndiaUpiBankPickerActivity extends AnonymousClass1PY {
    public View A00;
    public ListView A01;
    public TextView A02;
    public AnonymousClass0YP A03;
    public C61082sT A04;
    public C63022vj A05;
    public C10120e5 A06;
    public C664334g A07;
    public String A08;
    public ArrayList A09;
    public ArrayList A0A;
    public final AnonymousClass20E A0B = new AnonymousClass20E();
    public final C60922sD A0C = C60922sD.A00();
    public final C68683Ed A0D = C68683Ed.A00();
    public final C61772ti A0E = C61772ti.A00();
    public final C018809u A0F = C018809u.A00("IndiaUpiBankPickerActivity", "onboarding", "IN");

    public /* synthetic */ void lambda$onSearchRequested$20$IndiaUpiBankPickerActivity(View view) {
        A0a();
        this.A03.A04(true);
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        if (this.A03.A05()) {
            this.A03.A04(true);
            AnonymousClass20E r1 = this.A0B;
            r1.A01 = Boolean.TRUE;
            ((AnonymousClass1PY) this).A0A.A07(r1);
            return;
        }
        A0Z();
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.A09 = extras.getParcelableArrayList("extra_banks_list");
            File file = new File(getCacheDir(), "BankLogos");
            if (!file.mkdirs() && !file.isDirectory()) {
                this.A0F.A07(null, "create unable to create bank logos cache directory", null);
            }
            C664234e r2 = new C664234e(((ActivityC004702f) this).A0F, ((ActivityC004702f) this).A0O, file);
            r2.A04 = C004302a.A03(this, R.drawable.bank_logo_placeholder);
            r2.A03 = C004302a.A03(this, R.drawable.bank_logo_placeholder);
            r2.A01 = (int) (C002301g.A0K.A00 * 40.0f);
            this.A07 = r2.A00();
            setContentView(R.layout.india_upi_payment_bank_picker);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            A0C(toolbar);
            AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
            this.A03 = new AnonymousClass0YP(this, r6, findViewById(R.id.search_holder), toolbar, new C69253Gi(this));
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A0A(true);
                A092.A08(r6.A06(R.string.payments_bank_picker_activity_title));
            }
            if (this.A09 != null) {
                this.A01 = (ListView) findViewById(R.id.bank_picker_list);
                TextView textView = (TextView) findViewById(R.id.bank_picker_empty_tv);
                this.A02 = textView;
                this.A01.setEmptyView(textView);
                this.A05 = new C63022vj(this, this);
                this.A01.setFastScrollEnabled(true);
                this.A01.setAdapter((ListAdapter) this.A05);
                this.A01.setOnItemClickListener(new C62312ua(this));
                C63022vj r1 = this.A05;
                r1.A00 = this.A09;
                r1.notifyDataSetChanged();
            } else {
                this.A0F.A06("onboarding", "got empty banks", null);
            }
            C61082sT r12 = this.A0C.A04;
            this.A04 = r12;
            r12.A01("upi-bank-picker");
            this.A0D.AQ7();
            AnonymousClass20E r22 = this.A0B;
            r22.A08 = this.A0E.A02;
            r22.A02 = Boolean.FALSE;
            this.A01.setOnScrollListener(new C63012vi(this));
            r22.A00 = Boolean.valueOf(((AbstractActivityC34761jB) this).A0I.A0B("add_bank"));
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, ((AnonymousClass2C0) this).A01.A07(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(9);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C10120e5 r0 = this.A06;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A06 = null;
        }
        this.A07.A01.A01(false);
    }

    @Override // X.AnonymousClass1PY, X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            this.A0F.A03("action bar home");
            A0Z();
            finish();
            return true;
        }
    }

    public boolean onSearchRequested() {
        this.A0B.A03 = Boolean.TRUE;
        this.A03.A01();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        AnonymousClass0SE.A05(r5, this.A03.A01, applyDimension, 0);
        AnonymousClass0SE.A05(r5, this.A03.A03.findViewById(R.id.search_back), (int) TypedValue.applyDimension(1, 8.0f, displayMetrics), 0);
        AnonymousClass0YP r2 = this.A03;
        String A062 = r5.A06(R.string.payments_bank_picker_search_query_hint);
        SearchView searchView = r2.A01;
        if (searchView != null) {
            searchView.setQueryHint(A062);
        }
        findViewById(R.id.search_back).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 11));
        return false;
    }
}
