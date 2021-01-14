package com.whatsapp.location;

import X.AbstractC24471Ay;
import X.AbstractView$OnCreateContextMenuListenerC56112i5;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00S;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass020;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass06B;
import X.AnonymousClass08B;
import X.AnonymousClass0AC;
import X.AnonymousClass0AQ;
import X.AnonymousClass0C1;
import X.AnonymousClass0EU;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0L2;
import X.AnonymousClass0XZ;
import X.AnonymousClass1B5;
import X.AnonymousClass1B6;
import X.AnonymousClass1B7;
import X.AnonymousClass1B8;
import X.AnonymousClass1B9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1BR;
import X.AnonymousClass2C0;
import X.AnonymousClass2S1;
import X.AnonymousClass2SJ;
import X.AnonymousClass31y;
import X.BinderC04800Lv;
import X.C002001d;
import X.C002301g;
import X.C008805h;
import X.C014308b;
import X.C02770Dj;
import X.C02900Dx;
import X.C09200cS;
import X.C35471kP;
import X.C35931lJ;
import X.C36011lR;
import X.C36021lS;
import X.C49842Sk;
import X.C49852Sl;
import X.C55682hO;
import X.C55942ho;
import X.C55972hr;
import X.C60092om;
import X.C60102on;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity2 extends ActivityC004602e {
    public float A00 = -1.0f;
    public int A01 = 0;
    public Bundle A02;
    public MenuItem A03;
    public ImageView A04;
    public AbstractC24471Ay A05 = new C55972hr(this);
    public AnonymousClass1B5 A06;
    public C55942ho A07;
    public AbstractView$OnCreateContextMenuListenerC56112i5 A08;
    public Map A09 = new HashMap();
    public Set A0A = new HashSet();
    public final AnonymousClass1B8 A0B = new C55682hO(this);
    public final AnonymousClass0C1 A0C = AnonymousClass0C1.A01();
    public final AnonymousClass01I A0D = AnonymousClass01I.A00();
    public final AnonymousClass0HJ A0E = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0F = AnonymousClass01A.A00();
    public final AnonymousClass08B A0G = AnonymousClass08B.A00;
    public final C014308b A0H = C014308b.A00();
    public final AnonymousClass0L2 A0I = AnonymousClass0L2.A01();
    public final AnonymousClass0HK A0J = AnonymousClass0HK.A00();
    public final AnonymousClass00S A0K = AnonymousClass00S.A00();
    public final AnonymousClass03S A0L = AnonymousClass03S.A00();
    public final AnonymousClass0AQ A0M = AnonymousClass0AQ.A00();
    public final AnonymousClass01T A0N = AnonymousClass01T.A00();
    public final AnonymousClass0AC A0O = AnonymousClass0AC.A00;
    public final AnonymousClass01S A0P = AnonymousClass01S.A00();
    public final AnonymousClass0XZ A0Q = AnonymousClass0XZ.A00();
    public final C02770Dj A0R = C02770Dj.A00();
    public final AnonymousClass0EU A0S = AnonymousClass0EU.A03;
    public final AnonymousClass022 A0T = AnonymousClass022.A00();
    public final AnonymousClass31y A0U = AnonymousClass31y.A00();
    public final C09200cS A0V = C09200cS.A00();
    public volatile boolean A0W;
    public volatile boolean A0X = false;

    public static float A04(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        AnonymousClass1B5 r0 = groupChatLiveLocationsActivity2.A06;
        if (r0 != null) {
            C36021lS A012 = r0.A00().A01();
            Location location = new Location("");
            LatLng latLng = A012.A02;
            location.setLatitude(latLng.A00);
            location.setLongitude(latLng.A01);
            Location location2 = new Location("");
            LatLng latLng2 = A012.A03;
            location2.setLatitude(latLng2.A00);
            location2.setLongitude(latLng2.A01);
            double distanceTo = (double) location2.distanceTo(location);
            if (distanceTo <= 0.0d) {
                return f2;
            }
            double d = (double) groupChatLiveLocationsActivity2.A06.A02().A02;
            float log = (float) ((Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)) + d);
            if (log > 16.0f) {
                return 16.0f;
            }
            return log;
        }
        throw null;
    }

    public final AnonymousClass1BR A0T(C49842Sk r4) {
        LatLng A002 = r4.A00();
        Bitmap A042 = this.A08.A04(r4);
        C36011lR r1 = new C36011lR();
        r1.A07 = C008805h.A0J(A042);
        r1.A09 = this.A08.A09(r4);
        r1.A02 = 0.5f;
        r1.A03 = 0.87f;
        AnonymousClass1B5 r0 = this.A06;
        if (r0 != null) {
            r1.A08 = A002;
            AnonymousClass1BR A032 = r0.A03(r1);
            this.A09.put(r4.A03, A032);
            return A032;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r4.A0L.A04() == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
            r4 = this;
            X.AnonymousClass00E.A01()
            X.1B5 r0 = r4.A06
            if (r0 != 0) goto L_0x001c
            X.2ho r3 = r4.A07
            X.1B8 r2 = r4.A0B
            r1 = 0
            if (r3 == 0) goto L_0x0037
            X.AnonymousClass00E.A01()
            X.1B5 r0 = r3.A08
            if (r0 == 0) goto L_0x0033
            r2.AHS(r0)
            X.1B5 r1 = r3.A08
        L_0x001a:
            r4.A06 = r1
        L_0x001c:
            android.widget.ImageView r2 = r4.A04
            X.2i5 r0 = r4.A08
            X.0Dx r0 = r0.A0m
            if (r0 != 0) goto L_0x002d
            X.03S r0 = r4.A0L
            boolean r1 = r0.A04()
            r0 = 0
            if (r1 != 0) goto L_0x002f
        L_0x002d:
            r0 = 8
        L_0x002f:
            r2.setVisibility(r0)
            return
        L_0x0033:
            r3.A05(r2)
            goto L_0x001a
        L_0x0037:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A0U():void");
    }

    public final void A0V() {
        AnonymousClass1B5 r2 = this.A06;
        if (r2 != null) {
            AbstractView$OnCreateContextMenuListenerC56112i5 r1 = this.A08;
            if (r1.A0n != null || r1.A0m != null) {
                r2.A0D(false);
            } else if (this.A0L.A04()) {
                this.A06.A0D(true);
            }
            int width = this.A07.getWidth();
            int height = this.A07.getHeight();
            if (!(width == 0 || height == 0)) {
                ArrayList arrayList = new ArrayList(this.A0A);
                this.A0A.clear();
                AnonymousClass1B9 A002 = this.A06.A00();
                AbstractView$OnCreateContextMenuListenerC56112i5 r12 = this.A08;
                this.A06.A02();
                r12.A0Q(new C49852Sl(A002));
                for (C49842Sk r6 : this.A08.A1M) {
                    AnonymousClass1BR r5 = (AnonymousClass1BR) this.A09.get(r6.A03);
                    LatLng A003 = r6.A00();
                    if (r5 == null) {
                        r5 = A0T(r6);
                    } else {
                        Object A012 = r5.A01();
                        if (!(A012 instanceof C49842Sk)) {
                            r5 = A0T(r6);
                        } else {
                            if (!r5.A08()) {
                                r5.A07(true);
                            }
                            r5.A06(A003);
                            C49842Sk r22 = (C49842Sk) A012;
                            if (!(r22.A00 == r6.A00 && r22.A01 == r6.A01)) {
                                Bitmap A042 = this.A08.A04(r6);
                                try {
                                    r5.A00.APD(this.A08.A09(r6));
                                    r5.A05(C008805h.A0J(A042));
                                } catch (RemoteException e) {
                                    throw new AnonymousClass06B(e);
                                }
                            }
                        }
                    }
                    if (r6.A00 == 1) {
                        r5.A04(100.0f);
                    } else if (r6.A04.size() > 1) {
                        r5.A04(50.0f);
                    } else {
                        r5.A04(1.0f);
                    }
                    try {
                        r5.A00.ASH(new BinderC04800Lv(r6));
                        if (r6.A02 == this.A08.A0o) {
                            r5.A03();
                        } else {
                            r5.A02();
                        }
                        this.A0A.add(r5);
                    } catch (RemoteException e2) {
                        throw new AnonymousClass06B(e2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass1BR r13 = (AnonymousClass1BR) it.next();
                    if (!this.A0A.contains(r13) && r13.A01() != null && r13.A08()) {
                        r13.A07(false);
                    }
                }
            }
        }
    }

    public final void A0W(List list, boolean z) {
        if (this.A06 == null) {
            throw null;
        } else if (list.size() != 1) {
            AnonymousClass1BQ r8 = new AnonymousClass1BQ();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C02900Dx r0 = (C02900Dx) it.next();
                double d = r0.A00;
                double d2 = r0.A01;
                if (-180.0d > d2 || d2 >= 180.0d) {
                    d2 = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
                }
                double max = Math.max(-90.0d, Math.min(90.0d, d));
                r8.A00 = Math.min(r8.A00, max);
                r8.A01 = Math.max(r8.A01, max);
                double d3 = r8.A02;
                if (Double.isNaN(d3)) {
                    r8.A02 = d2;
                } else {
                    double d4 = r8.A03;
                    if (d3 <= d4) {
                        if (d3 <= d2 && d2 <= d4) {
                        }
                    } else if (d3 > d2) {
                        if (d2 <= d4) {
                        }
                    }
                    if (((d3 - d2) + 360.0d) % 360.0d < ((d2 - d4) + 360.0d) % 360.0d) {
                        r8.A02 = d2;
                    }
                }
                r8.A03 = d2;
            }
            A0Y(z, r8);
        } else if (!z) {
            this.A06.A09(C008805h.A0H(new LatLng(((C02900Dx) list.get(0)).A00, ((C02900Dx) list.get(0)).A01), 16.0f));
        } else if (!this.A0W) {
            this.A0W = true;
            this.A06.A0A(C008805h.A0H(new LatLng(((C02900Dx) list.get(0)).A00, ((C02900Dx) list.get(0)).A01), 16.0f), this.A05);
        }
    }

    public final void A0X(boolean z) {
        if (this.A06 == null || this.A08.A0u || this.A0A.isEmpty()) {
            return;
        }
        if (this.A07.getWidth() <= 0 || this.A07.getHeight() <= 0) {
            this.A07.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2SJ(this));
        } else if (!z || !this.A0W) {
            ArrayList arrayList = new ArrayList(this.A0A);
            if (this.A06 == null) {
                throw null;
            } else if (!arrayList.isEmpty()) {
                LatLng A052 = this.A08.A05();
                if (A052 != null) {
                    Collections.sort(arrayList, new AnonymousClass2S1(A052.A00, A052.A01));
                }
                AnonymousClass1BQ r7 = new AnonymousClass1BQ();
                AnonymousClass1BQ r6 = new AnonymousClass1BQ();
                r6.A01(((AnonymousClass1BR) arrayList.get(0)).A00());
                r7.A01(((AnonymousClass1BR) arrayList.get(0)).A00());
                int i = 1;
                while (i < arrayList.size()) {
                    AnonymousClass1BR r1 = (AnonymousClass1BR) arrayList.get(i);
                    r6.A01(r1.A00());
                    if (!AbstractView$OnCreateContextMenuListenerC56112i5.A02(r6.A00())) {
                        break;
                    }
                    r7.A01(r1.A00());
                    i++;
                }
                if (i == 1) {
                    C49842Sk r0 = (C49842Sk) ((AnonymousClass1BR) arrayList.get(0)).A01();
                    if (r0 != null) {
                        A0W(r0.A04, z);
                        return;
                    }
                    throw null;
                }
                A0Y(z, r7);
            }
        } else {
            this.A0X = true;
        }
    }

    public final void A0Y(boolean z, AnonymousClass1BQ r7) {
        if (this.A06 != null) {
            LatLngBounds A002 = r7.A00();
            if (((float) this.A07.getHeight()) > C002301g.A0K.A00 * 64.0f * 2.0f && ((float) this.A07.getWidth()) > C002301g.A0K.A00 * 64.0f * 2.0f) {
                if (!z) {
                    this.A06.A05();
                    this.A06.A09(C008805h.A0I(A002, (int) (C002301g.A0K.A00 * 64.0f)));
                    this.A07.postDelayed(new RunnableEBaseShape10S0100000_I1_5(this, 37), 500);
                } else if (!this.A0W) {
                    this.A0W = true;
                    this.A06.A05();
                    this.A06.A0A(C008805h.A0I(A002, (int) (C002301g.A0K.A00 * 64.0f)), this.A05);
                }
            }
        } else {
            throw null;
        }
    }

    public final boolean A0Z(LatLng latLng) {
        AnonymousClass1B5 r0 = this.A06;
        if (r0 != null) {
            AnonymousClass1B9 A002 = r0.A00();
            if (A002.A01().A04.A00(latLng)) {
                return false;
            }
            if (latLng.A00 >= A002.A01().A04.A01.A00) {
                return true;
            }
            Point A003 = A002.A00(A002.A01().A04.A01);
            A003.offset(0, this.A08.A0A);
            try {
                return !new LatLngBounds(A002.A00.A4U(new BinderC04800Lv(A003)), A002.A01().A04.A00).A00(latLng);
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        } else {
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$2247$GroupChatLiveLocationsActivity2(View view) {
        this.A08.A0B();
        C55942ho r3 = this.A07;
        int i = r3.A03;
        if (i == 0) {
            r3.setLocationMode(1);
        } else if (i == 1) {
            r3.setLocationMode(0);
        } else if (i == 2) {
            r3.setLocationMode(1);
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A08.A0X(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return true;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass00S r0 = this.A0K;
        AnonymousClass02M r02 = ((ActivityC004702f) this).A0F;
        AnonymousClass01I r03 = this.A0D;
        C09200cS r04 = this.A0V;
        AnonymousClass0L2 r05 = this.A0I;
        C02770Dj r15 = this.A0R;
        AnonymousClass0HJ r14 = this.A0E;
        AnonymousClass01A r13 = this.A0F;
        C014308b r7 = this.A0H;
        this.A08 = new C60092om(this, r0, r02, r03, r04, r05, r15, r14, r13, r7, ((AnonymousClass2C0) this).A01, this.A0G, this.A0O, this.A0L, this.A0C, this.A0P, this.A0J, this.A0Q, this.A0S);
        A09().A0A(true);
        setContentView(R.layout.groupchat_live_locations);
        AnonymousClass0AQ r2 = this.A0M;
        AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
        if (A012 != null) {
            A09().A08(C002001d.A1J(r7.A08(r2.A02(A012), false), this, super.A0M));
            this.A08.A0M(this, bundle);
            AnonymousClass1B7.A00(this);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            googleMapOptions.A00 = 1;
            googleMapOptions.A05 = false;
            googleMapOptions.A08 = true;
            googleMapOptions.A06 = true;
            googleMapOptions.A0A = true;
            googleMapOptions.A09 = true;
            this.A07 = new C60102on(this, this, googleMapOptions);
            View findViewById = findViewById(R.id.map_holder);
            if (findViewById != null) {
                ((ViewGroup) findViewById).addView(this.A07);
                this.A07.A03(bundle);
                View findViewById2 = findViewById(R.id.my_location);
                if (findViewById2 != null) {
                    ImageView imageView = (ImageView) findViewById2;
                    this.A04 = imageView;
                    imageView.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 39));
                    this.A02 = bundle;
                    A0U();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        Dialog A032 = this.A08.A03(i);
        if (A032 != null) {
            return A032;
        }
        return super.onCreateDialog(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass1B5 r0;
        getMenuInflater().inflate(R.menu.map_layers, menu);
        MenuItem findItem = menu.findItem(R.id.map_traffic);
        this.A03 = findItem;
        if (findItem == null || (r0 = this.A06) == null) {
            return true;
        }
        try {
            findItem.setChecked(r0.A01.ABd());
            return true;
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A07.A00();
        AbstractView$OnCreateContextMenuListenerC56112i5 r2 = this.A08;
        r2.A0d.A00();
        r2.A12.A00(r2.A11);
        r2.A1A.A00(r2.A19);
        if (this.A06 != null) {
            SharedPreferences.Editor edit = this.A0T.A01(AnonymousClass020.A02).edit();
            CameraPosition A022 = this.A06.A02();
            LatLng latLng = A022.A03;
            edit.putFloat("live_location_lat", (float) latLng.A00);
            edit.putFloat("live_location_lng", (float) latLng.A01);
            edit.putFloat("live_location_zoom", A022.A02);
            edit.apply();
        }
    }

    @Override // X.ActivityC004902h
    public void onLowMemory() {
        super.onLowMemory();
        this.A07.A01();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A06 == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.map_type_normal) {
            this.A06.A06(1);
            this.A0T.A01(AnonymousClass020.A02).edit().putInt("live_location_map_type", 1).apply();
            return true;
        } else if (itemId == R.id.map_type_satellite) {
            this.A06.A06(4);
            this.A0T.A01(AnonymousClass020.A02).edit().putInt("live_location_map_type", 4).apply();
            return true;
        } else if (itemId == R.id.map_type_terrain) {
            this.A06.A06(3);
            this.A0T.A01(AnonymousClass020.A02).edit().putInt("live_location_map_type", 3).apply();
            return true;
        } else if (itemId == R.id.map_traffic) {
            AnonymousClass1B5 r0 = this.A06;
            if (r0 != null) {
                try {
                    boolean z = !r0.A01.ABd();
                    this.A06.A0E(z);
                    this.A03.setChecked(z);
                    this.A0T.A01(AnonymousClass020.A02).edit().putBoolean("live_location_show_traffic", z).apply();
                    return true;
                } catch (RemoteException e) {
                    throw new AnonymousClass06B(e);
                }
            } else {
                throw null;
            }
        } else if (itemId != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A07.A02();
        C55942ho r0 = this.A07;
        SensorManager sensorManager = r0.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r0.A0B);
        }
        this.A08.A0C();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C35931lJ r2 = ((AnonymousClass1B6) this.A07).A00;
        r2.A01(null, new C35471kP(r2));
        this.A07.A06();
        this.A08.A0D();
        A0U();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass1B5 r0 = this.A06;
        if (r0 != null) {
            CameraPosition A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A07.A03);
        }
        this.A07.A04(bundle);
        this.A08.A0N(bundle);
        super.onSaveInstanceState(bundle);
    }
}
