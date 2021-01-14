package com.whatsapp.companiondevice;

import X.AbstractActivityC60812rK;
import X.ActivityC004702f;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass2F6;
import X.AnonymousClass2FE;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.HashMap;

public class PairedDevicesActivity extends AbstractActivityC60812rK {
    public View A00;
    public View A01;
    public AnonymousClass2FE A02;
    public HashMap A03;
    public final Runnable A04 = new RunnableEBaseShape8S0100000_I1_3(this, 38);

    @Override // X.AnonymousClass2C0, X.AbstractActivityC60812rK, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r7 = ((AnonymousClass2C0) this).A01;
        setTitle(r7.A06(R.string.whatsapp_web));
        this.A03 = new HashMap();
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            setContentView(R.layout.web_sessions);
            ListView listView = (ListView) findViewById(16908298);
            View inflate = getLayoutInflater().inflate(R.layout.web_sessions_header, (ViewGroup) null, false);
            this.A01 = inflate.findViewById(R.id.header);
            listView.addHeaderView(inflate, null, false);
            View inflate2 = getLayoutInflater().inflate(R.layout.web_sessions_footer, (ViewGroup) null, false);
            this.A00 = inflate2.findViewById(R.id.footer);
            inflate2.findViewById(R.id.logout_all).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 48));
            ((TextView) inflate2.findViewById(R.id.hint)).setText(r7.A06(R.string.qr_code_hint_2));
            listView.addFooterView(inflate2, null, false);
            this.A02 = new AnonymousClass2FE(this);
            A0U();
            listView.setVisibility(0);
            listView.setAdapter((ListAdapter) this.A02);
            listView.setOnItemClickListener(new AnonymousClass2F6(this));
            AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
            r0.A02.postDelayed(this.A04, 30000);
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_scan_qr, 0, ((AnonymousClass2C0) this).A01.A06(R.string.menuitem_scan_qr)).setIcon(R.drawable.ic_action_add).setShowAsAction(2);
        return true;
    }

    @Override // X.AbstractActivityC60812rK, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
        r0.A02.removeCallbacks(this.A04);
        for (CountDownTimer countDownTimer : this.A03.values()) {
            countDownTimer.cancel();
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_scan_qr) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (!A0P()) {
                startActivity(new Intent(this, DevicePairQrScannerActivity.class));
            }
            return true;
        }
    }
}
