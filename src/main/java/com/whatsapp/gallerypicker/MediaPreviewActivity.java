package com.whatsapp.gallerypicker;

import X.AbstractC007503q;
import X.AbstractC16300pa;
import X.AbstractC26651Lv;
import X.AbstractC64722ye;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00X;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01P;
import X.AnonymousClass01Q;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08D;
import X.AnonymousClass08V;
import X.AnonymousClass08W;
import X.AnonymousClass09E;
import X.AnonymousClass09H;
import X.AnonymousClass0AI;
import X.AnonymousClass0AL;
import X.AnonymousClass0DD;
import X.AnonymousClass0EJ;
import X.AnonymousClass0EW;
import X.AnonymousClass0Eg;
import X.AnonymousClass0IA;
import X.AnonymousClass0JW;
import X.AnonymousClass0TX;
import X.AnonymousClass0XN;
import X.AnonymousClass0Z6;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2Mt;
import X.AnonymousClass2OT;
import X.AnonymousClass2Ou;
import X.AnonymousClass2P5;
import X.AnonymousClass2PD;
import X.AnonymousClass2PF;
import X.AnonymousClass2PG;
import X.AnonymousClass2PM;
import X.AnonymousClass2T3;
import X.AnonymousClass2T4;
import X.AnonymousClass2UT;
import X.AnonymousClass36I;
import X.C000300f;
import X.C002101e;
import X.C002701k;
import X.C006803i;
import X.C014308b;
import X.C01970Ad;
import X.C02040Ak;
import X.C02220Bc;
import X.C02590Cr;
import X.C02600Cs;
import X.C02950Ed;
import X.C03270Fn;
import X.C03930Ii;
import X.C06170Sb;
import X.C07550Yd;
import X.C08340aw;
import X.C09980dq;
import X.C10440ed;
import X.C12060hU;
import X.C444120a;
import X.C53022cH;
import X.C53492dM;
import X.C53602dX;
import X.C53902e1;
import X.C54132eP;
import X.C54162eS;
import X.C54202eW;
import X.C56862jJ;
import X.C59502nm;
import X.C59792oI;
import X.DialogInterface$OnShowListenerC49042Ot;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.FirstStatusConfirmationDialogFragment;
import com.whatsapp.GifHelper;
import com.whatsapp.PhotoViewPager;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.doodle.TitleBarComponent;
import com.whatsapp.jid.Jid;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class MediaPreviewActivity extends ActivityC004602e implements AnonymousClass2PF, AbstractC26651Lv {
    public int A00 = 0;
    public int A01 = -1;
    public Bitmap A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public TextView A0C;
    public AnonymousClass08V A0D = new AnonymousClass08W((int) ((Runtime.getRuntime().maxMemory() / 1024) / 6));
    public RecyclerView A0E;
    public PhotoViewPager A0F;
    public TextEmojiLabel A0G;
    public TextEmojiLabel A0H;
    public WaImageView A0I;
    public WaImageView A0J;
    public TitleBarComponent A0K;
    public C54132eP A0L;
    public C59792oI A0M;
    public C10440ed A0N;
    public C54202eW A0O;
    public AnonymousClass2PM A0P;
    public AbstractC64722ye A0Q = new C53902e1(this);
    public C09980dq A0R;
    public C07550Yd A0S;
    public ArrayList A0T;
    public List A0U = new ArrayList();
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c = false;
    public final PointF A0d = new PointF();
    public final Rect A0e = new Rect();
    public final Handler A0f = new Handler(Looper.getMainLooper());
    public final View.OnTouchListener A0g = new AnonymousClass2PD(this);
    public final AnonymousClass0EW A0h = AnonymousClass0EW.A01;
    public final AnonymousClass01I A0i = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A0j = AnonymousClass0Z6.A00();
    public final C000300f A0k = C000300f.A00();
    public final AnonymousClass08D A0l = AnonymousClass08D.A00();
    public final AnonymousClass01A A0m = AnonymousClass01A.A00();
    public final AnonymousClass0AI A0n = AnonymousClass0AI.A00();
    public final C014308b A0o = C014308b.A00();
    public final AnonymousClass0XN A0p = AnonymousClass0XN.A00();
    public final AnonymousClass03P A0q = AnonymousClass03P.A00();
    public final C03270Fn A0r = C03270Fn.A00();
    public final AnonymousClass00S A0s = AnonymousClass00S.A00();
    public final AnonymousClass03S A0t = AnonymousClass03S.A00();
    public final AnonymousClass01Q A0u = AnonymousClass01Q.A00();
    public final AnonymousClass01K A0v = AnonymousClass01K.A00();
    public final AnonymousClass09E A0w = AnonymousClass09E.A00();
    public final AnonymousClass01P A0x = AnonymousClass01P.A00();
    public final C53022cH A0y = C53022cH.A00();
    public final C59502nm A0z = C59502nm.A00();
    public final C03930Ii A10 = C03930Ii.A00();
    public final C53492dM A11 = C53492dM.A00();
    public final C002701k A12 = C002701k.A00();
    public final AnonymousClass00Y A13 = AnonymousClass00Y.A00();
    public final C08340aw A14 = new C08340aw();
    public final AnonymousClass0Eg A15 = AnonymousClass0Eg.A00();
    public final AnonymousClass0EJ A16 = AnonymousClass0EJ.A01();
    public final AnonymousClass09H A17 = AnonymousClass09H.A01();
    public final AnonymousClass0IA A18 = AnonymousClass0IA.A00();
    public final C02040Ak A19 = C02040Ak.A00();
    public final C01970Ad A1A = C01970Ad.A00();
    public final AnonymousClass022 A1B = AnonymousClass022.A00();
    public final C02220Bc A1C = C02220Bc.A00();
    public final AnonymousClass00T A1D = C002101e.A00();
    public final Runnable A1E = new RunnableEBaseShape9S0100000_I1_4(this, 41);
    public final Collection A1F = new ArrayList();
    public final HashMap A1G = new HashMap();
    public final HashSet A1H = new HashSet();
    public final Map A1I = new HashMap();

    public static byte A04(C02220Bc r3, AnonymousClass2PG r4) {
        Byte A052 = r4.A05();
        if (A052 == null) {
            A052 = Byte.valueOf(r3.A05(r4.A0F));
            if (A052.byteValue() == 3 && GifHelper.A02(r4.A04())) {
                A052 = (byte) 13;
            }
        }
        return A052.byteValue();
    }

    public static final long A05(AnonymousClass2PG r4) {
        AnonymousClass36I r0;
        if (r4.A05() == null || r4.A05().byteValue() != 3) {
            return -1;
        }
        Point A012 = r4.A01();
        if (A012 != null) {
            return (long) (A012.y - A012.x);
        }
        synchronized (r4) {
            r0 = r4.A04;
        }
        if (r0 != null) {
            return r0.A04;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r6 != 43) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C444120a A06(byte r6, boolean r7, int r8, int r9, long r10) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPreviewActivity.A06(byte, boolean, int, int, long):X.20a");
    }

    public static void A07(MediaPreviewActivity mediaPreviewActivity, long j) {
        if (mediaPreviewActivity.A0Y && !mediaPreviewActivity.A0Z && mediaPreviewActivity.A0V) {
            mediaPreviewActivity.A0Z = true;
            AnonymousClass02M r2 = ((ActivityC004702f) mediaPreviewActivity).A0F;
            r2.A02.postDelayed(new RunnableEBaseShape9S0100000_I1_4(mediaPreviewActivity, 40), j);
        }
    }

    public static void A08(C02220Bc r3, Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AnonymousClass2PG r1 = (AnonymousClass2PG) it.next();
            if (collection.contains(r1.A04())) {
                r3.A0D(r1.A04());
                r3.A0D(r1.A02());
            }
        }
    }

    public final Uri A0T() {
        int i = this.A01;
        if (i < 0) {
            return null;
        }
        return (Uri) this.A0T.get(i);
    }

    public final C444120a A0U(byte b) {
        return A06(b, this.A0U.contains(C12060hU.A00), this.A0U.size(), getIntent().getIntExtra("origin", 1), getIntent().getLongExtra("picker_open_time", 0));
    }

    public final MediaPreviewFragment A0V() {
        Uri A0T2 = A0T();
        if (A0T2 != null) {
            Iterator it = ((AbstractCollection) A0D()).iterator();
            while (it.hasNext()) {
                AnonymousClass037 r1 = (AnonymousClass037) it.next();
                if (r1 instanceof MediaPreviewFragment) {
                    MediaPreviewFragment mediaPreviewFragment = (MediaPreviewFragment) r1;
                    if (A0T2.equals(mediaPreviewFragment.A00)) {
                        return mediaPreviewFragment;
                    }
                }
            }
        }
        return null;
    }

    public final void A0W() {
        Map map = this.A1I;
        for (AnonymousClass2T4 r2 : map.values()) {
            AnonymousClass0EJ r5 = this.A16;
            if (r5 != null) {
                C56862jJ r4 = (C56862jJ) r2;
                StringBuilder sb = new StringBuilder("app/mediajobmanager/cancelOptimistic mediaJob=");
                sb.append(r4);
                Log.d(sb.toString());
                if (r4.A0S == null) {
                    r4.A02 = true;
                    AnonymousClass2T3 A002 = r4.A00();
                    synchronized (A002) {
                        if (!A002.A0A) {
                            A002.A06 = 0;
                        } else {
                            A002.A06 = 1;
                        }
                    }
                    C02950Ed r22 = r5.A0B;
                    r22.A04.A00(r4.A02().A05).A06(r4);
                    r22.A02.A06(r4);
                    r22.A03.A06(r4);
                    r5.A0F.A06(r4);
                    r5.A0J.ANF(new RunnableEBaseShape8S0200000_I1_3(r5, r4, 22));
                    StringBuilder sb2 = new StringBuilder("app/mediajobmanager/cancelled optimistic mediaJob=");
                    sb2.append(r4);
                    Log.d(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("app/mediajobmanager/attempting to cancel non-optimistic job, skipped, job=");
                    sb3.append(r2);
                    Log.w(sb3.toString());
                }
            } else {
                throw null;
            }
        }
        map.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X() {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPreviewActivity.A0X():void");
    }

    public final void A0Y() {
        Iterator it = ((AbstractCollection) A0D()).iterator();
        while (it.hasNext()) {
            AnonymousClass037 r2 = (AnonymousClass037) it.next();
            if (r2 instanceof MediaPreviewFragment) {
                MediaPreviewFragment mediaPreviewFragment = (MediaPreviewFragment) r2;
                AnonymousClass2PG A002 = this.A14.A00(mediaPreviewFragment.A00);
                int i = mediaPreviewFragment.A02.A02;
                synchronized (A002) {
                    A002.A00 = i;
                }
            }
        }
    }

    public final void A0Z() {
        boolean z;
        int intExtra;
        if (!this.A0b) {
            MediaPreviewFragment A0V2 = A0V();
            if (A0V2 == null || !A0V2.A0u()) {
                A0X();
                HashMap hashMap = new HashMap();
                Iterator it = this.A0T.iterator();
                while (true) {
                    byte b = 13;
                    boolean z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass2PG A002 = this.A14.A00((Uri) it.next());
                    byte A042 = A04(this.A1C, A002);
                    A002.A09(Byte.valueOf(A042));
                    if (!A002.A0C()) {
                        b = A042;
                    }
                    Byte valueOf = Byte.valueOf(b);
                    C444120a r3 = (C444120a) hashMap.get(valueOf);
                    if (r3 == null) {
                        r3 = A0U(b);
                        hashMap.put(valueOf, r3);
                    }
                    r3.A05 = AnonymousClass008.A05(r3.A05);
                    if (A002.A02() != null) {
                        r3.A04 = AnonymousClass008.A05(r3.A04);
                        z2 = false;
                    }
                    if (A002.A00() != 0) {
                        z2 = false;
                    }
                    String A072 = A002.A07();
                    if (!TextUtils.isEmpty(A072)) {
                        AnonymousClass2Mt r11 = new AnonymousClass2Mt();
                        try {
                            MediaPreviewFragment A0V3 = A0V();
                            if (A0V3 != null) {
                                r11.A08(A072, this, super.A0M, this.A0k, this.A12, ((AnonymousClass2C0) this).A01, A0V3.A0D);
                            }
                            if (r11.A0A(new String[]{"pen"})) {
                                r3.A06 = Long.valueOf(r3.A06.longValue() + 1);
                                z2 = false;
                            }
                            if (r11.A09()) {
                                r3.A0A = Long.valueOf(r3.A0A.longValue() + 1);
                                z2 = false;
                            }
                            if (r11.A0A(new String[]{"text"})) {
                                r3.A0C = Long.valueOf(r3.A0C.longValue() + 1);
                                r3.A03 = AnonymousClass008.A05(r3.A03);
                            }
                        } catch (JSONException e) {
                            Log.e("mediapreview/cannot load doodle", e);
                        }
                    }
                    if (z2) {
                    }
                    r3.A03 = AnonymousClass008.A05(r3.A03);
                }
                HashSet hashSet = this.A1H;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    AnonymousClass2PG r1 = (AnonymousClass2PG) it2.next();
                    byte A043 = A04(this.A1C, r1);
                    r1.A09(Byte.valueOf(A043));
                    if (r1.A0C()) {
                        A043 = 13;
                    }
                    Byte valueOf2 = Byte.valueOf(A043);
                    C444120a r12 = (C444120a) hashMap.get(valueOf2);
                    if (r12 == null) {
                        r12 = A0U(A043);
                        hashMap.put(valueOf2, r12);
                    }
                    r12.A05 = AnonymousClass008.A05(r12.A05);
                }
                for (AnonymousClass00X r13 : hashMap.values()) {
                    this.A13.A09(r13, 1);
                    AnonymousClass00Y.A01(r13, "");
                }
                C02220Bc r5 = this.A1C;
                Collection collection = this.A1F;
                A08(r5, collection, new ArrayList(this.A14.A00.values()));
                A08(r5, collection, hashSet);
                AnonymousClass0DD A032 = this.A0l.A03();
                Iterator it3 = this.A0T.iterator();
                while (it3.hasNext()) {
                    A0f(A032, (Uri) it3.next());
                }
                if (this.A0T.size() == 1 && ((intExtra = getIntent().getIntExtra("origin", 1)) == 2 || intExtra == 7 || intExtra == 12 || intExtra == 15 || intExtra == 18)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    finish();
                    overridePendingTransition(17432576, 17432577);
                } else if (getIntent().getIntExtra("origin", 1) == 29) {
                    finish();
                    overridePendingTransition(0, 17432577);
                } else if (this.A02 == null || A0V2 == null) {
                    finish();
                } else {
                    this.A05.setVisibility(0);
                    if (A0V2 instanceof VideoPreviewFragment) {
                        VideoPreviewFragment videoPreviewFragment = (VideoPreviewFragment) A0V2;
                        videoPreviewFragment.A0J.A08();
                        videoPreviewFragment.A0J.A04().setAlpha(0.0f);
                        View view = ((AnonymousClass037) videoPreviewFragment).A0A;
                        if (view != null) {
                            view.findViewById(R.id.content).setVisibility(4);
                        } else {
                            throw null;
                        }
                    } else if (A0V2 instanceof ImagePreviewFragment) {
                        ((ImagePreviewFragment) A0V2).A01.setVisibility(4);
                    } else if (A0V2 instanceof GifPreviewFragment) {
                        GifPreviewFragment gifPreviewFragment = (GifPreviewFragment) A0V2;
                        gifPreviewFragment.A00.A08();
                        gifPreviewFragment.A00.A04().setVisibility(4);
                    }
                    ((LinearLayout) this.A08).setGravity(48);
                    AnonymousClass0TX.A0B(this);
                }
            }
        }
    }

    public final void A0a() {
        AnonymousClass0Eg r3 = this.A15;
        C06170Sb r4 = ((ActivityC004602e) this).A0H;
        C02590Cr r5 = super.A0M;
        C02600Cs r6 = super.A0L;
        C03930Ii r7 = this.A10;
        AnonymousClass03P r8 = this.A0q;
        AnonymousClass01X r9 = ((AnonymousClass2C0) this).A01;
        C53492dM r10 = this.A11;
        AnonymousClass00D r11 = super.A0J;
        AnonymousClass022 r12 = this.A1B;
        AnonymousClass02N r13 = null;
        if (!this.A0U.isEmpty() && this.A0U.size() == 1) {
            r13 = (AnonymousClass02N) this.A0U.get(0);
        }
        AnonymousClass2P5 r1 = new AnonymousClass2P5(this, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, this.A0G.getText());
        r1.setOnShowListener(new DialogInterface$OnShowListenerC49042Ot(this));
        r1.show();
        r1.setOnDismissListener(new AnonymousClass2Ou(this, r1));
    }

    public final void A0b() {
        Jid jid;
        long j;
        this.A0Y = false;
        StringBuilder A0S2 = AnonymousClass008.A0S("mediapreviewactivity/sendmedia uris size = ");
        A0S2.append(this.A0T.size());
        Log.i(A0S2.toString());
        if (!getIntent().getBooleanExtra("send", true) || !this.A0U.isEmpty()) {
            AbstractC007503q r16 = null;
            if (this.A0U.size() == 1) {
                jid = (Jid) this.A0U.get(0);
            } else {
                jid = null;
            }
            if (!AnonymousClass1VY.A0b(jid) || this.A0w.A0H()) {
                this.A0B.setEnabled(false);
                A0X();
                A0Y();
                long longExtra = getIntent().getLongExtra("quoted_message_row_id", 0);
                AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("quoted_group_jid"));
                if (longExtra > 0) {
                    r16 = this.A0v.A0J.A01(longExtra);
                } else if (A032 != null) {
                    r16 = AnonymousClass0AL.A00(A032, this.A0s.A05());
                }
                long longExtra2 = getIntent().getLongExtra("picker_open_time", 0);
                boolean booleanExtra = getIntent().getBooleanExtra("number_from_url", false);
                boolean booleanExtra2 = getIntent().getBooleanExtra("send", true);
                int intExtra = getIntent().getIntExtra("origin", 1);
                this.A0b = true;
                ((ActivityC004702f) this).A0F.A02.postDelayed(this.A1E, 300);
                this.A1D.ANC(new C54162eS(this, this.A0U, this.A0T, new HashSet(this.A1F), this.A14, r16, longExtra2, booleanExtra, intExtra, booleanExtra2, new HashMap(this.A1I), this.A1H, this.A0c, this.A0z), new Void[0]);
                return;
            }
            APm(new FirstStatusConfirmationDialogFragment());
            return;
        }
        Intent intent = new Intent(this, ContactPicker.class);
        intent.putExtra("send", true);
        intent.putExtra("skip_preview", true);
        HashSet hashSet = new HashSet();
        if (this.A0c) {
            C08340aw r5 = this.A14;
            j = A05(r5.A00((Uri) this.A0T.get(0)));
            int i = 42;
            if (A04(this.A1C, r5.A00((Uri) this.A0T.get(0))) == 3) {
                i = 43;
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            Iterator it = new ArrayList(this.A14.A00.values()).iterator();
            j = -1;
            while (it.hasNext()) {
                AnonymousClass2PG r1 = (AnonymousClass2PG) it.next();
                if (r1.A05() != null) {
                    hashSet.add(Integer.valueOf(r1.A05().byteValue()));
                    j = Math.max(j, A05(r1));
                }
            }
        }
        if (j != -1) {
            intent.putExtra("send_max_video_duration", j);
        }
        intent.putIntegerArrayListExtra("message_types", new ArrayList<>(hashSet));
        startActivityForResult(intent, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0c() {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPreviewActivity.A0c():void");
    }

    public final void A0d(int i) {
        AnonymousClass008.A0t("MediaPreviewActivity/onMediaSelected pos=", i);
        this.A01 = i;
        ((AbstractC16300pa) this.A0O).A01.A00();
        this.A0E.A0Y(this.A01);
        MediaPreviewFragment A0V2 = A0V();
        Iterator it = ((AbstractCollection) A0D()).iterator();
        while (it.hasNext()) {
            AnonymousClass037 r1 = (AnonymousClass037) it.next();
            if ((r1 instanceof MediaPreviewFragment) && r1 != A0V2) {
                MediaPreviewFragment mediaPreviewFragment = (MediaPreviewFragment) r1;
                if (mediaPreviewFragment instanceof VideoPreviewFragment) {
                    mediaPreviewFragment.A0v();
                } else if (mediaPreviewFragment instanceof ImagePreviewFragment) {
                    AnonymousClass2OT r2 = mediaPreviewFragment.A02;
                    r2.A0M.removeCallbacks(r2.A0Z);
                    r2.A03 = null;
                    r2.A0C = false;
                    r2.A04();
                } else if (mediaPreviewFragment instanceof GifPreviewFragment) {
                    mediaPreviewFragment.A0v();
                }
            }
        }
        if (A0V2 != null && !getIntent().getBooleanExtra("smb_send_product", false)) {
            A0V2.A0t(findViewById(R.id.media_preview_layout));
            A0V2.A0q();
            if (A0V2 instanceof VideoPreviewFragment) {
                VideoPreviewFragment videoPreviewFragment = (VideoPreviewFragment) A0V2;
                if (videoPreviewFragment.A0N) {
                    videoPreviewFragment.A0p();
                }
            } else if (A0V2 instanceof ImagePreviewFragment) {
                AnonymousClass2OT r12 = A0V2.A02;
                if (!r12.A0C) {
                    r12.A05();
                }
                C53602dX r0 = r12.A0B;
                if (r0 == null) {
                    r12.A0M.postDelayed(r12.A0Z, 500);
                } else {
                    ((AbstractC16300pa) r0).A01.A00();
                }
            } else if (A0V2 instanceof GifPreviewFragment) {
                A0V2.A0p();
            }
        }
        Uri A0T2 = A0T();
        C08340aw r02 = this.A14;
        if (A0T2 != null) {
            AnonymousClass2PG A002 = r02.A00(A0T2);
            SpannableStringBuilder spannableStringBuilder = null;
            if (A002.A06() != null) {
                spannableStringBuilder = new SpannableStringBuilder(A002.A06());
                this.A0j.A03(this, spannableStringBuilder, C006803i.A0O(A002.A08()), true);
            }
            A0g(spannableStringBuilder, true);
            return;
        }
        throw null;
    }

    public final void A0e(Uri uri) {
        this.A0T.remove(uri);
        Object remove = this.A14.A00.remove(uri);
        if (remove != null) {
            this.A1H.add(remove);
        }
        this.A0M.A06();
        ((AbstractC16300pa) this.A0O).A01.A00();
        ArrayList arrayList = this.A0T;
        if (arrayList.isEmpty()) {
            this.A01 = -1;
            finish();
            return;
        }
        int i = this.A01;
        if (i >= arrayList.size()) {
            i = arrayList.size() - 1;
            this.A01 = i;
        }
        if (i >= 0) {
            AFE();
            AG6(0.0f);
            this.A0F.setCurrentItem(this.A01);
            A0d(this.A01);
        }
        if (this.A0T.size() == 1) {
            this.A0E.setVisibility(8);
        }
    }

    public final void A0f(AnonymousClass0DD r5, Uri uri) {
        if (uri != null) {
            r5.A04(uri.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(uri.toString());
            sb.append("-thumb");
            r5.A04(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri.toString());
            sb2.append("-filter");
            r5.A04(sb2.toString());
            AnonymousClass08V r2 = this.A0D;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(uri.toString());
            sb3.append("-thumb");
            r2.A04(sb3.toString());
        }
    }

    public final void A0g(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            this.A0G.setText((CharSequence) null);
            this.A08.setContentDescription(((AnonymousClass2C0) this).A01.A06(R.string.add_caption));
        } else {
            if (z) {
                TextEmojiLabel textEmojiLabel = this.A0G;
                textEmojiLabel.A03(charSequence, null, null, true, 0, true, textEmojiLabel.getCurrentTextColor());
            } else {
                this.A0G.setText(charSequence);
            }
            this.A08.setContentDescription(this.A0G.getText());
        }
        A0c();
    }

    public final void A0h(boolean z, boolean z2) {
        if (z2) {
            this.A03.setVisibility(0);
        } else {
            this.A03.setVisibility(4);
        }
        if (z) {
            if (this.A0T.size() > 1) {
                this.A0E.setVisibility(0);
            }
            this.A04.setVisibility(0);
            this.A0B.setVisibility(0);
            A0c();
            return;
        }
        if (this.A0T.size() > 1) {
            this.A0E.setVisibility(4);
        } else {
            this.A0E.setVisibility(8);
        }
        this.A04.setVisibility(4);
        this.A0B.setVisibility(4);
    }

    public final boolean A0i() {
        List<Jid> list = this.A0U;
        if (list == null) {
            return false;
        }
        for (Jid jid : list) {
            if (AnonymousClass1VY.A0b(jid)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass2PF
    public boolean A2T(Uri uri) {
        boolean z;
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            z = A002.A0C;
        }
        return z;
    }

    @Override // X.AnonymousClass2PF
    public Uri A4k() {
        if (AnonymousClass2UT.A00) {
            return (Uri) getIntent().getParcelableExtra("animate_uri");
        }
        return null;
    }

    @Override // X.AnonymousClass2PF
    public File A5b(Uri uri) {
        return this.A14.A00(uri).A02();
    }

    @Override // X.AnonymousClass2PF
    public Rect A5c(Uri uri) {
        Rect rect;
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            rect = A002.A03;
        }
        return rect;
    }

    @Override // X.AnonymousClass2PF
    public String A66(Uri uri) {
        return this.A14.A00(uri).A07();
    }

    @Override // X.AnonymousClass2PF
    public String A69(Uri uri) {
        String str;
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            str = A002.A0A;
        }
        return str;
    }

    @Override // X.AnonymousClass2PF
    public File A6Q(Uri uri) {
        return this.A14.A00(uri).A04();
    }

    @Override // X.AnonymousClass2PF
    public int A6S(Uri uri) {
        int i;
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            i = A002.A00;
        }
        return i;
    }

    @Override // X.AnonymousClass2PF
    public List A6y() {
        return this.A0U;
    }

    @Override // X.AnonymousClass2PF
    public AnonymousClass2PM A7M() {
        return this.A0P;
    }

    @Override // X.AnonymousClass2PF
    public int A8r(Uri uri) {
        return this.A14.A00(uri).A00();
    }

    @Override // X.AnonymousClass2PF
    public boolean A8y(Uri uri) {
        return this.A14.A00(uri).A0C();
    }

    @Override // X.AnonymousClass2PF
    public TitleBarComponent A9O() {
        return this.A0K;
    }

    @Override // X.AnonymousClass2PF
    public Point A9U(Uri uri) {
        return this.A14.A00(uri).A01();
    }

    @Override // X.AnonymousClass2PF
    public AnonymousClass36I A9g(Uri uri) {
        AnonymousClass36I r0;
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            r0 = A002.A04;
        }
        return r0;
    }

    @Override // X.AnonymousClass2PF
    public void AFD() {
        if (this.A0B.getVisibility() != 4) {
            if (!this.A0X) {
                AlphaAnimation A022 = AnonymousClass008.A02(1.0f, 0.0f, 300);
                this.A0B.startAnimation(A022);
                this.A04.startAnimation(A022);
                if (this.A0T.size() > 1) {
                    this.A0E.startAnimation(A022);
                }
                if (this.A0C.getVisibility() == 0) {
                    this.A0C.startAnimation(A022);
                }
            } else {
                this.A0C.clearAnimation();
            }
            this.A0B.setVisibility(4);
            this.A04.setVisibility(4);
            if (this.A0T.size() > 1) {
                this.A0E.setVisibility(4);
            }
            if (this.A0C.getVisibility() == 0) {
                this.A0C.setVisibility(4);
            }
        }
    }

    @Override // X.AnonymousClass2PF
    public void AFE() {
        A0f(this.A0l.A03(), A0T());
        A0X();
        ((AbstractC16300pa) this.A0O).A01.A00();
        if (this.A0B.getVisibility() != 0) {
            AlphaAnimation A022 = AnonymousClass008.A02(0.0f, 1.0f, 300);
            this.A0B.setVisibility(0);
            this.A0B.startAnimation(A022);
            this.A04.setVisibility(0);
            this.A04.startAnimation(A022);
            if (this.A0T.size() > 1) {
                this.A0E.setVisibility(0);
                this.A0E.startAnimation(A022);
            }
        }
    }

    @Override // X.AnonymousClass2PF
    public void AG4() {
        AG6(0.0f);
        if (!this.A0X) {
            A0h(true, false);
            return;
        }
        this.A03.setVisibility(4);
        this.A0X = false;
    }

    @Override // X.AnonymousClass2PF
    public void AG5() {
        AG6(1.0f);
        A0h(false, false);
    }

    @Override // X.AnonymousClass2PF
    public void AG6(float f) {
        float f2 = 1.0f - f;
        this.A0E.setAlpha(f2);
        this.A04.setAlpha(f2);
        this.A0B.setAlpha(f2);
        this.A0C.setAlpha(f2);
    }

    @Override // X.AnonymousClass2PF
    public void AG7() {
        A0h(true, true);
    }

    @Override // X.AnonymousClass2PF
    public void AG8() {
        A0h(true, false);
    }

    @Override // X.AbstractC26651Lv
    public void AKT() {
        A0b();
    }

    @Override // X.AnonymousClass2PF
    public void AL2(boolean z) {
        this.A0X = z;
    }

    @Override // X.AnonymousClass2PF
    public void AO8(Uri uri, File file, Rect rect, int i) {
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            A002.A03 = rect;
        }
        synchronized (A002) {
            A002.A01 = i;
        }
        synchronized (A002) {
            A002.A05 = file;
        }
        A0f(this.A0l.A03(), uri);
        ((AbstractC16300pa) this.A0O).A01.A00();
    }

    @Override // X.AnonymousClass2PF
    public void AOF(Uri uri, int i) {
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            A002.A00 = i;
        }
    }

    @Override // X.AnonymousClass2PF
    public void AOa(Uri uri, boolean z) {
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            A002.A0D = z;
        }
    }

    @Override // X.AnonymousClass2PF
    public void AP4(Uri uri, boolean z) {
        AnonymousClass2PG A002 = this.A14.A00(uri);
        synchronized (A002) {
            A002.A0E = z;
        }
        A0c();
    }

    @Override // X.AnonymousClass2PF
    public void APH(Uri uri, long j, long j2) {
        AnonymousClass2PG A002 = this.A14.A00(uri);
        Point point = new Point((int) j, (int) j2);
        synchronized (A002) {
            A002.A02 = point;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b4, code lost:
        if (r8 != 100) goto L_0x00b6;
     */
    @Override // X.ActivityC004702f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPreviewActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void lambda$onCreate$2092$MediaPreviewActivity(View view) {
        MediaPreviewFragment A0V2 = A0V();
        if (A0V2 == null || !A0V2.A0u()) {
            A0X();
            A0Y();
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.A0T);
            C08340aw r0 = this.A14;
            if (r0 != null) {
                Bundle bundle = new Bundle();
                r0.A02(bundle);
                intent.putExtra("media_preview_params", bundle);
                this.A00 = 1;
                setResult(1, intent);
                finish();
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$2093$MediaPreviewActivity(View view) {
        Uri A0T2 = A0T();
        if (A0T2 != null) {
            A0e(A0T2);
        }
    }

    public /* synthetic */ void lambda$setupViewOnce$2097$MediaPreviewActivity(View view) {
        this.A0c = !this.A0c;
        A0c();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            this.A0U.clear();
            this.A0U.addAll(AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids")));
            A0b();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        A0Z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e5, code lost:
        if (getIntent().getBooleanExtra("smb_send_product", false) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0102, code lost:
        if (r1 != null) goto L_0x0104;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
        // Method dump skipped, instructions count: 1645
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPreviewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        int intExtra;
        if (this.A0F != null) {
            for (int i = 0; i < this.A0F.getChildCount(); i++) {
                View childAt = this.A0F.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A01();
                        }
                        i2++;
                    }
                }
            }
        }
        if (this.A00 == -1 || (intExtra = getIntent().getIntExtra("origin", 1)) == 5 || intExtra == 8 || intExtra == 9 || intExtra == 23 || intExtra == 22 || intExtra == 24 || intExtra == 25 || intExtra == 29) {
            this.A0l.A03().A00.A06(-1);
        }
        this.A1D.ANF(new RunnableEBaseShape9S0100000_I1_4(this.A0r, 37));
        super.onDestroy();
        AnonymousClass2PM r0 = this.A0P;
        if (r0 != null) {
            r0.A00();
            this.A0P = null;
        }
        C10440ed r02 = this.A0N;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A0N = null;
        }
        C09980dq r03 = this.A0R;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(true);
            this.A0R = null;
        }
        C53022cH r1 = this.A0y;
        synchronized (r1) {
            r1.A05.clear();
        }
        ((ActivityC004702f) this).A0F.A02.removeCallbacks(this.A1E);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A0Z();
        return true;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("uris", this.A0T);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0T.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A1G.get(it.next()));
        }
        bundle.putSerializable("ids", arrayList);
        C08340aw r0 = this.A14;
        if (r0 != null) {
            Bundle bundle2 = new Bundle();
            r0.A02(bundle2);
            bundle.putBundle("media_preview_params", bundle2);
            bundle.putBoolean("optimistic_started", this.A0Z);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A0V = true;
        if (this.A0N == null && !this.A0b && this.A0M != null && this.A0t.A06()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.A0T.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                File A032 = this.A14.A00(uri).A03();
                if (A032 == null || !A032.exists()) {
                    arrayList.add(uri);
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                ((ActivityC004702f) this).A0F.A0C(((AnonymousClass2C0) this).A01.A0A(R.plurals.file_was_removed, (long) size, Integer.valueOf(size)), 1);
                if (size == this.A0T.size()) {
                    finish();
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    A0e((Uri) it2.next());
                }
            }
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        this.A0V = false;
        if (!this.A0b) {
            A0W();
        }
    }
}
