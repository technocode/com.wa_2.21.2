package com.whatsapp;

import X.AbstractC07200Wh;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.ActivityC03630Ha;
import X.AnonymousClass00C;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass03A;
import X.AnonymousClass03P;
import X.AnonymousClass0JW;
import X.AnonymousClass0S2;
import X.AnonymousClass1KE;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C02660Cy;
import X.C11080fg;
import X.C11090fh;
import X.C27201Oo;
import X.C27211Op;
import X.C27221Oq;
import X.C39211r8;
import X.C41091uS;
import X.C41101uT;
import X.C459227b;
import X.C664234e;
import X.C664334g;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WebImagePicker extends ActivityC03630Ha {
    public int A00 = 4;
    public int A01;
    public Uri A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public ProgressBar A06;
    public SearchView A07;
    public C002301g A08;
    public C11090fh A09;
    public C27211Op A0A;
    public C27221Oq A0B;
    public C664334g A0C;
    public File A0D;
    public final AbstractC07200Wh A0E = new C41091uS(this);
    public final AnonymousClass00C A0F = AnonymousClass00C.A00();
    public final AnonymousClass03P A0G = AnonymousClass03P.A00();
    public final AnonymousClass00G A0H = AnonymousClass00G.A01;
    public final C02660Cy A0I = C02660Cy.A00();
    public final AnonymousClass03A A0J = AnonymousClass03A.A00();
    public final AnonymousClass00T A0K = C002101e.A00();
    public final ArrayList A0L = new ArrayList();

    public final void A0V() {
        C002301g r3 = this.A08;
        this.A01 = (r3.A08 << 1) + r3.A09 + ((int) r3.A01);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        int i = point.x;
        int i2 = i / this.A01;
        this.A00 = i2;
        this.A01 = (i / i2) - ((int) this.A08.A01);
        C664334g r0 = this.A0C;
        if (r0 != null) {
            r0.A01.A01(false);
        }
        C664234e r2 = new C664234e(((ActivityC004702f) this).A0F, this.A0I, this.A0D);
        r2.A01 = this.A01;
        r2.A02 = 4194304;
        r2.A04 = C004302a.A03(this, R.drawable.picture_loading);
        r2.A03 = C004302a.A03(this, R.drawable.ic_missing_thumbnail_picture);
        this.A0C = r2.A00();
    }

    public final void A0W() {
        String charSequence = this.A07.A0k.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            ((ActivityC004702f) this).A0F.A0C(((AnonymousClass2C0) this).A01.A06(R.string.photo_nothing_to_search), 0);
            return;
        }
        ((ActivityC004602e) this).A0H.A02(this.A07);
        this.A06.setVisibility(0);
        ((TextView) A0T().getEmptyView()).setText("");
        this.A0A.A00(charSequence);
    }

    public /* synthetic */ void lambda$onCreate$1504$WebImagePicker(View view) {
        A0W();
    }

    public void lambda$onCreate$1505$WebImagePicker(View view) {
        String str = (String) view.getTag();
        if (str != null && this.A02 != null) {
            Iterator it = this.A0L.iterator();
            while (it.hasNext()) {
                C27201Oo r3 = (C27201Oo) it.next();
                if (str.equals(r3.A07)) {
                    C11090fh r0 = this.A09;
                    if (r0 != null) {
                        ((AnonymousClass0JW) r0).A00.cancel(true);
                    }
                    C11090fh r2 = new C11090fh(this, r3);
                    this.A09 = r2;
                    this.A0K.ANC(r2, new Void[0]);
                    return;
                }
            }
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0W();
        } else {
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0V();
        this.A0A.notifyDataSetChanged();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        setTitle(r5.A06(R.string.search_web));
        this.A0D = new File(getCacheDir(), "Thumbs");
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0D(false);
            A092.A0B(true);
            this.A08 = C002301g.A0K;
            this.A0D.mkdirs();
            C27221Oq r0 = new C27221Oq(this.A0H, this.A0I, "");
            this.A0B = r0;
            File[] listFiles = r0.A06.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, AnonymousClass1KE.A00);
                int i = 0;
                while (true) {
                    int length = listFiles.length;
                    if (i >= length) {
                        break;
                    }
                    File file = listFiles[i];
                    if (i <= length - 16 || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                        file.delete();
                    }
                    i++;
                }
            }
            setContentView(R.layout.web_image_picker);
            this.A06 = (ProgressBar) findViewById(R.id.indefiniteProgressBar);
            String stringExtra = getIntent().getStringExtra("query");
            if (stringExtra != null) {
                stringExtra = C002001d.A1j(stringExtra);
            }
            C459227b r1 = new C459227b(A092.A01());
            this.A07 = r1;
            ((TextView) r1.findViewById(R.id.search_src_text)).setTextColor(C004302a.A00(this, R.color.search_text_color_dark));
            this.A07.setQueryHint(r5.A06(R.string.search_hint));
            this.A07.setIconified(false);
            SearchView searchView = this.A07;
            searchView.A0A = C39211r8.A00;
            searchView.A0E(stringExtra);
            SearchView searchView2 = this.A07;
            searchView2.A07 = new ViewOnClickEBaseShape3S0100000_I1_1(this, 42);
            searchView2.A0B = new C41101uT(this);
            A092.A05(searchView2);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.A02 = (Uri) extras.getParcelable("output");
            }
            ListView A0T = A0T();
            A0T.requestFocus();
            A0T.setClickable(false);
            A0T.setBackground(null);
            A0T.setDividerHeight(0);
            View inflate = getLayoutInflater().inflate(R.layout.web_image_picker_footer, (ViewGroup) A0T, false);
            A0T.addFooterView(inflate, null, false);
            A0T.setFooterDividersEnabled(false);
            this.A05 = inflate.findViewById(R.id.progress);
            this.A04 = inflate.findViewById(R.id.attribution);
            C27211Op r02 = new C27211Op(this);
            this.A0A = r02;
            A0U(r02);
            this.A03 = new ViewOnClickEBaseShape3S0100000_I1_1(this, 43);
            A0V();
            this.A0F.A08(this.A0E);
            this.A07.requestFocus();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0L.clear();
        this.A0C.A01.A01(true);
        C11090fh r0 = this.A09;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            Log.i("webimagesearch/cancel_image_download_task");
            if (this.A09.A00 != null) {
                Log.i("webimagesearch/cancel_dialog");
                this.A09.A00.dismiss();
                this.A09.A00 = null;
            }
            this.A09 = null;
        }
        C11080fg r02 = this.A0A.A00;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(false);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
