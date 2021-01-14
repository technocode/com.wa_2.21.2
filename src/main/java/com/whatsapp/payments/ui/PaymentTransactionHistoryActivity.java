package com.whatsapp.payments.ui;

import X.AbstractC000400g;
import X.AbstractC16300pa;
import X.AbstractC29091Wz;
import X.AbstractC61092sU;
import X.AbstractC61862tr;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0AD;
import X.AnonymousClass0AM;
import X.AnonymousClass0BA;
import X.AnonymousClass0JW;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0YP;
import X.AnonymousClass1X3;
import X.AnonymousClass1X4;
import X.AnonymousClass2C0;
import X.AnonymousClass2w3;
import X.AnonymousClass3GL;
import X.AnonymousClass3GN;
import X.AnonymousClass3HF;
import X.AnonymousClass3HG;
import X.AnonymousClass3HJ;
import X.C002001d;
import X.C002101e;
import X.C018809u;
import X.C01970Ad;
import X.C02040Ak;
import X.C02150Av;
import X.C10020du;
import X.C10030dv;
import X.C68783En;
import X.DialogInterface$OnClickListenerC62902vX;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.MultiExclusionChip;
import com.whatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class PaymentTransactionHistoryActivity extends ActivityC004602e implements AbstractC61092sU, AbstractC61862tr {
    public ProgressBar A00;
    public TextView A01;
    public AnonymousClass0YP A02;
    public AnonymousClass02N A03;
    public C10030dv A04;
    public C10020du A05;
    public AnonymousClass3HJ A06;
    public MultiExclusionChipGroup A07;
    public String A08;
    public ArrayList A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;
    public final AnonymousClass01K A0E = AnonymousClass01K.A00();
    public final AnonymousClass0AM A0F = AnonymousClass0AM.A00();
    public final AnonymousClass0BA A0G = AnonymousClass0BA.A00();
    public final AbstractC29091Wz A0H = new AnonymousClass3HF(this);
    public final AnonymousClass0AD A0I = AnonymousClass0AD.A00;
    public final C02040Ak A0J = C02040Ak.A00();
    public final C01970Ad A0K = C01970Ad.A00();
    public final C018809u A0L = C018809u.A00("PaymentTransactionHistoryActivity", "payment-settings", "COMMON");
    public final C68783En A0M = C68783En.A00();
    public final AnonymousClass1X3 A0N = new AnonymousClass1X3();
    public final AnonymousClass2w3 A0O = AnonymousClass2w3.A00();
    public final C02150Av A0P = C02150Av.A02();
    public final AnonymousClass00T A0Q = C002101e.A00();
    public final ArrayList A0R = new ArrayList();

    public final MultiExclusionChip A0T(String str) {
        MultiExclusionChip multiExclusionChip = (MultiExclusionChip) getLayoutInflater().inflate(R.layout.payment_filter_chip, (ViewGroup) null);
        C002001d.A2Z(multiExclusionChip.getCheckedIcon(), getResources().getColor(R.color.searchBackground));
        multiExclusionChip.setText(str);
        return multiExclusionChip;
    }

    public void A0U() {
        C10030dv r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C10020du r02 = this.A05;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
        }
        if (!((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A23) || TextUtils.isEmpty(this.A08) || this.A03 != null) {
            C10030dv r2 = new C10030dv(this, this.A09, new AnonymousClass3GN(this), this.A0O);
            this.A04 = r2;
            this.A0Q.ANC(r2, new Void[0]);
            return;
        }
        C10020du r5 = new C10020du(this.A0P, this.A0F, this.A0K, this.A0O, this.A08, this.A0C, this.A0N, new AnonymousClass3GN(this));
        this.A05 = r5;
        this.A0Q.ANC(r5, new Void[0]);
    }

    public final void A0V() {
        this.A02.A04(true);
        MultiExclusionChipGroup multiExclusionChipGroup = this.A07;
        if (multiExclusionChipGroup != null) {
            for (int i = 0; i < multiExclusionChipGroup.getChildCount(); i++) {
                ((CompoundButton) multiExclusionChipGroup.getChildAt(i)).setChecked(false);
            }
            this.A07.setVisibility(8);
        }
        A0U();
    }

    public final boolean A0W() {
        if (!isTaskRoot()) {
            return false;
        }
        Class A8J = this.A0K.A03().A8J();
        C018809u r2 = this.A0L;
        StringBuilder sb = new StringBuilder("PaymentTransactionHistoryActivity maybeOpenPaymentSettings ");
        sb.append(A8J);
        r2.A07(null, sb.toString(), null);
        Intent intent = new Intent(this, A8J);
        if (Build.VERSION.SDK_INT >= 21) {
            finishAndRemoveTask();
            startActivity(intent);
            return true;
        }
        startActivity(intent);
        return false;
    }

    @Override // X.AbstractC61862tr
    public void AEo(String str) {
        ((AbstractC16300pa) this.A06).A01.A00();
    }

    @Override // X.AbstractC61092sU
    public void AIO() {
        A0U();
    }

    public /* synthetic */ void lambda$onSearchRequested$97$PaymentTransactionHistoryActivity(View view) {
        A0V();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A02.A05()) {
            A0V();
        } else if (!A0W()) {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        AnonymousClass00E.A07(this.A0J.A02());
        setContentView(R.layout.payment_transaction_history);
        this.A0Q.ANF(new RunnableEBaseShape11S0100000_I1_6(this.A0G, 19));
        this.A0I.A01(this.A0H);
        this.A06 = new AnonymousClass3HJ(this, this, new ArrayList());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.transaction_list);
        recyclerView.setAdapter(this.A06);
        AnonymousClass0Q7.A0h(recyclerView, true);
        AnonymousClass0Q7.A0h(findViewById(16908292), true);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.A00 = progressBar;
        progressBar.setVisibility(0);
        this.A01 = (TextView) findViewById(R.id.payment_transaction_search_no_matches);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
        this.A02 = new AnonymousClass0YP(this, r7, findViewById(R.id.search_holder), toolbar, new AnonymousClass3HG(this));
        this.A0C = getIntent().getBooleanExtra("extra_show_requests", false);
        this.A0A = getIntent().getBooleanExtra("extra_disable_search", false);
        AnonymousClass1X4 r1 = (AnonymousClass1X4) getIntent().getParcelableExtra("extra_predefined_search_filter");
        if (r1 != null) {
            this.A0N.A00 = r1;
        }
        this.A03 = AnonymousClass02N.A01(getIntent().getStringExtra("extra_jid"));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            if (this.A0C) {
                A092.A08(r7.A08(R.plurals.payments_settings_payment_requests, 2));
            } else {
                A092.A08(r7.A06(R.string.payments_settings_payment_history));
            }
            A092.A0A(true);
        }
        A0U();
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        String A062 = r3.A06(R.string.payments_request_status_requested_expired);
        AnonymousClass0MC r2 = r4.A01;
        r2.A0E = A062;
        r2.A0J = false;
        r4.A04(R.string.ok, new DialogInterface$OnClickListenerC62902vX(this));
        r2.A0I = r3.A06(R.string.payments_request_status_request_expired);
        return r4.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0A) {
            menu.add(0, R.id.menuitem_search, 0, ((AnonymousClass2C0) this).A01.A06(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C10030dv r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C10020du r02 = this.A05;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
        }
        this.A0I.A00(this.A0H);
        this.A04 = null;
        this.A05 = null;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            A0W();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0C = bundle.getBoolean("extra_show_requests");
        this.A03 = AnonymousClass02N.A01(bundle.getString("extra_jid"));
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_requests", this.A0C);
        AnonymousClass02N r0 = this.A03;
        if (r0 != null) {
            bundle.putString("extra_jid", r0.getRawString());
        }
    }

    public boolean onSearchRequested() {
        this.A02.A01();
        AnonymousClass0YP r2 = this.A02;
        AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
        String A062 = r7.A06(R.string.search_hint);
        SearchView searchView = r2.A01;
        if (searchView != null) {
            searchView.setQueryHint(A062);
        }
        View findViewById = findViewById(R.id.search_back);
        if (((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A23) && !this.A0C && (this.A0B || this.A0D)) {
            findViewById(R.id.appBarLayout).setVisibility(0);
            if (this.A07 == null) {
                MultiExclusionChipGroup multiExclusionChipGroup = (MultiExclusionChipGroup) AnonymousClass0Q7.A0D(findViewById(R.id.payment_filters), R.id.payment_filter_group);
                this.A07 = multiExclusionChipGroup;
                String A063 = r7.A06(R.string.payment_search_filter_from_you);
                String A064 = r7.A06(R.string.payment_search_filter_to_you);
                String A065 = r7.A06(R.string.payments_transaction_status_complete);
                String A066 = r7.A06(R.string.payment_search_filter_incomplete);
                MultiExclusionChip A0T = A0T(A063);
                MultiExclusionChip A0T2 = A0T(A064);
                MultiExclusionChip A0T3 = A0T(A065);
                MultiExclusionChip A0T4 = A0T(A066);
                if (this.A0D) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(A0T);
                    arrayList.add(A0T2);
                    multiExclusionChipGroup.A01(arrayList);
                }
                if (this.A0B) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(A0T3);
                    arrayList2.add(A0T4);
                    multiExclusionChipGroup.A01(arrayList2);
                }
                multiExclusionChipGroup.A00 = new AnonymousClass3GL(this, A0T, A0T2, A0T3, A0T4);
            }
            this.A07.setVisibility(0);
        }
        findViewById.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 32));
        return false;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        C68783En r1 = this.A0M;
        r1.A00.clear();
        r1.A02.add(new WeakReference(this));
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A0M.A02(this);
    }
}
