package com.whatsapp.location;

import X.AbstractC19070uN;
import X.AbstractC19160uZ;
import X.AbstractC19240uh;
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
import X.AnonymousClass08B;
import X.AnonymousClass0AC;
import X.AnonymousClass0AQ;
import X.AnonymousClass0C1;
import X.AnonymousClass0EU;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0L2;
import X.AnonymousClass0N2;
import X.AnonymousClass0XZ;
import X.AnonymousClass2C0;
import X.AnonymousClass2S0;
import X.AnonymousClass2SI;
import X.AnonymousClass31y;
import X.C002001d;
import X.C002301g;
import X.C014308b;
import X.C02770Dj;
import X.C02900Dx;
import X.C07020Vp;
import X.C07030Vq;
import X.C07040Vr;
import X.C09200cS;
import X.C19130uW;
import X.C19250ui;
import X.C19590vH;
import X.C19620vK;
import X.C19630vL;
import X.C19640vM;
import X.C19690vR;
import X.C32031eE;
import X.C32311eg;
import X.C49842Sk;
import X.C49852Sl;
import X.C55642hK;
import X.C55952hp;
import X.C60072ok;
import X.C60082ol;
import X.C60572pk;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity extends ActivityC004602e {
    public float A00 = -1.0f;
    public int A01 = 0;
    public Bundle A02;
    public ImageView A03;
    public AbstractC19070uN A04 = new C55952hp(this);
    public C32031eE A05;
    public C60072ok A06;
    public AbstractView$OnCreateContextMenuListenerC56112i5 A07;
    public Map A08 = new HashMap();
    public Set A09 = new HashSet();
    public final AbstractC19240uh A0A = new C55642hK(this);
    public final AnonymousClass0C1 A0B = AnonymousClass0C1.A01();
    public final AnonymousClass01I A0C = AnonymousClass01I.A00();
    public final AnonymousClass0HJ A0D = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0E = AnonymousClass01A.A00();
    public final AnonymousClass08B A0F = AnonymousClass08B.A00;
    public final C014308b A0G = C014308b.A00();
    public final AnonymousClass0L2 A0H = AnonymousClass0L2.A01();
    public final AnonymousClass0HK A0I = AnonymousClass0HK.A00();
    public final AnonymousClass00S A0J = AnonymousClass00S.A00();
    public final AnonymousClass03S A0K = AnonymousClass03S.A00();
    public final AnonymousClass0AQ A0L = AnonymousClass0AQ.A00();
    public final AnonymousClass01T A0M = AnonymousClass01T.A00();
    public final AnonymousClass0AC A0N = AnonymousClass0AC.A00;
    public final AnonymousClass01S A0O = AnonymousClass01S.A00();
    public final AnonymousClass0XZ A0P = AnonymousClass0XZ.A00();
    public final C02770Dj A0Q = C02770Dj.A00();
    public final AnonymousClass0EU A0R = AnonymousClass0EU.A03;
    public final AnonymousClass022 A0S = AnonymousClass022.A00();
    public final AnonymousClass31y A0T = AnonymousClass31y.A00();
    public final C09200cS A0U = C09200cS.A00();
    public volatile boolean A0V;
    public volatile boolean A0W = false;

    public static float A04(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        C32031eE r0 = groupChatLiveLocationsActivity.A05;
        if (r0 != null) {
            C19690vR A062 = r0.A0R.A06();
            Location location = new Location("");
            C07040Vr r2 = A062.A02;
            location.setLatitude(r2.A00);
            location.setLongitude(r2.A01);
            Location location2 = new Location("");
            C07040Vr r22 = A062.A03;
            location2.setLatitude(r22.A00);
            location2.setLongitude(r22.A01);
            double distanceTo = (double) location2.distanceTo(location);
            if (distanceTo <= 0.0d) {
                return f2;
            }
            double d = (double) groupChatLiveLocationsActivity.A05.A02().A02;
            float log = (float) ((Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)) + d);
            if (log > 16.0f) {
                return 16.0f;
            }
            return log;
        }
        throw null;
    }

    public final C32311eg A0T(C49842Sk r7) {
        if (this.A05 != null) {
            LatLng A002 = r7.A00();
            C07040Vr r4 = new C07040Vr(A002.A00, A002.A01);
            Bitmap A042 = this.A07.A04(r7);
            C19640vM r3 = new C19640vM();
            r3.A01 = C19590vH.A00(A042);
            r3.A04 = this.A07.A09(r7);
            float[] fArr = r3.A06;
            fArr[0] = 0.5f;
            fArr[1] = 0.87f;
            AnonymousClass01I r2 = this.A0C;
            UserJid userJid = r7.A02.A06;
            if (r2.A09(userJid)) {
                r3.A04 = ((AnonymousClass2C0) this).A01.A06(R.string.group_subject_changed_by_you);
            } else {
                r3.A04 = this.A0G.A08(this.A0E.A0A(userJid), false);
            }
            C32031eE r0 = this.A05;
            r3.A02 = r4;
            C32311eg r22 = new C32311eg(r0, r3);
            r0.A09(r22);
            r22.A0I = r0;
            this.A08.put(r7.A03, r22);
            return r22;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0K.A04() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
            r3 = this;
            X.AnonymousClass00E.A01()
            X.1eE r0 = r3.A05
            if (r0 != 0) goto L_0x0011
            X.2ok r1 = r3.A06
            X.0uh r0 = r3.A0A
            X.1eE r0 = r1.A0L(r0)
            r3.A05 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A03
            X.2i5 r0 = r3.A07
            X.0Dx r0 = r0.A0m
            if (r0 != 0) goto L_0x0022
            X.03S r0 = r3.A0K
            boolean r1 = r0.A04()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A0U():void");
    }

    public final void A0V() {
        int i;
        int i2;
        C32031eE r2 = this.A05;
        if (r2 != null) {
            AbstractView$OnCreateContextMenuListenerC56112i5 r1 = this.A07;
            if (r1.A0n != null || r1.A0m != null) {
                r2.A0B(false);
            } else if (this.A0K.A04()) {
                this.A05.A0B(true);
            }
            int width = this.A06.getWidth();
            int height = this.A06.getHeight();
            if (!(width == 0 || height == 0)) {
                ArrayList arrayList = new ArrayList(this.A09);
                this.A09.clear();
                C32031eE r0 = this.A05;
                C19250ui r10 = r0.A0R;
                AbstractView$OnCreateContextMenuListenerC56112i5 r12 = this.A07;
                r0.A02();
                r12.A0Q(new C49852Sl(r10));
                for (C49842Sk r9 : this.A07.A1M) {
                    C32311eg r22 = (C32311eg) this.A08.get(r9.A03);
                    LatLng A002 = r9.A00();
                    C07040Vr r13 = new C07040Vr(A002.A00, A002.A01);
                    if (r22 == null) {
                        r22 = A0T(r9);
                    } else {
                        Object obj = r22.A0L;
                        if (!(obj instanceof C49842Sk)) {
                            r22 = A0T(r9);
                        } else {
                            if (!((AbstractC19160uZ) r22).A04) {
                                ((AbstractC19160uZ) r22).A04 = true;
                                r22.A00();
                            }
                            r22.A08(r13);
                            C49842Sk r5 = (C49842Sk) obj;
                            if (!(r5.A00 == r9.A00 && r5.A01 == r9.A01)) {
                                r22.A07(C19590vH.A00(this.A07.A04(r9)));
                                r22.A0N = this.A07.A09(r9);
                                r22.A05();
                            }
                        }
                    }
                    if (r9.A00 == 1) {
                        C32031eE r02 = ((AbstractC19160uZ) r22).A0A;
                        r02.A0A(r22);
                        ((AbstractC19160uZ) r22).A02 = 100.0f;
                        r02.A09(r22);
                    } else if (r9.A04.size() > 1) {
                        C32031eE r03 = ((AbstractC19160uZ) r22).A0A;
                        r03.A0A(r22);
                        ((AbstractC19160uZ) r22).A02 = 50.0f;
                        r03.A09(r22);
                    } else {
                        C32031eE r04 = ((AbstractC19160uZ) r22).A0A;
                        r04.A0A(r22);
                        ((AbstractC19160uZ) r22).A02 = 1.0f;
                        r04.A09(r22);
                    }
                    r22.A0L = r9;
                    Point A042 = r10.A04(r13);
                    C02900Dx r14 = r9.A02;
                    C02900Dx r05 = this.A07.A0o;
                    if (r14 == r05 || (r05 == null && r22.A0Q && (i = A042.x) >= 0 && i <= this.A06.getWidth() && (i2 = A042.y) >= 0 && i2 <= this.A06.getHeight())) {
                        r22.A04();
                    } else {
                        r22.A03();
                    }
                    this.A09.add(r22);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C32311eg r15 = (C32311eg) it.next();
                    if (!this.A09.contains(r15) && r15.A0L != null && ((AbstractC19160uZ) r15).A04) {
                        ((AbstractC19160uZ) r15).A04 = false;
                        r15.A00();
                    }
                }
            }
        }
    }

    public final void A0W(List list, boolean z) {
        if (this.A05 == null) {
            throw null;
        } else if (list.size() != 1) {
            C19620vK r10 = new C19620vK();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C02900Dx r0 = (C02900Dx) it.next();
                double d = r0.A00;
                double d2 = r0.A01;
                if (!r10.A04) {
                    r10.A02 = d;
                    r10.A01 = d;
                    r10.A00 = d2;
                    r10.A03 = d2;
                    r10.A04 = true;
                }
                if (d > r10.A01) {
                    r10.A01 = d;
                } else if (d < r10.A02) {
                    r10.A02 = d;
                }
                double d3 = r10.A00;
                double d4 = r10.A03;
                double A002 = C19630vL.A00(d3, d4);
                double A003 = C19630vL.A00(d2, d4);
                double A004 = C19630vL.A00(d3, d2);
                if (Double.compare(A003, A002) > 0 || Double.compare(A004, A002) > 0) {
                    if (A003 <= A004) {
                        r10.A00 = d2;
                    } else {
                        r10.A03 = d2;
                    }
                }
            }
            A0Y(z, r10);
        } else if (z) {
            this.A0V = true;
            this.A05.A08(AnonymousClass0N2.A0j(new C07040Vr(((C02900Dx) list.get(0)).A00, ((C02900Dx) list.get(0)).A01), 16.0f), 1500, null);
        } else {
            this.A05.A08(AnonymousClass0N2.A0j(new C07040Vr(((C02900Dx) list.get(0)).A00, ((C02900Dx) list.get(0)).A01), 16.0f), 0, null);
        }
    }

    public final void A0X(boolean z) {
        if (this.A05 == null || this.A07.A0u || this.A09.isEmpty()) {
            return;
        }
        if (this.A06.getWidth() <= 0 || this.A06.getHeight() <= 0) {
            this.A06.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2SI(this));
        } else if (!z || !this.A0V) {
            ArrayList arrayList = new ArrayList(this.A09);
            if (this.A05 != null) {
                if (this.A07.A05() != null) {
                    LatLng A052 = this.A07.A05();
                    C07040Vr r0 = new C07040Vr(A052.A00, A052.A01);
                    Collections.sort(arrayList, new AnonymousClass2S0(r0.A00, r0.A01));
                }
                C19620vK r20 = new C19620vK();
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                int i = 0;
                boolean z2 = false;
                while (i < arrayList.size()) {
                    C32311eg r02 = (C32311eg) arrayList.get(i);
                    C07040Vr r13 = r02.A0K;
                    if (!z2) {
                        d = r13.A00;
                        d3 = r13.A01;
                        d2 = d;
                        d4 = d3;
                        z2 = true;
                    }
                    double d5 = r13.A00;
                    if (d5 > d) {
                        d = d5;
                    } else if (d5 < d2) {
                        d2 = d5;
                    }
                    double A002 = C19630vL.A00(d3, d4);
                    double d6 = r13.A01;
                    double A003 = C19630vL.A00(d6, d4);
                    double A004 = C19630vL.A00(d3, d6);
                    if (Double.compare(A003, A002) > 0 || Double.compare(A004, A002) > 0) {
                        if (A003 <= A004) {
                            d3 = r13.A01;
                        } else {
                            d4 = r13.A01;
                        }
                    }
                    C19630vL r9 = new C19630vL(new C07040Vr(d2, d4), new C07040Vr(d, d3));
                    C07040Vr r03 = r9.A01;
                    LatLng latLng = new LatLng(r03.A00, r03.A01);
                    C07040Vr r04 = r9.A00;
                    if (!AbstractView$OnCreateContextMenuListenerC56112i5.A02(new LatLngBounds(latLng, new LatLng(r04.A00, r04.A01)))) {
                        break;
                    }
                    r20.A00(r02.A0K);
                    i++;
                }
                if (i == 1) {
                    A0W(((C49842Sk) ((C32311eg) arrayList.get(0)).A0L).A04, z);
                } else {
                    A0Y(z, r20);
                }
            } else {
                throw null;
            }
        } else {
            this.A0W = true;
        }
    }

    public final void A0Y(boolean z, C19620vK r19) {
        if (this.A05 != null) {
            C19630vL r6 = new C19630vL(new C07040Vr(r19.A02, r19.A03), new C07040Vr(r19.A01, r19.A00));
            C07040Vr A012 = r6.A01();
            int width = this.A06.getWidth();
            int height = this.A06.getHeight();
            C07040Vr r0 = r6.A01;
            LatLng latLng = new LatLng(r0.A00, r0.A01);
            C07040Vr r02 = r6.A00;
            LatLngBounds latLngBounds = new LatLngBounds(latLng, new LatLng(r02.A00, r02.A01));
            LatLng latLng2 = latLngBounds.A00;
            double A002 = AbstractView$OnCreateContextMenuListenerC56112i5.A00(latLng2.A00);
            LatLng latLng3 = latLngBounds.A01;
            double A003 = (A002 - AbstractView$OnCreateContextMenuListenerC56112i5.A00(latLng3.A00)) / 3.141592653589793d;
            double d = latLng2.A01 - latLng3.A01;
            if (d < 0.0d) {
                d += 360.0d;
            }
            float min = (float) Math.min(Math.log((((double) height) / 256.0d) / A003) / 0.6931471805599453d, Math.log((((double) width) / 256.0d) / (d / 360.0d)) / 0.6931471805599453d);
            if (((float) this.A06.getHeight()) > C002301g.A0K.A00 * 64.0f * 2.0f && ((float) this.A06.getWidth()) > C002301g.A0K.A00 * 64.0f * 2.0f) {
                if (z) {
                    this.A0V = true;
                    if (min > 21.0f) {
                        this.A05.A08(AnonymousClass0N2.A0j(A012, 19.0f), 1500, this.A04);
                        return;
                    }
                    C32031eE r2 = this.A05;
                    C07030Vq r1 = new C07030Vq();
                    r1.A09 = r6;
                    r1.A07 = (int) (C002301g.A0K.A00 * 64.0f);
                    r2.A08(r1, 1500, this.A04);
                    return;
                }
                this.A05.A08(AnonymousClass0N2.A0j(A012, Math.min(19.0f, min)), 0, null);
                return;
            }
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$onCreate$2240$GroupChatLiveLocationsActivity(View view) {
        this.A07.A0B();
        C60072ok r3 = this.A06;
        int i = r3.A02;
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
        if (!this.A07.A0X(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return true;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass00S r0 = this.A0J;
        AnonymousClass02M r02 = ((ActivityC004702f) this).A0F;
        AnonymousClass01I r03 = this.A0C;
        C09200cS r04 = this.A0U;
        AnonymousClass0L2 r05 = this.A0H;
        C02770Dj r15 = this.A0Q;
        AnonymousClass0HJ r14 = this.A0D;
        AnonymousClass01A r13 = this.A0E;
        C014308b r6 = this.A0G;
        this.A07 = new C60082ol(this, r0, r02, r03, r04, r05, r15, r14, r13, r6, ((AnonymousClass2C0) this).A01, this.A0F, this.A0N, this.A0K, this.A0B, this.A0O, this.A0I, this.A0P, this.A0R);
        A09().A0A(true);
        setContentView(R.layout.groupchat_live_locations);
        AnonymousClass0AQ r2 = this.A0L;
        AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
        if (A012 != null) {
            A09().A08(C002001d.A1J(r6.A08(r2.A02(A012), false), this, super.A0M));
            this.A07.A0M(this, bundle);
            C02770Dj.A01(this);
            C19130uW r1 = new C19130uW();
            r1.A02 = 1;
            r1.A08 = true;
            r1.A04 = true;
            r1.A05 = true;
            r1.A07 = true;
            this.A06 = new C60572pk(this, this, r1);
            View findViewById = findViewById(R.id.map_holder);
            if (findViewById != null) {
                ((ViewGroup) findViewById).addView(this.A06);
                this.A06.A0E(bundle);
                View findViewById2 = findViewById(R.id.my_location);
                if (findViewById2 != null) {
                    ImageView imageView = (ImageView) findViewById2;
                    this.A03 = imageView;
                    imageView.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 38));
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
        Dialog A032 = this.A07.A03(i);
        if (A032 != null) {
            return A032;
        }
        return super.onCreateDialog(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.map_layers, menu);
        menu.removeGroup(R.id.map_setting);
        return true;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        if (this.A06 != null) {
            AbstractView$OnCreateContextMenuListenerC56112i5 r2 = this.A07;
            r2.A0d.A00();
            r2.A12.A00(r2.A11);
            r2.A1A.A00(r2.A19);
            if (this.A05 != null) {
                SharedPreferences.Editor edit = this.A0S.A01(AnonymousClass020.A02).edit();
                C07020Vp A022 = this.A05.A02();
                C07040Vr r4 = A022.A03;
                edit.putFloat("live_location_lat", (float) r4.A00);
                edit.putFloat("live_location_lng", (float) r4.A01);
                edit.putFloat("live_location_zoom", A022.A02);
                edit.apply();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004902h
    public void onLowMemory() {
        super.onLowMemory();
        this.A06.A04();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A05 == null) {
            throw null;
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        C60072ok r0 = this.A06;
        if (r0 != null) {
            SensorManager sensorManager = r0.A04;
            if (sensorManager != null) {
                sensorManager.unregisterListener(r0.A08);
            }
            this.A07.A0C();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C60072ok r0 = this.A06;
        if (r0 != null) {
            r0.A0M();
            this.A07.A0D();
            A0U();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        C32031eE r0 = this.A05;
        if (r0 != null) {
            C07020Vp A022 = r0.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C07040Vr r3 = A022.A03;
            bundle.putDouble("camera_lat", r3.A00);
            bundle.putDouble("camera_lng", r3.A01);
            bundle.putInt("map_location_mode", this.A06.A02);
        }
        this.A06.A0G(bundle);
        this.A07.A0N(bundle);
        super.onSaveInstanceState(bundle);
    }
}
