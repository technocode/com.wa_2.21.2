package com.whatsapp.companiondevice;

import X.AbstractActivityC60812rK;
import X.AbstractC000400g;
import X.AbstractC000900m;
import X.AbstractC03150Ez;
import X.AbstractC16300pa;
import X.AbstractC16320pc;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass0C4;
import X.AnonymousClass0DH;
import X.AnonymousClass0JF;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass2F3;
import X.AnonymousClass2XK;
import X.AnonymousClass2XM;
import X.AnonymousClass2XX;
import X.AnonymousClass2XY;
import X.AnonymousClass2XZ;
import X.C000300f;
import X.C003301q;
import X.C015808q;
import X.C02420Bx;
import X.C03130Ex;
import X.C13700kg;
import X.C13710kh;
import X.C28051Sr;
import X.C51022Xa;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biometric.BiometricAuthPlugin;
import com.whatsapp.companiondevice.optin.FirstTimeExperienceDialogFragment;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinkedDevicesActivity extends AbstractActivityC60812rK implements DialogInterface.OnDismissListener {
    public RecyclerView A00;
    public BiometricAuthPlugin A01;
    public C51022Xa A02;
    public LinkedDevicesDetailDialogFragment A03;
    public AnonymousClass0JF A04;
    public Runnable A05;
    public List A06 = new ArrayList();
    public final AbstractC16320pc A07 = new AnonymousClass2XY(this);
    public final AnonymousClass02M A08 = AnonymousClass02M.A00();
    public final C000300f A09 = C000300f.A00();
    public final C02420Bx A0A = C02420Bx.A00();
    public final AnonymousClass0DH A0B = AnonymousClass0DH.A00();
    public final AbstractC000900m A0C = new AnonymousClass2XM(this);
    public final C003301q A0D = C003301q.A02;
    public final AnonymousClass04j A0E = AnonymousClass04j.A00();
    public final C03130Ex A0F = C03130Ex.A00();
    public final C015808q A0G = C015808q.A00();
    public final AbstractC03150Ez A0H = new AnonymousClass2XX(this);
    public final Comparator A0I = AnonymousClass2F3.A00;

    public final void A0X() {
        C13700kg r0;
        if (!A0P()) {
            if (!this.A09.A0D(AbstractC000400g.A1J) || !this.A01.A00()) {
                startActivity(new Intent(this, DevicePairQrScannerActivity.class));
                return;
            }
            BiometricAuthPlugin biometricAuthPlugin = this.A01;
            C13710kh r1 = biometricAuthPlugin.A02;
            if (r1 == null || (r0 = biometricAuthPlugin.A01) == null) {
                throw new IllegalStateException("BiometricAuthPlugin/authenticate: Have you check if you can authenticate? Check canAuthenticate()");
            }
            r1.A02(r0);
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            A0U();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass02M r2 = this.A08;
        r2.A02.post(new RunnableEBaseShape8S0100000_I1_3(this, 31));
    }

    @Override // X.AnonymousClass2C0, X.AbstractActivityC60812rK, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AnonymousClass01X r7;
        super.onCreate(bundle);
        if (C28051Sr.A1p(this.A09)) {
            r7 = ((AnonymousClass2C0) this).A01;
            setTitle(r7.A06(R.string.linked_devices_screen_title));
        } else {
            r7 = ((AnonymousClass2C0) this).A01;
            setTitle(r7.A06(R.string.whatsapp_web));
        }
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            setContentView(R.layout.linked_devices_activity);
            AnonymousClass02M r3 = this.A08;
            this.A01 = new BiometricAuthPlugin(this, r3, new AnonymousClass2XK(this));
            C03130Ex r6 = this.A0F;
            r6.A02.execute(new RunnableEBaseShape2S0300000_I1(r6, this.A0H, r3.A06, 26));
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.linked_device_recycler_view);
            this.A00 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            AnonymousClass2XZ r5 = new AnonymousClass2XZ(this);
            AnonymousClass0C4 r62 = ((AbstractActivityC60812rK) this).A0B;
            C015808q r8 = this.A0G;
            C51022Xa r4 = new C51022Xa(r5, r62, r7, r8, ((AbstractActivityC60812rK) this).A04);
            this.A02 = r4;
            this.A00.setAdapter(r4);
            C51022Xa r0 = this.A02;
            ((AbstractC16300pa) r0).A01.registerObserver(this.A07);
            A0U();
            C003301q r1 = this.A0D;
            r1.A01(this.A0C);
            this.A04 = r1.A02();
            if (r8.A02() && !r8.A03.A00.getBoolean("md_opt_in_first_time_experience_shown", false)) {
                Log.d("OptInWebBeta/First_Time_Experience");
                this.A0J.A00.edit().putBoolean("md_opt_in_first_time_experience_shown", true).apply();
                new FirstTimeExperienceDialogFragment().A0u(A04(), null);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AbstractActivityC60812rK, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        C03130Ex r0 = this.A0F;
        r0.A00.A02(this.A0H);
        this.A0D.A00(this.A0C);
        C51022Xa r02 = this.A02;
        ((AbstractC16300pa) r02).A01.unregisterObserver(this.A07);
        super.onDestroy();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A03 = null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        ((AbstractActivityC60812rK) this).A08.ANF(new RunnableEBaseShape8S0100000_I1_3(this, 30));
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        Runnable runnable = this.A05;
        if (runnable != null) {
            ((AbstractActivityC60812rK) this).A08.AMj(runnable);
        }
    }
}
