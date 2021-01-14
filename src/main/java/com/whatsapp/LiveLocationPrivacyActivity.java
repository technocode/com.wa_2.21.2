package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass00S;
import X.AnonymousClass01S;
import X.AnonymousClass01X;
import X.AnonymousClass03S;
import X.AnonymousClass0ED;
import X.AnonymousClass0L2;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0YX;
import X.AnonymousClass1IM;
import X.AnonymousClass1IN;
import X.AnonymousClass1MO;
import X.AnonymousClass1MP;
import X.AnonymousClass2C0;
import X.C014308b;
import X.C40231sr;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.ArrayList;
import java.util.List;

public class LiveLocationPrivacyActivity extends ActivityC004602e {
    public View A00;
    public View A01;
    public View A02;
    public Button A03;
    public ListView A04;
    public ScrollView A05;
    public TextView A06;
    public AnonymousClass1MP A07;
    public AnonymousClass0YX A08;
    public final C014308b A09 = C014308b.A00();
    public final AnonymousClass0L2 A0A = AnonymousClass0L2.A01();
    public final AnonymousClass00S A0B = AnonymousClass00S.A00();
    public final AnonymousClass03S A0C = AnonymousClass03S.A00();
    public final AnonymousClass0ED A0D = new C40231sr(this);
    public final AnonymousClass01S A0E = AnonymousClass01S.A00();
    public final List A0F = new ArrayList();

    public final void A0T() {
        List list = this.A0F;
        list.clear();
        list.addAll(this.A0E.A0A());
        this.A07.notifyDataSetChanged();
        if (list.isEmpty()) {
            this.A06.setVisibility(8);
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A05.setVisibility(0);
            this.A03.setVisibility(8);
            return;
        }
        this.A06.setText(((AnonymousClass2C0) this).A01.A0A(R.plurals.live_location_currently_sharing, (long) list.size(), Integer.valueOf(list.size())));
        this.A06.setVisibility(0);
        this.A01.setVisibility(0);
        this.A05.setVisibility(8);
        this.A02.setVisibility(0);
        this.A04.setVisibility(0);
        this.A03.setVisibility(0);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RequestPermissionActivity.A0L(this, this.A0C, R.string.permission_location_access_on_updating_location_request, R.string.permission_location_access_on_updating_location, 0);
        setContentView(R.layout.live_location_privacy);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A08(((AnonymousClass2C0) this).A01.A06(R.string.settings_privacy_live_location));
            this.A08 = this.A0A.A03(this);
            this.A07 = new AnonymousClass1MP(this);
            this.A02 = findViewById(R.id.list_view_container);
            this.A04 = (ListView) findViewById(R.id.list_view);
            View inflate = getLayoutInflater().inflate(R.layout.live_location_list_header, (ViewGroup) null, false);
            AnonymousClass0Q7.A0W(inflate, 2);
            this.A06 = (TextView) inflate.findViewById(R.id.title);
            this.A05 = (ScrollView) findViewById(R.id.live_location_not_sharing);
            this.A00 = findViewById(R.id.bottom_button_container);
            this.A03 = (Button) findViewById(R.id.stop_sharing_btn);
            this.A04.addHeaderView(inflate);
            View inflate2 = getLayoutInflater().inflate(R.layout.live_location_privacy_footer, (ViewGroup) null, false);
            this.A01 = inflate2;
            this.A04.addFooterView(inflate2);
            this.A04.setOnItemClickListener(new AnonymousClass1IM(this));
            this.A04.setAdapter((ListAdapter) this.A07);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A04.setOnScrollListener(new AnonymousClass1MO(this, getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation)));
            }
            this.A03.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 5));
            A0T();
            this.A0E.A0V(this.A0D);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        String A062 = r3.A06(R.string.live_location_stop_sharing_dialog);
        AnonymousClass0MC r0 = r4.A01;
        r0.A0E = A062;
        r0.A0J = true;
        r4.A05(r3.A06(R.string.cancel), null);
        r4.A07(r3.A06(R.string.live_location_stop), new AnonymousClass1IN(this));
        AnonymousClass0MD A002 = r4.A00();
        A002.requestWindowFeature(1);
        return A002;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass01S r0 = this.A0E;
        r0.A0W.remove(this.A0D);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        LocationSharingService.A02(getApplicationContext(), this.A0E);
    }
}
