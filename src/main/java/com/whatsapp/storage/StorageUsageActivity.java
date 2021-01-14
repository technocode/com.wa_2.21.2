package com.whatsapp.storage;

import X.AbstractC000400g;
import X.AbstractC16300pa;
import X.AbstractC16370ph;
import X.AbstractC30641bg;
import X.ActivityC004602e;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01B;
import X.AnonymousClass01K;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass088;
import X.AnonymousClass0BV;
import X.AnonymousClass0L2;
import X.AnonymousClass0S2;
import X.AnonymousClass0VR;
import X.AnonymousClass0YP;
import X.AnonymousClass0YX;
import X.AnonymousClass1VD;
import X.AnonymousClass2C0;
import X.AnonymousClass2L5;
import X.AnonymousClass2L6;
import X.AnonymousClass348;
import X.AnonymousClass34C;
import X.AnonymousClass3RJ;
import X.AnonymousClass3RR;
import X.AnonymousClass3RS;
import X.AnonymousClass3RT;
import X.C000300f;
import X.C002101e;
import X.C014308b;
import X.C014508d;
import X.C02580Cq;
import X.C08580bN;
import X.C16480ps;
import X.C73193Vv;
import X.RunnableC27931Se;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class StorageUsageActivity extends ActivityC004602e {
    public static final long A0W = TimeUnit.MINUTES.toMillis(1);
    public int A00;
    public int A01;
    public RecyclerView A02;
    public AnonymousClass0YP A03;
    public AnonymousClass0YX A04;
    public AnonymousClass2L5 A05;
    public AnonymousClass3RT A06;
    public AnonymousClass348 A07;
    public AnonymousClass34C A08;
    public RunnableEBaseShape9S0200000_I1_4 A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C;
    public List A0D;
    public final AnonymousClass088 A0E = AnonymousClass088.A00();
    public final AnonymousClass02M A0F = AnonymousClass02M.A00();
    public final C000300f A0G = C000300f.A00();
    public final AnonymousClass01A A0H = AnonymousClass01A.A00();
    public final C014308b A0I = C014308b.A00();
    public final AnonymousClass0L2 A0J = AnonymousClass0L2.A01();
    public final AnonymousClass00C A0K = AnonymousClass00C.A00();
    public final AnonymousClass00S A0L = AnonymousClass00S.A00();
    public final AnonymousClass01K A0M = AnonymousClass01K.A00();
    public final AnonymousClass0BV A0N = AnonymousClass0BV.A00();
    public final C014508d A0O = C014508d.A00();
    public final AnonymousClass2L6 A0P = AnonymousClass2L6.A00();
    public final AnonymousClass00Y A0Q = AnonymousClass00Y.A00();
    public final C02580Cq A0R = C02580Cq.A01();
    public final C08580bN A0S;
    public final AnonymousClass00T A0T = C002101e.A00();
    public final C73193Vv A0U = C73193Vv.A00();
    public final Set A0V;

    public StorageUsageActivity() {
        AnonymousClass01B.A00();
        this.A0S = new C08580bN();
        this.A0V = new HashSet();
        this.A0C = new ArrayList();
        this.A05 = new AnonymousClass3RR(this);
    }

    public static Intent A04(Context context, String str, int i) {
        Intent intent = new Intent(context, StorageUsageActivity.class);
        intent.putExtra("session_id", str);
        intent.putExtra("entry_point", i);
        return intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r10 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r9 == null) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(com.whatsapp.storage.StorageUsageActivity r7, java.util.List r8, java.util.List r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.storage.StorageUsageActivity.A05(com.whatsapp.storage.StorageUsageActivity, java.util.List, java.util.List, boolean):void");
    }

    public final void A0T() {
        RunnableEBaseShape9S0200000_I1_4 runnableEBaseShape9S0200000_I1_4 = new RunnableEBaseShape9S0200000_I1_4(this);
        this.A09 = runnableEBaseShape9S0200000_I1_4;
        this.A0T.ANF(runnableEBaseShape9S0200000_I1_4);
        A0U(3);
    }

    public final void A0U(int i) {
        this.A0V.add(Integer.valueOf(i));
        this.A06.A0G(true);
    }

    public final void A0V(int i) {
        Set set = this.A0V;
        set.remove(Integer.valueOf(i));
        AnonymousClass3RT r2 = this.A06;
        boolean z = false;
        if (set.size() != 0) {
            z = true;
        }
        r2.A0G(z);
    }

    public /* synthetic */ void lambda$onCreate$2593$StorageUsageActivity(View view) {
        onSearchRequested();
    }

    public /* synthetic */ void lambda$onSearchRequested$2595$StorageUsageActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == 1) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(intent.getStringExtra("jid"));
            int intExtra = intent.getIntExtra("gallery_type", -1);
            long longExtra = intent.getLongExtra("memory_size", -1);
            long longExtra2 = intent.getLongExtra("deleted_size", -1);
            if (longExtra >= 0) {
                if (longExtra2 > 0) {
                    AnonymousClass00T r4 = this.A0T;
                    r4.ANF(new RunnableEBaseShape13S0100000_I1_8(this, 6));
                    r4.ANF(new RunnableEBaseShape13S0100000_I1_8(this, 13));
                    r4.ANF(new RunnableEBaseShape13S0100000_I1_8(this, 12));
                }
                if (intExtra == 0 && A012 != null) {
                    AnonymousClass3RT r5 = this.A06;
                    for (AnonymousClass1VD r3 : r5.A05) {
                        if (r3.A01().equals(A012)) {
                            r3.A00.A0G = longExtra;
                            Collections.sort(r5.A05);
                            ((AbstractC16300pa) r5).A01.A00();
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        AnonymousClass0YP r0 = this.A03;
        if (r0 == null || !r0.A05()) {
            super.onBackPressed();
            return;
        }
        this.A0A = null;
        this.A0D = null;
        this.A03.A04(true);
        this.A06.A0F(false);
        this.A02.A0X(0);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("storage-usage-activity/create");
        AnonymousClass00S r12 = this.A0L;
        C73193Vv r13 = this.A0U;
        this.A07 = new AnonymousClass348(r12, r13);
        setTitle(R.string.manage_storage);
        setContentView(R.layout.activity_storage_usage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        this.A0A = null;
        this.A0D = null;
        if (this.A0G.A0D(AbstractC000400g.A2H)) {
            this.A03 = new AnonymousClass0YP(this, ((AnonymousClass2C0) this).A01, findViewById(R.id.search_holder), toolbar, new AnonymousClass3RS(this));
        }
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            C08580bN r10 = this.A0S;
            r10.A03(this, new AnonymousClass3RJ(this));
            this.A04 = this.A0J.A03(this);
            this.A0B = getIntent().getStringExtra("session_id");
            this.A00 = getIntent().getIntExtra("entry_point", -1);
            this.A02 = (RecyclerView) findViewById(R.id.conversation_list);
            WrappedLinearLayoutManager wrappedLinearLayoutManager = new WrappedLinearLayoutManager();
            this.A06 = new AnonymousClass3RT(this.A0F, wrappedLinearLayoutManager, this.A04, this.A00, this.A0B, r10, new ViewOnClickEBaseShape8S0100000_I1_6(this, 48));
            this.A02.setLayoutManager(wrappedLinearLayoutManager);
            RecyclerView recyclerView = this.A02;
            AbstractC16370ph r5 = recyclerView.A0R;
            if (r5 instanceof AbstractC30641bg) {
                ((AbstractC30641bg) r5).A00 = false;
            }
            recyclerView.setAdapter(this.A06);
            int max = Math.max(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.storage_preview_item_thumb_size);
            this.A01 = Math.max(1, ((dimensionPixelSize >> 1) + max) / dimensionPixelSize);
            this.A08 = new AnonymousClass34C(this.A0M, this.A0N, this.A0R, this.A0O, this.A07);
            AnonymousClass00T r4 = this.A0T;
            r4.ANF(new RunnableEBaseShape13S0100000_I1_8(this, 5));
            A0U(0);
            A0U(2);
            A0U(1);
            if (bundle == null || bundle.getParcelableArrayList("LIST_OF_CONTACTS") == null) {
                A0T();
            } else {
                if (System.currentTimeMillis() - bundle.getLong("SAVED_AT_TIMESTAMP") < A0W) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("LIST_OF_CONTACTS");
                    this.A0C = parcelableArrayList;
                    this.A06.A0E(parcelableArrayList, null, this.A0A, this.A0D);
                    if (bundle.getBoolean("LIST_IS_NOT_FULL", false)) {
                        A0T();
                    }
                } else {
                    A0T();
                }
            }
            AnonymousClass2L6 r0 = this.A0P;
            r0.A07.add(this.A05);
            r4.ANF(new RunnableC27931Se(this.A0B, this.A00, this.A0E, r12, r13, this.A0Q));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A02 = null;
        this.A04.A00();
        AnonymousClass2L6 r0 = this.A0P;
        r0.A07.remove(this.A05);
        this.A0V.clear();
        RunnableEBaseShape9S0200000_I1_4 runnableEBaseShape9S0200000_I1_4 = this.A09;
        if (runnableEBaseShape9S0200000_I1_4 != null) {
            ((AtomicBoolean) runnableEBaseShape9S0200000_I1_4.A00).set(true);
        }
        this.A06.A0G(false);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        onSearchRequested();
        return true;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = this.A0C;
        if (arrayList != null && !arrayList.isEmpty()) {
            bundle.putLong("SAVED_AT_TIMESTAMP", System.currentTimeMillis());
            ArrayList<? extends Parcelable> arrayList2 = this.A0C;
            if (arrayList2.size() > 200) {
                bundle.putParcelableArrayList("LIST_OF_CONTACTS", new ArrayList<>(arrayList2.subList(0, 200)));
                bundle.putBoolean("LIST_IS_NOT_FULL", true);
                return;
            }
            bundle.putParcelableArrayList("LIST_OF_CONTACTS", arrayList2);
        }
    }

    public boolean onSearchRequested() {
        AnonymousClass0YP r0;
        if (!this.A0G.A0D(AbstractC000400g.A2H) || (r0 = this.A03) == null) {
            return false;
        }
        r0.A01();
        this.A06.A0F(true);
        this.A03.A03.findViewById(R.id.search_back).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 47));
        return false;
    }

    public class WrappedLinearLayoutManager extends LinearLayoutManager {
        public WrappedLinearLayoutManager() {
            super(1);
        }

        @Override // X.AnonymousClass0VT, androidx.recyclerview.widget.LinearLayoutManager
        public void A0p(C16480ps r3, AnonymousClass0VR r4) {
            try {
                super.A0p(r3, r4);
            } catch (IndexOutOfBoundsException e) {
                Log.e("WrappedLinearLayoutManager", e);
            }
        }
    }
}
