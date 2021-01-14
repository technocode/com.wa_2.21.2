package X;

import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.PlaceInfo;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Sd  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC49792Sd implements LocationListener {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Location A06;
    public Handler A07;
    public Handler A08;
    public HandlerThread A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public ImageView A0R;
    public ImageView A0S;
    public ListView A0T;
    public ProgressBar A0U;
    public ProgressBar A0V;
    public TextView A0W;
    public ActivityC004802g A0X;
    public AnonymousClass1MN A0Y;
    public PlaceInfo A0Z;
    public AnonymousClass1N1 A0a;
    public AnonymousClass0YP A0b;
    public AnonymousClass02N A0c;
    public AnonymousClass2SS A0d;
    public C49762Sa A0e;
    public RunnableC49772Sb A0f;
    public C56232iI A0g;
    public AnonymousClass2Se A0h;
    public C664334g A0i;
    public Runnable A0j;
    public Runnable A0k;
    public String A0l;
    public boolean A0m = true;
    public boolean A0n = false;
    public boolean A0o = false;
    public boolean A0p = false;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s = false;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v = true;
    public final C02780Dk A0w;
    public final AnonymousClass0C1 A0x;
    public final AnonymousClass02M A0y;
    public final AnonymousClass01I A0z;
    public final PlaceInfo A10 = new PlaceInfo();
    public final AnonymousClass1N2 A11;
    public final C04360Kb A12;
    public final AnonymousClass0HJ A13;
    public final AnonymousClass0HK A14;
    public final AnonymousClass03P A15;
    public final AnonymousClass00S A16;
    public final AnonymousClass00G A17;
    public final AnonymousClass03S A18;
    public final AnonymousClass00D A19;
    public final AnonymousClass01X A1A;
    public final AnonymousClass01K A1B;
    public final C02600Cs A1C;
    public final C02590Cr A1D;
    public final C03930Ii A1E;
    public final C53492dM A1F;
    public final AnonymousClass0M9 A1G;
    public final C002701k A1H;
    public final AnonymousClass0Eg A1I;
    public final C02660Cy A1J;
    public final AnonymousClass01S A1K;
    public final C02770Dj A1L;
    public final AnonymousClass022 A1M;
    public final C06170Sb A1N;
    public final AnonymousClass00T A1O;
    public final WhatsAppLibLoader A1P;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AbstractC49792Sd(AnonymousClass00G r3, AnonymousClass00S r4, C002701k r5, AnonymousClass0Eg r6, AnonymousClass02M r7, C06170Sb r8, AnonymousClass01I r9, AnonymousClass00T r10, C02590Cr r11, C02600Cs r12, C04360Kb r13, C03930Ii r14, C02780Dk r15, C02770Dj r16, AnonymousClass0HJ r17, AnonymousClass03P r18, AnonymousClass0M9 r19, AnonymousClass01X r20, AnonymousClass01K r21, AnonymousClass1N2 r22, WhatsAppLibLoader whatsAppLibLoader, C53492dM r24, C02660Cy r25, AnonymousClass03S r26, AnonymousClass00D r27, AnonymousClass0C1 r28, AnonymousClass01S r29, AnonymousClass022 r30, AnonymousClass0HK r31) {
        this.A17 = r3;
        this.A16 = r4;
        this.A1H = r5;
        this.A1I = r6;
        this.A0y = r7;
        this.A1N = r8;
        this.A0z = r9;
        this.A1O = r10;
        this.A1D = r11;
        this.A1C = r12;
        this.A12 = r13;
        this.A1E = r14;
        this.A0w = r15;
        this.A1L = r16;
        this.A13 = r17;
        this.A15 = r18;
        this.A1A = r20;
        this.A1G = r19;
        this.A1B = r21;
        this.A11 = r22;
        this.A1P = whatsAppLibLoader;
        this.A1F = r24;
        this.A1J = r25;
        this.A18 = r26;
        this.A19 = r27;
        this.A0x = r28;
        this.A1K = r29;
        this.A1M = r30;
        this.A14 = r31;
    }

    public int A00() {
        if (!(this instanceof C56152iA)) {
            C56122i7 r0 = (C56122i7) this;
            Location A022 = r0.A02();
            C32031eE r02 = r0.A01.A03;
            if (r02 == null || A022 == null) {
                return 0;
            }
            C19690vR A062 = r02.A0R.A06();
            Location location = new Location("");
            C07040Vr r7 = A062.A02;
            double d = r7.A00;
            C07040Vr r6 = A062.A03;
            location.setLatitude((d + r6.A00) / 2.0d);
            location.setLongitude((r7.A01 + r6.A01) / 2.0d);
            return (int) A022.distanceTo(location);
        }
        AnonymousClass2SG r4 = ((C56152iA) this).A01.A06;
        if (r4 == null) {
            return 0;
        }
        LatLng latLng = r4.A00.A02().A03;
        Location location2 = new Location("");
        location2.setLatitude(latLng.A00);
        location2.setLongitude(latLng.A01);
        C36021lS A012 = r4.A00.A00().A01();
        Location location3 = new Location("");
        LatLng latLng2 = A012.A02;
        double d2 = latLng2.A00;
        LatLng latLng3 = A012.A03;
        location3.setLatitude((d2 + latLng3.A00) / 2.0d);
        location3.setLongitude((latLng2.A01 + latLng3.A01) / 2.0d);
        location2.distanceTo(location3);
        return 0;
    }

    public Dialog A01(int i) {
        if (i == 2) {
            AnonymousClass2S9 r4 = new AnonymousClass2S9(this);
            AnonymousClass0MB r3 = new AnonymousClass0MB(this.A0X);
            AnonymousClass01X r2 = this.A1A;
            String A062 = r2.A06(R.string.gps_required_title);
            AnonymousClass0MC r1 = r3.A01;
            r1.A0I = A062;
            r1.A0E = r2.A06(R.string.gps_required_body);
            r1.A0J = true;
            r3.A07(r2.A06(R.string.ok), r4);
            return r3.A00();
        } else if (i == 3) {
            return A03(3);
        } else {
            if (i != 4) {
                return null;
            }
            return A03(4);
        }
    }

    public Location A02() {
        if (!(this instanceof C56152iA)) {
            C32031eE r0 = ((C56122i7) this).A01.A03;
            if (r0 == null) {
                return null;
            }
            C07040Vr r3 = r0.A02().A03;
            Location location = new Location("");
            location.setLatitude(r3.A00);
            location.setLongitude(r3.A01);
            return location;
        }
        AnonymousClass2SG r02 = ((C56152iA) this).A01.A06;
        if (r02 == null) {
            return null;
        }
        LatLng latLng = r02.A00.A02().A03;
        Location location2 = new Location("");
        location2.setLatitude(latLng.A00);
        location2.setLongitude(latLng.A01);
        return location2;
    }

    public final AnonymousClass0MD A03(int i) {
        AnonymousClass01X r9;
        String A062;
        int i2;
        String A0D2;
        Uri A032;
        View inflate = this.A0X.getLayoutInflater().inflate(R.layout.location_new_user_dialog, (ViewGroup) null, false);
        ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(inflate, R.id.header_logo);
        if (i == 3) {
            r9 = this.A1A;
            A062 = r9.A06(R.string.share_live_location);
        } else if (i == 4) {
            r9 = this.A1A;
            A062 = r9.A06(R.string.send_this_location);
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown new user dialog type: ", i));
        }
        imageView.setContentDescription(A062);
        if (i == 3) {
            i2 = R.drawable.nux_live_location;
        } else if (i == 4) {
            i2 = R.drawable.nux_location;
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown new user dialog type: ", i));
        }
        imageView.setImageResource(i2);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) inflate.findViewById(R.id.location_new_user_description);
        Application application = this.A17.A00;
        AnonymousClass02M r7 = this.A0y;
        C02780Dk r6 = this.A0w;
        AnonymousClass03P r5 = this.A15;
        if (i == 3) {
            boolean A0E2 = this.A1H.A0E(332);
            int i3 = R.string.live_location_first_use_dialog_description;
            if (A0E2) {
                i3 = R.string.live_location_new_user_dialog_description;
            }
            A0D2 = r9.A0D(i3, "learn-more");
        } else if (i == 4) {
            A0D2 = r9.A0D(R.string.nearby_location_new_user_dialog_description, "learn-more");
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown new user dialog type: ", i));
        }
        C002701k r3 = this.A1H;
        if (r3.A0E(332)) {
            AnonymousClass0M9 r2 = this.A1G;
            Uri.Builder A002 = AnonymousClass0M9.A00();
            A002.appendPath("android");
            A002.appendPath("chats");
            A002.appendPath("how-to-use-location-features");
            r2.A04(A002);
            A032 = A002.build();
        } else {
            A032 = this.A1G.A03("general", "26000049", null);
        }
        C002001d.A2Q(application, r7, r6, r5, textEmojiLabel, A0D2, A032);
        AnonymousClass0MB r22 = new AnonymousClass0MB(this.A0X);
        AnonymousClass0MC r52 = r22.A01;
        r52.A0C = inflate;
        r52.A01 = 0;
        r52.A0J = true;
        r22.A05(r9.A06(R.string.cancel), new AnonymousClass2S6(this, i));
        r52.A02 = new AnonymousClass2S8(this);
        boolean A0E3 = r3.A0E(332);
        int i4 = R.string.btn_continue;
        if (A0E3) {
            i4 = R.string.agree;
        }
        r22.A07(r9.A06(i4), new AnonymousClass2S7(this, i));
        return r22.A00();
    }

    public void A04() {
        if (!(this instanceof C56152iA)) {
            LocationPicker locationPicker = ((C56122i7) this).A01;
            C32031eE r1 = locationPicker.A03;
            if (r1 != null) {
                locationPicker.A07 = null;
                r1.A05();
                return;
            }
            return;
        }
        LocationPicker2 locationPicker2 = ((C56152iA) this).A01;
        AnonymousClass1B5 r12 = locationPicker2.A01;
        if (r12 != null) {
            locationPicker2.A05 = null;
            try {
                r12.A01.clear();
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        }
    }

    public void A05() {
        AnonymousClass1N1 r0;
        AnonymousClass1N1 r02;
        if (!(this instanceof C56152iA)) {
            C56122i7 r1 = (C56122i7) this;
            LocationPicker locationPicker = r1.A01;
            if (locationPicker.A03 != null) {
                if (!r1.A0t && locationPicker.A07 == null) {
                    r1.A04();
                }
                if (!(r1.A0t || (r02 = r1.A0a) == null)) {
                    for (PlaceInfo placeInfo : r02.places) {
                        C19640vM r4 = new C19640vM();
                        r4.A02 = new C07040Vr(placeInfo.lat, placeInfo.lon);
                        if (!TextUtils.isEmpty(placeInfo.name)) {
                            r4.A04 = placeInfo.name;
                        }
                        if (!TextUtils.isEmpty(placeInfo.vicinity)) {
                            r4.A03 = placeInfo.vicinity;
                        }
                        r4.A01 = locationPicker.A05;
                        float[] fArr = r4.A06;
                        fArr[0] = 0.5f;
                        fArr[1] = 0.5f;
                        C32031eE r12 = locationPicker.A03;
                        C32311eg r03 = new C32311eg(r12, r4);
                        r12.A09(r03);
                        r03.A0I = r12;
                        r03.A0L = placeInfo;
                        placeInfo.A01 = r03;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C56152iA r13 = (C56152iA) this;
        LocationPicker2 locationPicker2 = r13.A01;
        if (locationPicker2.A01 != null) {
            if (!r13.A0t && locationPicker2.A05 == null) {
                r13.A04();
            }
            if (!(r13.A0t || (r0 = r13.A0a) == null)) {
                for (PlaceInfo placeInfo2 : r0.places) {
                    C36011lR r2 = new C36011lR();
                    r2.A08 = new LatLng(placeInfo2.lat, placeInfo2.lon);
                    if (!TextUtils.isEmpty(placeInfo2.name)) {
                        r2.A09 = placeInfo2.name;
                    }
                    if (!TextUtils.isEmpty(placeInfo2.vicinity)) {
                        r2.A0A = placeInfo2.vicinity;
                    }
                    r2.A07 = locationPicker2.A03;
                    r2.A02 = 0.5f;
                    r2.A03 = 0.5f;
                    AnonymousClass1BR A032 = locationPicker2.A01.A03(r2);
                    if (A032 != null) {
                        try {
                            A032.A00.ASH(new BinderC04800Lv(placeInfo2));
                            placeInfo2.A01 = A032;
                        } catch (RemoteException e) {
                            throw new AnonymousClass06B(e);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public void A06() {
        Handler handler = this.A08;
        if (handler != null) {
            handler.removeCallbacks(this.A0k);
        }
        C56232iI r0 = this.A0g;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A0g = null;
        }
        this.A0i.A01.A01(false);
        AnonymousClass1MN r2 = this.A0Y;
        r2.A01.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A02);
        r2.A05.A06();
        this.A09.quit();
    }

    public void A07() {
        if (this.A0p || this.A0t) {
            A0R(false);
        }
        this.A0x.A05(3, 5000, 1000, this, "location-picker-onresume");
        A0S(false, null);
        System.currentTimeMillis();
    }

    public final void A08() {
        this.A0t = false;
        if (this.A0p) {
            this.A0X.finish();
            return;
        }
        View currentFocus = this.A0X.getCurrentFocus();
        if (currentFocus != null) {
            this.A1N.A02(currentFocus);
        }
        if (this.A0A != null) {
            this.A0J.clearAnimation();
            if (this.A0J.getVisibility() == 0) {
                A0T(false, null);
                AnonymousClass2SU r2 = new AnonymousClass2SU(this);
                r2.setDuration(350);
                r2.setAnimationListener(new C56192iE(this));
                r2.setInterpolator(new AccelerateInterpolator());
                this.A0J.startAnimation(r2);
            } else {
                this.A0J.setVisibility(8);
                A0G(0);
            }
            if (this.A0d != null) {
                this.A0A.clearAnimation();
                if (this.A0A.getVisibility() != 0) {
                    this.A0A.setVisibility(0);
                    A0T(false, null);
                    AnonymousClass2SS r4 = this.A0d;
                    C56212iG r1 = new C56212iG(this);
                    if (r4 != null) {
                        AnonymousClass2SP r22 = new AnonymousClass2SP(r4);
                        r22.setAnimationListener(new C56172iC(r4, r1));
                        r22.setDuration(400);
                        r22.setInterpolator(new AccelerateInterpolator());
                        r4.A01.startAnimation(r22);
                        return;
                    }
                    throw null;
                }
                this.A0A.setVisibility(0);
                if (this.A0A.getHeight() == 0) {
                    this.A0A.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2SY(this));
                    return;
                }
                AnonymousClass2SS r23 = this.A0d;
                r23.A02.A00((float) this.A0A.getHeight());
                A0J(A02(), A00(), null, false);
                A0S(true, null);
                return;
            }
            return;
        }
        A0T(false, null);
        A0J(A02(), A00(), null, false);
        A0S(true, null);
    }

    public final void A09() {
        int indexOf;
        PlaceInfo placeInfo = this.A0Z;
        if (placeInfo != null && (indexOf = this.A0a.places.indexOf(placeInfo)) >= 0) {
            A0D();
            ListView listView = this.A0T;
            listView.smoothScrollToPosition(listView.getHeaderViewsCount() + indexOf);
        }
    }

    public final void A0A() {
        if (!this.A1H.A0E(332) || !this.A19.A00.getBoolean("nearby_location_new_user", true)) {
            if (this.A0u) {
                Intent intent = new Intent();
                intent.putExtra("locations_string", this.A0l);
                PlaceInfo placeInfo = this.A10;
                intent.putExtra("longitude", placeInfo.lon);
                intent.putExtra("latitude", placeInfo.lat);
                this.A0X.setResult(-1, intent);
            } else {
                Location location = this.A06;
                AbstractC007503q r11 = null;
                if (location != null && location.getAccuracy() > 200.0f) {
                    location = null;
                }
                long longExtra = this.A0X.getIntent().getLongExtra("quoted_message_row_id", 0);
                AnonymousClass02U A032 = AnonymousClass02U.A03(this.A0X.getIntent().getStringExtra("quoted_group_jid"));
                if (longExtra > 0) {
                    r11 = this.A1B.A0J.A01(longExtra);
                } else if (A032 != null) {
                    r11 = AnonymousClass0AL.A00(A032, this.A16.A05());
                }
                AnonymousClass02N r13 = this.A0c;
                if (r13 != null) {
                    C04360Kb r10 = this.A12;
                    boolean booleanExtra = this.A0X.getIntent().getBooleanExtra("has_number_from_url", false);
                    AnonymousClass0AL r12 = r10.A12;
                    AnonymousClass00S r15 = r10.A0L;
                    long A052 = r15.A05();
                    AnonymousClass0A6 r2 = r12.A07;
                    C05470Or r8 = new C05470Or(AnonymousClass0FI.A07(r2.A01, r2.A00, r13, true), A052, location);
                    r12.A05(r8, r11);
                    if (booleanExtra) {
                        r8.A0O(4);
                    }
                    r10.A0K(r8);
                    AnonymousClass01K r132 = r10.A0W;
                    r132.A0H.A01(new RunnableEBaseShape0S0201000_I0(r132, 2, r8, 10), 26);
                    C10240eJ r14 = new C10240eJ(r15, r10.A01, r132, r10.A0d, r10.A0e, r10.A0m, r10.A0N, r10.A03, r10.A0n, r10.A0Z, r8);
                    r14.A01 = 15;
                    r10.A1A.ANC(r14, new Void[0]);
                }
                this.A0X.setResult(-1);
            }
            this.A0X.finish();
            return;
        }
        this.A0j = new RunnableEBaseShape10S0100000_I1_5(this, 36);
        C002001d.A2O(this.A0X, 4);
    }

    public final void A0B() {
        String str;
        AnonymousClass1N1 r2 = this.A0a;
        if (r2 == null || r2.places.isEmpty()) {
            str = null;
        } else if (r2.source == 3) {
            str = this.A1A.A0D(R.string.location_data_provided_by_fousquare, "<a href='https://foursquare.com/'>foursquare</a>");
        } else {
            str = r2.htmlAttributions;
        }
        this.A0M.setVisibility(8);
        if (str == null || this.A0o) {
            this.A0W.setVisibility(8);
            return;
        }
        this.A0W.setText(Html.fromHtml(str));
        this.A0W.setVisibility(0);
    }

    public final void A0C() {
        TextView textView;
        if (!this.A0n) {
            textView = (TextView) this.A0X.findViewById(R.id.location_accuracy);
        } else if (!this.A0o) {
            textView = (TextView) this.A0G.findViewById(R.id.location_description);
        } else {
            return;
        }
        if (textView == null) {
            return;
        }
        if (this.A0u && !TextUtils.isEmpty(this.A0l)) {
            textView.setVisibility(0);
            textView.setText(this.A0l);
        } else if (this.A0u || this.A01 <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            AnonymousClass01X r6 = this.A1A;
            int i = this.A01;
            textView.setText(r6.A0A(R.plurals.location_accuracy, (long) i, Integer.valueOf(i)));
        }
    }

    public final void A0D() {
        ArrayList arrayList;
        AnonymousClass2Se r1 = this.A0h;
        AnonymousClass1N1 r0 = this.A0a;
        if (r0 != null) {
            arrayList = r0.places;
        } else {
            arrayList = null;
        }
        r1.A01 = arrayList;
        r1.A00 = this.A0Z;
        r1.notifyDataSetChanged();
    }

    public void A0E(double d, double d2) {
        PlaceInfo placeInfo = this.A10;
        placeInfo.lat = d;
        placeInfo.lon = d2;
        placeInfo.name = null;
        placeInfo.address = null;
        if ((this.A0o && !this.A0s) || (this.A0u && TextUtils.isEmpty(this.A0l))) {
            if (this.A0Z == null && this.A0n) {
                this.A0B.setVisibility(0);
            }
            this.A07.removeCallbacks(this.A0f);
            RunnableC49772Sb r1 = new RunnableC49772Sb(this, d, d2);
            this.A0f = r1;
            this.A07.post(r1);
        }
    }

    public void A0F(int i) {
        if (!(this instanceof C56152iA)) {
            C32031eE r1 = ((C56122i7) this).A01.A03;
            if (r1 != null) {
                r1.A07(0, 0, i);
                return;
            }
            return;
        }
        AnonymousClass1B5 r12 = ((C56152iA) this).A01.A01;
        if (r12 != null) {
            r12.A07(0, 0, i);
        }
    }

    public final void A0G(int i) {
        this.A02 = i;
        int max = Math.max(this.A00, i);
        this.A0K.setPadding(0, 0, 0, max);
        this.A0K.requestLayout();
        A0F(max);
    }

    public final void A0H(int i, boolean z, Float f) {
        this.A0A.clearAnimation();
        A0K(A02(), i, z, f);
        AnonymousClass2SS r3 = this.A0d;
        if (r3 == null) {
            return;
        }
        if (z) {
            AnonymousClass2SR r2 = new AnonymousClass2SR(r3, r3.A01, i);
            r2.setDuration((long) ((int) (((float) i) / r3.A00.getDisplayMetrics().density)));
            r3.A01.startAnimation(r2);
            return;
        }
        r3.A01.getLayoutParams().height = i;
        r3.A01.requestLayout();
        r3.A02.A00((float) i);
    }

    public void A0I(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            A0J(A02(), Math.max(A00(), 50000), intent.getStringExtra("query"), true);
        }
    }

    public final void A0J(Location location, int i, String str, boolean z) {
        this.A08.removeCallbacks(this.A0k);
        if (this.A0o) {
            this.A0V.setVisibility(0);
        } else {
            this.A0U.setVisibility(0);
        }
        this.A0Z = null;
        A04();
        this.A0X.findViewById(R.id.places_empty).setVisibility(8);
        this.A0W.setVisibility(8);
        this.A0M.setVisibility(8);
        this.A0a = new AnonymousClass1N1();
        this.A0e.A01 = false;
        A0D();
        C56232iI r3 = new C56232iI(this, location, i, str, z);
        this.A0g = r3;
        this.A1O.ANC(r3, new Void[0]);
    }

    public void A0K(Location location, int i, boolean z, Float f) {
        float floatValue;
        float floatValue2;
        if (!(this instanceof C56152iA)) {
            C56122i7 r4 = (C56122i7) this;
            LocationPicker locationPicker = r4.A01;
            if (locationPicker.A03 != null && location != null) {
                C07040Vr r6 = new C07040Vr(location.getLatitude(), location.getLongitude());
                float f2 = locationPicker.A03.A02().A02;
                if (f == null) {
                    floatValue2 = 0.0f;
                } else {
                    floatValue2 = f.floatValue();
                }
                locationPicker.A03.A07(0, 0, i);
                C07030Vq A0j2 = AnonymousClass0N2.A0j(r6, f2 + floatValue2);
                C32031eE r2 = locationPicker.A03;
                if (z) {
                    r2.A08(A0j2, 400, r4.A00);
                } else {
                    r2.A08(A0j2, 0, null);
                }
            }
        } else {
            C56152iA r1 = (C56152iA) this;
            AnonymousClass2SG r7 = r1.A01.A06;
            if (r7 != null) {
                Integer valueOf = Integer.valueOf(i);
                AbstractC24471Ay r42 = r1.A00;
                if (location != null) {
                    LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                    AnonymousClass1B5 r3 = r7.A00;
                    float f3 = r3.A02().A02;
                    if (f == null) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = f.floatValue();
                    }
                    float f4 = f3 + floatValue;
                    if (valueOf != null) {
                        r3.A07(0, 0, valueOf.intValue());
                    }
                    AnonymousClass06A A0H2 = C008805h.A0H(latLng, f4);
                    if (z) {
                        r3.A0B(A0H2, r42);
                    } else {
                        r3.A09(A0H2);
                    }
                }
            }
        }
    }

    public void A0L(Bundle bundle) {
        bundle.putSerializable("places", this.A0a);
        bundle.putBoolean("show_live_location_setting", this.A0t);
        bundle.putBoolean("fullscreen", this.A0o);
        bundle.putBoolean("zoom_to_user", this.A0v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00e4, code lost:
        if (r6 != false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(X.ActivityC004802g r30, android.os.Bundle r31) {
        /*
        // Method dump skipped, instructions count: 1224
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC49792Sd.A0M(X.02g, android.os.Bundle):void");
    }

    public final void A0N(PlaceInfo placeInfo) {
        AbstractC007503q A002;
        if (!this.A1H.A0E(332) || !this.A19.A00.getBoolean("nearby_location_new_user", true)) {
            if (this.A0u) {
                Intent intent = new Intent();
                intent.putExtra("locations_string", placeInfo.name);
                PlaceInfo placeInfo2 = this.A10;
                intent.putExtra("longitude", placeInfo2.lon);
                intent.putExtra("latitude", placeInfo2.lat);
                this.A0X.setResult(-1, intent);
            } else {
                long longExtra = this.A0X.getIntent().getLongExtra("quoted_message_row_id", 0);
                AnonymousClass02U A032 = AnonymousClass02U.A03(this.A0X.getIntent().getStringExtra("quoted_group_jid"));
                if (longExtra > 0) {
                    A002 = this.A1B.A0J.A01(longExtra);
                } else {
                    A002 = A032 != null ? AnonymousClass0AL.A00(A032, this.A16.A05()) : null;
                }
                AnonymousClass02N r9 = this.A0c;
                if (r9 != null) {
                    C04360Kb r11 = this.A12;
                    boolean booleanExtra = this.A0X.getIntent().getBooleanExtra("has_number_from_url", false);
                    AnonymousClass0AL r8 = r11.A12;
                    AnonymousClass00S r14 = r11.A0L;
                    long A052 = r14.A05();
                    AnonymousClass0A6 r2 = r8.A07;
                    C05470Or r92 = new C05470Or(AnonymousClass0FI.A07(r2.A01, r2.A00, r9, true), A052, placeInfo);
                    r8.A05(r92, A002);
                    if (booleanExtra) {
                        r92.A0O(4);
                    }
                    r11.A0K(r92);
                    AnonymousClass01K r12 = r11.A0W;
                    r12.A0H.A01(new RunnableEBaseShape0S0201000_I0(r12, 2, r92, 10), 26);
                    r11.A1A.ANC(new C10240eJ(r14, r11.A01, r12, r11.A0d, r11.A0e, r11.A0m, r11.A0N, r11.A03, r11.A0n, r11.A0Z, r92), new Void[0]);
                }
                this.A0X.setResult(-1);
            }
            this.A0X.finish();
            return;
        }
        this.A0j = new RunnableEBaseShape8S0200000_I1_3(this, placeInfo, 21);
        C002001d.A2O(this.A0X, 4);
    }

    public void A0O(Object obj) {
        Iterator it = this.A0a.places.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            if (obj.equals(placeInfo.A01)) {
                this.A0Z = placeInfo;
                break;
            }
        }
        A09();
    }

    public void A0P(String str, Object obj) {
        if (str != null) {
            for (PlaceInfo placeInfo : this.A0a.places) {
                if (obj.equals(placeInfo.A01)) {
                    A0N(placeInfo);
                    return;
                }
            }
        }
    }

    public void A0Q(boolean z) {
        if (!(this instanceof C56152iA)) {
            C56122i7 r5 = (C56122i7) this;
            LocationPicker locationPicker = r5.A01;
            if (locationPicker.A03 != null) {
                if (locationPicker.A07 == null) {
                    r5.A04();
                }
                Location location = r5.A06;
                if (location != null) {
                    C07040Vr r6 = new C07040Vr(location.getLatitude(), r5.A06.getLongitude());
                    LocationPicker.A04(locationPicker, r6);
                    locationPicker.A03.A0B(false);
                    C07020Vp r0 = new C07020Vp(r6, 15.0f, Float.MIN_VALUE, 0.0f);
                    C32031eE r3 = locationPicker.A03;
                    C07030Vq A0i2 = AnonymousClass0N2.A0i(r0);
                    if (z) {
                        r3.A08(A0i2, 400, r5.A00);
                    } else {
                        r3.A08(A0i2, 0, null);
                    }
                }
            }
        } else {
            C56152iA r62 = (C56152iA) this;
            LocationPicker2 locationPicker2 = r62.A01;
            if (locationPicker2.A01 != null) {
                if (locationPicker2.A05 == null) {
                    r62.A04();
                }
                Location location2 = r62.A06;
                if (location2 != null) {
                    LatLng latLng = new LatLng(location2.getLatitude(), r62.A06.getLongitude());
                    LocationPicker2.A04(locationPicker2, latLng);
                    locationPicker2.A01.A0D(false);
                    CameraPosition cameraPosition = new CameraPosition(latLng, 15.0f, 0.0f, 0.0f);
                    AnonymousClass1B5 r2 = locationPicker2.A01;
                    AnonymousClass06A A0F2 = C008805h.A0F(cameraPosition);
                    if (z) {
                        r2.A0B(A0F2, r62.A00);
                    } else {
                        r2.A09(A0F2);
                    }
                }
            }
        }
    }

    public final void A0R(boolean z) {
        if (this.A19.A00.getBoolean("live_location_is_new_user", true)) {
            C002001d.A2O(this.A0X, 3);
            return;
        }
        LocationManager A082 = this.A15.A08();
        if (A082 != null && !A082.isProviderEnabled("gps") && !A082.isProviderEnabled("network")) {
            C002001d.A2O(this.A0X, 2);
        } else if (!this.A18.A04()) {
            this.A0t = false;
            A0S(false, null);
        } else {
            this.A0a = new AnonymousClass1N1();
            this.A0t = true;
            View view = this.A0A;
            if (view != null) {
                if (this.A0d != null) {
                    view.clearAnimation();
                    AnonymousClass2SS r5 = this.A0d;
                    if (!z || r5.A01.getVisibility() != 0) {
                        r5.A01.setVisibility(8);
                        r5.A02.A00(0.0f);
                    } else {
                        AnonymousClass2SQ r2 = new AnonymousClass2SQ(r5);
                        r2.setAnimationListener(new C56182iD(r5));
                        r2.setDuration(350);
                        r2.setInterpolator(new AccelerateInterpolator());
                        r5.A01.startAnimation(r2);
                    }
                }
                this.A0J.clearAnimation();
                if (!z || this.A0J.getVisibility() == 0) {
                    this.A0J.setVisibility(0);
                    if (this.A0J.getHeight() == 0) {
                        this.A0J.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2ST(this));
                        return;
                    }
                    A0G(this.A0J.getHeight());
                    A0Q(false);
                    A0T(false, null);
                    return;
                }
                this.A0J.setVisibility(0);
                A0T(false, null);
                AnonymousClass2SZ r22 = new AnonymousClass2SZ(this);
                r22.setDuration(400);
                r22.setAnimationListener(new C56222iH(this));
                r22.setInterpolator(new AccelerateInterpolator());
                this.A0J.startAnimation(r22);
                return;
            }
            A0Q(true);
            A0S(true, null);
        }
    }

    public void A0S(boolean z, Float f) {
        boolean A042 = this.A18.A04();
        LocationSharingService.A02(this.A17.A00, this.A1K);
        if (A042) {
            this.A0S.setVisibility(0);
            this.A0N.setVisibility(8);
            if (this.A0t) {
                this.A0F.setVisibility(8);
                this.A0P.setVisibility(8);
                this.A0H.setVisibility(8);
                if (this.A0J == null) {
                    this.A0I.setVisibility(0);
                }
            } else {
                this.A0P.setVisibility(0);
                if (this.A0n) {
                    this.A0H.setVisibility(0);
                    this.A0F.setVisibility(8);
                } else {
                    this.A0H.setVisibility(8);
                    this.A0F.setVisibility(0);
                }
                if (this.A0J == null) {
                    this.A0I.setVisibility(8);
                }
            }
            A0U(true, false, null);
            A0T(z, f);
            return;
        }
        this.A0F.setVisibility(8);
        this.A0H.setVisibility(8);
        this.A0P.setVisibility(8);
        this.A0S.setVisibility(8);
        if (this.A0J == null) {
            this.A0I.setVisibility(8);
        }
        AnonymousClass00D r1 = this.A19;
        AnonymousClass008.A0n(r1, "live_location_is_new_user", true);
        AnonymousClass008.A0n(r1, "nearby_location_new_user", true);
        A0U(false, z, f);
    }

    public final void A0T(boolean z, Float f) {
        boolean z2;
        PlaceInfo placeInfo;
        Object obj;
        PlaceInfo placeInfo2;
        Object obj2;
        PlaceInfo placeInfo3;
        Object obj3;
        int height;
        PlaceInfo placeInfo4;
        Object obj4;
        if (!(this instanceof C56152iA)) {
            z2 = false;
            if (((C56122i7) this).A01.A03 != null) {
                z2 = true;
            }
        } else {
            z2 = false;
            if (((C56152iA) this).A01.A01 != null) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.A0t) {
                if (this.A0b.A05()) {
                    this.A0b.A04(true);
                }
                this.A0o = false;
                this.A0R.setVisibility(8);
                this.A0P.setVisibility(8);
                this.A0E.setVisibility(8);
                this.A0B.setVisibility(8);
                this.A0X.invalidateOptionsMenu();
                return;
            }
            AnonymousClass03S r2 = this.A18;
            if (r2.A04()) {
                boolean z3 = !C007603r.A08();
                if (!(this instanceof C56152iA)) {
                    LocationPicker locationPicker = ((C56122i7) this).A01;
                    if (locationPicker.A03 != null && locationPicker.A0K.A04()) {
                        locationPicker.A03.A0B(z3);
                    }
                } else {
                    LocationPicker2 locationPicker2 = ((C56152iA) this).A01;
                    if (locationPicker2.A01 != null && locationPicker2.A0I.A04()) {
                        locationPicker2.A01.A0D(z3);
                    }
                }
            }
            A04();
            A05();
            this.A0R.setVisibility(0);
            if (this.A0o) {
                this.A0R.setImageResource(R.drawable.btn_map_fullscreen_off);
                ImageView imageView = this.A0R;
                AnonymousClass01X r22 = this.A1A;
                imageView.setContentDescription(r22.A06(R.string.show_places_list));
                if (this.A0n) {
                    ImageView imageView2 = (ImageView) this.A0T.findViewById(R.id.send_current_location_icon);
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.ic_current_location);
                    }
                    TextView textView = (TextView) this.A0T.findViewById(R.id.send_current_location_text);
                    if (textView != null) {
                        textView.setText(r22.A06(R.string.send_this_location));
                    }
                }
                TextView textView2 = (TextView) this.A0X.findViewById(R.id.location_picker_current_location_text);
                if (this.A0u && textView2 != null) {
                    textView2.setText(r22.A06(R.string.select_this_location));
                }
                if (!(this instanceof C56152iA)) {
                    LocationPicker locationPicker3 = ((C56122i7) this).A01;
                    if (!(locationPicker3.A03 == null || (placeInfo4 = locationPicker3.A09.A0Z) == null || (obj4 = placeInfo4.A01) == null)) {
                        C32311eg r1 = (C32311eg) obj4;
                        r1.A07(locationPicker3.A06);
                        r1.A04();
                    }
                } else {
                    LocationPicker2 locationPicker22 = ((C56152iA) this).A01;
                    if (!(locationPicker22.A01 == null || (placeInfo3 = locationPicker22.A08.A0Z) == null || (obj3 = placeInfo3.A01) == null)) {
                        AnonymousClass1BR r12 = (AnonymousClass1BR) obj3;
                        r12.A05(locationPicker22.A04);
                        r12.A03();
                    }
                }
                this.A0W.setVisibility(8);
                if (this.A0A != null) {
                    this.A0P.setVisibility(0);
                    this.A0T.setAdapter((ListAdapter) null);
                    this.A0T.setOnScrollListener(null);
                    if (this.A0n) {
                        height = this.A0H.getHeight() + this.A0T.findViewById(R.id.send_current_location_btn).getHeight() + this.A0T.findViewById(R.id.nearby_places_header).getHeight();
                    } else {
                        height = this.A0F.getHeight();
                    }
                    this.A0O.getLayoutParams().height = height;
                    A0H(height, true, f);
                } else {
                    this.A0P.setVisibility(8);
                }
                PlaceInfo placeInfo5 = this.A0Z;
                if ((placeInfo5 == null || placeInfo5.A01 == null) && (!this.A0b.A05() || !C06170Sb.A01(this.A0Q))) {
                    this.A0E.setVisibility(0);
                } else {
                    this.A0E.setVisibility(8);
                }
            } else {
                if (this.A0n) {
                    ImageView imageView3 = (ImageView) this.A0T.findViewById(R.id.send_current_location_icon);
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.btn_send_current_location);
                    }
                    TextView textView3 = (TextView) this.A0T.findViewById(R.id.send_current_location_text);
                    if (textView3 != null) {
                        textView3.setText(this.A1A.A06(R.string.send_your_current_location));
                    }
                    A0C();
                }
                TextView textView4 = (TextView) this.A0X.findViewById(R.id.location_picker_current_location_text);
                if (this.A0u && textView4 != null) {
                    textView4.setText(this.A1A.A06(R.string.select_your_current_location));
                }
                this.A0R.setImageResource(R.drawable.btn_map_fullscreen_on);
                this.A0R.setContentDescription(this.A1A.A06(R.string.hide_places_list));
                if (!(this instanceof C56152iA)) {
                    LocationPicker locationPicker4 = ((C56122i7) this).A01;
                    if (!(locationPicker4.A03 == null || (placeInfo2 = locationPicker4.A09.A0Z) == null || (obj2 = placeInfo2.A01) == null)) {
                        C32311eg r13 = (C32311eg) obj2;
                        r13.A07(locationPicker4.A06);
                        r13.A03();
                    }
                } else {
                    LocationPicker2 locationPicker23 = ((C56152iA) this).A01;
                    if (!(locationPicker23.A01 == null || (placeInfo = locationPicker23.A08.A0Z) == null || (obj = placeInfo.A01) == null)) {
                        AnonymousClass1BR r14 = (AnonymousClass1BR) obj;
                        r14.A05(locationPicker23.A04);
                        r14.A02();
                    }
                }
                if (r2.A04()) {
                    this.A0P.setVisibility(0);
                } else {
                    this.A0P.setVisibility(8);
                }
                A0B();
                if (this.A0A != null) {
                    int i = this.A04;
                    if (C06170Sb.A01(this.A0Q)) {
                        i >>= 1;
                    }
                    this.A0O.getLayoutParams().height = i;
                    if (r2.A04()) {
                        A0H(i, z, f);
                    }
                    this.A0T.setAdapter((ListAdapter) this.A0h);
                    this.A0T.setOnScrollListener(this.A0e);
                    A09();
                }
                this.A0E.setVisibility(8);
                this.A0B.setVisibility(8);
            }
            this.A0X.invalidateOptionsMenu();
        }
    }

    public final void A0U(boolean z, boolean z2, Float f) {
        View findViewById = this.A0X.findViewById(R.id.permissions_request_minimized);
        if (!z) {
            this.A0E.setVisibility(8);
            if (this.A0o) {
                this.A0R.setImageResource(R.drawable.btn_map_fullscreen_off);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                    if (findViewById.getMeasuredHeight() > 0) {
                        A0H(findViewById.getMeasuredHeight(), z2, f);
                    } else {
                        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2SV(this, findViewById, f));
                    }
                }
                this.A0N.setVisibility(8);
                return;
            }
            this.A0R.setImageResource(R.drawable.btn_map_fullscreen_on);
            this.A0N.setVisibility(0);
            if (findViewById != null) {
                findViewById.setVisibility(4);
                if (this.A03 > 0) {
                    ViewGroup.LayoutParams layoutParams = this.A0N.getLayoutParams();
                    int i = this.A03;
                    layoutParams.height = i;
                    A0H(i, z2, f);
                }
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(4);
            this.A03 = (int) (((double) this.A0L.getMeasuredHeight()) * 0.66d);
            ViewGroup.LayoutParams layoutParams2 = this.A0N.getLayoutParams();
            int i2 = this.A03;
            layoutParams2.height = i2;
            A0H(i2, z2, f);
        }
    }

    public boolean A0V() {
        if (this.A0b.A05()) {
            this.A0b.A04(true);
            return true;
        }
        this.A0Y.A06.dismiss();
        if (!this.A0t) {
            return false;
        }
        A08();
        return true;
    }

    public boolean A0W(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0X.onSearchRequested();
            return true;
        } else if (itemId == 1) {
            this.A0m = false;
            A0J(A02(), A00(), null, false);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            if (this.A0t) {
                this.A0Y.A06.dismiss();
                A08();
                return true;
            }
            this.A0X.finish();
            return true;
        }
    }

    public void onLocationChanged(Location location) {
        int i;
        if (C02770Dj.A03(location, this.A06)) {
            boolean z = true;
            if (location.hasAccuracy()) {
                i = Math.max(1, (int) location.getAccuracy());
            } else {
                i = -1;
            }
            if (i != this.A01) {
                this.A01 = i;
            }
            A0C();
            AnonymousClass1N1 r0 = this.A0a;
            if (r0 == null || r0.A00() == null || !this.A0m || location.getAccuracy() >= 200.0f || this.A0a.A00().distanceTo(location) <= 1000.0f) {
                z = false;
            } else {
                this.A0m = false;
            }
            this.A06 = location;
            if (this.A0a != null && !z) {
                return;
            }
            if ((location.getAccuracy() < 200.0f && location.getTime() + 60000 > System.currentTimeMillis()) || this.A0r) {
                AnonymousClass02M r2 = this.A0y;
                r2.A02.post(new RunnableEBaseShape1S0210000_I1(this, location, z, 6));
            }
        }
    }
}
