package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactLiveLocationThumbnail;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.DragBottomSheetIndicator;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.GroupChatLiveLocationsUi$11;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2i5  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractView$OnCreateContextMenuListenerC56112i5 implements LocationListener, AnonymousClass0DJ, View.OnCreateContextMenuListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 0.0f;
    public float A05;
    public float A06 = 0.0f;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C = 30000;
    public long A0D;
    public Activity A0E;
    public BroadcastReceiver A0F = new AnonymousClass2SL(this);
    public Bitmap A0G;
    public Bitmap A0H;
    public Drawable A0I;
    public Location A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public View A0U;
    public TextView A0V;
    public TextView A0W;
    public RecyclerView A0X;
    public RecyclerView A0Y;
    public BottomSheetBehavior A0Z;
    public BottomSheetBehavior A0a;
    public ContactLiveLocationThumbnail A0b;
    public ContactLiveLocationThumbnail A0c;
    public AnonymousClass0YX A0d;
    public AnonymousClass02N A0e;
    public UserJid A0f;
    public DragBottomSheetIndicator A0g;
    public C56092i3 A0h;
    public C56092i3 A0i;
    public AnonymousClass2SN A0j;
    public C56252iK A0k;
    public C49842Sk A0l;
    public C02900Dx A0m;
    public C02900Dx A0n;
    public C02900Dx A0o;
    public boolean A0p = false;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s = false;
    public boolean A0t = false;
    public boolean A0u = false;
    public final Handler A0v = new Handler(Looper.getMainLooper());
    public final AnonymousClass0C1 A0w;
    public final AnonymousClass02M A0x;
    public final AnonymousClass01I A0y;
    public final AnonymousClass0HJ A0z;
    public final AnonymousClass01A A10;
    public final AnonymousClass0BP A11 = new C56072i1(this);
    public final AnonymousClass08B A12;
    public final C014308b A13;
    public final AnonymousClass0L2 A14;
    public final AnonymousClass0HK A15;
    public final AnonymousClass00S A16;
    public final AnonymousClass03S A17;
    public final AnonymousClass01X A18;
    public final AnonymousClass019 A19 = new C56062i0(this);
    public final AnonymousClass0AC A1A;
    public final AnonymousClass0ED A1B = new C56032hx(this);
    public final AnonymousClass0EF A1C = new C56042hy(this);
    public final AnonymousClass01S A1D;
    public final AnonymousClass0XZ A1E;
    public final C02770Dj A1F;
    public final AnonymousClass0EU A1G;
    public final C09200cS A1H;
    public final Runnable A1I = new RunnableEBaseShape10S0100000_I1_5(this, 42);
    public final Runnable A1J = new RunnableEBaseShape10S0100000_I1_5(this, 40);
    public final Runnable A1K = new RunnableEBaseShape10S0100000_I1_5(this, 41);
    public final List A1L = new ArrayList();
    public final List A1M = new ArrayList();
    public final List A1N = new ArrayList();
    public final Map A1O = new HashMap();
    public final Set A1P = new LinkedHashSet();
    public volatile boolean A1Q;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AbstractView$OnCreateContextMenuListenerC56112i5(AnonymousClass00S r3, AnonymousClass02M r4, AnonymousClass01I r5, C09200cS r6, AnonymousClass0L2 r7, C02770Dj r8, AnonymousClass0HJ r9, AnonymousClass01A r10, C014308b r11, AnonymousClass01X r12, AnonymousClass08B r13, AnonymousClass0AC r14, AnonymousClass03S r15, AnonymousClass0C1 r16, AnonymousClass01S r17, AnonymousClass0HK r18, AnonymousClass0XZ r19, AnonymousClass0EU r20) {
        if (r3 != null) {
            this.A16 = r3;
            if (r4 != null) {
                this.A0x = r4;
                if (r5 != null) {
                    this.A0y = r5;
                    if (r6 != null) {
                        this.A1H = r6;
                        if (r7 != null) {
                            this.A14 = r7;
                            if (r8 != null) {
                                this.A1F = r8;
                                if (r9 != null) {
                                    this.A0z = r9;
                                    if (r10 != null) {
                                        this.A10 = r10;
                                        if (r11 != null) {
                                            this.A13 = r11;
                                            if (r12 != null) {
                                                this.A18 = r12;
                                                if (r13 != null) {
                                                    this.A12 = r13;
                                                    if (r14 != null) {
                                                        this.A1A = r14;
                                                        if (r16 != null) {
                                                            this.A0w = r16;
                                                            if (r15 != null) {
                                                                this.A17 = r15;
                                                                if (r17 != null) {
                                                                    this.A1D = r17;
                                                                    this.A0r = r15.A04();
                                                                    if (r18 != null) {
                                                                        this.A15 = r18;
                                                                        if (r19 != null) {
                                                                            this.A1E = r19;
                                                                            if (r20 != null) {
                                                                                this.A1G = r20;
                                                                                return;
                                                                            }
                                                                            throw null;
                                                                        }
                                                                        throw null;
                                                                    }
                                                                    throw null;
                                                                }
                                                                throw null;
                                                            }
                                                            throw null;
                                                        }
                                                        throw null;
                                                    }
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return Math.max(Math.min(Math.log((sin + 1.0d) / (1.0d - sin)) / 2.0d, 3.141592653589793d), -3.141592653589793d) / 2.0d;
    }

    public static final String A01(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C02900Dx) it.next()).A06.getRawString());
        }
        Collections.sort(arrayList);
        return TextUtils.join("|", arrayList);
    }

    public static boolean A02(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.A01;
        double d = latLng.A00;
        LatLng latLng2 = latLngBounds.A00;
        if (d - latLng2.A00 > 80.0d) {
            return false;
        }
        double d2 = latLng2.A01 - latLng.A01;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        if (d2 <= 90.0d) {
            return true;
        }
        return false;
    }

    public Dialog A03(int i) {
        if (i == 0) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(this.A0E);
            AnonymousClass01X r2 = this.A18;
            String A062 = r2.A06(R.string.live_location_stop_sharing_dialog);
            AnonymousClass0MC r0 = r3.A01;
            r0.A0E = A062;
            r0.A0J = true;
            r3.A05(r2.A06(R.string.cancel), null);
            r3.A07(r2.A06(R.string.live_location_stop), new AnonymousClass2S2(this));
            AnonymousClass0MD A002 = r3.A00();
            A002.requestWindowFeature(1);
            return A002;
        } else if (i != 2) {
            return null;
        } else {
            AnonymousClass2S3 r5 = new AnonymousClass2S3(this);
            AnonymousClass0MB r32 = new AnonymousClass0MB(this.A0E);
            AnonymousClass01X r22 = this.A18;
            String A063 = r22.A06(R.string.gps_required_title);
            AnonymousClass0MC r1 = r32.A01;
            r1.A0I = A063;
            r1.A0E = r22.A06(R.string.gps_required_body);
            r1.A0J = true;
            r32.A07(r22.A06(R.string.ok), r5);
            return r32.A00();
        }
    }

    public Bitmap A04(C49842Sk r24) {
        ContactLiveLocationThumbnail contactLiveLocationThumbnail;
        View view;
        List list;
        boolean z;
        Bitmap A002;
        ArrayList arrayList = new ArrayList();
        int i = r24.A00;
        if (i == 1) {
            contactLiveLocationThumbnail = this.A0c;
            view = this.A0Q;
            list = r24.A04;
            if (list.size() == 1) {
                C007003k A0A2 = this.A10.A0A(((C02900Dx) list.get(0)).A06);
                Bitmap A022 = this.A15.A02(A0A2, this.A0E.getResources().getDimensionPixelSize(R.dimen.live_location_selected_avatar_size), this.A0E.getResources().getDimension(R.dimen.live_location_selected_avatar_radius), true);
                if (A022 == null) {
                    AnonymousClass0HJ r0 = this.A0z;
                    A022 = r0.A00.A00(this.A0E, r0.A03(A0A2));
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(A022);
            } else {
                for (int i2 = 0; i2 < Math.min(list.size(), 4); i2++) {
                    Bitmap A023 = this.A15.A02(this.A10.A0A(((C02900Dx) list.get(i2)).A06), this.A0E.getResources().getDimensionPixelSize(R.dimen.live_location_selected_avatar_size), 0.0f, true);
                    if (A023 == null) {
                        A023 = this.A0H;
                    }
                    arrayList.add(A023);
                }
                z = false;
            }
            contactLiveLocationThumbnail.setAlpha(1.0f);
        } else {
            contactLiveLocationThumbnail = this.A0b;
            view = this.A0K;
            list = r24.A04;
            if (list.size() == 1) {
                C007003k A0A3 = this.A10.A0A(((C02900Dx) list.get(0)).A06);
                Bitmap A024 = this.A15.A02(A0A3, this.A0E.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), this.A0E.getResources().getDimension(R.dimen.small_avatar_radius), true);
                if (A024 == null) {
                    AnonymousClass0HJ r02 = this.A0z;
                    A024 = r02.A00.A00(this.A0E, r02.A03(A0A3));
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(A024);
            } else {
                for (int i3 = 0; i3 < Math.min(list.size(), 4); i3++) {
                    Bitmap A025 = this.A15.A02(this.A10.A0A(((C02900Dx) list.get(i3)).A06), this.A0E.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), 0.0f, true);
                    if (A025 == null) {
                        A025 = this.A0G;
                    }
                    arrayList.add(A025);
                }
                z = false;
            }
            if (i == 2) {
                contactLiveLocationThumbnail.setAlpha(0.3f);
            } else {
                contactLiveLocationThumbnail.setAlpha(1.0f);
            }
        }
        if (arrayList.size() == 1) {
            A002 = (Bitmap) arrayList.get(0);
        } else {
            A002 = AnonymousClass0L2.A00(arrayList, 0.0f);
        }
        contactLiveLocationThumbnail.setImageBitmap(A002);
        int i4 = r24.A01;
        if (i4 == 0) {
            contactLiveLocationThumbnail.A01 = C004302a.A00(this.A0E, R.color.live_location_live_location_marker_glow);
        } else if (i4 == 1) {
            contactLiveLocationThumbnail.A01 = C004302a.A00(this.A0E, R.color.live_location_stale_location_marker);
        } else if (i4 == 2) {
            contactLiveLocationThumbnail.A01 = 0;
        }
        contactLiveLocationThumbnail.A03 = z;
        contactLiveLocationThumbnail.A02 = list.size();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public LatLng A05() {
        if (this.A0f != null) {
            for (C02900Dx r5 : this.A1L) {
                if (r5 != null && r5.A05 > 0 && r5.A06.equals(this.A0f)) {
                    return new LatLng(r5.A00, r5.A01);
                }
            }
        }
        Location A032 = this.A0w.A03("group-chat-live-location-ui");
        if (A032 != null) {
            return new LatLng(A032.getLatitude(), A032.getLongitude());
        }
        return null;
    }

    public C49842Sk A06(LatLng latLng) {
        C49852Sl A082 = A08();
        if (A082 == null) {
            return null;
        }
        Point A002 = A082.A00(latLng);
        Point point = new Point(A002.x - (this.A0B >> 1), A002.y - (this.A0A >> 1));
        Point point2 = new Point((this.A0B >> 1) + A002.x, (this.A0A >> 1) + A002.y);
        AnonymousClass1BQ r1 = new AnonymousClass1BQ();
        r1.A01(A082.A01(point));
        r1.A01(A082.A01(point2));
        LatLngBounds A003 = r1.A00();
        for (C49842Sk r12 : this.A1M) {
            if (A003.A00(r12.A00())) {
                return r12;
            }
        }
        return null;
    }

    public C49842Sk A07(C02900Dx r6) {
        if (r6 == null) {
            return null;
        }
        for (C49842Sk r3 : this.A1M) {
            List list = r3.A04;
            if (list.size() > 1 && list.contains(r6)) {
                return r3;
            }
        }
        return null;
    }

    public C49852Sl A08() {
        if (!(this instanceof C60092om)) {
            C32031eE r0 = ((C60082ol) this).A00.A05;
            if (r0 != null) {
                return new C49852Sl(r0.A0R);
            }
            return null;
        }
        AnonymousClass1B5 r02 = ((C60092om) this).A00.A06;
        if (r02 != null) {
            return new C49852Sl(r02.A00());
        }
        return null;
    }

    public String A09(C49842Sk r9) {
        List<C02900Dx> list = r9.A04;
        if (list.size() == 1 && this.A0y.A09(((C02900Dx) list.get(0)).A06)) {
            return this.A18.A06(R.string.your_live_location_marker_content_description);
        }
        ArrayList arrayList = new ArrayList();
        for (C02900Dx r0 : list) {
            arrayList.add(r0.A06);
        }
        AnonymousClass01X r5 = this.A18;
        return r5.A0A(R.plurals.live_location_marker_content_description, (long) arrayList.size(), r5.A0E(this.A13.A0B(arrayList)));
    }

    public void A0A() {
        if (!(this instanceof C60092om)) {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = ((C60082ol) this).A00;
            if (!(!((ActivityC004702f) groupChatLiveLocationsActivity).A0B) && groupChatLiveLocationsActivity.A05 != null) {
                if (groupChatLiveLocationsActivity.A07.A0o != null && !groupChatLiveLocationsActivity.A0V) {
                    groupChatLiveLocationsActivity.A0V = true;
                    C02900Dx r6 = groupChatLiveLocationsActivity.A07.A0o;
                    C07040Vr r5 = new C07040Vr(r6.A00, r6.A01);
                    float A042 = GroupChatLiveLocationsActivity.A04(groupChatLiveLocationsActivity, r6.A02, -1.0f);
                    if (A042 > groupChatLiveLocationsActivity.A05.A02().A02 || A042 == -1.0f) {
                        C32031eE r2 = groupChatLiveLocationsActivity.A05;
                        C07030Vq r1 = new C07030Vq();
                        r1.A08 = r5;
                        r2.A08(r1, 1500, groupChatLiveLocationsActivity.A04);
                        return;
                    }
                    groupChatLiveLocationsActivity.A05.A08(AnonymousClass0N2.A0j(r5, A042), 1500, groupChatLiveLocationsActivity.A04);
                } else if (!groupChatLiveLocationsActivity.A07.A0u) {
                    groupChatLiveLocationsActivity.A0X(true);
                }
            }
        } else {
            C60092om r3 = (C60092om) this;
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = r3.A00;
            if (!(!((ActivityC004702f) groupChatLiveLocationsActivity2).A0B) && groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0W) {
                AbstractView$OnCreateContextMenuListenerC56112i5 r12 = groupChatLiveLocationsActivity2.A08;
                if (r12.A0o == null || r3.A0t) {
                    C49842Sk r0 = r12.A0l;
                    if (r0 != null) {
                        LatLng A002 = r0.A00();
                        if (!groupChatLiveLocationsActivity2.A06.A00().A01().A04.A00(A002)) {
                            AbstractView$OnCreateContextMenuListenerC56112i5 r13 = groupChatLiveLocationsActivity2.A08;
                            if (!r13.A0t) {
                                groupChatLiveLocationsActivity2.A0W = true;
                                groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0G(A002), groupChatLiveLocationsActivity2.A05);
                            } else if (groupChatLiveLocationsActivity2.A0Z(r13.A0l.A00())) {
                                groupChatLiveLocationsActivity2.A08.A0B();
                            }
                        }
                    } else if (!r12.A0u) {
                        groupChatLiveLocationsActivity2.A0X(true);
                    }
                } else {
                    groupChatLiveLocationsActivity2.A0W = true;
                    C02900Dx r22 = groupChatLiveLocationsActivity2.A08.A0o;
                    LatLng latLng = new LatLng(r22.A00, r22.A01);
                    float A043 = GroupChatLiveLocationsActivity2.A04(groupChatLiveLocationsActivity2, r22.A02, -1.0f);
                    if (A043 > groupChatLiveLocationsActivity2.A06.A02().A02 || A043 == -1.0f) {
                        groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0G(latLng), groupChatLiveLocationsActivity2.A05);
                    } else {
                        groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0H(latLng, A043), groupChatLiveLocationsActivity2.A05);
                    }
                }
            }
        }
    }

    public void A0B() {
        this.A0o = null;
        this.A0j = null;
        A0O(null);
        A0G();
        ((AbstractC16300pa) this.A0h).A01.A00();
    }

    public void A0C() {
        this.A1G.A01(this);
        this.A0D = 0;
        Handler handler = this.A0v;
        handler.removeCallbacks(this.A1I);
        AnonymousClass0XZ r1 = this.A1E;
        AnonymousClass02N r4 = this.A0e;
        synchronized (r1.A06) {
            r1.A07.remove(r4);
            if (!r1.A08.contains(r4)) {
                r1.A04.A0K(new RunnableC448121t(r4, null));
            }
        }
        handler.removeCallbacks(this.A1K);
        handler.removeCallbacks(this.A1J);
        this.A0w.A06(this);
        this.A0J = null;
        this.A0E.unregisterReceiver(this.A0F);
        AnonymousClass01S r2 = this.A1D;
        r2.A0X.remove(this.A1C);
        r2.A0W.remove(this.A1B);
    }

    public void A0D() {
        AnonymousClass0C1 r7 = this.A0w;
        this.A0q = r7.A08();
        this.A0r = this.A17.A04();
        Context applicationContext = this.A0E.getApplicationContext();
        AnonymousClass01S r5 = this.A1D;
        LocationSharingService.A02(applicationContext, r5);
        if (this.A0m == null) {
            r5.A0V(this.A1B);
            AnonymousClass0EF r2 = this.A1C;
            List list = r5.A0X;
            if (!list.contains(r2)) {
                list.add(r2);
            }
            C56082i2 r4 = new C56082i2(this, this.A0e);
            Handler handler = this.A0v;
            Runnable runnable = this.A1I;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.A0C);
            this.A1E.A01(this.A0e, r4);
        }
        A0I();
        this.A0E.invalidateOptionsMenu();
        this.A0E.registerReceiver(this.A0F, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        if (r5.A0e(this.A0e)) {
            r7.A05(3, 5000, 1000, this, "group-chat-live-location-ui-onresume");
        }
        this.A1G.A00(this);
    }

    public void A0E() {
        if (!(this instanceof C60092om)) {
            C60082ol r2 = (C60082ol) this;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = r2.A00;
            if (!(!((ActivityC004702f) groupChatLiveLocationsActivity).A0B)) {
                groupChatLiveLocationsActivity.A0V();
                r2.A0A();
                if (!groupChatLiveLocationsActivity.A07.A0u) {
                    groupChatLiveLocationsActivity.A06.setLocationMode(2);
                    return;
                }
                return;
            }
            return;
        }
        C60092om r22 = (C60092om) this;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = r22.A00;
        if (!(!((ActivityC004702f) groupChatLiveLocationsActivity2).A0B)) {
            groupChatLiveLocationsActivity2.A0V();
            r22.A0A();
            if (!groupChatLiveLocationsActivity2.A08.A0u) {
                groupChatLiveLocationsActivity2.A07.setLocationMode(2);
            }
        }
    }

    public final void A0F() {
        AnonymousClass01X r8 = this.A18;
        List list = this.A1N;
        this.A0V.setText(r8.A0A(R.plurals.live_location_marker_title, (long) list.size(), Integer.valueOf(list.size())));
        ((AbstractC16300pa) this.A0i).A01.A00();
        if (this.A0R != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.A0E.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int min = Math.min((int) (Math.min(4.5d, (double) list.size()) * ((double) this.A07)), displayMetrics.heightPixels >> 1);
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            bottomSheetBehavior.A0J = true;
            bottomSheetBehavior.A0D(5);
            if (this.A0a.A0B != 3) {
                this.A0Y.setLayoutParams(new LinearLayout.LayoutParams(-1, min));
                this.A0a.A0D(3);
            } else if (min != this.A0Y.getHeight()) {
                this.A0Y.clearAnimation();
                AnonymousClass2SM r2 = new AnonymousClass2SM(this, this.A0Y, min);
                r2.setDuration((long) ((int) (((float) min) / this.A0E.getResources().getDisplayMetrics().density)));
                A0L((float) this.A0Z.A07(), false);
                this.A0Y.startAnimation(r2);
            }
        } else if (this.A0M.getTranslationY() != 0.0f) {
            this.A0M.clearAnimation();
            View view = this.A0M;
            view.setTranslationY((float) view.getHeight());
            AnonymousClass0Q7.A0E(this.A0M).A03(0.0f);
        }
    }

    public final void A0G() {
        this.A1N.clear();
        ((AbstractC16300pa) this.A0i).A01.A00();
        A0O(null);
        if (this.A0R != null) {
            this.A0Y.clearAnimation();
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            if (bottomSheetBehavior.A0B != 4) {
                bottomSheetBehavior.A0D(4);
                A0W(true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.A0a;
            if (bottomSheetBehavior2.A0B != 5) {
                bottomSheetBehavior2.A0D(5);
            } else {
                this.A06 = 0.0f;
                A0K(Math.max(this.A04, 0.0f), true);
            }
        } else {
            this.A0M.clearAnimation();
            AnonymousClass0Q7.A0E(this.A0M).A03((float) this.A0M.getHeight());
        }
        A0E();
    }

    public final void A0H() {
        boolean z = false;
        if (this.A0T.getVisibility() != 0) {
            this.A0T.setVisibility(0);
            this.A0T.startAnimation(AnimationUtils.loadAnimation(this.A0E, R.anim.bottom_up));
        }
        if (this.A1L.size() > 2) {
            z = true;
        }
        DragBottomSheetIndicator dragBottomSheetIndicator = this.A0g;
        if (dragBottomSheetIndicator != null) {
            int i = 8;
            if (z) {
                i = 4;
            }
            dragBottomSheetIndicator.setVisibility(i);
            this.A0L.setVisibility(8);
        }
    }

    public final void A0I() {
        AnonymousClass02M r2 = this.A0x;
        r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(this, 38));
    }

    public final void A0J() {
        ArrayList arrayList;
        C007003k A092;
        if (this.A0D <= System.currentTimeMillis()) {
            this.A0W.setOnClickListener(null);
            AnonymousClass01S r1 = this.A1D;
            if (r1.A0e(this.A0e) && !this.A0r) {
                this.A0W.setText(this.A18.A06(R.string.live_location_fix_location_update));
                this.A0W.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 32));
                A0H();
            } else if (!r1.A0e(this.A0e) || this.A0q) {
                Set set = this.A1P;
                boolean z = true;
                int i = 0;
                if (!set.isEmpty()) {
                    synchronized (set) {
                        arrayList = new ArrayList(set);
                        set.clear();
                    }
                    int size = arrayList.size();
                    if (size != 1 || (A092 = this.A10.A09((AnonymousClass02N) arrayList.get(0))) == null) {
                        this.A0W.setText(this.A18.A0A(R.plurals.live_location_stopped_sharing_count, (long) size, Integer.valueOf(size)));
                    } else {
                        this.A0W.setText(this.A18.A0D(R.string.live_location_stopped_sharing_name, this.A13.A06(A092)));
                    }
                    this.A0D = System.currentTimeMillis() + 3000;
                    this.A0v.postDelayed(this.A1K, 3000);
                    A0H();
                    return;
                }
                List list = this.A1L;
                if (list.isEmpty()) {
                    this.A0W.setText(this.A18.A06(R.string.live_location_no_one_sharing));
                    A0H();
                    return;
                }
                if (this.A0T.getVisibility() == 0) {
                    this.A0T.setVisibility(0);
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.A0E, R.anim.bottom_down);
                    loadAnimation.setAnimationListener(new C55992ht(this));
                    this.A0T.startAnimation(loadAnimation);
                }
                if (list.size() <= 2) {
                    z = false;
                }
                DragBottomSheetIndicator dragBottomSheetIndicator = this.A0g;
                if (dragBottomSheetIndicator != null) {
                    int i2 = 8;
                    if (z) {
                        i2 = 0;
                    }
                    dragBottomSheetIndicator.setVisibility(i2);
                    View view = this.A0L;
                    if (!z) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            } else {
                this.A0W.setText(this.A18.A06(R.string.live_location_fix_location_update));
                this.A0W.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 33));
                A0H();
            }
        }
    }

    public void A0K(float f, boolean z) {
        if (!(this instanceof C60092om)) {
            C60082ol r3 = (C60082ol) this;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = r3.A00;
            int i = (int) f;
            groupChatLiveLocationsActivity.A01 = i;
            C32031eE r0 = groupChatLiveLocationsActivity.A05;
            if (r0 != null) {
                r0.A07(0, 0, i);
            }
            if (z) {
                r3.A0A();
                return;
            }
            return;
        }
        C60092om r32 = (C60092om) this;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = r32.A00;
        int i2 = (int) f;
        groupChatLiveLocationsActivity2.A01 = i2;
        AnonymousClass1B5 r02 = groupChatLiveLocationsActivity2.A06;
        if (r02 != null) {
            r02.A07(0, 0, i2);
        }
        if (z) {
            r32.A0A();
        }
    }

    public final void A0L(float f, boolean z) {
        this.A04 = f;
        if (this.A0g.getVisibility() != 8) {
            this.A04 -= this.A0E.getResources().getDisplayMetrics().density * 20.0f;
        }
        float f2 = this.A04;
        float max = Math.max(f2, this.A06);
        this.A0P.setTranslationY(-f2);
        A0K(max, z);
    }

    public void A0M(Activity activity, Bundle bundle) {
        this.A0E = activity;
        this.A05 = activity.getResources().getDimension(R.dimen.group_participant_row_height);
        this.A07 = activity.getResources().getDimension(R.dimen.live_location_selected_row_height);
        this.A00 = activity.getResources().getDimension(R.dimen.live_location_list_drag_indicator_height);
        this.A08 = activity.getResources().getDimension(R.dimen.tab_height);
        this.A03 = activity.getResources().getDimension(R.dimen.live_location_row_spacing);
        this.A01 = activity.getResources().getDimension(R.dimen.live_location_row_divider_inset_left);
        this.A02 = activity.getResources().getDimension(R.dimen.live_location_row_divider_inset_right);
        this.A0d = this.A14.A03(activity);
        AnonymousClass02N A012 = AnonymousClass02N.A01(activity.getIntent().getStringExtra("jid"));
        if (A012 != null) {
            this.A0e = A012;
            this.A0f = UserJid.getNullable(activity.getIntent().getStringExtra("target"));
            UserJid nullable = UserJid.getNullable(activity.getIntent().getStringExtra("final_location_jid"));
            long longExtra = activity.getIntent().getLongExtra("final_location_timestamp", 0);
            if (nullable != null && longExtra > 0) {
                C02900Dx r5 = new C02900Dx(nullable);
                this.A0m = r5;
                r5.A05 = longExtra;
                r5.A00 = activity.getIntent().getDoubleExtra("final_location_latitude", 0.0d);
                this.A0m.A01 = activity.getIntent().getDoubleExtra("final_location_longitude", 0.0d);
            }
            this.A0q = this.A0w.A08();
            A0V("group-chat-live-location-ui-oncreate");
            this.A0X = (RecyclerView) activity.findViewById(R.id.user_list);
            this.A0N = activity.findViewById(R.id.list_holder);
            this.A0g = (DragBottomSheetIndicator) activity.findViewById(R.id.drag_indicator);
            this.A0P = activity.findViewById(R.id.map_bottom);
            this.A0O = activity.findViewById(R.id.list_holder_shadow);
            View view = this.A0N;
            int i = 8;
            if (view != null) {
                view.setVisibility(8);
                this.A0O.setVisibility(8);
                this.A0g.setVisibility(8);
                this.A0Z = new GroupChatLiveLocationsUi$11(this);
                BottomSheetBehavior bottomSheetBehavior = this.A0Z;
                ((C14270lr) this.A0N.getLayoutParams()).A00(bottomSheetBehavior);
                bottomSheetBehavior.A0J = false;
                bottomSheetBehavior.A0E = new C56002hu(this);
                this.A0L = activity.findViewById(R.id.drag_indicator_click);
                ViewOnClickCListenerShape13S0100000_I1_2 viewOnClickCListenerShape13S0100000_I1_2 = new ViewOnClickCListenerShape13S0100000_I1_2(this, 29);
                this.A0g.setOnClickListener(viewOnClickCListenerShape13S0100000_I1_2);
                this.A0L.setOnClickListener(viewOnClickCListenerShape13S0100000_I1_2);
            }
            this.A0S = activity.findViewById(R.id.selected_list_title_holder);
            this.A0V = (TextView) activity.findViewById(R.id.selected_list_title);
            this.A0Y = (RecyclerView) activity.findViewById(R.id.selected_list);
            activity.findViewById(R.id.selected_cancel).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 30));
            this.A0R = activity.findViewById(R.id.selected_list_holder);
            View findViewById = activity.findViewById(R.id.landscape_selected_list_holder);
            this.A0M = findViewById;
            View view2 = this.A0R;
            if (view2 != null) {
                BottomSheetBehavior A002 = BottomSheetBehavior.A00(view2);
                this.A0a = A002;
                A002.A0E = new C56012hv(this);
                A002.A0N = true;
                A002.A0D(5);
            } else {
                findViewById.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2SK(this));
            }
            this.A0I = C004302a.A03(activity, R.drawable.live_location_list_divider);
            C56022hw r7 = new C56022hw(this);
            List<C02900Dx> list = this.A1L;
            this.A0h = new C56092i3(this, list, false);
            this.A0X.setLayoutManager(new LinearLayoutManager(1));
            this.A0X.setAdapter(this.A0h);
            RecyclerView recyclerView = this.A0X;
            recyclerView.A0i = true;
            recyclerView.setOnCreateContextMenuListener(this);
            this.A0X.A0j(r7);
            List list2 = this.A1N;
            this.A0i = new C56092i3(this, list2, true);
            this.A0Y.setLayoutManager(new LinearLayoutManager(1));
            this.A0Y.setAdapter(this.A0i);
            RecyclerView recyclerView2 = this.A0Y;
            recyclerView2.A0i = true;
            recyclerView2.A0j(r7);
            this.A0W = (TextView) activity.findViewById(R.id.status);
            this.A0T = activity.findViewById(R.id.status_panel);
            A0W(true);
            this.A1A.A01(this.A19);
            this.A12.A01(this.A11);
            View inflate = View.inflate(this.A0E, R.layout.contact_live_location_marker, null);
            this.A0K = inflate;
            this.A0b = (ContactLiveLocationThumbnail) inflate.findViewById(R.id.contact_photo);
            AnonymousClass0HJ r9 = this.A0z;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.small_avatar_size);
            if (r9 != null) {
                this.A0G = AnonymousClass0HJ.A01(activity, R.drawable.avatar_contact, dimensionPixelSize, 0.0f);
                int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(R.dimen.live_location_selected_avatar_size);
                if (r9 != null) {
                    this.A0H = AnonymousClass0HJ.A01(activity, R.drawable.avatar_contact, dimensionPixelSize2, 0.0f);
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    this.A0K.measure(makeMeasureSpec, makeMeasureSpec);
                    this.A0K.layout(0, 0, this.A0K.getMeasuredWidth(), this.A0K.getMeasuredHeight());
                    View inflate2 = View.inflate(this.A0E, R.layout.contact_live_location_selected_marker, null);
                    this.A0Q = inflate2;
                    this.A0c = (ContactLiveLocationThumbnail) inflate2.findViewById(R.id.contact_photo);
                    this.A0Q.measure(makeMeasureSpec, makeMeasureSpec);
                    this.A0B = this.A0Q.getMeasuredWidth();
                    int measuredHeight = this.A0Q.getMeasuredHeight();
                    this.A0A = measuredHeight;
                    this.A0Q.layout(0, 0, this.A0B, measuredHeight);
                    if (bundle != null) {
                        this.A0s = bundle.getBoolean("map_follow_user", false);
                        this.A0u = bundle.getBoolean("map_touched", false);
                        AnonymousClass02N A013 = AnonymousClass02N.A01(bundle.getString("selected_user_jid"));
                        if (A013 != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C02900Dx r1 = (C02900Dx) it.next();
                                if (r1.A06.equals(A013)) {
                                    this.A0o = r1;
                                    break;
                                }
                            }
                        }
                        HashSet hashSet = new HashSet();
                        AnonymousClass1VY.A0O(UserJid.class, bundle.getStringArrayList("selected_user_jids"), hashSet);
                        if (!hashSet.isEmpty()) {
                            for (C02900Dx r12 : list) {
                                if (hashSet.contains(r12.A06)) {
                                    list2.add(r12);
                                }
                            }
                            Collections.sort(list2, new AnonymousClass2SO(this.A0y, this.A10, this.A13));
                            ((AbstractC16300pa) this.A0i).A01.A00();
                            A0F();
                        }
                    }
                    View findViewById2 = activity.findViewById(R.id.zoom_out);
                    this.A0U = findViewById2;
                    findViewById2.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 31));
                    View view3 = this.A0U;
                    if (this.A0u && this.A0m == null) {
                        i = 0;
                    }
                    view3.setVisibility(i);
                    this.A0k = new C56252iK(new AnonymousClass2SO(this.A0y, this.A10, this.A13), (float) this.A0B, (float) this.A0A, this.A1F);
                    LocationSharingService.A02(activity.getApplicationContext(), this.A1D);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A0N(Bundle bundle) {
        bundle.putBoolean("map_follow_user", this.A0s);
        bundle.putBoolean("map_touched", this.A0u);
        C02900Dx r0 = this.A0o;
        if (r0 != null) {
            bundle.putString("selected_user_jid", r0.A06.getRawString());
        }
        List<C02900Dx> list = this.A1N;
        if (!list.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(list.size());
            for (C02900Dx r02 : list) {
                arrayList.add(r02.A06.getRawString());
            }
            bundle.putStringArrayList("selected_user_jids", arrayList);
        }
    }

    public final void A0O(C49842Sk r10) {
        ArrayList arrayList = new ArrayList();
        List<C49842Sk> list = this.A1M;
        synchronized (list) {
            if (r10 == null) {
                this.A0l = null;
                for (C49842Sk r0 : list) {
                    arrayList.add(new C49842Sk(r0.A04, 0, this.A1F));
                }
            } else {
                for (C49842Sk r4 : list) {
                    if (r4 == r10) {
                        arrayList.add(new C49842Sk(r4.A04, 1, this.A1F));
                        this.A0l = r4;
                    } else {
                        arrayList.add(new C49842Sk(r4.A04, 2, this.A1F));
                    }
                }
            }
            list.clear();
            list.addAll(arrayList);
            this.A0t = false;
        }
    }

    public void A0P(C49842Sk r6, boolean z) {
        A0O(r6);
        List list = r6.A04;
        if (list.size() == 1) {
            C02900Dx r1 = (C02900Dx) list.get(0);
            this.A0o = null;
            A0G();
            A0T(r1);
            this.A0o = r1;
            A0R(r1);
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0D(4);
                return;
            }
            return;
        }
        this.A0o = null;
        List list2 = this.A1N;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new AnonymousClass2SO(this.A0y, this.A10, this.A13));
        ((AbstractC16300pa) this.A0i).A01.A00();
        A0F();
        if (z) {
            A0I();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x000a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.C49852Sl r12) {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnCreateContextMenuListenerC56112i5.A0Q(X.2Sl):void");
    }

    public void A0R(C02900Dx r8) {
        if (!(this instanceof C60092om)) {
            C60082ol r1 = (C60082ol) this;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = r1.A00;
            C32031eE r0 = groupChatLiveLocationsActivity.A05;
            if (r0 != null) {
                r0.A06();
                r1.A0u = true;
                View view = r1.A0U;
                int i = 8;
                if (groupChatLiveLocationsActivity.A07.A0m == null) {
                    i = 0;
                }
                view.setVisibility(i);
                groupChatLiveLocationsActivity.A06.setLocationMode(2);
                C07040Vr r6 = new C07040Vr(r8.A00, r8.A01);
                float A042 = GroupChatLiveLocationsActivity.A04(groupChatLiveLocationsActivity, r8.A02, 16.0f);
                groupChatLiveLocationsActivity.A0V = true;
                if (groupChatLiveLocationsActivity.A05.A02().A02 < A042) {
                    Point A043 = groupChatLiveLocationsActivity.A05.A0R.A04(r6);
                    int i2 = A043.x;
                    if (i2 <= 0 || A043.y <= 0 || i2 >= groupChatLiveLocationsActivity.A06.getWidth() || A043.y >= groupChatLiveLocationsActivity.A06.getHeight()) {
                        C32031eE r2 = groupChatLiveLocationsActivity.A05;
                        C07030Vq r12 = new C07030Vq();
                        r12.A08 = r6;
                        r2.A08(r12, 1500, groupChatLiveLocationsActivity.A04);
                    } else {
                        groupChatLiveLocationsActivity.A05.A08(AnonymousClass0N2.A0j(r6, A042), 1500, groupChatLiveLocationsActivity.A04);
                    }
                } else {
                    C32031eE r22 = groupChatLiveLocationsActivity.A05;
                    C07030Vq r13 = new C07030Vq();
                    r13.A08 = r6;
                    r22.A08(r13, 1500, groupChatLiveLocationsActivity.A04);
                }
                groupChatLiveLocationsActivity.A0V();
                return;
            }
            throw null;
        }
        C60092om r14 = (C60092om) this;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = r14.A00;
        AnonymousClass1B5 r02 = groupChatLiveLocationsActivity2.A06;
        if (r02 != null) {
            try {
                r02.A01.AQD();
                r14.A0u = true;
                View view2 = r14.A0U;
                int i3 = 8;
                if (groupChatLiveLocationsActivity2.A08.A0m == null) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
                groupChatLiveLocationsActivity2.A07.setLocationMode(2);
                if (!groupChatLiveLocationsActivity2.A0W) {
                    groupChatLiveLocationsActivity2.A0W = true;
                    LatLng latLng = new LatLng(r8.A00, r8.A01);
                    float A044 = GroupChatLiveLocationsActivity2.A04(groupChatLiveLocationsActivity2, r8.A02, 16.0f);
                    groupChatLiveLocationsActivity2.A06.A05();
                    if (groupChatLiveLocationsActivity2.A06.A02().A02 < A044) {
                        Point A002 = groupChatLiveLocationsActivity2.A06.A00().A00(latLng);
                        int i4 = A002.x;
                        if (i4 <= 0 || A002.y <= 0 || i4 >= groupChatLiveLocationsActivity2.A07.getWidth() || A002.y >= groupChatLiveLocationsActivity2.A07.getHeight()) {
                            groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0G(latLng), groupChatLiveLocationsActivity2.A05);
                        } else {
                            groupChatLiveLocationsActivity2.A06.A05();
                            groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0H(latLng, A044), groupChatLiveLocationsActivity2.A05);
                        }
                    } else {
                        groupChatLiveLocationsActivity2.A06.A0A(C008805h.A0G(latLng), groupChatLiveLocationsActivity2.A05);
                    }
                }
                groupChatLiveLocationsActivity2.A0V();
            } catch (RemoteException e) {
                throw new AnonymousClass06B(e);
            }
        }
    }

    public final void A0S(C02900Dx r5) {
        Map map = this.A1O;
        synchronized (map) {
            map.put(r5.A06, r5);
        }
        this.A0v.postDelayed(this.A1J, 3000);
    }

    public final void A0T(C02900Dx r4) {
        C49842Sk r1;
        if (r4 != null) {
            Iterator it = this.A1M.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r1 = (C49842Sk) it.next();
                if (r1.A02 == r4) {
                    break;
                }
            }
        }
        r1 = null;
        A0O(r1);
    }

    public void A0U(Float f) {
        AnonymousClass2SN r5 = this.A0j;
        if (r5 != null) {
            if (f == null || ((double) Math.abs(r5.A00 - f.floatValue())) <= 0.05d) {
                String A012 = A01(r5.A01);
                this.A0j = null;
                for (C49842Sk r1 : this.A1M) {
                    if (A012.equals(A01(r1.A04))) {
                        A0P(r1, false);
                        return;
                    }
                }
            }
        }
    }

    public final void A0V(String str) {
        if (this.A0m != null) {
            List list = this.A1L;
            list.clear();
            list.add(this.A0m);
            this.A0n = null;
            this.A0J = null;
            this.A0w.A06(this);
            return;
        }
        List list2 = this.A1L;
        list2.clear();
        AnonymousClass01S r1 = this.A1D;
        list2.addAll(r1.A08(this.A0e));
        if (r1.A0e(this.A0e)) {
            if (this.A0n == null) {
                AnonymousClass01I r0 = this.A0y;
                r0.A04();
                AnonymousClass0HR r02 = r0.A01;
                if (r02 != null) {
                    UserJid userJid = (UserJid) r02.A09;
                    if (userJid != null) {
                        this.A0n = new C02900Dx(userJid);
                        AnonymousClass0C1 r5 = this.A0w;
                        Location A032 = r5.A03(str);
                        if (A032 != null) {
                            this.A0n.A00 = A032.getLatitude();
                            this.A0n.A01 = A032.getLongitude();
                            this.A0n.A05 = A032.getTime();
                            this.A0n.A02 = A032.getSpeed();
                            this.A0n.A03 = (int) A032.getAccuracy();
                            this.A0n.A04 = (int) A032.getBearing();
                        }
                        r5.A05(3, 5000, 1000, this, str);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            list2.add(0, this.A0n);
            return;
        }
        this.A0n = null;
        this.A0J = null;
        this.A0w.A06(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W(boolean r15) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnCreateContextMenuListenerC56112i5.A0W(boolean):void");
    }

    public boolean A0X(int i, int i2) {
        Activity activity = this.A0E;
        if (activity != null) {
            LocationSharingService.A02(activity.getApplicationContext(), this.A1D);
        }
        if (i == 34) {
            if (i2 != -1) {
                return false;
            }
            this.A1F.A06(this.A0E, this.A0e);
            return true;
        } else if (i != 100) {
            return false;
        } else {
            if (i2 == 1000) {
                Activity activity2 = this.A0E;
                activity2.startActivity(Conversation.A05(activity2, this.A0e));
                this.A0E.finish();
            }
            return true;
        }
    }

    @Override // X.AnonymousClass0DJ
    public void ADz(boolean z) {
        if (z) {
            C56082i2 r4 = new C56082i2(this, this.A0e);
            Handler handler = this.A0v;
            Runnable runnable = this.A1I;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.A0C);
            this.A1E.A01(this.A0e, r4);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    public void onLocationChanged(Location location) {
        if (C02770Dj.A03(location, this.A0J)) {
            this.A0J = location;
            C02900Dx r2 = this.A0n;
            if (r2 != null) {
                r2.A00 = location.getLatitude();
                this.A0n.A01 = location.getLongitude();
                this.A0n.A05 = location.getTime();
                this.A0n.A02 = location.getSpeed();
                this.A0n.A03 = (int) location.getAccuracy();
                this.A0n.A04 = (int) location.getBearing();
                ((AbstractC16300pa) this.A0h).A01.A00();
                if (this.A0p) {
                    this.A0p = false;
                    A0I();
                    return;
                }
                A0S(this.A0n);
            } else if (this.A1D.A0e(this.A0e)) {
                A0I();
            }
        }
    }
}
