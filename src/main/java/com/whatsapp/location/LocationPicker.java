package com.whatsapp.location;

import X.AbstractC19160uZ;
import X.AbstractC19240uh;
import X.AbstractC49792Sd;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01S;
import X.AnonymousClass01X;
import X.AnonymousClass020;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass0C1;
import X.AnonymousClass0ET;
import X.AnonymousClass0Eg;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0L2;
import X.AnonymousClass0M9;
import X.AnonymousClass1N2;
import X.AnonymousClass2C0;
import X.C000300f;
import X.C002101e;
import X.C02660Cy;
import X.C02770Dj;
import X.C03930Ii;
import X.C04360Kb;
import X.C06170Sb;
import X.C07020Vp;
import X.C07030Vq;
import X.C07040Vr;
import X.C19130uW;
import X.C19570vF;
import X.C19590vH;
import X.C19640vM;
import X.C32031eE;
import X.C32311eg;
import X.C53492dM;
import X.C55772hX;
import X.C56122i7;
import X.C60072ok;
import X.C60582pl;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.PlaceInfo;
import com.whatsapp.util.WhatsAppLibLoader;

public class LocationPicker extends ActivityC004602e {
    public float A00;
    public float A01;
    public Bundle A02;
    public C32031eE A03;
    public C19570vF A04;
    public C19570vF A05;
    public C19570vF A06;
    public C32311eg A07;
    public C60072ok A08;
    public AbstractC49792Sd A09;
    public boolean A0A;
    public final AbstractC19240uh A0B = new C55772hX(this);
    public final AnonymousClass0C1 A0C;
    public final AnonymousClass01I A0D = AnonymousClass01I.A00();
    public final C04360Kb A0E = C04360Kb.A00();
    public final AnonymousClass0HJ A0F;
    public final AnonymousClass0HK A0G;
    public final AnonymousClass03P A0H;
    public final AnonymousClass00S A0I = AnonymousClass00S.A00();
    public final AnonymousClass00G A0J = AnonymousClass00G.A01;
    public final AnonymousClass03S A0K;
    public final AnonymousClass01K A0L;
    public final C03930Ii A0M = C03930Ii.A00();
    public final C53492dM A0N;
    public final AnonymousClass0M9 A0O;
    public final AnonymousClass0ET A0P;
    public final AnonymousClass0Eg A0Q = AnonymousClass0Eg.A00();
    public final C02660Cy A0R;
    public final AnonymousClass01S A0S;
    public final C02770Dj A0T;
    public final AnonymousClass022 A0U;
    public final C06170Sb A0V = C06170Sb.A00();
    public final AnonymousClass00T A0W = C002101e.A00();
    public final WhatsAppLibLoader A0X;

    public LocationPicker() {
        AnonymousClass0L2.A01();
        this.A0T = C02770Dj.A00();
        this.A0F = AnonymousClass0HJ.A02();
        this.A0O = AnonymousClass0M9.A01();
        this.A0H = AnonymousClass03P.A00();
        this.A0L = AnonymousClass01K.A00();
        this.A0P = AnonymousClass0ET.A00();
        this.A0X = WhatsAppLibLoader.A00();
        this.A0N = C53492dM.A00();
        this.A0R = C02660Cy.A00();
        this.A0K = AnonymousClass03S.A00();
        this.A0C = AnonymousClass0C1.A01();
        this.A0S = AnonymousClass01S.A00();
        this.A0U = AnonymousClass022.A00();
        this.A0G = AnonymousClass0HK.A00();
    }

    public static void A04(LocationPicker locationPicker, C07040Vr r4) {
        if (locationPicker.A03 != null) {
            C32311eg r0 = locationPicker.A07;
            if (r0 == null) {
                C19640vM r2 = new C19640vM();
                r2.A02 = r4;
                r2.A01 = locationPicker.A04;
                C32031eE r1 = locationPicker.A03;
                C32311eg r02 = new C32311eg(r1, r2);
                r1.A09(r02);
                r02.A0I = r1;
                locationPicker.A07 = r02;
                return;
            }
            r0.A08(r4);
            C32311eg r12 = locationPicker.A07;
            ((AbstractC19160uZ) r12).A04 = true;
            r12.A00();
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$2271$LocationPicker(View view) {
        Object obj;
        this.A09.A0B.setVisibility(0);
        PlaceInfo placeInfo = this.A09.A0Z;
        if (placeInfo != null && (obj = placeInfo.A01) != null) {
            ((C32311eg) obj).A03();
        }
    }

    public void lambda$onCreate$2272$LocationPicker(View view) {
        AbstractC49792Sd r1 = this.A09;
        if (!r1.A0t) {
            PlaceInfo placeInfo = r1.A0Z;
            if (placeInfo != null) {
                Object obj = placeInfo.A01;
                if (obj != null) {
                    ((C32311eg) obj).A07(this.A05);
                }
                AbstractC49792Sd r12 = this.A09;
                r12.A0Z = null;
                r12.A0D();
            }
            AbstractC49792Sd r13 = this.A09;
            boolean z = r13.A0o;
            View view2 = r13.A0E;
            if (z) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
            C60072ok r3 = this.A08;
            int i = r3.A02;
            if (i == 0) {
                r3.setLocationMode(1);
            } else if (i == 1) {
                r3.setLocationMode(0);
            } else if (i == 2) {
                r3.setLocationMode(1);
            }
        } else if (r1.A06 != null) {
            r1.A0S.setImageResource(R.drawable.btn_myl_active);
            C32031eE r5 = this.A03;
            if (r5 != null) {
                C07040Vr r0 = new C07040Vr(this.A09.A06.getLatitude(), this.A09.A06.getLongitude());
                C07030Vq r2 = new C07030Vq();
                r2.A08 = r0;
                r5.A08(r2, 1500, null);
            }
            this.A09.A0s = true;
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (!this.A09.A0V()) {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r12 = ((AnonymousClass2C0) this).A01;
        setTitle(r12.A06(R.string.send_location));
        AnonymousClass00G r0 = this.A0J;
        AnonymousClass01I r02 = this.A0D;
        C000300f r2 = ((ActivityC004702f) this).A0G;
        AnonymousClass0ET r1 = this.A0P;
        C02660Cy r03 = this.A0R;
        C56122i7 r04 = new C56122i7(this, r0, this.A0I, super.A0N, this.A0Q, ((ActivityC004702f) this).A0F, this.A0V, r02, this.A0W, super.A0M, super.A0L, this.A0E, this.A0M, ((ActivityC004602e) this).A04, this.A0T, this.A0F, this.A0H, this.A0O, r12, this.A0L, new AnonymousClass1N2(r0, r02, r2, r1, r03), this.A0X, this.A0N, r03, this.A0K, super.A0J, this.A0C, this.A0S, this.A0U, this.A0G);
        this.A09 = r04;
        r04.A0M(this, bundle);
        this.A09.A0D.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 41));
        C02770Dj.A01(this);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red);
        this.A05 = C19590vH.A00(decodeResource);
        this.A06 = C19590vH.A00(decodeResource2);
        this.A04 = C19590vH.A00(this.A09.A05);
        C19130uW r22 = new C19130uW();
        r22.A02 = 1;
        r22.A08 = true;
        r22.A04 = false;
        r22.A05 = true;
        r22.A07 = true;
        this.A08 = new C60582pl(this, this, r22);
        View findViewById = findViewById(R.id.map_holder);
        if (findViewById != null) {
            ((ViewGroup) findViewById).addView(this.A08);
            this.A08.A0E(bundle);
            this.A02 = bundle;
            if (this.A03 == null) {
                this.A03 = this.A08.A0L(this.A0B);
            }
            AbstractC49792Sd r13 = this.A09;
            View findViewById2 = findViewById(R.id.my_location);
            if (findViewById2 != null) {
                r13.A0S = (ImageView) findViewById2;
                this.A09.A0S.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 42));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        Dialog A012 = this.A09.A01(i);
        if (A012 != null) {
            return A012;
        }
        return super.onCreateDialog(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        menu.add(0, 0, 0, r2.A06(R.string.search)).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        menu.add(0, 1, 0, r2.A06(R.string.refresh)).setIcon(R.drawable.ic_action_refresh).setShowAsAction(1);
        return true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        if (this.A08 != null) {
            this.A09.A06();
            if (this.A03 != null) {
                SharedPreferences.Editor edit = this.A0U.A01(AnonymousClass020.A02).edit();
                C07020Vp A022 = this.A03.A02();
                C07040Vr r4 = A022.A03;
                edit.putFloat("share_location_lat", (float) r4.A00);
                edit.putFloat("share_location_lon", (float) r4.A01);
                edit.putFloat("share_location_zoom", A022.A02);
                edit.apply();
            }
            super.onDestroy();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004902h
    public void onLowMemory() {
        super.onLowMemory();
        this.A08.A04();
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A09.A0I(intent);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.A09.A0W(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        C60072ok r0 = this.A08;
        if (r0 != null) {
            SensorManager sensorManager = r0.A04;
            if (sensorManager != null) {
                sensorManager.unregisterListener(r0.A08);
            }
            AbstractC49792Sd r1 = this.A09;
            r1.A0q = r1.A18.A04();
            r1.A0x.A06(r1);
            super.onPause();
            return;
        }
        throw null;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.A09.A0t) {
            menu.findItem(0).setVisible(false);
            menu.findItem(1).setVisible(false);
        } else if (!this.A0K.A04()) {
            menu.findItem(0).setVisible(false);
            return true;
        }
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        C32031eE r1;
        super.onResume();
        AnonymousClass03S r2 = this.A0K;
        if (r2.A04() != this.A09.A0q) {
            invalidateOptionsMenu();
            if (r2.A04() && (r1 = this.A03) != null && !this.A09.A0t) {
                r1.A0B(true);
            }
        }
        C60072ok r0 = this.A08;
        if (r0 != null) {
            r0.A0M();
            if (this.A03 == null) {
                this.A03 = this.A08.A0L(this.A0B);
            }
            this.A09.A07();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        C32031eE r0 = this.A03;
        if (r0 != null) {
            C07020Vp A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C07040Vr r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A08.A02);
        }
        this.A08.A0G(bundle);
        this.A09.A0L(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A09.A0b.A01();
        return false;
    }
}
