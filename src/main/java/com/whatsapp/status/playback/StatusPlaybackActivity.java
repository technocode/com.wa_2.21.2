package com.whatsapp.status.playback;

import X.AbstractC659532f;
import X.AbstractC659732h;
import X.AbstractC660032k;
import X.AbstractC71663Pv;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00Y;
import X.AnonymousClass02Z;
import X.AnonymousClass037;
import X.AnonymousClass03S;
import X.AnonymousClass09E;
import X.AnonymousClass0BB;
import X.AnonymousClass0Q7;
import X.AnonymousClass0YE;
import X.AnonymousClass1Nx;
import X.AnonymousClass1Ny;
import X.AnonymousClass1VC;
import X.AnonymousClass1VY;
import X.AnonymousClass21A;
import X.AnonymousClass32G;
import X.AnonymousClass32H;
import X.AnonymousClass32I;
import X.AnonymousClass32J;
import X.AnonymousClass32N;
import X.AnonymousClass32O;
import X.AnonymousClass32V;
import X.AnonymousClass32Z;
import X.AnonymousClass37E;
import X.AnonymousClass3PL;
import X.AnonymousClass3PP;
import X.AnonymousClass3PQ;
import X.C006803i;
import X.C007303n;
import X.C02780Dk;
import X.C04380Kd;
import X.C27091Nz;
import X.C659932j;
import X.C660132l;
import X.C71453Pa;
import X.C72403Ss;
import X.C75003bx;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StatusPlaybackActivity extends ActivityC004602e implements AnonymousClass32Z {
    public static final Interpolator A0N = AnonymousClass32H.A00;
    public float A00 = 3.5f;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public int A05 = -1;
    public long A06;
    public ViewPager A07;
    public C007303n A08;
    public AnonymousClass32N A09;
    public AnonymousClass32O A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public final Rect A0G = new Rect();
    public final C04380Kd A0H = C04380Kd.A00();
    public final AnonymousClass03S A0I = AnonymousClass03S.A00();
    public final AnonymousClass09E A0J = AnonymousClass09E.A00();
    public final AnonymousClass0BB A0K = AnonymousClass0BB.A00();
    public final C660132l A0L = C660132l.A00();
    public final AnonymousClass37E A0M = AnonymousClass37E.A00();

    public final StatusPlaybackFragment A0T(int i) {
        AnonymousClass32N r0 = this.A09;
        if (r0 != null && i >= 0 && i < r0.A00.size()) {
            return A0U((AnonymousClass3PP) this.A09.A00.get(i));
        }
        return null;
    }

    public final StatusPlaybackFragment A0U(AnonymousClass3PP r6) {
        String rawString;
        if (!(r6 == null || (rawString = r6.A00.A0A.getRawString()) == null)) {
            Iterator it = ((AbstractCollection) A0D()).iterator();
            while (it.hasNext()) {
                AnonymousClass037 r1 = (AnonymousClass037) it.next();
                if (r1 instanceof StatusPlaybackFragment) {
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) r1;
                    if (rawString.equals(statusPlaybackFragment.A0n())) {
                        return statusPlaybackFragment;
                    }
                }
            }
        }
        return null;
    }

    public final void A0V(String str, int i, int i2) {
        int A002 = this.A09.A00(str);
        if (A002 >= 0 && A002 < this.A09.A00.size()) {
            if (A002 != this.A07.getCurrentItem()) {
                this.A09.A00.remove(A002);
                int i3 = this.A01;
                if (A002 <= i3) {
                    this.A01 = i3 - 1;
                }
                int i4 = this.A05;
                if (A002 <= i4) {
                    this.A05 = i4 - 1;
                }
                this.A07.A0V.A06();
            } else if (this.A0C || A002 == this.A09.A00.size() - 1) {
                finish();
            } else {
                this.A0B = new AnonymousClass32J(this, str, i, i2);
                AGq(str, true, i, i2);
            }
        }
    }

    @Override // X.AnonymousClass32Z
    public int A72() {
        return this.A03;
    }

    @Override // X.AnonymousClass32Z
    public void AFp(int i) {
        this.A03 = i;
        if (i == 1) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        finish();
    }

    @Override // X.AnonymousClass32Z
    public boolean AGq(String str, boolean z, int i, int i2) {
        int A002 = this.A09.A00(str);
        if (z) {
            this.A03 = i;
            this.A02 = i2;
            if (A002 >= this.A09.A00.size() - 1 || this.A0C) {
                finish();
                return true;
            }
            this.A0A.A00 = this.A00;
            this.A00 = 3.5f;
            this.A07.A0B(A002 + 1, true);
            this.A0A.A00 = 0.0f;
            return true;
        } else if (A002 <= 0 || this.A0C) {
            return false;
        } else {
            this.A0A.A00 = this.A00;
            this.A00 = 3.5f;
            this.A03 = i;
            this.A02 = i2;
            this.A07.A0B(A002 - 1, true);
            this.A0A.A00 = 0.0f;
            return true;
        }
    }

    @Override // X.AnonymousClass32Z
    public void AGt(String str) {
        A0V(str, 0, 0);
    }

    @Override // X.AnonymousClass32Z
    public void AGu(String str) {
        StatusPlaybackFragment A0U;
        AnonymousClass3PP r1 = (AnonymousClass3PP) this.A09.A00.get(this.A07.getCurrentItem());
        if (r1.A00.A0A.getRawString().equals(str) && (A0U = A0U(r1)) != null) {
            A0U.A0p();
            A0U.A0r(1);
        }
    }

    @Override // X.AnonymousClass32Z
    public void AKF(float f) {
        float f2;
        if (f < 0.9f) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f - ((1.0f - f) * 10.0f);
        }
        View findViewById = findViewById(R.id.video_playback_container_overlay);
        findViewById.setVisibility(0);
        findViewById.setBackgroundColor(((int) (f2 * 255.0f)) << 24);
        findViewById(R.id.video_playback_container).setVisibility(4);
    }

    @Override // X.ActivityC004802g, X.ActivityC005002j
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int keyCode = keyEvent.getKeyCode();
        if (!(keyEvent.getAction() == 0 && (keyCode == 24 || keyCode == 25))) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C660132l r7 = this.A0L;
        boolean z = false;
        if (keyCode == 24) {
            z = true;
        }
        if (r7 != null) {
            AnonymousClass008.A1G("AudioManager/adjustAudioVolume isUp=", z);
            AudioManager A092 = r7.A06.A09();
            if (A092 != null) {
                int streamVolume = A092.getStreamVolume(3);
                int streamMaxVolume = A092.getStreamMaxVolume(3);
                if (z) {
                    if (streamVolume < streamMaxVolume) {
                        i = streamVolume + 1;
                        A092.adjustSuggestedStreamVolume(1, 3, 16);
                    }
                    i = streamVolume;
                } else {
                    if (streamVolume > 0) {
                        i = streamVolume - 1;
                        A092.adjustSuggestedStreamVolume(-1, 3, 16);
                    }
                    i = streamVolume;
                }
                AnonymousClass008.A1K(AnonymousClass008.A0U("AudioManager/adjustAudioVolume previous=", streamVolume, "; new=", i, "; max="), streamMaxVolume);
                List<AbstractC660032k> list = r7.A04;
                if (list != null) {
                    for (AbstractC660032k r0 : list) {
                        r0.AD8(streamVolume, i, streamMaxVolume);
                    }
                }
            }
            if (r7.A05) {
                r7.A05 = false;
                List<AbstractC660032k> list2 = r7.A04;
                if (list2 != null) {
                    for (AbstractC660032k r02 : list2) {
                        r02.AD5(false);
                    }
                }
            }
            return true;
        }
        throw null;
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        if (!this.A0A.isFinished() && this.A0A.timePassed() < (this.A0A.getDuration() >> 1)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            long eventTime = motionEvent.getEventTime() - this.A06;
            if (eventTime == 0 || eventTime > 1000) {
                f = 3.5f;
            } else {
                f = ((((float) eventTime) * 2.5f) / 1000.0f) + 1.0f;
            }
            this.A00 = f;
            this.A06 = motionEvent.getEventTime();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0D = true;
            AnonymousClass0YE r0 = this.A07.A0V;
            if (r0 != null) {
                r0.A06();
                this.A07.setCurrentItem(this.A04);
                return;
            }
            throw null;
        } else {
            finish();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        AbstractC659532f A0w;
        boolean z;
        StatusPlaybackFragment A0T = A0T(this.A07.getCurrentItem());
        if (!(A0T == null || (A0w = ((StatusPlaybackContactFragment) A0T).A0w()) == null)) {
            AbstractC71663Pv r4 = (AbstractC71663Pv) A0w;
            BottomSheetBehavior bottomSheetBehavior = r4.A00;
            if (bottomSheetBehavior.A0B == 3) {
                bottomSheetBehavior.A0D(4);
                return;
            }
            AbstractC659732h A0C2 = r4.A0C();
            MediaCaptionTextView mediaCaptionTextView = A0C2.A0F;
            if (((ReadMoreTextView) mediaCaptionTextView).A05) {
                mediaCaptionTextView.setExpanded(false);
                A0C2.A02.setVisibility(A0C2.A0F.getVisibility());
                r4.A0G();
                return;
            }
            AnonymousClass32V A0B2 = r4.A0B();
            if (!(A0B2 instanceof C71453Pa)) {
                z = false;
            } else {
                C71453Pa r1 = (C71453Pa) A0B2;
                View view = r1.A00;
                if (view == null || view.getVisibility() != 0) {
                    z = false;
                } else {
                    r1.A00.performClick();
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        this.A03 = 3;
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        C02780Dk.A04(getWindow());
        setContentView(R.layout.status_playback);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(134217728);
            AnonymousClass0Q7.A0e(findViewById(R.id.root_view), new AnonymousClass3PL(this));
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        this.A07 = viewPager;
        this.A0A = new AnonymousClass32O(viewPager.getContext(), A0N);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.A07, this.A0A);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
        }
        UserJid A0B2 = AnonymousClass1VY.A0B(getIntent().getStringExtra("jid"));
        C007303n A082 = C006803i.A08(getIntent());
        this.A08 = A082;
        boolean z = false;
        this.A04 = 0;
        AnonymousClass32N r6 = new AnonymousClass32N();
        if (A082 != null) {
            AnonymousClass1VC A072 = this.A0J.A07(A0B2);
            if (A072 != null && !A072.A03()) {
                r6.A01(new AnonymousClass3PP(A072.A01()));
            }
        } else if (AnonymousClass02Z.A02(A0B2)) {
            AnonymousClass09E r0 = this.A0J;
            r0.A0C();
            AnonymousClass1VC r1 = (AnonymousClass1VC) r0.A05.get(AnonymousClass02Z.A00);
            if (r1 != null && !r1.A03()) {
                r6.A01(new AnonymousClass3PP(r1.A01()));
            }
        } else {
            AnonymousClass0BB r9 = this.A0K;
            if (r9.A08(A0B2).A0G) {
                AnonymousClass1VC A073 = this.A0J.A07(A0B2);
                if (A073 != null && !A073.A03()) {
                    r6.A01(new AnonymousClass3PP(A073.A01()));
                }
            } else {
                if (getIntent().hasExtra("sorted_jids")) {
                    AnonymousClass09E r02 = this.A0J;
                    r02.A0C();
                    Map unmodifiableMap = Collections.unmodifiableMap(r02.A05);
                    Iterator it = ((AbstractCollection) AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("sorted_jids"))).iterator();
                    while (it.hasNext()) {
                        r6.A01(new AnonymousClass3PP((AnonymousClass1VC) unmodifiableMap.get(it.next())));
                    }
                    this.A0F = getIntent().getBooleanExtra("unseen_only", false);
                } else {
                    List A083 = this.A0J.A08();
                    Collections.sort(A083, AnonymousClass32I.A00);
                    ArrayList arrayList = new ArrayList();
                    AbstractCollection abstractCollection = (AbstractCollection) A083;
                    Iterator it2 = abstractCollection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AnonymousClass1VC r12 = (AnonymousClass1VC) it2.next();
                        if (A0B2.equals(r12.A0A)) {
                            boolean z2 = false;
                            if (r12.A01 > 0) {
                                z2 = true;
                            }
                            this.A0F = z2;
                        }
                    }
                    Iterator it3 = abstractCollection.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass1VC r2 = (AnonymousClass1VC) it3.next();
                        UserJid userJid = r2.A0A;
                        if (AnonymousClass02Z.A02(userJid)) {
                            arrayList.add(r2);
                        } else if (this.A0F && r2.A01 == 0) {
                            arrayList.add(r2);
                        } else if (r9.A08(userJid).A0G) {
                            arrayList.add(r2);
                        }
                    }
                    abstractCollection.removeAll(arrayList);
                    Iterator it4 = abstractCollection.iterator();
                    while (it4.hasNext()) {
                        r6.A01(new AnonymousClass3PP((AnonymousClass1VC) it4.next()));
                    }
                }
                this.A0C = !this.A0F;
                this.A04 = r6.A00(A0B2.getRawString());
            }
        }
        if (r6.A00.size() == 0) {
            StringBuilder sb = new StringBuilder("statusplaybackactivity/create/no statuses for ");
            sb.append(A0B2);
            Log.i(sb.toString());
            finish();
            return;
        }
        boolean A062 = this.A0I.A06();
        this.A0D = A062;
        if (!A062) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_status_view_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_status_view;
            }
            RequestPermissionActivity.A0B(this, R.string.permission_storage_need_write_access_on_status_view_request, i2, true, 151);
        }
        this.A09 = r6;
        this.A07.setAdapter(new C75003bx(this, A04()));
        this.A07.setCurrentItem(this.A04);
        this.A01 = this.A04;
        this.A07.A0F(new AnonymousClass3PQ(this));
        this.A07.setOnTouchListener(new AnonymousClass32G(this));
        C660132l r22 = this.A0L;
        if (r22 != null) {
            r22.A02 = new Handler(Looper.getMainLooper());
            AudioManager A092 = r22.A06.A09();
            if (!(A092 == null || A092.getRingerMode() == 2)) {
                z = true;
            }
            r22.A05 = z;
            this.A07.setKeepScreenOn(true);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C660132l r3 = this.A0L;
        Handler handler = r3.A02;
        if (handler != null) {
            handler.removeCallbacks(r3.A07);
        }
        if (r3.A03 != null) {
            Log.i("AudioManager/audio-focus-abandoned");
            r3.A03 = null;
            AudioManager A092 = r3.A06.A09();
            if (A092 != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    A092.abandonAudioFocusRequest(r3.A01());
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r3.A01;
                    if (onAudioFocusChangeListener == null) {
                        onAudioFocusChangeListener = C659932j.A00;
                        r3.A01 = onAudioFocusChangeListener;
                    }
                    A092.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        }
        if (r3.A04 != null) {
            r3.A04 = null;
        }
        C04380Kd r5 = this.A0H;
        AnonymousClass1Ny r1 = r5.A00;
        C27091Nz r0 = r5.A01;
        if (!(r1 == null || r0 == null)) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass1Nx r7 : r0.A09.values()) {
                AnonymousClass00Y r32 = r5.A04;
                if (r7 != null) {
                    AnonymousClass21A r2 = new AnonymousClass21A();
                    r2.A05 = Long.valueOf(r7.A05);
                    r2.A06 = Long.valueOf(r7.A06);
                    r2.A01 = Integer.valueOf(r7.A02);
                    r2.A02 = Long.valueOf((long) r7.A01);
                    r2.A00 = Integer.valueOf(r7.A00);
                    r2.A04 = Long.valueOf((long) r7.A04);
                    r2.A03 = Long.valueOf((long) r7.A03);
                    r32.A09(r2, 1);
                    AnonymousClass00Y.A01(r2, "");
                    arrayList.addAll(r7.A07.values());
                } else {
                    throw null;
                }
            }
            r5.A06.ANF(new RunnableEBaseShape6S0200000_I1_1(r5, arrayList, 11));
            r5.A01 = null;
        }
        AnonymousClass37E r12 = this.A0M;
        C72403Ss r02 = r12.A00;
        if (r02 != null) {
            r02.A08();
            r12.A00 = null;
        }
    }
}
