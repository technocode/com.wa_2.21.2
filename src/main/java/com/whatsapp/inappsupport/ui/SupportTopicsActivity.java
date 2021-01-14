package com.whatsapp.inappsupport.ui;

import X.AbstractC15460o7;
import X.ActivityC004602e;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C06470Tj;
import X.C49482Qq;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

public class SupportTopicsActivity extends ActivityC004602e implements AbstractC15460o7 {
    public int A00;
    public int A01;
    public MenuItem A02;
    public List A03;

    public static Intent A04(Context context, ArrayList arrayList, Bundle bundle) {
        Intent intent = new Intent(context, SupportTopicsActivity.class);
        intent.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
        intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (bundle != null) {
            intent.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle", bundle);
        }
        return intent;
    }

    public void A0T(C49482Qq r11) {
        int i = this.A00;
        if (i == 1 || i == 2) {
            setResult(-1, getIntent());
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList(this.A03.size());
        ArrayList arrayList2 = new ArrayList(this.A03.size());
        for (int i2 = 0; i2 < this.A03.size(); i2++) {
            if (((SupportTopicsFragment) this.A03.get(i2)).A00 != null) {
                C49482Qq r1 = ((SupportTopicsFragment) this.A03.get(i2)).A00;
                arrayList.add(r1.A03);
                arrayList2.add(r1.A02);
            }
        }
        if (r11 != null) {
            arrayList.add(r11.A03);
            arrayList2.add(r11.A02);
        }
        String string = getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle").getString("com.whatsapp.DescribeProblemActivity.from");
        if (string == null) {
            string = "support_topics";
        }
        startActivity(C002001d.A0R(this, string, null, null, arrayList2, arrayList, getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle")));
    }

    public /* synthetic */ void lambda$onCreate$1376$SupportTopicsActivity(View view) {
        onBackPressed();
    }

    public /* synthetic */ void lambda$onCreate$1377$SupportTopicsActivity(View view) {
        A0T(null);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 15 && i2 == -1) {
            setResult(-1, getIntent());
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (!this.A03.isEmpty()) {
            List list = this.A03;
            list.remove(list.size() - 1);
            if (!this.A03.isEmpty()) {
                List list2 = this.A03;
                SupportTopicsFragment supportTopicsFragment = (SupportTopicsFragment) list2.get(list2.size() - 1);
                MenuItem menuItem = this.A02;
                if (menuItem != null) {
                    C49482Qq r0 = supportTopicsFragment.A00;
                    if (r0 != null) {
                        menuItem.setVisible(r0.A06);
                    } else {
                        menuItem.setVisible(false);
                    }
                }
            }
        }
        super.onBackPressed();
    }

    @Override // X.AbstractC15460o7
    public void onBackStackChanged() {
        String string;
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            if (A04().A03() == 0) {
                string = getString(R.string.payment_support_topic_flow_primary_title);
            } else {
                string = getString(R.string.payment_support_topic_flow_secondary_title);
            }
            A09.A08(string);
            A09.A0A(true);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        this.A01 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        this.A00 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (this.A01 == 2) {
            String string = getString(R.string.settings_help);
            setTheme(2131952179);
            super.onCreate(bundle);
            setTitle(string);
            setContentView(R.layout.support_topics_activity);
            findViewById(R.id.toolbar_layout).setVisibility(0);
            Toolbar toolbar = (Toolbar) AnonymousClass0TX.A0A(this, R.id.toolbar);
            toolbar.setNavigationIcon(new C06470Tj(((AnonymousClass2C0) this).A01, C002001d.A0e(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.lightActionBarItemDrawableTint))));
            toolbar.setTitle(string);
            toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 30));
            A0C(toolbar);
            View findViewById = findViewById(R.id.contact_us_button);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 29));
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.support_topics_activity);
            AnonymousClass0S2 A09 = A09();
            if (A09 != null) {
                A09.A08(getString(R.string.payment_support_topic_flow_primary_title));
                A09.A0A(true);
            }
        }
        this.A03 = new ArrayList();
        AnonymousClass0LW A04 = A04();
        ArrayList arrayList = A04.A0A;
        if (arrayList == null) {
            arrayList = new ArrayList();
            A04.A0A = arrayList;
        }
        arrayList.add(this);
        ArrayList<? extends Parcelable> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics");
        SupportTopicsFragment supportTopicsFragment = new SupportTopicsFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("parent_topic", null);
        bundle2.putParcelableArrayList("topics", parcelableArrayListExtra);
        supportTopicsFragment.A0N(bundle2);
        if (A04 != null) {
            AnonymousClass0QB r1 = new AnonymousClass0QB(A04);
            r1.A05(R.id.support_topics_container, supportTopicsFragment);
            r1.A00();
            this.A03.add(supportTopicsFragment);
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01 != 1) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.support_topics_menu, menu);
        MenuItem findItem = menu.findItem(R.id.support_topic_skip);
        this.A02 = findItem;
        findItem.setVisible(false);
        return true;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332 && !this.A03.isEmpty()) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.support_topic_skip) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A0T(null);
            return true;
        }
    }
}
