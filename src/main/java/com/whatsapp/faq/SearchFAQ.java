package com.whatsapp.faq;

import X.AbstractC000400g;
import X.ActivityC004702f;
import X.ActivityC03630Ha;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass0J8;
import X.AnonymousClass2C0;
import X.AnonymousClass2O8;
import X.AnonymousClass2O9;
import X.AnonymousClass2OA;
import X.C002101e;
import X.C26401Ks;
import X.C28051Sr;
import X.C44221zh;
import X.C48802Nt;
import X.C61812tm;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SearchFAQ extends ActivityC03630Ha implements AnonymousClass0J8 {
    public int A00;
    public C48802Nt A01;
    public String A02;
    public String A03;
    public String A04;
    public ArrayList A05;
    public HashMap A06;
    public HashSet A07;
    public List A08;
    public final C26401Ks A09 = C26401Ks.A00();
    public final AnonymousClass00Y A0A = AnonymousClass00Y.A00();
    public final AnonymousClass00T A0B = C002101e.A00();

    public final void A0V(int i) {
        C44221zh r3 = new C44221zh();
        r3.A00 = Integer.valueOf(i);
        r3.A01 = this.A03;
        r3.A02 = ((AnonymousClass2C0) this).A01.A04();
        this.A0B.ANF(new RunnableEBaseShape3S0200000_I0_2(this, r3, 1));
    }

    public final void A0W(AnonymousClass2O9 r5) {
        this.A07.add(r5.A03);
        Intent intent = new Intent(this, FaqItemActivity.class);
        intent.putExtra("title", r5.A02);
        intent.putExtra("content", r5.A01);
        intent.putExtra("url", r5.A03);
        intent.putExtra("article_id", r5.A00);
        startActivityForResult(intent, 1);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override // X.AnonymousClass0J8
    public void AJM(boolean z) {
        A0V(3);
        if (z) {
            setResult(-1);
            finish();
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            long j = 0;
            long longExtra = intent.getLongExtra("total_time_spent", 0);
            long longExtra2 = intent.getLongExtra("article_id", -1);
            HashMap hashMap = this.A06;
            Long valueOf = Long.valueOf(longExtra2);
            if (hashMap.containsKey(valueOf)) {
                longExtra += ((Number) this.A06.get(valueOf)).longValue();
            }
            this.A06.put(valueOf, Long.valueOf(longExtra));
            StringBuilder sb = new StringBuilder("search-faq/activity-result total time spent on last article opened is ");
            sb.append(longExtra);
            Log.d(sb.toString());
            StringBuilder sb2 = new StringBuilder("search-faq/activity-result total time spent per article is ");
            sb2.append(TextUtils.join(", ", this.A06.entrySet()));
            Log.d(sb2.toString());
            StringBuilder sb3 = new StringBuilder("search-faq/activity-result total time spend on all articles is ");
            for (Number number : this.A06.values()) {
                j += number.longValue();
            }
            sb3.append(j);
            Log.d(sb3.toString());
        } else {
            AnonymousClass008.A0t("search-faq/activity-result/result/", i2);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        A0V(2);
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A01.A00();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        Runnable runnable;
        super.onCreate(bundle);
        int i = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("com.whatsapp.faq.SearchFAQ.usePaymentsFlow", false);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        int i2 = R.string.search_help_center;
        if (booleanExtra) {
            i2 = R.string.payments_support_search_help_center_title;
        }
        setTitle(r2.A06(i2));
        A09().A0A(true);
        setContentView(R.layout.search_faq);
        this.A07 = new HashSet();
        if (bundle != null) {
            String[] stringArray = bundle.getStringArray("FaqItemsReadTitles");
            if (stringArray != null) {
                Collections.addAll(this.A07, stringArray);
            }
            if (bundle.containsKey("timeSpentPerArticle")) {
                HashMap hashMap = (HashMap) bundle.getSerializable("timeSpentPerArticle");
                this.A06 = hashMap;
                hashMap.size();
            }
        }
        Intent intent = getIntent();
        this.A02 = intent.getStringExtra("com.whatsapp.faq.SearchFAQ.from");
        ArrayList arrayList = new ArrayList();
        if (this.A06 == null) {
            this.A06 = new HashMap();
        }
        int intExtra = intent.getIntExtra("com.whatsapp.faq.SearchFAQ.count", 0);
        this.A00 = intExtra;
        if (booleanExtra) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("payments_support_faqs");
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("payments_support_topics");
            Bundle bundleExtra = intent.getBundleExtra("describe_problem_bundle");
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                C61812tm r0 = (C61812tm) it.next();
                arrayList.add(new AnonymousClass2O9(r0.A02, r0.A00, r0.A03, Long.parseLong(r0.A01)));
            }
            runnable = new RunnableEBaseShape0S0300000_I0_0(this, parcelableArrayListExtra2, bundleExtra, 38);
        } else {
            this.A03 = intent.getStringExtra("com.whatsapp.faq.SearchFAQ.problem");
            this.A04 = intent.getStringExtra("com.whatsapp.faq.SearchFAQ.status");
            this.A05 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            String[] stringArrayExtra = intent.getStringArrayExtra("com.whatsapp.faq.SearchFAQ.additionalDetails");
            if (stringArrayExtra != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    String[] split = str.split(":");
                    if (split.length == 2) {
                        arrayList2.add(new Pair(split[0], split[1]));
                    }
                }
                this.A08 = arrayList2;
            }
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.whatsapp.faq.SearchFAQ.titles");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.whatsapp.faq.SearchFAQ.descriptions");
            ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("com.whatsapp.faq.SearchFAQ.urls");
            ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("com.whatsapp.faq.SearchFAQ.ids");
            if (!(stringArrayListExtra == null || stringArrayListExtra2 == null || stringArrayListExtra3 == null || stringArrayListExtra4 == null)) {
                if (stringArrayListExtra.size() < intExtra) {
                    intExtra = stringArrayListExtra.size();
                }
                if (stringArrayListExtra2.size() < intExtra) {
                    intExtra = stringArrayListExtra2.size();
                }
                if (stringArrayListExtra3.size() < intExtra) {
                    intExtra = stringArrayListExtra3.size();
                }
                if (stringArrayListExtra4.size() < intExtra) {
                    intExtra = stringArrayListExtra4.size();
                }
                for (int i3 = 0; i3 < intExtra; i3++) {
                    long parseLong = Long.parseLong(stringArrayListExtra4.get(i3));
                    StringBuilder A0T = AnonymousClass008.A0T("search-faq/result item=", i3, " title=");
                    A0T.append(stringArrayListExtra.get(i3));
                    A0T.append(" url=");
                    A0T.append(stringArrayListExtra3.get(i3));
                    A0T.append(" id=");
                    A0T.append(parseLong);
                    Log.d(A0T.toString());
                    arrayList.add(new AnonymousClass2O9(stringArrayListExtra.get(i3), stringArrayListExtra2.get(i3), stringArrayListExtra3.get(i3), parseLong));
                }
            }
            runnable = new RunnableEBaseShape3S0200000_I0_2(this, intent, 2);
        }
        ListAdapter r9 = new AnonymousClass2OA(this, this, arrayList);
        ListView A0T2 = A0T();
        A0T2.addHeaderView(((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.search_faq_header, (ViewGroup) null), null, false);
        A0U(r9);
        registerForContextMenu(A0T2);
        if (arrayList.size() == 1) {
            A0W((AnonymousClass2O9) arrayList.get(0));
        }
        View findViewById = findViewById(R.id.bottom_button_container);
        C48802Nt r02 = new C48802Nt(A0T2, findViewById, getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
        this.A01 = r02;
        r02.A00();
        this.A01.A02(this, (TextView) findViewById(R.id.does_not_match_button), r2.A06(R.string.does_not_match_button), new AnonymousClass2O8(runnable), R.style.FaqInlineLink);
        this.A01.A01.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(runnable, 49));
        if (C28051Sr.A1x(this.A02) && ((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A1t)) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A0V(2);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            HashSet hashSet = this.A07;
            if (hashSet != null && hashSet.size() > 0) {
                bundle.putStringArray("FaqItemsReadTitles", (String[]) this.A07.toArray(new String[0]));
            }
            HashMap hashMap = this.A06;
            if (hashMap != null && hashMap.size() > 0) {
                bundle.putSerializable("timeSpentPerArticle", hashMap);
            }
        }
        super.onSaveInstanceState(bundle);
    }
}
