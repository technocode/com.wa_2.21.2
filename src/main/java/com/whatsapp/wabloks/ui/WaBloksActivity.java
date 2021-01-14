package com.whatsapp.wabloks.ui;

import X.AbstractC011006p;
import X.ActivityC004602e;
import X.AnonymousClass00E;
import X.AnonymousClass00b;
import X.AnonymousClass01X;
import X.AnonymousClass06P;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass1GM;
import X.AnonymousClass1TY;
import X.AnonymousClass3AP;
import X.AnonymousClass3Aa;
import X.AnonymousClass3V6;
import X.AnonymousClass3VT;
import X.C004302a;
import X.C009205v;
import X.C010406j;
import X.C06470Tj;
import X.C28051Sr;
import X.C37351o4;
import X.C43201xx;
import X.C43211xy;
import X.C43221xz;
import X.C72813Uj;
import X.C74403ao;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkScreenFragment;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class WaBloksActivity extends ActivityC004602e {
    public AnonymousClass3Aa A00;
    public List A01;

    public void A0T(List list) {
        if (list != null) {
            this.A01 = list;
            if (list.size() > 0) {
                ((C72813Uj) this.A00).A00.A08();
                onCreateOptionsMenu(((C72813Uj) this.A00).A00.getMenu());
            }
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        this.A00.A00();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AnonymousClass3AP.get().ui();
        Intent intent = getIntent();
        C72813Uj r1 = new C72813Uj();
        if (((AnonymousClass3Aa) r1).A00 == null) {
            ((AnonymousClass3Aa) r1).A00 = intent;
            ((AnonymousClass3Aa) r1).A01 = this;
        }
        this.A00 = r1;
        super.onCreate(bundle);
        C72813Uj r2 = (C72813Uj) this.A00;
        if (r2 != null) {
            try {
                AnonymousClass00b.A00(((AnonymousClass3Aa) r2).A01.getApplicationContext());
            } catch (IOException unused) {
            }
            ((AnonymousClass3Aa) r2).A01.setContentView(R.layout.activity_wablok_screen_main);
            View findViewById = ((AnonymousClass3Aa) r2).A01.findViewById(R.id.wabloks_screen_toolbar);
            if (findViewById != null) {
                Toolbar toolbar = (Toolbar) findViewById;
                r2.A00 = toolbar;
                toolbar.setTitle("");
                Toolbar toolbar2 = r2.A00;
                toolbar2.A09();
                ((AnonymousClass3Aa) r2).A01.A0C(toolbar2);
                AnonymousClass0S2 A09 = ((AnonymousClass3Aa) r2).A01.A09();
                if (A09 != null) {
                    A09.A0A(true);
                }
                C06470Tj r3 = new C06470Tj((AnonymousClass01X) r2.A03.get(), C004302a.A03(((AnonymousClass3Aa) r2).A01, R.drawable.ic_back_teal));
                r3.setColorFilter(((AnonymousClass3Aa) r2).A01.getResources().getColor(R.color.wabloksui_screen_back_arrow), PorterDuff.Mode.SRC_ATOP);
                r2.A00.setNavigationIcon(r3);
                r2.A00.setBackgroundColor(((AnonymousClass3Aa) r2).A01.getResources().getColor(R.color.wabloksui_screen_toolbar));
                r2.A00.setNavigationOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r2, 32));
                if (((AnonymousClass3Aa) r2).A00.getBooleanExtra("has_options", false)) {
                    C43221xz r32 = (C43221xz) ((AnonymousClass1TY) C72813Uj.A05.get()).A01("wa_screen_options", ((AnonymousClass3Aa) r2).A00.getStringExtra("options_key"));
                    if (r32 == null) {
                        ((AnonymousClass3Aa) r2).A01.finish();
                    } else {
                        C43201xx r0 = r32.A00;
                        if (r0 != null) {
                            r2.A00.setTitle(r0.A00);
                            List list = r32.A00.A01;
                            if (list != null) {
                                try {
                                    ((WaBloksActivity) ((AnonymousClass3Aa) r2).A01).A0T(list);
                                } catch (ClassCastException unused2) {
                                    Log.e("This is not an instance of WaBloksActity");
                                }
                            }
                        }
                    }
                }
                String stringExtra = ((AnonymousClass3Aa) r2).A00.getStringExtra("screen_name");
                AnonymousClass00E.A03(stringExtra);
                AnonymousClass0LW A04 = ((AnonymousClass3Aa) r2).A01.A04();
                if (A04.A03() == 0) {
                    AnonymousClass0QB r5 = new AnonymousClass0QB(A04);
                    Serializable serializableExtra = ((AnonymousClass3Aa) r2).A00.getSerializableExtra("screen_params");
                    BkScreenFragment bkScreenFragment = new BkScreenFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("screen_name", stringExtra);
                    bundle2.putSerializable("screen_params", serializableExtra);
                    bkScreenFragment.A0N(bundle2);
                    r5.A05(R.id.bloks_fragment_container, bkScreenFragment);
                    r5.A08(stringExtra);
                    r5.A01();
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            List list = this.A01;
            if (list != null && list.size() > 0) {
                menu.clear();
                for (C43211xy r3 : this.A01) {
                    if (r3.A01.name().equals("MORE")) {
                        menu.add(0, R.id.menu_more, 0, R.string.share_shops_link);
                        onPrepareOptionsMenu(((C72813Uj) this.A00).A00.getMenu());
                        ((C72813Uj) this.A00).A00.A0R = new AnonymousClass3VT(this, r3);
                    }
                }
            }
        } catch (NullPointerException unused) {
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        if (this.A00 != null) {
            super.onDestroy();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        if (this.A00 != null) {
            super.onPause();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C72813Uj r2 = (C72813Uj) this.A00;
        if (r2.A01 == null) {
            r2.A01 = new C37351o4(new AnonymousClass3V6(new C74403ao((WaBloksActivity) ((AnonymousClass3Aa) r2).A01)));
        }
        Context applicationContext = ((AnonymousClass3Aa) r2).A01.getApplicationContext();
        AbstractC011006p r22 = r2.A01;
        C28051Sr.A1H();
        AnonymousClass06P r3 = new AnonymousClass06P(C28051Sr.A02);
        C28051Sr.A1H();
        C009205v.A05 = new C009205v(applicationContext, r22, r3, new AnonymousClass1GM(), Collections.emptyMap());
        C28051Sr.A1H();
        C010406j.A01 = new C010406j(new AnonymousClass06P(C28051Sr.A02));
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        if (this.A00 != null) {
            super.onStop();
            return;
        }
        throw null;
    }
}
