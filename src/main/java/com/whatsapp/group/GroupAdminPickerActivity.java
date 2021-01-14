package com.whatsapp.group;

import X.AbstractC16300pa;
import X.AbstractC49342Qc;
import X.ActivityC004602e;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02U;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0EZ;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0YP;
import X.AnonymousClass0YX;
import X.AnonymousClass1M5;
import X.AnonymousClass1YB;
import X.AnonymousClass2QE;
import X.AnonymousClass2QU;
import X.AnonymousClass2QV;
import X.AnonymousClass31y;
import X.C002101e;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C05340Od;
import X.C06470Tj;
import X.C10360eV;
import X.C14270lr;
import X.C54742fQ;
import X.C54842fa;
import X.C54852fb;
import X.C54862fc;
import X.C54872fd;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupAdminPickerActivity extends ActivityC004602e {
    public ColorDrawable A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public SearchView A05;
    public BottomSheetBehavior A06;
    public AnonymousClass0YX A07;
    public C10360eV A08;
    public C54872fd A09;
    public AnonymousClass02U A0A;
    public String A0B;
    public List A0C;
    public final View.OnClickListener A0D = new ViewOnClickEBaseShape6S0100000_I1_4(this, 17);
    public final AnonymousClass01I A0E = AnonymousClass01I.A00();
    public final AnonymousClass01A A0F = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0G = new C54842fa(this);
    public final AnonymousClass08B A0H = AnonymousClass08B.A00;
    public final C014308b A0I = C014308b.A00();
    public final AnonymousClass0L2 A0J = AnonymousClass0L2.A01();
    public final AnonymousClass01X A0K = AnonymousClass01X.A00();
    public final AnonymousClass01T A0L = AnonymousClass01T.A00();
    public final AbstractC49342Qc A0M = new C54742fQ(this);
    public final AnonymousClass0EZ A0N = AnonymousClass0EZ.A01;
    public final AnonymousClass31y A0O = AnonymousClass31y.A00();
    public final AnonymousClass00T A0P = C002101e.A00();

    public static boolean A04(GroupAdminPickerActivity groupAdminPickerActivity, UserJid userJid) {
        if (groupAdminPickerActivity == null) {
            throw null;
        } else if (userJid == null) {
            return false;
        } else {
            for (C007003k r1 : groupAdminPickerActivity.A0C) {
                if (userJid.equals(r1.A02(UserJid.class))) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void A0T() {
        this.A02.setPadding(0, getResources().getDimensionPixelSize(R.dimen.admin_picker_top_padding), 0, 0);
        ((C14270lr) this.A02.getLayoutParams()).A00(this.A06);
        this.A00.setColor(2130706432);
        this.A04.setVisibility(0);
        this.A03.setVisibility(8);
        A0W(null);
    }

    public final void A0U() {
        this.A02.setPadding(0, 0, 0, 0);
        ((C14270lr) this.A02.getLayoutParams()).A00(null);
        this.A00.setColor(C004302a.A00(this, R.color.groupAdminPickerBackground));
        this.A05.setIconified(false);
        this.A04.setVisibility(8);
        this.A03.setVisibility(0);
    }

    public final void A0V() {
        AnonymousClass01T r1 = this.A0L;
        AnonymousClass02U r0 = this.A0A;
        if (r0 != null) {
            C05340Od A012 = r1.A01(r0);
            this.A0C = new ArrayList(A012.A01.size());
            Iterator it = A012.A05().iterator();
            while (it.hasNext()) {
                AnonymousClass01I r02 = this.A0E;
                UserJid userJid = ((AnonymousClass1M5) it.next()).A03;
                if (!r02.A09(userJid)) {
                    this.A0C.add(this.A0F.A0A(userJid));
                }
            }
            return;
        }
        throw null;
    }

    public final void A0W(String str) {
        this.A0B = str;
        C10360eV r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C10360eV r2 = new C10360eV(this, this.A0C, str);
        this.A08 = r2;
        this.A0P.ANC(r2, new Void[0]);
    }

    public /* synthetic */ void lambda$new$2124$GroupAdminPickerActivity(View view) {
        if (view.getTag() instanceof UserJid) {
            Intent intent = new Intent();
            intent.putExtra("contact", ((Jid) view.getTag()).getRawString());
            setResult(-1, intent);
            finish();
        }
    }

    public /* synthetic */ void lambda$onCreate$2127$GroupAdminPickerActivity(View view) {
        A0U();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A03.getVisibility() == 0) {
            A0T();
        } else {
            this.A06.A0D(4);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.group_admin_picker);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A02 = findViewById;
        this.A06 = BottomSheetBehavior.A00(findViewById);
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2QU(this));
        this.A01 = findViewById(R.id.background);
        PointF pointF = new PointF();
        this.A01.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, pointF, 46));
        this.A01.setOnTouchListener(new AnonymousClass2QE(pointF));
        ColorDrawable colorDrawable = new ColorDrawable(2130706432);
        this.A00 = colorDrawable;
        this.A01.setBackground(colorDrawable);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) getResources().getInteger(17694720));
        this.A01.startAnimation(alphaAnimation);
        int A002 = C004302a.A00(this, R.color.primary_dark_dimmed);
        int A003 = C004302a.A00(this, R.color.primary_dark);
        this.A06.A0E = new C54852fb(this, A003, A002);
        this.A04 = findViewById(R.id.title_holder);
        View findViewById2 = findViewById(R.id.search_holder);
        this.A03 = findViewById2;
        AnonymousClass0YP.A00(findViewById2);
        SearchView searchView = (SearchView) this.A03.findViewById(R.id.search_view);
        this.A05 = searchView;
        ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C004302a.A00(this, R.color.search_text_color));
        this.A05.setIconifiedByDefault(false);
        this.A05.setQueryHint(getString(R.string.select_group_admin_search_hint));
        ((ImageView) this.A05.findViewById(R.id.search_mag_icon)).setImageDrawable(new AnonymousClass2QV(C004302a.A03(this, R.drawable.ic_back_teal)));
        this.A05.A0B = new C54862fc(this);
        ImageView imageView = (ImageView) this.A03.findViewById(R.id.search_back);
        imageView.setImageDrawable(new C06470Tj(this.A0K, C004302a.A03(this, R.drawable.ic_back_teal)));
        imageView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 12));
        findViewById(R.id.search_btn).setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 16));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.A07 = this.A0J.A03(this);
        AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("gid"));
        if (A032 != null) {
            this.A0A = A032;
            A0V();
            C54872fd r1 = new C54872fd(this);
            this.A09 = r1;
            r1.A01 = this.A0C;
            r1.A00 = AnonymousClass1YB.A03(null, r1.A02.A0K);
            ((AbstractC16300pa) r1).A01.A00();
            recyclerView.setAdapter(this.A09);
            this.A0H.A01(this.A0G);
            AnonymousClass0EZ r0 = this.A0N;
            r0.A00.add(this.A0M);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0H.A00(this.A0G);
        AnonymousClass0EZ r0 = this.A0N;
        r0.A00.remove(this.A0M);
        this.A07.A00();
        C10360eV r02 = this.A08;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A0U();
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean z = false;
        if (this.A03.getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("search", z);
    }
}
