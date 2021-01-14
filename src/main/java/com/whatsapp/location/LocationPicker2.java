package com.whatsapp.location;

import X.AbstractC49792Sd;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00E;
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
import X.AnonymousClass06F;
import X.AnonymousClass0C1;
import X.AnonymousClass0ET;
import X.AnonymousClass0Eg;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0M9;
import X.AnonymousClass1B5;
import X.AnonymousClass1B6;
import X.AnonymousClass1B7;
import X.AnonymousClass1B8;
import X.AnonymousClass1BR;
import X.AnonymousClass1N2;
import X.AnonymousClass2C0;
import X.AnonymousClass2SG;
import X.C000300f;
import X.C002101e;
import X.C008805h;
import X.C02660Cy;
import X.C02770Dj;
import X.C03930Ii;
import X.C04360Kb;
import X.C06170Sb;
import X.C35471kP;
import X.C35931lJ;
import X.C36011lR;
import X.C53492dM;
import X.C55792hZ;
import X.C55942ho;
import X.C56152iA;
import X.C60152ot;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.PlaceInfo;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

public class LocationPicker2 extends ActivityC004602e {
    public Bundle A00;
    public AnonymousClass1B5 A01;
    public AnonymousClass06F A02;
    public AnonymousClass06F A03;
    public AnonymousClass06F A04;
    public AnonymousClass1BR A05;
    public AnonymousClass2SG A06;
    public C55942ho A07;
    public AbstractC49792Sd A08;
    public final AnonymousClass1B8 A09 = new C55792hZ(this);
    public final AnonymousClass0C1 A0A = AnonymousClass0C1.A01();
    public final AnonymousClass01I A0B = AnonymousClass01I.A00();
    public final C04360Kb A0C = C04360Kb.A00();
    public final AnonymousClass0HJ A0D = AnonymousClass0HJ.A02();
    public final AnonymousClass0HK A0E = AnonymousClass0HK.A00();
    public final AnonymousClass03P A0F = AnonymousClass03P.A00();
    public final AnonymousClass00S A0G = AnonymousClass00S.A00();
    public final AnonymousClass00G A0H = AnonymousClass00G.A01;
    public final AnonymousClass03S A0I = AnonymousClass03S.A00();
    public final AnonymousClass01K A0J = AnonymousClass01K.A00();
    public final C03930Ii A0K = C03930Ii.A00();
    public final C53492dM A0L = C53492dM.A00();
    public final AnonymousClass0M9 A0M = AnonymousClass0M9.A01();
    public final AnonymousClass0ET A0N = AnonymousClass0ET.A00();
    public final AnonymousClass0Eg A0O = AnonymousClass0Eg.A00();
    public final C02660Cy A0P = C02660Cy.A00();
    public final AnonymousClass01S A0Q = AnonymousClass01S.A00();
    public final C02770Dj A0R = C02770Dj.A00();
    public final AnonymousClass022 A0S = AnonymousClass022.A00();
    public final C06170Sb A0T = C06170Sb.A00();
    public final AnonymousClass00T A0U = C002101e.A00();
    public final WhatsAppLibLoader A0V = WhatsAppLibLoader.A00();

    public static void A04(LocationPicker2 locationPicker2, LatLng latLng) {
        AnonymousClass1B5 r2 = locationPicker2.A01;
        if (r2 != null) {
            AnonymousClass1BR r0 = locationPicker2.A05;
            if (r0 == null) {
                C36011lR r1 = new C36011lR();
                r1.A08 = latLng;
                r1.A07 = locationPicker2.A02;
                locationPicker2.A05 = r2.A03(r1);
                return;
            }
            r0.A06(latLng);
            locationPicker2.A05.A07(true);
            return;
        }
        throw null;
    }

    public final void A0T() {
        if (this.A01 == null) {
            C55942ho r3 = this.A07;
            AnonymousClass1B8 r2 = this.A09;
            AnonymousClass1B5 r1 = null;
            if (r3 != null) {
                AnonymousClass00E.A01();
                AnonymousClass1B5 r0 = r3.A08;
                if (r0 != null) {
                    r2.AHS(r0);
                    r1 = r3.A08;
                } else {
                    r3.A05(r2);
                }
                this.A01 = r1;
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$2278$LocationPicker2(View view) {
        Object obj;
        this.A08.A0B.setVisibility(0);
        PlaceInfo placeInfo = this.A08.A0Z;
        if (placeInfo != null && (obj = placeInfo.A01) != null) {
            ((AnonymousClass1BR) obj).A02();
        }
    }

    public /* synthetic */ void lambda$onCreate$2279$LocationPicker2(View view) {
        AbstractC49792Sd r1 = this.A08;
        if (!r1.A0t) {
            PlaceInfo placeInfo = r1.A0Z;
            if (placeInfo != null) {
                Object obj = placeInfo.A01;
                if (obj != null) {
                    ((AnonymousClass1BR) obj).A05(this.A03);
                }
                AbstractC49792Sd r12 = this.A08;
                r12.A0Z = null;
                r12.A0D();
            }
            AbstractC49792Sd r13 = this.A08;
            boolean z = r13.A0o;
            View view2 = r13.A0E;
            if (z) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
            C55942ho r3 = this.A07;
            int i = r3.A03;
            if (i == 0) {
                r3.setLocationMode(1);
            } else if (i == 1) {
                r3.setLocationMode(0);
            } else if (i == 2) {
                r3.setLocationMode(1);
            }
        } else if (r1.A06 != null) {
            r1.A0S.setImageResource(R.drawable.btn_myl_active);
            AnonymousClass1B5 r5 = this.A01;
            if (r5 != null) {
                r5.A08(C008805h.A0G(new LatLng(this.A08.A06.getLatitude(), this.A08.A06.getLongitude())));
            }
            this.A08.A0s = true;
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (!this.A08.A0V()) {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r12 = ((AnonymousClass2C0) this).A01;
        setTitle(r12.A06(R.string.send_location));
        AnonymousClass00G r0 = this.A0H;
        AnonymousClass01I r02 = this.A0B;
        C000300f r2 = ((ActivityC004702f) this).A0G;
        AnonymousClass0ET r1 = this.A0N;
        C02660Cy r03 = this.A0P;
        C56152iA r04 = new C56152iA(this, r0, this.A0G, super.A0N, this.A0O, ((ActivityC004702f) this).A0F, this.A0T, r02, this.A0U, super.A0M, super.A0L, this.A0C, this.A0K, ((ActivityC004602e) this).A04, this.A0R, this.A0D, this.A0F, this.A0M, r12, this.A0J, new AnonymousClass1N2(r0, r02, r2, r1, r03), this.A0V, this.A0L, r03, this.A0I, super.A0J, this.A0A, this.A0Q, this.A0S, this.A0E);
        this.A08 = r04;
        r04.A0M(this, bundle);
        this.A08.A0D.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 44));
        int A002 = AnonymousClass1B7.A00(this);
        StringBuilder sb = new StringBuilder("LocationPicker2/onCreate MapsInitializer init:");
        sb.append(A002);
        Log.d(sb.toString());
        this.A03 = C008805h.A0J(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_green));
        this.A04 = C008805h.A0J(BitmapFactory.decodeResource(getResources(), R.drawable.pin_location_red));
        this.A02 = C008805h.A0J(this.A08.A05);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        googleMapOptions.A0C = Boolean.FALSE;
        googleMapOptions.A05 = false;
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = false;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A07 = new C60152ot(this, this, googleMapOptions);
        View findViewById = findViewById(R.id.map_holder);
        if (findViewById != null) {
            ((ViewGroup) findViewById).addView(this.A07);
            this.A07.A03(bundle);
            this.A00 = bundle;
            A0T();
            AbstractC49792Sd r13 = this.A08;
            View findViewById2 = findViewById(R.id.my_location);
            if (findViewById2 != null) {
                r13.A0S = (ImageView) findViewById2;
                this.A08.A0S.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 43));
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        Dialog A012 = this.A08.A01(i);
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
        this.A07.A00();
        this.A08.A06();
        if (this.A01 != null) {
            SharedPreferences.Editor edit = this.A0S.A01(AnonymousClass020.A02).edit();
            CameraPosition A022 = this.A01.A02();
            LatLng latLng = A022.A03;
            edit.putFloat("share_location_lat", (float) latLng.A00);
            edit.putFloat("share_location_lon", (float) latLng.A01);
            edit.putFloat("share_location_zoom", A022.A02);
            edit.apply();
        }
        super.onDestroy();
    }

    @Override // X.ActivityC004902h
    public void onLowMemory() {
        super.onLowMemory();
        this.A07.A01();
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A08.A0I(intent);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.A08.A0W(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        this.A07.A02();
        C55942ho r0 = this.A07;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0B);
        }
        AbstractC49792Sd r1 = this.A08;
        r1.A0q = r1.A18.A04();
        r1.A0x.A06(r1);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.A08.A0t) {
            menu.findItem(0).setVisible(false);
            menu.findItem(1).setVisible(false);
        } else if (!this.A0I.A04()) {
            menu.findItem(0).setVisible(false);
            return true;
        }
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        AnonymousClass1B5 r1;
        super.onResume();
        AnonymousClass03S r2 = this.A0I;
        if (r2.A04() != this.A08.A0q) {
            invalidateOptionsMenu();
            if (r2.A04() && (r1 = this.A01) != null && !this.A08.A0t) {
                r1.A0D(true);
            }
        }
        C35931lJ r22 = ((AnonymousClass1B6) this.A07).A00;
        r22.A01(null, new C35471kP(r22));
        this.A07.A06();
        A0T();
        this.A08.A07();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass1B5 r0 = this.A01;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A07.A03);
        }
        this.A07.A04(bundle);
        this.A08.A0L(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        this.A08.A0b.A01();
        return false;
    }
}
